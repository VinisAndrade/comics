package br.com.zup.comics.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.util.Calendar;

import static java.util.Calendar.FRIDAY;
import static java.util.Calendar.MONDAY;
import static java.util.Calendar.THURSDAY;
import static java.util.Calendar.TUESDAY;
import static java.util.Calendar.WEDNESDAY;

@Entity
@Table(name = "comic")
public class Comic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "price")
    private String price;

    @Column(name = "authors")
    private String authors;

    @NotBlank
    @Column(name = "isbn", unique = true)
    private String isbn;

    @Column(name = "description")
    private String description;

    @Column(name = "user_id")
    private Long userId;

    public Comic() {
    }

    public Comic(String title, String price, String authors, String isbn, String description) {
        this.title = title;
        this.price = price;
        this.authors = authors;
        this.isbn = isbn;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPrice() {
        return price;
    }

    public String getAuthors() {
        return authors;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getDescription() {
        return description;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public boolean checkDiscountForDay() {
        var calendar = Calendar.getInstance();
        var day = calendar.get(Calendar.DAY_OF_WEEK);
        boolean haveDiscount;
        switch (day) {
            case MONDAY:
                haveDiscount = isbn.endsWith("0") || isbn.endsWith("1");
                break;
            case TUESDAY:
                haveDiscount = isbn.endsWith("2") || isbn.endsWith("3");
                break;
            case WEDNESDAY:
                haveDiscount = isbn.endsWith("4") || isbn.endsWith("5");
                break;
            case THURSDAY:
                haveDiscount = isbn.endsWith("6") || isbn.endsWith("7");
                break;
            case FRIDAY:
                haveDiscount = isbn.endsWith("8") || isbn.endsWith("9");
                break;
            default:
                haveDiscount = false;
        }
        return haveDiscount;
    }
}

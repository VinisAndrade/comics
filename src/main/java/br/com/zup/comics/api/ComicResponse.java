package br.com.zup.comics.api;

import br.com.zup.comics.model.Comic;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

public class ComicResponse {

    private Long comicId;

    private String title;

    private String price;

    private String authors;

    private String isbn;

    private String description;

    private boolean haveDiscountToDay;

    public ComicResponse(Long comicId, String title, String price, String authors, String isbn, String description, boolean haveDiscountToDay) {
        this.comicId = comicId;
        this.title = title;
        this.price = price;
        this.authors = authors;
        this.isbn = isbn;
        this.description = description;
        this.haveDiscountToDay = haveDiscountToDay;
    }

    public Long getComicId() {
        return comicId;
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

    public boolean isHaveDiscountToDay() {
        return haveDiscountToDay;
    }

    public static ComicResponse from(Comic comic) {
        return new ComicResponse(
                comic.getId(),
                comic.getTitle(),
                comic.getPrice(),
                comic.getAuthors(),
                comic.getIsbn(),
                comic.getDescription(),
                comic.checkDiscountForDay());
    }


}

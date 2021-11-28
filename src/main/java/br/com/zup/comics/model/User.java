package br.com.zup.comics.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "cpf", unique = true)
    private String cpf;

    @Column(name = "birthdate")
    private LocalDate birthdate;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private List<Comic> comics = new ArrayList<>();

    public User() {
    }

    public User(String name, String email, String cpf, LocalDate birthdate) {
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.birthdate = birthdate;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public List<Comic> getComics() {
        return comics;
    }

    public void addComic(Comic comic){
        var isbns = this.comics.stream().map(Comic::getIsbn).collect(Collectors.toList());
        if(isbns.contains(comic.getIsbn())){
            throw new RuntimeException();
        }
        comic.setUserId(this.id);
        this.comics.add(comic);
    }
}

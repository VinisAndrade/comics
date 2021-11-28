package br.com.zup.comics.api;

import br.com.zup.comics.model.User;

import java.time.LocalDate;

public class UserResponse {

    private Long id;

    private String name;

    private String email;

    private String cpf;

    private LocalDate birthdate;

    public UserResponse(Long id, String name, String email, String cpf, LocalDate birthdate) {
        this.id = id;
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

    public static UserResponse from(User user) {
        return new UserResponse(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getCpf(),
                user.getBirthdate());
    }
}

package br.com.zup.comics.api;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;

public class CreateUserRequest {

    @NotBlank(message = "Erro: nome em branco/null")
    private String name;

    @Email(message = "Erro: e-mail inválido")
    private String email;

    @Pattern(regexp = "^\\d{3}.\\d{3}.\\d{3}-\\d{2}$", message = "CPF deve estar no formato correto")
    private String cpf;

    private LocalDate birthdate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
}

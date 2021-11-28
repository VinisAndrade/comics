package br.com.zup.comics.controller;

import br.com.zup.comics.api.ComicResponse;
import br.com.zup.comics.api.CreateUserRequest;
import br.com.zup.comics.api.UserResponse;
import br.com.zup.comics.model.Comic;
import br.com.zup.comics.service.ComicService;
import br.com.zup.comics.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@Validated
public class UserController {

    private final UserService userService;
    private final ComicService comicService;

    public UserController(UserService userService, ComicService comicService) {
        this.userService = userService;
        this.comicService = comicService;
    }

    @PostMapping("/user")
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponse createUser(@Valid @RequestBody CreateUserRequest createUserRequest) {
        final var user = userService.createUser(createUserRequest.getName(), createUserRequest.getEmail(), createUserRequest.getCpf(), createUserRequest.getBirthdate());
        return UserResponse.from(user);
    }

    @GetMapping("/user")
    public List<UserResponse> getUsers() {
        final var users = userService.findUsers();
        return users.stream()
                .map(UserResponse::from ).collect(Collectors.toList());

    }

    @PostMapping("/user/{id}/comic/{comicId}")
    @ResponseStatus(HttpStatus.CREATED)
    public ComicResponse addComic(@PathVariable Long id, @PathVariable String comicId){
        return ComicResponse.from(comicService.addComicToUser(id, comicId));
    }

    @GetMapping("/user/{id}/comic")
    public List<ComicResponse> getComics(@PathVariable Long id){
        var comics = comicService.getComicsFromUser(id);
        return comics.stream().map(ComicResponse::from).collect(Collectors.toList());
    }
}

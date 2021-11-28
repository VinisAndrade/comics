package br.com.zup.comics.service;

import br.com.zup.comics.client.MarvelClient;
import br.com.zup.comics.model.Comic;
import br.com.zup.comics.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Calendar.*;

@Service
public class ComicService {
    private final UserRepository userRepository;
    private final MarvelClient marvelClient;

    public ComicService(UserRepository userRepository, MarvelClient marvelClient) {
        this.userRepository = userRepository;
        this.marvelClient = marvelClient;
    }

    public Comic addComicToUser(Long userId, String comicId) {
        var user = userRepository.findById(userId).orElseThrow();
        var comic = this.findComic(comicId);
        user.addComic(comic);
        userRepository.saveAndFlush(user);
        return comic;
    }

    public Comic findComic(String comicId) {
        var marvelComicResponse = marvelClient.getComic(comicId);
        var data = marvelComicResponse.getData().getResults().stream().findFirst().get();
        return new Comic(data.getTitle(), data.getPrices().stream().findFirst().get().getPrice(), data.getCreators().getItems().stream().map(creatorItem -> creatorItem.getName()).collect(Collectors.joining(", ")), data.getIsbn(), data.getDescription());
    }

    public List<Comic> getComicsFromUser(Long id) {
        var user = userRepository.findById(id).orElseThrow();
        return user.getComics();

    }
}

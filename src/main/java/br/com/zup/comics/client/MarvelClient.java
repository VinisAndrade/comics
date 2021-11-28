package br.com.zup.comics.client;

import br.com.zup.comics.client.api.MarvelComicResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "marvelClient", url = "https://gateway.marvel.com/", configuration = {MarvelAuth.class})
public interface MarvelClient {

    @GetMapping(value = "/v1/public/comics/{comicId}")
    MarvelComicResponse getComic(@PathVariable String comicId);

}




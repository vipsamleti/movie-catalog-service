package io.vipsamleti.moviecatalogservice.controller;

import io.vipsamleti.moviecatalogservice.model.MovieCatalog;
import io.vipsamleti.moviecatalogservice.repository.MovieCatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieCatalogController {

    @Autowired
    private MovieCatalogRepository movieCatalogRepository;

    @GetMapping("/{id}")
    public ResponseEntity getMoviesById(@PathVariable("id") final String id){

        MovieCatalog movieCatalog = movieCatalogRepository.getOne(id);
        if(movieCatalog != null)
            return ResponseEntity.ok().body(movieCatalog);
        else
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @GetMapping("/all")
    public ResponseEntity getAllMovies(){
        List<MovieCatalog> movieCatalogList = movieCatalogRepository.findAll();
        if(!movieCatalogList.isEmpty())
            return ResponseEntity.ok().body(movieCatalogList);
        else
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @PostMapping
    public ResponseEntity postMovieCatalog(@RequestBody MovieCatalog movieCatalog){
        movieCatalogRepository.save(movieCatalog);
        return ResponseEntity.ok().build();
    }

}

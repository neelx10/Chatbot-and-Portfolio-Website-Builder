package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.demo.moviemodel.MovieMatch;

@RestController 
@RequestMapping ("/movies")
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/search")
    public List<MovieMatch> search(@RequestParam String query) {
        return movieService.search(query);
    }

    @GetMapping("/{title}/similar")
    public List<MovieMatch> similarMovies(@PathVariable String title) {
        return movieService.similarMovies(title);
    }
}

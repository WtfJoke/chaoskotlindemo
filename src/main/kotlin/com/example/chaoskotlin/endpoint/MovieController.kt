package com.example.chaoskotlin.endpoint

import com.example.chaoskotlin.domain.Movie
import com.example.chaoskotlin.service.MovieService

import org.springframework.web.bind.annotation.GetMapping

import org.springframework.web.bind.annotation.RestController


@RestController
class MovieController(val movieService: MovieService) {

    @GetMapping("/movies")
    fun getRecommendation(): Movie = movieService.getMovie()
}

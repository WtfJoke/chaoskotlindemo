package com.example.chaoskotlin.service

import com.example.chaoskotlin.domain.Movie
import com.example.chaoskotlin.repository.MovieRepository
import io.vavr.control.Try
import org.springframework.stereotype.Service
import java.util.*

@Service
class MovieService(val movieRepository: MovieRepository) {
    private val fallbackMovie: Movie = Movie("Titanic", "3h 15m")

    fun getMovies(): List<Movie> = movieRepository.findAll().toList()

    fun getMovie(): Movie = Try.of(this::getRecommendedMovie).getOrElse(fallbackMovie)

    fun getMovieByTitle(title: String): Movie = movieRepository.findByTitle(title)

    fun getRecommendedMovie(): Movie {
//        demoRepo.foo()
        val movies = getMovies()
        return movies[Random().nextInt(movies.size)]
    }

}

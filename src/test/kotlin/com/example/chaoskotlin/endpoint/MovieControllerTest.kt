package com.example.chaoskotlin.endpoint

import com.example.chaoskotlin.domain.Movie
import com.example.chaoskotlin.service.MovieService
import org.junit.jupiter.api.Test
import org.mockito.Mockito
import org.mockito.Mockito.`when`
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import org.springframework.test.web.servlet.setup.MockMvcBuilders

internal class MovieControllerTest{
    private val movieService: MovieService = Mockito.mock(MovieService::class.java)
    private val restMock = MockMvcBuilders.standaloneSetup(MovieController(movieService)).build()

    @Test
    @Throws(Exception::class)
    fun noRecommendationWithNoMovies() {
        `when`(movieService.getMovie()).thenReturn(null)
        restMock.perform(MockMvcRequestBuilders.get("/movies"))
                .andExpect(MockMvcResultMatchers.status().isOk)
                .andExpect(MockMvcResultMatchers.jsonPath("$").doesNotExist()) // empty content/json
    }

    @Test
    @Throws(Exception::class)
    fun aRecommendationWithMovies() {
        `when`(movieService.getMovie()).thenReturn(Movie("a Movie", "1h"))
        restMock.perform(MockMvcRequestBuilders.get("/movies"))
                .andExpect(MockMvcResultMatchers.status().isOk)
                .andExpect(MockMvcResultMatchers.content().json("{title: \"a Movie\", duration: \"1h\"}"))
    }
}
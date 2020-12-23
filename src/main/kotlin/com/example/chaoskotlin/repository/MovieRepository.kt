package com.example.chaoskotlin.repository

import com.example.chaoskotlin.domain.Movie
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface MovieRepository : CrudRepository<Movie, Long>
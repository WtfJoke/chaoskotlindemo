package com.example.chaoskotlin.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
data class Movie(
        val title: String,
        val duration: String,
        @Id @GeneratedValue
        var id: Long = -1,)
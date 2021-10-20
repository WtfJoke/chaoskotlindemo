package com.example.chaoskotlin

import com.example.chaoskotlin.domain.Movie
import com.example.chaoskotlin.repository.MovieRepository
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean


@SpringBootApplication
class ChaoskotlinApplication{

    @Bean
    fun demo(repository: MovieRepository): CommandLineRunner {
        return CommandLineRunner {
            repository.save(Movie("Inception", "2h 28m"))
            repository.save(Movie("Source Code", "1h 33m"))
            repository.save(Movie("Forest Gump", "2h 22m"))
            repository.save(Movie("Life Is Beautiful", "1h 56m"))
            repository.save(Movie("12 Angry Men", "1h 36min"))
            repository.save(Movie("Spider-Man: A New Universe", "1h 56m"))
            repository.save(Movie("Swiss Army Man", "1h 37m"))
            repository.save(Movie("John Wick 3", "2h 10m"))
        }
    }

    private val logger = LoggerFactory.getLogger(ChaoskotlinApplication::class.java)


    @Bean
    fun applicationRunner(@Value("\${password}") password: String): ApplicationRunner? {
        return ApplicationRunner {
            logger.info(
                "`message` loaded from the AWS Parameter store: {}",
                password
            )
        }
    }
}

fun main(args: Array<String>) {
    runApplication<ChaoskotlinApplication>(*args)
}




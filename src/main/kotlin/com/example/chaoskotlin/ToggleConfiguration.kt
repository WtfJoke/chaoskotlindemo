package com.example.chaoskotlin

import de.codecentric.spring.boot.chaos.monkey.configuration.toggles.ChaosToggles
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ToggleConfiguration {
    @Bean
    fun chaosToggles(): ChaosToggles {
        return ToggleBasedOnHeader()
    }

}
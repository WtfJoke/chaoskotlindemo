package com.example.chaoskotlin

import no.finn.unleash.DefaultUnleash
import no.finn.unleash.Unleash
import no.finn.unleash.util.UnleashConfig
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class UnleashConfiguration {

    @Bean
    fun unleash(): Unleash {
        val config = UnleashConfig.builder()
            .appName("chaoskotlin-test")
            .instanceId("chaoskotlin instance")
            .unleashAPI("http://localhost:4242/api/")
            .customHttpHeader("Authorization", "14710c29a7798cb64a6c63896f362bd8396786c3b3ff121a726122e552b2170d")
            .build()

        return DefaultUnleash(config)
    }
}
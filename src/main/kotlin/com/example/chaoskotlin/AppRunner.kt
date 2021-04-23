package com.example.chaoskotlin

import org.springframework.context.ApplicationEvent
import org.springframework.context.ApplicationListener
import org.springframework.stereotype.Component

@Component
class AppRunner : ApplicationListener<ApplicationEvent>  {
    override fun onApplicationEvent(event: ApplicationEvent) {
        println(event)
    }


}
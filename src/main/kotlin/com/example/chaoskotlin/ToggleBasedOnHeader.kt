package com.example.chaoskotlin

import de.codecentric.spring.boot.chaos.monkey.configuration.toggles.ChaosToggles
import org.springframework.web.context.request.RequestContextHolder
import org.springframework.web.context.request.ServletRequestAttributes

class ToggleBasedOnHeader : ChaosToggles {
    override fun isEnabled(toggleName: String): Boolean {
        val currentRequest = (RequestContextHolder.currentRequestAttributes() as ServletRequestAttributes).request
        val chaosEnabledHeader = currentRequest.getHeader("chaos")
        return chaosEnabledHeader.toBoolean()
    }
}
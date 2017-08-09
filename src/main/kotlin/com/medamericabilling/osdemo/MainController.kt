package com.medamericabilling.osdemo

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.Mapping
import org.springframework.web.bind.annotation.RestController

@RestController("/")
open class MainController {

    @GetMapping
    fun index(): String = "Hello from ${System.getenv("HOSTNAME")}"

}
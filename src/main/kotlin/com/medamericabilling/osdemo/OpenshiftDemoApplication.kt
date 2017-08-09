package com.medamericabilling.osdemo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class OpenshiftDemoApplication

fun main(args: Array<String>) {
    SpringApplication.run(OpenshiftDemoApplication::class.java, *args)
}

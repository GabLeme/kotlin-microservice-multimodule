package com.microservice.auth

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication


@SpringBootApplication(
        scanBasePackages=[
            "com.microservice.auth"
        ]
)
@EnableAutoConfiguration
class Main {

    companion object {
        @JvmStatic fun main(args: Array<String>) {
            SpringApplication.run(Main::class.java, *args)
        }
    }
}
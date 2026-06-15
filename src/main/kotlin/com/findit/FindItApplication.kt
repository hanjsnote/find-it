package com.findit

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FindItApplication

fun main(args: Array<String>) {
    runApplication<FindItApplication>(*args)
}

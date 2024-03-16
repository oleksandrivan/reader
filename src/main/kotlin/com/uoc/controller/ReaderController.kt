package com.uoc.controller

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get


@Controller("/")
class ReaderController {

    @Get("hello")
    fun hello(): String {
        return "Hello World"
    }

    @Get("hello/{name}")
    fun hello(name: String): String {
        return "Hello $name!"
    }
}
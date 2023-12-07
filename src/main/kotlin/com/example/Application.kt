package com.example

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.engine.embeddedServer



fun Application.myapp(){
    routing {
        get("/"){
            call.respondText("Hello dasda")
        }
    }
}
fun main(args:Array<String>) {
    embeddedServer(
        Netty,
        watchPaths = listOf("com.example"),
        module = Application::myapp,
        port = 8080
    ).start(wait = true)
}

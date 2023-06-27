package com.gbabler.plugins

import com.gbabler.routes.customerRouting
import com.gbabler.routes.getOrderRoute
import com.gbabler.routes.listOrdersRoute
import com.gbabler.routes.totalizeOrderRoute
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*

fun Application.configureRouting() {
    routing {
        customerRouting()
        listOrdersRoute()
        getOrderRoute()
        totalizeOrderRoute()
    }
}

fun Application.configureSerialization() {
    install(ContentNegotiation) {
        json()
    }
}

package transferium

import transferium.routes.registerStatusRoutes
import io.ktor.application.Application
import io.ktor.features.ContentNegotiation
import io.ktor.application.install
import io.ktor.jackson.jackson

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

fun Application.module() {
    install(ContentNegotiation) {
        jackson()
    }
    registerStatusRoutes()
}


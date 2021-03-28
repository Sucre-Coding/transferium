package transferium.routes

import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.response.respond
import io.ktor.routing.Route
import io.ktor.routing.route
import io.ktor.routing.routing
import io.ktor.routing.get
import transferium.model.Status

fun Route.statusRouting() {
    route("/status") {
        get {
            call.respond(Status())
        }
    }
}

fun Route.homeRouting() {
    route("/") {
        get {
            call.respond(Status())
        }
    }
}

fun Application.registerStatusRoutes() {
    routing {
        statusRouting()
        homeRouting()
    }
}

package org.bolay.vertx.starter

import io.vertx.core.AbstractVerticle
import io.vertx.core.Vertx
import io.vertx.ext.web.Router
import io.vertx.ext.web.handler.StaticHandler

fun main(args: Array<String>){
    Vertx.vertx().deployVerticle(MainVerticle())
}

class MainVerticle :AbstractVerticle() {




    override fun start() {
        val server = vertx.createHttpServer()
        val router = Router.router(vertx)

        val staticHandler = StaticHandler.create()
        staticHandler.setIndexPage("html/index.html")
        router.route("/static/*").handler(staticHandler)
        //server.requestHandler({request ->
        //   request.response().end("Hello Vert.x")
        //})
        server.requestHandler(router).listen(8080)
        staticHandler.setCachingEnabled(false)

    }
}
package org.bolay.vertx.starter

import io.vertx.core.AbstractVerticle
import io.vertx.core.Vertx
import io.vertx.ext.web.Router
import io.vertx.ext.web.handler.StaticHandler
import io.vertx.ext.web.handler.sockjs.BridgeOptions
import io.vertx.ext.web.handler.sockjs.SockJSHandler

fun main(args: Array<String>){
    Vertx.vertx().deployVerticle(MainVerticle())
}

class MainVerticle :AbstractVerticle() {




    override fun start() {
        var server = vertx.createHttpServer()
        var router = Router.router(vertx);

        router.route().handler(StaticHandler.create().setIndexPage("html/index.html"))

        var sockJSHandler = SockJSHandler.create(vertx)
        var options = BridgeOptions()

        sockJSHandler.bridge(options)
        router.route("/eventbus/*").handler(sockJSHandler)

        server.requestHandler({ router.accept(it) }).listen(8081)

    }
}
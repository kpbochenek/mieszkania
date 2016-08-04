package com.kpbochenek.mieszkania

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.stream.ActorMaterializer
import com.typesafe.scalalogging.LazyLogging
import akka.http.scaladsl.model._
import akka.http.scaladsl.server.Directives._

/** Created by kpbochenek on 8/4/16. */

object MieszkaniaApp extends LazyLogging {
  def main(args: Array[String]): Unit = {
    logger.info("Wynajem mieszkan START")

    implicit val system = ActorSystem("mieszkania")
    implicit val materializer = ActorMaterializer()
    implicit val executionContext = system.dispatcher

    val route =
      path("hello") {
        get {
          complete(HttpEntity(ContentTypes.`text/html(UTF-8)`, "<h1>Say hello to akka-http</h1>"))
        }
      }

    val bindingFuture = Http().bindAndHandle(route, "localhost", 8080)
  }

}

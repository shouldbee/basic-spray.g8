package $organization$.$name;format="lower,word"$

import akka.actor.{ ActorSystem, Props, Actor }
import akka.event.slf4j.SLF4JLogging
import akka.io.IO
import spray.can.Http
import spray.routing.HttpService

object Boot extends App {
  implicit val system = ActorSystem("on-spray-can")
  val service = system.actorOf(Props[HelloWorldActor], "hello-world-actor")
  IO(Http) ! Http.Bind(service, "0.0.0.0", 8080)
}

class HelloWorldActor extends Actor with HttpService {
  override def actorRefFactory = context
  override def receive = runRoute({
    path("hello") {
      complete("Hello $organization$.$name$!")
    }
  })
}

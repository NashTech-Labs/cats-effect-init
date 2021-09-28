package com.cats_effect

import cats.instances.string._
import cats.effect.{ExitCode, IO, IOApp}
import cats.syntax.all._

object Application extends IOApp {

  println("Hello " |+| "Cats!".toUpperCase)

  override def run(args: List[String]): IO[ExitCode] =
    if (args.headOption.map(_ == "--do-it").getOrElse(false))
      IO.println("I did it!").as(ExitCode.Success)
    else
      IO.println("Didn't do it").as(ExitCode(-1))

}

name := "cats-effect-init"
version := "0.0.1-SNAPSHOT"

scalaVersion := "2.13.1"

libraryDependencies ++= Seq(
                           "org.typelevel" %% "cats-core" % "2.0.0",
                           "org.typelevel" %% "cats-effect" % "3.2.2",
                           "org.typelevel" %% "munit-cats-effect-3" % "1.0.3" % Test
)

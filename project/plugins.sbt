// mandatory for cats effect
addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat" % "0.1.11")
addCompilerPlugin("org.typelevel" %% "kind-projector" % "0.11.0" cross CrossVersion.full)
addCompilerPlugin("com.olegpy" %% "better-monadic-for" % "0.3.1")


//Plugin for Scalastyle
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "1.0.0")
// this v1.5.1 is preinstalled in current IDEA releases, used for code formatting
addSbtPlugin("com.geirsson" % "sbt-scalafmt" % "1.5.1")

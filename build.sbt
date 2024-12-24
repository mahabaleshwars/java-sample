name := "java-sapmachine"

version := "0.1"

scalaVersion := "2.13.8"

libraryDependencies += "org.scala-lang" % "scala-library" % "2.13.8"

coverageEnabled := true

resolvers += Resolver.sonatypeRepo("releases")
resolvers += "sbt-plugin-releases" at "https://repo.scala-sbt.org/scalasbt/sbt-plugin-releases/"

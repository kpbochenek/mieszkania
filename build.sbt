name := "mieszkania"
organization := "kpbochenek"

scalaVersion := "2.11.8"

val akkaV = "2.4.8"

libraryDependencies ++= Seq(

  "com.typesafe.akka" %% "akka-actor" % akkaV,
  "com.typesafe.akka" %% "akka-http-experimental" % akkaV,

  "ch.qos.logback" % "logback-classic" % "1.1.7",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.4.0"


)
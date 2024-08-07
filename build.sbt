name := "recetas"
organization := "com.mimo"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.13"

libraryDependencies ++= Seq(
  guice,
  "com.typesafe.play" %% "play-guice" % "2.8.8",      // Dependencia de Play-Guice
  "com.typesafe.play" %% "play-logback" % "2.8.8",    // Dependencia de Play-Logback
  "ch.qos.logback" % "logback-classic" % "1.4.5",     // Logback para logging
  "org.scalatestplus.play" %% "scalatestplus-play" % "5.1.0" % Test // ScalaTest para pruebas
)

resolvers += "Typesafe repository" at "https://repo.typesafe.com/typesafe/releases/"

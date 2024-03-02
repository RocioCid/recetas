name := """recetas"""
organization := "com.mimo"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.13"

libraryDependencies += guice

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.4.5"


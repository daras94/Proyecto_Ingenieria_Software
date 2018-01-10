name := """ms-gestion-autentificacion"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs
)
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.38"
libraryDependencies += "org.webjars" % "swagger-ui" % "2.2.10-1"
libraryDependencies += "javax.validation" % "validation-api" % "1.1.0.Final"

PlayKeys.devSettings := Seq("play.server.http.port" -> "9300")

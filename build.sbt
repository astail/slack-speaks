organization := "net.astail"

name := "slack2affiliate"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.typesafe" % "config" % "1.3.3",
  "com.github.gilbertw1" %% "slack-scala-client" % "0.2.3",
  "am.ik.voicetext" % "voicetext4j" % "1.0.0",
  "com.googlecode.soundlibs" % "mp3spi" % "1.9.5.4"
)

enablePlugins(JavaAppPackaging)

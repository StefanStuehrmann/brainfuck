name := "brainfuck"

organization := "com.github.mkroli"

version := "0.1-SNAPSHOT"

scalaVersion := "2.10.0"

libraryDependencies ++= Seq(
  "com.github.scopt" %% "scopt" % "2.1.0"
)

assemblySettings

buildInfoSettings

sourceGenerators in Compile <+= buildInfo

buildInfoKeys := Seq[BuildInfoKey](name, version)

buildInfoPackage := "com.github.mkroli.brainfuck.build"
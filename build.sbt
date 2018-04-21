enablePlugins(ScalaJSPlugin)

name := "Example"

scalaVersion := "2.12.5"

jsDependencies += RuntimeDOM

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.5",
  "com.lihaoyi" %%% "scalatags" % "0.6.7",
  "com.lihaoyi" %%% "utest" % "0.6.3" % "test"
)

testFrameworks += new TestFramework("utest.runner.Framework")

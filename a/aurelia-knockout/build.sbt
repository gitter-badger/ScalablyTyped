organization := "org.scalablytyped"
name := "aurelia-knockout"
version := "2.3.0-4cb735"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aurelia-binding" % "2.1.7-2ef07b",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.4.2-3d2c9f",
  "org.scalablytyped" %%% "aurelia-loader" % "1.0.0-0cb28c",
  "org.scalablytyped" %%% "aurelia-logging" % "1.5.0-5336a6",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.4-527a8e",
  "org.scalablytyped" %%% "aurelia-pal" % "1.8.0-9e2425",
  "org.scalablytyped" %%% "aurelia-path" % "1.1.1-3be461",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.1-9f08ea",
  "org.scalablytyped" %%% "aurelia-templating" % "1.10.1-d59c2f",
  "org.scalablytyped" %%% "knockout" % "v3.4.0-dt-20190102Z-c053e5",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
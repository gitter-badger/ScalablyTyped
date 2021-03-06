organization := "org.scalablytyped"
name := "aurelia-binding"
version := "2.1.7-fd1466"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aurelia-dependency-injection" % "1.4.2-0560ce",
  "org.scalablytyped" %%% "aurelia-logging" % "1.5.0-77e255",
  "org.scalablytyped" %%% "aurelia-metadata" % "1.0.4-428fac",
  "org.scalablytyped" %%% "aurelia-pal" % "1.8.0-9ad621",
  "org.scalablytyped" %%% "aurelia-task-queue" % "1.3.1-6a28c5",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
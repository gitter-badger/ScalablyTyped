organization := "org.scalablytyped"
name := "constant-case"
version := "2.0.0-10ded1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "lower-case" % "1.1.4-ac4235",
  "org.scalablytyped" %%% "no-case" % "2.3.2-bd94dc",
  "org.scalablytyped" %%% "snake-case" % "2.1.0-f9a6c9",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "upper-case" % "1.1.3-46a299")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
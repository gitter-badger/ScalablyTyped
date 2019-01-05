organization := "org.scalablytyped"
name := "spectrum"
version := "1.5.1-dt-20180731Z-5dea9d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20181219Z-46c2e0",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-89c527",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "tinycolor2" % "1.4-dt-20180731Z-2423e9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
organization := "org.scalablytyped"
name := "aframe"
version := "0.8-dt-20181220Z-7ae8ae"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "three" % "0.93-dt-20181231Z-d3178d",
  "org.scalablytyped" %%% "tween_dot_js" % "v16.9.0-dt-20180214Z-c904be")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
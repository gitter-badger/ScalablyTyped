organization := "org.scalablytyped"
name := "createjs"
version := "0.0-unknown-dt-20180214Z-416a08"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "createjs-lib" % "0.0-unknown-dt-20180214Z-a35f08",
  "org.scalablytyped" %%% "easeljs" % "1.0.0-dt-20181116Z-88c259",
  "org.scalablytyped" %%% "preloadjs" % "0.6.2-dt-20180214Z-201dd8",
  "org.scalablytyped" %%% "soundjs" % "0.6.0-dt-20180214Z-aeb6a7",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "tweenjs" % "1.0.2-dt-20180517Z-a9c8cb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
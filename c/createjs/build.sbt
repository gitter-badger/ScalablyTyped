organization := "org.scalablytyped"
name := "createjs"
version := "0.0-unknown-dt-20180214Z-dc4a0e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "createjs-lib" % "0.0-unknown-dt-20180214Z-0e9022",
  "org.scalablytyped" %%% "easeljs" % "1.0.0-dt-20181116Z-5ec058",
  "org.scalablytyped" %%% "preloadjs" % "0.6.2-dt-20180214Z-02b492",
  "org.scalablytyped" %%% "soundjs" % "0.6.0-dt-20180214Z-50f4ff",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "tweenjs" % "1.0.2-dt-20180517Z-c9c1f4")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
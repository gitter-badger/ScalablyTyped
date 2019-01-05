organization := "org.scalablytyped"
name := "webcola"
version := "3.3.8-5c4ae4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20180807Z-0fbc4b",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20181117Z-b4e8ea",
  "org.scalablytyped" %%% "d3-selection" % "1.3-dt-20181117Z-b8b9c8",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20180912Z-c3e42d",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
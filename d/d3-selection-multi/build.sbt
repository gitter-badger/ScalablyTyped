organization := "org.scalablytyped"
name := "d3-selection-multi"
version := "1.0-dt-20180917Z-cb350e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "d3-selection" % "1.3-dt-20181117Z-d2359f",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20181115Z-3f5e72",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
organization := "org.scalablytyped"
name := "d3-scale"
version := "2.1-dt-20181216Z-474da3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20180912Z-2ca750",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
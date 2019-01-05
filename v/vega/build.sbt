organization := "org.scalablytyped"
name := "vega"
version := "4.4.0-128a40"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "vega-lib" % "4.4.0-c5ddfe",
  "org.scalablytyped" %%% "vega-typings" % "0.3.53-cc0094",
  "org.scalablytyped" %%% "vega-util" % "1.7.1-3a3c0d",
  "org.scalablytyped" %%% "yargs" % "12.0-dt-20181231Z-f71b14")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
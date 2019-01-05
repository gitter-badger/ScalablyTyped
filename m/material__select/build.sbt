organization := "org.scalablytyped"
name := "material__select"
version := "0.35-dt-20180511Z-40e9e3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20180511Z-d27ab7",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20180511Z-2bd2c9",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20180511Z-fa5b46",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
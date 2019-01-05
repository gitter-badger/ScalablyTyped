organization := "org.scalablytyped"
name := "babel__core"
version := "7.0-dt-20181129Z-b979d0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "babel__generator" % "7.0-dt-20181115Z-69c211",
  "org.scalablytyped" %%% "babel__parser" % "7.2.3-42f0f4",
  "org.scalablytyped" %%% "babel__template" % "7.0-dt-20181115Z-8eeff1",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20181128Z-b211b6",
  "org.scalablytyped" %%% "babel__types" % "7.2.2-b4ccb0",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-8f83bf",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
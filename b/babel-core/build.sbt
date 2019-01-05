organization := "org.scalablytyped"
name := "babel-core"
version := "6.25-dt-20180611Z-4d7375"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20180611Z-ca36c0",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20180611Z-8f38ca",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20180611Z-0d4026",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20180613Z-5050a1",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20181029Z-cce67f",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
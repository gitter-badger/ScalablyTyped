organization := "org.scalablytyped"
name := "shopify-prime"
version := "2.12.0-37c9b5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "crypto-js" % "v3.1.8-dt-20180725Z-be14d4",
  "org.scalablytyped" %%% "jsuri" % "1.3-dt-20180214Z-f5fa34",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181119Z-bbc75c",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "url-join" % "4.0-dt-20181231Z-c41c56")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
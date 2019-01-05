organization := "org.scalablytyped"
name := "mongoose-unique-validator"
version := "1.0-dt-20180214Z-efbcad"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bson" % "1.0.6-dt-20180721Z-a71ac9",
  "org.scalablytyped" %%% "mongodb" % "v3.1-dt-20181223Z-4c88f7",
  "org.scalablytyped" %%% "mongoose" % "5.3.4-dt-20190103Z-3c0af5",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
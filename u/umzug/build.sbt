organization := "org.scalablytyped"
name := "umzug"
version := "v2.2.0-dt-20180731Z-fc1122"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-1c3671",
  "org.scalablytyped" %%% "bson" % "1.0.6-dt-20180721Z-a71ac9",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-c665d4",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-8f83bf",
  "org.scalablytyped" %%% "mongodb" % "v3.1-dt-20181223Z-4c88f7",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "sequelize" % "4.27.11-dt-20181210Z-709e0b",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "validator" % "v10.9.0-dt-20181214Z-a9b9fa")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
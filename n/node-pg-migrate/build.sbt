organization := "org.scalablytyped"
name := "node-pg-migrate"
version := "3.14.2-0abcf5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-8f83bf",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-e9357f",
  "org.scalablytyped" %%% "moment" % "2.23.0-87137f",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "pg" % "7.4-dt-20181008Z-8a4d39",
  "org.scalablytyped" %%% "pg-types" % "1.11-dt-20180214Z-2f5411",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "yargs" % "12.0-dt-20181231Z-f71b14")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
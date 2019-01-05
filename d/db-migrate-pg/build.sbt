organization := "org.scalablytyped"
name := "db-migrate-pg"
version := "0.0-unknown-dt-20181121Z-0fcb7d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-1c3671",
  "org.scalablytyped" %%% "db-migrate-base" % "0.0-unknown-dt-20181121Z-b46aec",
  "org.scalablytyped" %%% "moment" % "2.23.0-87137f",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "pg" % "7.4-dt-20181008Z-8a4d39",
  "org.scalablytyped" %%% "pg-types" % "1.11-dt-20180214Z-2f5411",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
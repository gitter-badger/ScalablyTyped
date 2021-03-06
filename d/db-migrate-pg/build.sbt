organization := "org.scalablytyped"
name := "db-migrate-pg"
version := "0.0-unknown-dt-20181121Z-9f45e5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-6bd481",
  "org.scalablytyped" %%% "db-migrate-base" % "0.0-unknown-dt-20181121Z-823ba5",
  "org.scalablytyped" %%% "moment" % "2.23.0-fd2546",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "pg" % "7.4-dt-20181008Z-1f5d39",
  "org.scalablytyped" %%% "pg-types" % "1.11-dt-20180214Z-8c92eb",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
organization := "org.scalablytyped"
name := "anydb-sql-migrations"
version := "2.3.1-d524ee"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "any-db" % "2.1.0-dt-20180214Z-c1a216",
  "org.scalablytyped" %%% "any-db-transaction" % "2.2.1-dt-20180214Z-e27f9d",
  "org.scalablytyped" %%% "anydb-sql" % "0.7.0-b04b9d",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-1c3671",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-8f83bf",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "sqlite3" % "3.1-dt-20180322Z-a24993",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "yargs" % "12.0-dt-20181231Z-f71b14")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
organization := "org.scalablytyped"
name := "pouchdb-adapter-websql"
version := "6.1-dt-20180214Z-4c1ff5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-4790a3",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181119Z-bbc75c",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20181213Z-bc21d8",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20180611Z-46c170",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
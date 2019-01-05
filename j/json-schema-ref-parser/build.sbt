organization := "org.scalablytyped"
name := "json-schema-ref-parser"
version := "3.3.1-c60b1b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-4790a3",
  "org.scalablytyped" %%% "es6-promise" % "4.2.5-e42bd5",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20181220Z-f2aa44",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20180919Z-5fe862",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "ono" % "4.0.11-fb6552",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "z-schema" % "v3.16.0-dt-20180214Z-8d6748")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
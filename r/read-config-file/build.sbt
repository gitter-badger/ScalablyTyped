organization := "org.scalablytyped"
name := "read-config-file"
version := "3.2.0-7f1fbe"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.6.2-681e1b",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-1c3671",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.6-399d47",
  "org.scalablytyped" %%% "dotenv" % "6.1-dt-20181101Z-968971",
  "org.scalablytyped" %%% "dotenv-expand" % "4.2.0-be46f0",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-12c155",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-acc0be",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180706Z-c657d8",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.0-cad0ab",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20181220Z-f2aa44",
  "org.scalablytyped" %%% "json5" % "0.0-unknown-dt-20180813Z-68ad04",
  "org.scalablytyped" %%% "lazy-val" % "1.0.3-616901",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-539bad",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-f36a77")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
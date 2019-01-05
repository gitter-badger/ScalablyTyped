organization := "org.scalablytyped"
name := "jest-json-schema"
version := "1.2-dt-20180214Z-0804a2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.6.2-681e1b",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-12c155",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-acc0be",
  "org.scalablytyped" %%% "jest" % "23.3-dt-20181231Z-bc3749",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-539bad",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-f36a77")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
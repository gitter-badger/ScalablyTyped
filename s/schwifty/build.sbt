organization := "org.scalablytyped"
name := "schwifty"
version := "4.0-dt-20180712Z-e184d8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.6.2-681e1b",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-1c3671",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-d6739c",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20181111Z-0840fb",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-12c155",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-acc0be",
  "org.scalablytyped" %%% "hapi" % "17.8-dt-20181212Z-f6673c",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-70c78c",
  "org.scalablytyped" %%% "joi" % "14.0-dt-20181211Z-4b84e2",
  "org.scalablytyped" %%% "knex" % "0.15-dt-20181115Z-b12485",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-8f83bf",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180214Z-0ddad8",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180214Z-1b0236",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "objection" % "1.4.0-6e68b0",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180214Z-359690",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-539bad",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-329809",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-f36a77")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
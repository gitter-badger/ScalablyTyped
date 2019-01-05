organization := "org.scalablytyped"
name := "swagger-restify-mw"
version := "0.7-dt-20181022Z-569bc3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-8a43c6",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-d6739c",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20181009Z-9c6560",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20181111Z-0840fb",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-18ada2",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180603Z-365ce8",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180604Z-7df9aa",
  "org.scalablytyped" %%% "hapi" % "17.8-dt-20181212Z-f6673c",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-70c78c",
  "org.scalablytyped" %%% "joi" % "14.0-dt-20181211Z-4b84e2",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-e9f135",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180214Z-0ddad8",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180214Z-1b0236",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180214Z-359690",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-f21515",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20181231Z-ef7e3a",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-1666cb",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-329809",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-2300cd",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "swagger-node-runner" % "0.5-dt-20181022Z-a9319e",
  "org.scalablytyped" %%% "swagger-schema-official" % "2.0-dt-20181113Z-30ac64")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
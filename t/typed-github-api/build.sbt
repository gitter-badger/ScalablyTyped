organization := "org.scalablytyped"
name := "typed-github-api"
version := "1.2.6-07a5d7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.0.1-dt-20181121Z-00e9c5",
  "org.scalablytyped" %%% "blow-http-statuses" % "0.2.4-69b3ad",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-8a43c6",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-18ada2",
  "org.scalablytyped" %%% "crypto-js" % "v3.1.8-dt-20180725Z-be14d4",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180603Z-365ce8",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180604Z-7df9aa",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180214Z-2499a9",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-84d423",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-e9f135",
  "org.scalablytyped" %%% "moment" % "2.23.0-87137f",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181119Z-bbc75c",
  "org.scalablytyped" %%% "one-time" % "0.0-dt-20181231Z-9c4f81",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-f21515",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20181231Z-950c17",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-fd38e3",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-1666cb",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180214Z-6e93fd",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-b37dbb",
  "org.scalablytyped" %%% "typescript-event-handler" % "1.0.0-67c0fa",
  "org.scalablytyped" %%% "winston" % "3.1.0-70dae1",
  "org.scalablytyped" %%% "winston-transport" % "4.2.0-04f2a9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
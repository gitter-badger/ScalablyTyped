organization := "org.scalablytyped"
name := "easy-api-request"
version := "0.0-unknown-dt-20181121Z-184aad"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-8a43c6",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20181009Z-9c6560",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-485138",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-18ada2",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180603Z-365ce8",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180604Z-7df9aa",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-e1da01",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-e9f135",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "q" % "1.5-dt-20181124Z-0d6d43",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-f21515",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-434e1e",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-1666cb",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181015Z-626b78")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
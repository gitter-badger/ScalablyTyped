organization := "org.scalablytyped"
name := "webpack-dev-server"
version := "3.1-dt-20180917Z-5922f7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180214Z-1bdaa7",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-8a43c6",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-18ada2",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180603Z-365ce8",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180604Z-7df9aa",
  "org.scalablytyped" %%% "http-proxy" % "1.16-dt-20180514Z-41ad77",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20181214Z-9e9aea",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-e9f135",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-f21515",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-1666cb",
  "org.scalablytyped" %%% "source-map" % "0.7.3-c639f4",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-d5f9eb",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-1864c7",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20181221Z-7baef8")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
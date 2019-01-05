organization := "org.scalablytyped"
name := "express-routers"
version := "1.0.1-2d1bf6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-8a43c6",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-18ada2",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180603Z-365ce8",
  "org.scalablytyped" %%% "express-promise-router" % "2.0-dt-20180214Z-739da0",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180604Z-7df9aa",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-e9f135",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-f21515",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-1666cb",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180523Z-fc6353",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
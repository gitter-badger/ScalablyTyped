organization := "org.scalablytyped"
name := "sw-precache-webpack-plugin"
version := "0.11-dt-20180507Z-648324"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180214Z-1bdaa7",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "path-to-regexp" % "2.4.0-d6c881",
  "org.scalablytyped" %%% "source-map" % "0.7.3-c639f4",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "sw-precache" % "5.2-dt-20180504Z-2e28c7",
  "org.scalablytyped" %%% "sw-toolbox" % "3.6.0-555db4",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-d5f9eb",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-1864c7",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20181221Z-7baef8")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
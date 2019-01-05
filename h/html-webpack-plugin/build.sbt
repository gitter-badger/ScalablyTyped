organization := "org.scalablytyped"
name := "html-webpack-plugin"
version := "3.2-dt-20181121Z-c78dee"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180214Z-1bdaa7",
  "org.scalablytyped" %%% "clean-css" % "v3.4.9-dt-20180214Z-b48a7d",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20181017Z-17c53d",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20180214Z-ae5896",
  "org.scalablytyped" %%% "source-map" % "0.7.3-c639f4",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-d5f9eb",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-1864c7",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20181221Z-7baef8")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
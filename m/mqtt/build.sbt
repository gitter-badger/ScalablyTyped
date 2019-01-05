organization := "org.scalablytyped"
name := "mqtt"
version := "2.18.8-bc7c6d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bl" % "v2.1.0-dt-20181010Z-9b0afc",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-d7d5f2",
  "org.scalablytyped" %%% "end-of-stream" % "1.4-dt-20180214Z-c338e9",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20180214Z-eaf375",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-ab73cf",
  "org.scalablytyped" %%% "mqtt-packet" % "5.6.0-ea4e2d",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "pump" % "1.0-dt-20180214Z-8e7624",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20181231Z-950c17",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-fd38e3",
  "org.scalablytyped" %%% "split2" % "2.1.0-dt-20180214Z-a6054e",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "xtend" % "4.0.1-dt-20180214Z-b6aa9e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
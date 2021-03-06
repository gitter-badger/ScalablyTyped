organization := "org.scalablytyped"
name := "mongoose-sequence"
version := "3.0.2-dt-20180214Z-8803a0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bson" % "1.0.6-dt-20180721Z-0a850a",
  "org.scalablytyped" %%% "mongodb" % "v3.1-dt-20181223Z-e16bad",
  "org.scalablytyped" %%% "mongoose" % "5.3.4-dt-20190103Z-85a48a",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
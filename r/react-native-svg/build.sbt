organization := "org.scalablytyped"
name := "react-native-svg"
version := "8.0.10-dee7b5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "color" % "3.0-dt-20180214Z-8b0c9c",
  "org.scalablytyped" %%% "color-convert" % "1.9-dt-20180214Z-6aa8a7",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-be7dc7",
  "org.scalablytyped" %%% "csstype" % "2.5.8-c53c8c",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-8f83bf",
  "org.scalablytyped" %%% "pegjs" % "v0.10.0-dt-20180522Z-944552",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-8f2b50",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-9a2db2",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190103Z-bafb95",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
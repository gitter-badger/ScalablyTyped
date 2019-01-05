organization := "org.scalablytyped"
name := "react-native-goby"
version := "0.0.5-f9428c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-c53c8c",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-9f5922",
  "org.scalablytyped" %%% "inquirer" % "0.0-unknown-dt-20180808Z-32bbb0",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-9283e5",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20181029Z-c4e557",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-8f2b50",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-9a2db2",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190103Z-bafb95",
  "org.scalablytyped" %%% "rx" % "4.1-dt-20180214Z-69acaa",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180214Z-029811",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180214Z-0f21e5",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181017Z-5aee7f",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20180214Z-3a8515",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-5373d8",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-26c527",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20180214Z-77dfab",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-834b52",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-eea16d",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-74c2de",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20180214Z-db01d0",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20180214Z-80aebf",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20180214Z-13eaac",
  "org.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20180925Z-17c65c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
organization := "org.scalablytyped"
name := "apollo-link-ws"
version := "1.0.12-7e0969"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-link" % "1.2.6-e5c089",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.27-e442b0",
  "org.scalablytyped" %%% "backo2" % "1.0-dt-20180601Z-e9685d",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.0-0af275",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-acc0be",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181231Z-71fd40",
  "org.scalablytyped" %%% "iterall" % "1.2.2-8404db",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.15-96b318",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-22c53e",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-d3f3a4",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-19c81d",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.13-408a22")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
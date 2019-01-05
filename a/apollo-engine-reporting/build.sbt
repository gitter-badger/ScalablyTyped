organization := "org.scalablytyped"
name := "apollo-engine-reporting"
version := "0.2.0-4013a0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.2.0-a62f71",
  "org.scalablytyped" %%% "apollo-server-env" % "2.2.0-cc7ec9",
  "org.scalablytyped" %%% "async-retry" % "1.2-dt-20180601Z-fed56e",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181231Z-71fd40",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-8f83bf",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-b07d38",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181119Z-bbc75c",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-66fc8a",
  "org.scalablytyped" %%% "protobufjs__aspromise" % "1.1.2-03717d",
  "org.scalablytyped" %%% "protobufjs__base64" % "1.1.2-7c7d44",
  "org.scalablytyped" %%% "protobufjs__codegen" % "2.0.4-b65569",
  "org.scalablytyped" %%% "protobufjs__eventemitter" % "1.1.0-c1f6dc",
  "org.scalablytyped" %%% "protobufjs__fetch" % "1.1.0-11ce72",
  "org.scalablytyped" %%% "protobufjs__float" % "1.0.2-e761ff",
  "org.scalablytyped" %%% "protobufjs__inquire" % "1.1.0-c89ba5",
  "org.scalablytyped" %%% "protobufjs__path" % "1.1.2-135e9e",
  "org.scalablytyped" %%% "protobufjs__pool" % "1.1.0-bb5753",
  "org.scalablytyped" %%% "protobufjs__utf8" % "1.1.0-9439d0",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "util_dot_promisify" % "1.0-dt-20180214Z-4e3ab7")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
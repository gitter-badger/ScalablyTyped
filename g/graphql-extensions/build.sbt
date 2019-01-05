organization := "org.scalablytyped"
name := "graphql-extensions"
version := "0.4.0-de85cd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-datasource" % "0.2.1-5c7650",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "0.2.0-4013a0",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.2.0-a62f71",
  "org.scalablytyped" %%% "apollo-env" % "0.2.5-eef4de",
  "org.scalablytyped" %%% "apollo-link" % "1.2.6-e5c089",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.2.1-ced0cf",
  "org.scalablytyped" %%% "apollo-server-core" % "2.3.1-54adbf",
  "org.scalablytyped" %%% "apollo-server-env" % "2.2.0-cc7ec9",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.2.0-0ae448",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.2.1-24bfc5",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.27-e442b0",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.2.9-caceb8",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.6-367862",
  "org.scalablytyped" %%% "async-retry" % "1.2-dt-20180601Z-fed56e",
  "org.scalablytyped" %%% "backo2" % "1.0-dt-20180601Z-e9685d",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-ddad3f",
  "org.scalablytyped" %%% "deprecated-decorator" % "0.1.6-15e99f",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.0-0af275",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-acc0be",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181231Z-71fd40",
  "org.scalablytyped" %%% "graphql-subscriptions" % "1.0.0-ed83b6",
  "org.scalablytyped" %%% "graphql-tag" % "2.10.0-7d493a",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.3-c459b7",
  "org.scalablytyped" %%% "iterall" % "1.2.2-8404db",
  "org.scalablytyped" %%% "json-stable-stringify" % "1.0-dt-20180214Z-cebf95",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-8f83bf",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-b07d38",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180530Z-facc5a",
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
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.15-96b318",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-22c53e",
  "org.scalablytyped" %%% "util_dot_promisify" % "1.0-dt-20180214Z-4e3ab7",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-766720",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-d3f3a4",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-19c81d",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.13-408a22")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
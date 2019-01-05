organization := "org.scalablytyped"
name := "firebase"
version := "5.7.2-2b0936"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-ddad3f",
  "org.scalablytyped" %%% "firebase__app" % "0.3.5-6e342e",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.2-bb4e20",
  "org.scalablytyped" %%% "firebase__auth" % "0.9.1-51a06c",
  "org.scalablytyped" %%% "firebase__auth-types" % "0.5.0-f51a59",
  "org.scalablytyped" %%% "firebase__database" % "0.3.8-71f6ad",
  "org.scalablytyped" %%% "firebase__database-types" % "0.3.2-68c97a",
  "org.scalablytyped" %%% "firebase__firestore" % "0.9.2-3eac43",
  "org.scalablytyped" %%% "firebase__firestore-types" % "0.8.0-e4377c",
  "org.scalablytyped" %%% "firebase__functions" % "0.3.3-ee85b8",
  "org.scalablytyped" %%% "firebase__functions-types" % "0.2.1-932486",
  "org.scalablytyped" %%% "firebase__logger" % "0.1.2-cd19f8",
  "org.scalablytyped" %%% "firebase__messaging" % "0.3.7-7d8e2f",
  "org.scalablytyped" %%% "firebase__messaging-types" % "0.2.3-7b7275",
  "org.scalablytyped" %%% "firebase__polyfill" % "0.3.3-0cd9fc",
  "org.scalablytyped" %%% "firebase__storage" % "0.2.4-c40c80",
  "org.scalablytyped" %%% "firebase__storage-types" % "0.2.3-793376",
  "org.scalablytyped" %%% "firebase__util" % "0.2.3-75d1b9",
  "org.scalablytyped" %%% "grpc" % "1.17.0-4f58fe",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20180214Z-ed98ef",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-8f83bf",
  "org.scalablytyped" %%% "lodash_dot_camelcase" % "4.3-dt-20180723Z-a9d2ad",
  "org.scalablytyped" %%% "lodash_dot_clone" % "4.5-dt-20180723Z-2a5752",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-b07d38",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "promise-polyfill" % "6.0-dt-20181107Z-e9b0fa",
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
  "org.scalablytyped" %%% "tslib" % "1.9.3-6dcdd5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
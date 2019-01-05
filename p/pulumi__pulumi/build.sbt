organization := "org.scalablytyped"
name := "pulumi__pulumi"
version := "0.16.9-49d8a9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-dddbcc",
  "org.scalablytyped" %%% "buffer-from" % "1.1-dt-20180616Z-aee973",
  "org.scalablytyped" %%% "diff" % "3.5-dt-20181102Z-ffcc4c",
  "org.scalablytyped" %%% "google-protobuf" % "3.2-dt-20180214Z-29faee",
  "org.scalablytyped" %%% "grpc" % "1.17.0-4f58fe",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-8f83bf",
  "org.scalablytyped" %%% "lodash_dot_camelcase" % "4.3-dt-20180723Z-a9d2ad",
  "org.scalablytyped" %%% "lodash_dot_clone" % "4.5-dt-20180723Z-2a5752",
  "org.scalablytyped" %%% "long" % "4.0.0-dt-20180425Z-b07d38",
  "org.scalablytyped" %%% "make-error" % "1.3.5-2bd9d4",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-ab73cf",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-e9357f",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180214Z-f56fcd",
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
  "org.scalablytyped" %%% "read-package-tree" % "5.2-dt-20180512Z-ef92b1",
  "org.scalablytyped" %%% "require-from-string" % "1.2-dt-20180214Z-e4556e",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180523Z-fc6353",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "ts-node" % "7.0.1-6c2bf1",
  "org.scalablytyped" %%% "typescript" % "3.2.2-593474",
  "org.scalablytyped" %%% "upath" % "1.1.0-b84ba9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
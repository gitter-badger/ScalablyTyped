organization := "org.scalablytyped"
name := "apollo-react"
version := "0.7.1-c3aba0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-cache" % "1.1.22-370b80",
  "org.scalablytyped" %%% "apollo-client" % "2.4.8-5cca52",
  "org.scalablytyped" %%% "apollo-link" % "1.2.6-e5c089",
  "org.scalablytyped" %%% "apollo-link-dedup" % "1.0.13-7e5a53",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.27-e442b0",
  "org.scalablytyped" %%% "csstype" % "2.5.8-c53c8c",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-acc0be",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181231Z-71fd40",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-9daabc",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20180214Z-890639",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-8f83bf",
  "org.scalablytyped" %%% "lodash_dot_flatten" % "4.4-dt-20180723Z-8e502f",
  "org.scalablytyped" %%% "lodash_dot_isequal" % "4.5-dt-20180723Z-512f66",
  "org.scalablytyped" %%% "lodash_dot_isobject" % "3.0-dt-20180723Z-51cc04",
  "org.scalablytyped" %%% "lodash_dot_pick" % "4.4-dt-20180723Z-8d4a62",
  "org.scalablytyped" %%% "object-assign" % "4.0.1-dt-20180214Z-13475b",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-8f2b50",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-9a2db2",
  "org.scalablytyped" %%% "redux" % "4.0.1-006f63",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-22c53e",
  "org.scalablytyped" %%% "typed-graphql" % "1.0.2-8f00c1",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-19c81d",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.13-408a22")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
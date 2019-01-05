organization := "org.scalablytyped"
name := "ionic__cli-framework"
version := "1.5.1-d8e28b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-8a8082",
  "org.scalablytyped" %%% "chalk" % "2.4.1-b7eb02",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-be7dc7",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-4790a3",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-33dc56",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-9f5922",
  "org.scalablytyped" %%% "inquirer" % "0.0-unknown-dt-20180808Z-32bbb0",
  "org.scalablytyped" %%% "ionic__utils-fs" % "0.0.6-a41aa5",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-8f83bf",
  "org.scalablytyped" %%% "log-update" % "2.0-dt-20180214Z-bd6fd7",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-9283e5",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-ab73cf",
  "org.scalablytyped" %%% "ncp" % "v2.0.0-dt-20180214Z-fda3cf",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "rimraf" % "2.0-dt-20180214Z-d44863",
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
  "org.scalablytyped" %%% "slice-ansi" % "2.0-dt-20181119Z-a9f7a4",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "string-width" % "2.0-dt-20180530Z-8e7c69",
  "org.scalablytyped" %%% "strip-ansi" % "3.0-dt-20180214Z-aefeb8",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-581bf6",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20180214Z-13eaac",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-c50061",
  "org.scalablytyped" %%% "tree-kill" % "1.2.1-766cbe",
  "org.scalablytyped" %%% "tslib" % "1.9.3-6dcdd5",
  "org.scalablytyped" %%% "untildify" % "3.0-dt-20180214Z-522818",
  "org.scalablytyped" %%% "wrap-ansi" % "v3.0.0-dt-20180323Z-0b06ca",
  "org.scalablytyped" %%% "write-file-atomic" % "2.1-dt-20180214Z-446481")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
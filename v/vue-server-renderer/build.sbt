organization := "org.scalablytyped"
name := "vue-server-renderer"
version := "2.5.21-57badf"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-8a8082",
  "org.scalablytyped" %%% "chalk" % "2.4.1-b7eb02",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-be7dc7",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-33dc56",
  "org.scalablytyped" %%% "hash-sum" % "1.0-dt-20180822Z-f611ce",
  "org.scalablytyped" %%% "he" % "v1.1.1-dt-20180507Z-40ad34",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-8f83bf",
  "org.scalablytyped" %%% "lodash_dot_template" % "4.4-dt-20180723Z-d4c2eb",
  "org.scalablytyped" %%% "lodash_dot_uniq" % "4.5-dt-20180723Z-3cc797",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "resolve" % "0.0-unknown-dt-20180507Z-325645",
  "org.scalablytyped" %%% "serialize-javascript" % "1.5-dt-20181015Z-c8066b",
  "org.scalablytyped" %%% "source-map" % "0.7.3-c639f4",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-581bf6",
  "org.scalablytyped" %%% "vue" % "2.5.21-d1f983")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
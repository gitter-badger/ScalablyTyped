organization := "org.scalablytyped"
name := "ecmarkup"
version := "3.16.0-e3b67f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-8a8082",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-1c3671",
  "org.scalablytyped" %%% "chalk" % "2.4.1-b7eb02",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-be7dc7",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-33dc56",
  "org.scalablytyped" %%% "grammarkdown" % "2.0.11-0ea5ce",
  "org.scalablytyped" %%% "he" % "v1.1.1-dt-20180507Z-40ad34",
  "org.scalablytyped" %%% "highlight_dot_js" % "v9.12-dt-20180214Z-60bfef",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20181220Z-f2aa44",
  "org.scalablytyped" %%% "jsdom" % "12.2-dt-20181121Z-3e88b5",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "nomnom" % "0.0-unknown-dt-20180214Z-df1e34",
  "org.scalablytyped" %%% "parse5" % "5.0-dt-20180611Z-2e6c37",
  "org.scalablytyped" %%% "prex" % "0.4.5-6b5190",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-581bf6",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181015Z-626b78")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
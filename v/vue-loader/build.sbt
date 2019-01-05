organization := "org.scalablytyped"
name := "vue-loader"
version := "15.4.2-680e40"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-8a8082",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180214Z-1bdaa7",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-1c3671",
  "org.scalablytyped" %%% "chalk" % "2.4.1-b7eb02",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-be7dc7",
  "org.scalablytyped" %%% "consolidate" % "0.0-unknown-dt-20180712Z-fdbce3",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-33dc56",
  "org.scalablytyped" %%% "hash-sum" % "1.0-dt-20180822Z-f611ce",
  "org.scalablytyped" %%% "js-base64" % "2.3-dt-20180214Z-2e185a",
  "org.scalablytyped" %%% "loader-utils" % "1.1-dt-20180306Z-8b735d",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180530Z-facc5a",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "postcss" % "5.2.18-c64749",
  "org.scalablytyped" %%% "prettier" % "1.15-dt-20181124Z-c435c4",
  "org.scalablytyped" %%% "source-map" % "0.7.3-c639f4",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-581bf6",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-d5f9eb",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-1864c7",
  "org.scalablytyped" %%% "vue__component-compiler-utils" % "2.3.1-1f4aba",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20181221Z-7baef8")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
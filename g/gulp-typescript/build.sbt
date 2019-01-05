organization := "org.scalablytyped"
name := "gulp-typescript"
version := "5.0.0-9136d6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-colors" % "3.2-dt-20181231Z-7c2f9d",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-9f5922",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180214Z-9b6f88",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-9283e5",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20180214Z-258b19",
  "org.scalablytyped" %%% "source-map" % "0.7.3-c639f4",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-c50061",
  "org.scalablytyped" %%% "typescript" % "3.2.2-593474",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-f9547d",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20181121Z-0caabd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
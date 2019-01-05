organization := "org.scalablytyped"
name := "gulp-help-doc"
version := "0.0-unknown-dt-20180214Z-3ed094"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chokidar" % "1.7-dt-20180226Z-22c546",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-9f5922",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180214Z-9b6f88",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20180214Z-c8d927",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-9283e5",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20180217Z-98af11",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-9c8acc",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-f9547d",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20181121Z-0caabd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
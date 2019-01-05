organization := "org.scalablytyped"
name := "gulp-typedoc"
version := "2.2.1-e1098c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-colors" % "3.2-dt-20181231Z-7c2f9d",
  "org.scalablytyped" %%% "event-stream" % "v3.3.2-dt-20180510Z-3c97af",
  "org.scalablytyped" %%% "fancy-log" % "1.3-dt-20180214Z-d2e75e",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180706Z-c657d8",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-9f5922",
  "org.scalablytyped" %%% "handlebars" % "v4.0.11-dt-20181213Z-497ba0",
  "org.scalablytyped" %%% "highlight_dot_js" % "v9.12-dt-20180214Z-60bfef",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-8f83bf",
  "org.scalablytyped" %%% "marked" % "0.6-dt-20190102Z-ea0cef",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-9283e5",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20180214Z-258b19",
  "org.scalablytyped" %%% "progress" % "2.0-dt-20181213Z-97158a",
  "org.scalablytyped" %%% "shelljs" % "0.8-dt-20181206Z-53f7fa",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "typedoc" % "0.14.0-a91751",
  "org.scalablytyped" %%% "typescript" % "3.2.2-593474")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
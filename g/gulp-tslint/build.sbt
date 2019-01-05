organization := "org.scalablytyped"
name := "gulp-tslint"
version := "8.1.3-efff0e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-8a8082",
  "org.scalablytyped" %%% "babel-code-frame" % "6.20-dt-20180214Z-055c66",
  "org.scalablytyped" %%% "builtin-modules" % "2.0-dt-20180214Z-b4916d",
  "org.scalablytyped" %%% "chalk" % "2.4.1-b7eb02",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-be7dc7",
  "org.scalablytyped" %%% "commander" % "2.19.0-ad2033",
  "org.scalablytyped" %%% "diff" % "3.5-dt-20181102Z-ffcc4c",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-33dc56",
  "org.scalablytyped" %%% "fancy-log" % "1.3-dt-20180214Z-d2e75e",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-9f5922",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20181220Z-f2aa44",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-9283e5",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20180214Z-258b19",
  "org.scalablytyped" %%% "resolve" % "0.0-unknown-dt-20180507Z-325645",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-6ffbb3",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-581bf6",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20180214Z-13eaac",
  "org.scalablytyped" %%% "tslib" % "1.9.3-6dcdd5",
  "org.scalablytyped" %%% "tslint" % "5.12.0-b15f95",
  "org.scalablytyped" %%% "tsutils" % "2.29.0-99b706",
  "org.scalablytyped" %%% "typescript" % "3.2.2-593474")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
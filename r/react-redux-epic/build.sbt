organization := "org.scalablytyped"
name := "react-redux-epic"
version := "1.1-dt-20181017Z-cde51d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-c53c8c",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-8f2b50",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-9a2db2",
  "org.scalablytyped" %%% "redux" % "4.0.1-006f63",
  "org.scalablytyped" %%% "redux-observable" % "1.0.0-0143db",
  "org.scalablytyped" %%% "rxjs" % "6.3.3-fe05c7",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-22c53e",
  "org.scalablytyped" %%% "tslib" % "1.9.3-6dcdd5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
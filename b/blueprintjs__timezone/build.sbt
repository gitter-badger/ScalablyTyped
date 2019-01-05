organization := "org.scalablytyped"
name := "blueprintjs__timezone"
version := "3.1.0-8924db"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "blueprintjs__core" % "3.10.0-157b7d",
  "org.scalablytyped" %%% "blueprintjs__icons" % "3.4.0-66a061",
  "org.scalablytyped" %%% "blueprintjs__select" % "3.4.0-a8c83a",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-c754c3",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-226252",
  "org.scalablytyped" %%% "csstype" % "2.5.8-c53c8c",
  "org.scalablytyped" %%% "dom4" % "v2.0-dt-20180806Z-5aaf0e",
  "org.scalablytyped" %%% "moment" % "2.23.0-87137f",
  "org.scalablytyped" %%% "moment-timezone" % "0.5-dt-20181231Z-39941d",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "popper_dot_js" % "1.14.6-aaf038",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-8f2b50",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-9a2db2",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-ba2fb9",
  "org.scalablytyped" %%% "react-popper" % "1.3.2-c1493d",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20181219Z-52cb3c",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-4653eb",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "tslib" % "1.9.3-6dcdd5",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180214Z-e21922")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
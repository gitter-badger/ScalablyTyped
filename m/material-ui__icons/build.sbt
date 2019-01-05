organization := "org.scalablytyped"
name := "material-ui__icons"
version := "3.0.1-10c191"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-c754c3",
  "org.scalablytyped" %%% "csstype" % "2.5.8-c53c8c",
  "org.scalablytyped" %%% "debounce" % "1.2-dt-20181201Z-2c0a18",
  "org.scalablytyped" %%% "deepmerge" % "3.0.0-7e862c",
  "org.scalablytyped" %%% "dom-helpers" % "3.4-dt-20181128Z-dd0743",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-9daabc",
  "org.scalablytyped" %%% "indefinite-observable" % "2.0.1-5125d6",
  "org.scalablytyped" %%% "is-plain-object" % "2.0.4-7619ac",
  "org.scalablytyped" %%% "isobject" % "3.0.1-d99fd5",
  "org.scalablytyped" %%% "jss" % "9.5-dt-20181017Z-3ee997",
  "org.scalablytyped" %%% "keycode" % "2.2.0-26c375",
  "org.scalablytyped" %%% "material-ui__core" % "3.8.1-6648b8",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "normalize-scroll-left" % "0.1.2-87f8b4",
  "org.scalablytyped" %%% "popper_dot_js" % "1.14.6-aaf038",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-8f2b50",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-9a2db2",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-ba2fb9",
  "org.scalablytyped" %%% "react-event-listener" % "0.4-dt-20180803Z-1c4965",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20181219Z-52cb3c",
  "org.scalablytyped" %%% "recompose" % "0.30-dt-20181212Z-a970b9",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-22c53e",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180214Z-e21922")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
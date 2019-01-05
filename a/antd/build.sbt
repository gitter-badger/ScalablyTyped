organization := "org.scalablytyped"
name := "antd"
version := "3.11.6-2b02a4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ant-design__icons" % "1.1.16-fc9e60",
  "org.scalablytyped" %%% "ant-design__icons-react" % "1.1.2-541e14",
  "org.scalablytyped" %%% "array-tree-filter" % "2.1.0-d752e9",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-c754c3",
  "org.scalablytyped" %%% "create-react-class" % "15.6-dt-20180806Z-523c3d",
  "org.scalablytyped" %%% "create-react-context" % "0.2.2-226252",
  "org.scalablytyped" %%% "csstype" % "2.5.8-c53c8c",
  "org.scalablytyped" %%% "enquire_dot_js" % "2.1-dt-20180328Z-80054c",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-8f83bf",
  "org.scalablytyped" %%% "moment" % "2.23.0-87137f",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-8f2b50",
  "org.scalablytyped" %%% "raf" % "3.4-dt-20190103Z-ebb48c",
  "org.scalablytyped" %%% "rc-calendar" % "9.8.2-e22817",
  "org.scalablytyped" %%% "rc-dialog" % "7.2.1-076ecb",
  "org.scalablytyped" %%% "rc-progress" % "2.2-dt-20181116Z-94ce2d",
  "org.scalablytyped" %%% "rc-select" % "v5.9.0-dt-20180823Z-2d32a1",
  "org.scalablytyped" %%% "rc-slider" % "8.6-dt-20180822Z-2a4a62",
  "org.scalablytyped" %%% "rc-time-picker" % "3.4-dt-20181102Z-6c6318",
  "org.scalablytyped" %%% "rc-tooltip" % "3.7-dt-20181121Z-5a9390",
  "org.scalablytyped" %%% "rc-tree" % "1.11-dt-20180803Z-2dcfb9",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-9a2db2",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-ba2fb9",
  "org.scalablytyped" %%% "react-slick" % "0.23-dt-20180806Z-45e15f",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-4653eb",
  "org.scalablytyped" %%% "shallowequal" % "1.1-dt-20181231Z-efa2d3",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "warning" % "3.0.0-dt-20180214Z-e21922")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
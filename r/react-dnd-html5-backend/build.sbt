organization := "org.scalablytyped"
name := "react-dnd-html5-backend"
version := "7.0.2-69a4b6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "asap" % "2.0-dt-20180629Z-3cebae",
  "org.scalablytyped" %%% "dnd-core" % "7.0.2-5250da",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20180214Z-890639",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-8f83bf",
  "org.scalablytyped" %%% "redux" % "4.0.1-006f63",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-22c53e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
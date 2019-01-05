organization := "org.scalablytyped"
name := "router5"
version := "7.0.1-b356e6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "path-parser" % "4.2.0-0ff25b",
  "org.scalablytyped" %%% "route-node" % "3.4.2-0cea93",
  "org.scalablytyped" %%% "router5-transition-path" % "7.0.0-7dba0d",
  "org.scalablytyped" %%% "search-params" % "2.1.3-3f448e",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-22c53e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
organization := "org.scalablytyped"
name := "cordova_dot_plugins_dot_diagnostic"
version := "4.0.10-5e57c2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "colors" % "1.3.3-012f5f",
  "org.scalablytyped" %%% "cordova" % "0.0-unknown-dt-20181116Z-dce7a5",
  "org.scalablytyped" %%% "elementtree" % "0.1-dt-20180830Z-523b25",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-ab73cf",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
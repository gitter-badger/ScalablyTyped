organization := "org.scalablytyped"
name := "handsontable"
version := "6.2.2-188abf"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bignumber_dot_js" % "8.0.1-71c7ce",
  "org.scalablytyped" %%% "moment" % "2.23.0-87137f",
  "org.scalablytyped" %%% "numbro" % "2.1.1-fa9578",
  "org.scalablytyped" %%% "pikaday" % "1.7-dt-20181116Z-93e87a",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
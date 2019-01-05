organization := "org.scalablytyped"
name := "jest-matcher-utils"
version := "21.0-dt-20180214Z-88ef72"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-8a8082",
  "org.scalablytyped" %%% "chalk" % "2.4.1-b7eb02",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-be7dc7",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-33dc56",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-581bf6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
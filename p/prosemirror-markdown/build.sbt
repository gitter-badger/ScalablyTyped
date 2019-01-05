organization := "org.scalablytyped"
name := "prosemirror-markdown"
version := "1.0-dt-20181102Z-76a0e9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "linkify-it" % "2.0.3-dt-20181017Z-747ea5",
  "org.scalablytyped" %%% "markdown-it" % "0.0-unknown-dt-20181102Z-4f3c0d",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180214Z-f9723c",
  "org.scalablytyped" %%% "prosemirror-model" % "1.5-dt-20180621Z-8f166c",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
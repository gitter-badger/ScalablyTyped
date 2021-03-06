organization := "org.scalablytyped"
name := "prosemirror-collab"
version := "1.0-dt-20180504Z-90540c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180214Z-2c5902",
  "org.scalablytyped" %%% "prosemirror-model" % "1.5-dt-20180621Z-0ce40a",
  "org.scalablytyped" %%% "prosemirror-state" % "1.2-dt-20180621Z-943f72",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.1-dt-20180621Z-25f04b",
  "org.scalablytyped" %%% "prosemirror-view" % "1.3-dt-20180621Z-8e4af5",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
organization := "org.scalablytyped"
name := "prosemirror-tables"
version := "0.1-dt-20180420Z-90bf5f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180214Z-f9723c",
  "org.scalablytyped" %%% "prosemirror-model" % "1.5-dt-20180621Z-8f166c",
  "org.scalablytyped" %%% "prosemirror-state" % "1.2-dt-20180621Z-691947",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.1-dt-20180621Z-da6d93",
  "org.scalablytyped" %%% "prosemirror-view" % "1.3-dt-20180621Z-6fcc78",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
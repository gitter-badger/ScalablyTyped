organization := "org.scalablytyped"
name := "sentence-case"
version := "2.1.1-31af2a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "lower-case" % "1.1.4-ac4235",
  "org.scalablytyped" %%% "no-case" % "2.3.2-bd94dc",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "upper-case" % "1.1.3-46a299",
  "org.scalablytyped" %%% "upper-case-first" % "1.1.2-7c0f3b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
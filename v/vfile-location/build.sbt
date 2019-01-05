organization := "org.scalablytyped"
name := "vfile-location"
version := "2.0-dt-20181127Z-f97920"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20181205Z-83a90e",
  "org.scalablytyped" %%% "vfile" % "3.0-dt-20181205Z-ed2bc0",
  "org.scalablytyped" %%% "vfile-message" % "1.0-dt-20181205Z-231db7")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
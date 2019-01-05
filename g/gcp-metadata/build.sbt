organization := "org.scalablytyped"
name := "gcp-metadata"
version := "0.7.0-0c826b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "axios" % "0.18.0-d5afd8",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20180214Z-4402af",
  "org.scalablytyped" %%% "is-buffer" % "2.0-dt-20181210Z-ac7c1f",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "retry-axios" % "0.3.2-fde2b9",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
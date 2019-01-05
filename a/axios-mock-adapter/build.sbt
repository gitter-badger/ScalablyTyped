organization := "org.scalablytyped"
name := "axios-mock-adapter"
version := "1.16.0-6d0ebf"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "axios" % "0.18.0-d5afd8",
  "org.scalablytyped" %%% "deep-equal" % "1.0-dt-20180214Z-9d55d3",
  "org.scalablytyped" %%% "is-buffer" % "2.0-dt-20181210Z-ac7c1f",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
organization := "org.scalablytyped"
name := "aws-sdk"
version := "2.383.0-2bda72"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "events" % "1.2-dt-20180226Z-c531be",
  "org.scalablytyped" %%% "jmespath" % "0.15-dt-20180214Z-bc33c0",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-579628",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-766720",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180606Z-e97b86")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
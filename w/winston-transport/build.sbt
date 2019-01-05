organization := "org.scalablytyped"
name := "winston-transport"
version := "4.2.0-04f2a9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-84d423",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20181231Z-950c17",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-fd38e3",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-b37dbb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
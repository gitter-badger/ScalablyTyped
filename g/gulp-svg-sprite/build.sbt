organization := "org.scalablytyped"
name := "gulp-svg-sprite"
version := "1.2.9-dt-20181017Z-507d94"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.0.1-dt-20181121Z-00e9c5",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180214Z-2499a9",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-84d423",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "one-time" % "0.0-dt-20181231Z-9c4f81",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20181231Z-950c17",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-fd38e3",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180214Z-6e93fd",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "svg-sprite" % "0.0-unknown-dt-20181017Z-d648e3",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-b37dbb",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-f9547d",
  "org.scalablytyped" %%% "winston" % "3.1.0-70dae1",
  "org.scalablytyped" %%% "winston-transport" % "4.2.0-04f2a9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
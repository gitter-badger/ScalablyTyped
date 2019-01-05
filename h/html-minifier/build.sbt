organization := "org.scalablytyped"
name := "html-minifier"
version := "3.5-dt-20181017Z-17c53d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "clean-css" % "v3.4.9-dt-20180214Z-b48a7d",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20180214Z-ae5896",
  "org.scalablytyped" %%% "source-map" % "0.7.3-c639f4",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-1864c7")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
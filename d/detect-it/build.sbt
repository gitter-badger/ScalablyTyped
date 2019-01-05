organization := "org.scalablytyped"
name := "detect-it"
version := "2.1-dt-20180214Z-dace92"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "detect-hover" % "1.0-dt-20180214Z-fedccd",
  "org.scalablytyped" %%% "detect-passive-events" % "1.0-dt-20180214Z-3efccd",
  "org.scalablytyped" %%% "detect-pointer" % "1.0-dt-20180214Z-812353",
  "org.scalablytyped" %%% "detect-touch-events" % "1.0-dt-20180214Z-50a856",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
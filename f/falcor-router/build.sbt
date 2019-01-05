organization := "org.scalablytyped"
name := "falcor-router"
version := "0.4.0-dt-20180214Z-22e483"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "falcor" % "0.1-dt-20180214Z-bfb56f",
  "org.scalablytyped" %%% "falcor-http-datasource" % "0.1.3-dt-20180214Z-b0bf74",
  "org.scalablytyped" %%% "falcor-json-graph" % "1.1.7-dt-20180214Z-adeb77",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
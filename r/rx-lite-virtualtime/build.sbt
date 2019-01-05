organization := "org.scalablytyped"
name := "rx-lite-virtualtime"
version := "4.0-dt-20180214Z-80aebf"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180214Z-029811",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180214Z-0f21e5",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181017Z-5aee7f",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
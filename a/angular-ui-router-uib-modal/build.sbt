organization := "org.scalablytyped"
name := "angular-ui-router-uib-modal"
version := "0.0.11-e6bb7b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20181217Z-782143",
  "org.scalablytyped" %%% "angular-ui-bootstrap" % "0.13.3-dt-20180721Z-efd9bc",
  "org.scalablytyped" %%% "angular-ui-router" % "1.1.38-dt-20180214Z-dea6b9",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
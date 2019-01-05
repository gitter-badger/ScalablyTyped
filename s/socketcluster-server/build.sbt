organization := "org.scalablytyped"
name := "socketcluster-server"
version := "14.2-dt-20190103Z-6daf47"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.0.1-dt-20181121Z-00e9c5",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20180414Z-97c517",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-3d8377",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-db08b5",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20181101Z-3ba1c5",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-531f80",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20181218Z-70b4a6",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-733b73",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20181218Z-daf739",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-d3f3a4")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
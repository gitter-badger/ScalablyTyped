organization := "org.scalablytyped"
name := "mendixmodelsdk"
version := "4.18.0-8f138e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-485138",
  "org.scalablytyped" %%% "deep-equal" % "1.0-dt-20180214Z-9d55d3",
  "org.scalablytyped" %%% "eventsource" % "1.0-dt-20180522Z-76c7ba",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-e1da01",
  "org.scalablytyped" %%% "mobx" % "5.8.0-e78d1b",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-434e1e",
  "org.scalablytyped" %%% "requestretry" % "1.12-dt-20180214Z-e827c8",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181015Z-626b78",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-766720",
  "org.scalablytyped" %%% "wolfy87-eventemitter" % "5.2.5-c5a66d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
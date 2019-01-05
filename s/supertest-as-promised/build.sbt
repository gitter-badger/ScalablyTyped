organization := "org.scalablytyped"
name := "supertest-as-promised"
version := "2.0-dt-20180712Z-8168a0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-1c3671",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20180706Z-15651f",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "superagent" % "3.8-dt-20181230Z-076ce5",
  "org.scalablytyped" %%% "supertest" % "v2.0.1-dt-20181121Z-d335f6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
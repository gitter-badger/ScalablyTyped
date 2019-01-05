organization := "org.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20180712Z-1bc598"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-1c3671",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20180709Z-6a3b6e",
  "org.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20181128Z-5e5663",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20181129Z-69a71c",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
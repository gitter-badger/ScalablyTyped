organization := "org.scalablytyped"
name := "chromecast-caf-sender"
version := "1.0-dt-20180921Z-d2070b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20181231Z-65346c",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20180827Z-166d75",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20180214Z-8bf78e",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
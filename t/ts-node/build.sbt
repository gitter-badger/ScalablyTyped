organization := "org.scalablytyped"
name := "ts-node"
version := "7.0.1-6c2bf1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-dddbcc",
  "org.scalablytyped" %%% "buffer-from" % "1.1-dt-20180616Z-aee973",
  "org.scalablytyped" %%% "diff" % "3.5-dt-20181102Z-ffcc4c",
  "org.scalablytyped" %%% "make-error" % "1.3.5-2bd9d4",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-ab73cf",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-e9357f",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180523Z-fc6353",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "typescript" % "3.2.2-593474")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
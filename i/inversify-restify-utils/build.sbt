organization := "org.scalablytyped"
name := "inversify-restify-utils"
version := "3.4.0-19b3af"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20181009Z-9c6560",
  "org.scalablytyped" %%% "gulp-debug" % "v2.0.1-dt-20180214Z-7a341b",
  "org.scalablytyped" %%% "inversify" % "5.0.1-a27f45",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20181231Z-ef7e3a",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-2300cd",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
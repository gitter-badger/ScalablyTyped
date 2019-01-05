organization := "org.scalablytyped"
name := "cwise"
version := "1.0-dt-20180214Z-9a1ab2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "cwise-compiler" % "1.1-dt-20180214Z-153379",
  "org.scalablytyped" %%% "cwise-parser" % "1.0-dt-20180301Z-8ecf4b",
  "org.scalablytyped" %%% "ndarray" % "1.0-dt-20180310Z-697b38",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
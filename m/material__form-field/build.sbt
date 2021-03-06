organization := "org.scalablytyped"
name := "material__form-field"
version := "0.35-dt-20180511Z-ad6e9d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20180511Z-6c5aff",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20180511Z-616fba",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20180511Z-0eca2d",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
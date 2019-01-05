organization := "org.scalablytyped"
name := "material__textfield"
version := "0.35-dt-20180511Z-debca4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20180511Z-d27ab7",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20180511Z-2bd2c9",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20180511Z-fa5b46",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20180511Z-802e72",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20180511Z-dc4aeb",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
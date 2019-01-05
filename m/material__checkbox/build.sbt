organization := "org.scalablytyped"
name := "material__checkbox"
version := "0.35-dt-20180511Z-4c43d4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20180511Z-d27ab7",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20180511Z-dc4aeb",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20180511Z-4598c9",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
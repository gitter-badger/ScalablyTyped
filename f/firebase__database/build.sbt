organization := "org.scalablytyped"
name := "firebase__database"
version := "0.3.8-71f6ad"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "firebase__app" % "0.3.5-6e342e",
  "org.scalablytyped" %%% "firebase__app-types" % "0.3.2-bb4e20",
  "org.scalablytyped" %%% "firebase__database-types" % "0.3.2-68c97a",
  "org.scalablytyped" %%% "firebase__logger" % "0.1.2-cd19f8",
  "org.scalablytyped" %%% "firebase__util" % "0.2.3-75d1b9",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "tslib" % "1.9.3-6dcdd5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
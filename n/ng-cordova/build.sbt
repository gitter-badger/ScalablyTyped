organization := "org.scalablytyped"
name := "ng-cordova"
version := "0.0-unknown-dt-20181124Z-24e428"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20181217Z-782143",
  "org.scalablytyped" %%% "cordova" % "0.0-unknown-dt-20181116Z-dce7a5",
  "org.scalablytyped" %%% "cordova-plugin-camera" % "4.0.3-76d107",
  "org.scalablytyped" %%% "cordova-plugin-file" % "6.0.1-ff5342",
  "org.scalablytyped" %%% "cordova-plugin-file-transfer" % "1.7.1-113ccb",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
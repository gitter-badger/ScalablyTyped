organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "4.1-dt-20180825Z-6da089"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "imagemin" % "6.0-dt-20180823Z-f96646",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-f3536e",
  "org.scalablytyped" %%% "imagemin-jpegtran" % "5.0-dt-20180825Z-21598d",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-b7ebfe",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-493574",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "svgo" % "1.0-dt-20180507Z-06a099")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
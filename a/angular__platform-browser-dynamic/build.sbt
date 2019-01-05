organization := "org.scalablytyped"
name := "angular__platform-browser-dynamic"
version := "7.1.4-ad7891"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular__common" % "7.1.4-f73eef",
  "org.scalablytyped" %%% "angular__compiler" % "7.1.4-b198bd",
  "org.scalablytyped" %%% "angular__core" % "7.1.4-f553de",
  "org.scalablytyped" %%% "angular__platform-browser" % "7.1.4-3bc007",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "rxjs" % "6.3.3-fe05c7",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "tslib" % "1.9.3-6dcdd5",
  "org.scalablytyped" %%% "zone_dot_js" % "0.8.26-d6891b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
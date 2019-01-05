organization := "org.scalablytyped"
name := "activex-access"
version := "14.0-dt-20180522Z-3cd3ec"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20180513Z-f337e2",
  "org.scalablytyped" %%% "activex-dao" % "16.0-dt-20180513Z-359aa6",
  "org.scalablytyped" %%% "activex-helpers" % "1.0.2-07dc3a",
  "org.scalablytyped" %%% "activex-interop" % "0.0-dt-20180721Z-c66cb4",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20180721Z-4a3654",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20180721Z-a56e14",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20180522Z-8b0181",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20180513Z-f95598",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
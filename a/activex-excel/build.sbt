organization := "org.scalablytyped"
name := "activex-excel"
version := "14.0-dt-20180721Z-570b98"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "activex-adodb" % "6.1-dt-20180513Z-8aa25c",
  "org.scalablytyped" %%% "activex-dao" % "16.0-dt-20180513Z-a029f0",
  "org.scalablytyped" %%% "activex-helpers" % "1.0.2-414d28",
  "org.scalablytyped" %%% "activex-interop" % "0.0-dt-20180721Z-ad213e",
  "org.scalablytyped" %%% "activex-office" % "16.0-dt-20180721Z-b1b041",
  "org.scalablytyped" %%% "activex-outlook" % "14.0-dt-20180721Z-727ac3",
  "org.scalablytyped" %%% "activex-stdole" % "2.0-dt-20180522Z-09b674",
  "org.scalablytyped" %%% "activex-vbide" % "14.0-dt-20180513Z-5ac481",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
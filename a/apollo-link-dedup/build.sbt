organization := "org.scalablytyped"
name := "apollo-link-dedup"
version := "1.0.13-7e5a53"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-link" % "1.2.6-e5c089",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.27-e442b0",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-acc0be",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181231Z-71fd40",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-19c81d",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.13-408a22")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
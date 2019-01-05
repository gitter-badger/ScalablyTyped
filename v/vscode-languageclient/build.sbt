organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "5.2.1-96d549"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-6ffbb3",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-139872",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-f83ec4",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-2d613a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
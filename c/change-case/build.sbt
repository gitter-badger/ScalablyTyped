organization := "org.scalablytyped"
name := "change-case"
version := "3.0.2-7b32c3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "camel-case" % "3.0.0-96dbf4",
  "org.scalablytyped" %%% "constant-case" % "2.0.0-10ded1",
  "org.scalablytyped" %%% "dot-case" % "2.1.1-ce3d5d",
  "org.scalablytyped" %%% "header-case" % "1.0.1-d033c0",
  "org.scalablytyped" %%% "is-lower-case" % "1.1.3-6188db",
  "org.scalablytyped" %%% "is-upper-case" % "1.1.2-20183d",
  "org.scalablytyped" %%% "lower-case" % "1.1.4-ac4235",
  "org.scalablytyped" %%% "lower-case-first" % "1.0.2-84ff4e",
  "org.scalablytyped" %%% "no-case" % "2.3.2-bd94dc",
  "org.scalablytyped" %%% "param-case" % "2.1.1-2e9c8d",
  "org.scalablytyped" %%% "pascal-case" % "2.0.1-4eacef",
  "org.scalablytyped" %%% "path-case" % "2.1.1-476a0b",
  "org.scalablytyped" %%% "sentence-case" % "2.1.1-31af2a",
  "org.scalablytyped" %%% "snake-case" % "2.1.0-f9a6c9",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "swap-case" % "1.1.2-ad29ff",
  "org.scalablytyped" %%% "title-case" % "2.1.1-7da3d8",
  "org.scalablytyped" %%% "upper-case" % "1.1.3-46a299",
  "org.scalablytyped" %%% "upper-case-first" % "1.1.2-7c0f3b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
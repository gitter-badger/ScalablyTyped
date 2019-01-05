organization := "org.scalablytyped"
name := "google-auth-library"
version := "2.0.2-28df6a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "axios" % "0.18.0-d5afd8",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20180214Z-4402af",
  "org.scalablytyped" %%% "gcp-metadata" % "0.7.0-0c826b",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-4bbabb",
  "org.scalablytyped" %%% "gtoken" % "2.3.0-d64be8",
  "org.scalablytyped" %%% "is-buffer" % "2.0-dt-20181210Z-ac7c1f",
  "org.scalablytyped" %%% "jws" % "3.1-dt-20180817Z-41ef2a",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180530Z-facc5a",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-e9f135",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20181204Z-98ebdb",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-f11a0a",
  "org.scalablytyped" %%% "retry-axios" % "0.3.2-fde2b9",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-6ffbb3",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
organization := "org.scalablytyped"
name := "google-cloud__common"
version := "0.27.0-289e60"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-dddbcc",
  "org.scalablytyped" %%% "axios" % "0.18.0-d5afd8",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-485138",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-157f88",
  "org.scalablytyped" %%% "ent" % "2.2.0-dt-20180214Z-df27cd",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20180214Z-4402af",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-e1da01",
  "org.scalablytyped" %%% "gcp-metadata" % "0.7.0-0c826b",
  "org.scalablytyped" %%% "google-auth-library" % "2.0.2-28df6a",
  "org.scalablytyped" %%% "google-cloud__projectify" % "0.3.2-86ebdc",
  "org.scalablytyped" %%% "google-cloud__promisify" % "0.3.1-698e8a",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-4bbabb",
  "org.scalablytyped" %%% "gtoken" % "2.3.0-d64be8",
  "org.scalablytyped" %%% "is-buffer" % "2.0-dt-20181210Z-ac7c1f",
  "org.scalablytyped" %%% "jws" % "3.1-dt-20180817Z-41ef2a",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180530Z-facc5a",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-e9f135",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20181204Z-98ebdb",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-f11a0a",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-434e1e",
  "org.scalablytyped" %%% "retry-axios" % "0.3.2-fde2b9",
  "org.scalablytyped" %%% "retry-request" % "4.0.0-5e06fb",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-6ffbb3",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-c50061",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181015Z-626b78")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
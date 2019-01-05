organization := "org.scalablytyped"
name := "google-cloud__storage"
version := "2.3.4-b09d0e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "arrify" % "1.0-dt-20180509Z-dddbcc",
  "org.scalablytyped" %%% "async" % "2.0.1-dt-20181121Z-00e9c5",
  "org.scalablytyped" %%% "axios" % "0.18.0-d5afd8",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-485138",
  "org.scalablytyped" %%% "compressible" % "2.0-dt-20180214Z-65ba32",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-d7d5f2",
  "org.scalablytyped" %%% "configstore" % "4.0-dt-20181202Z-90965e",
  "org.scalablytyped" %%% "duplexify" % "3.6-dt-20181030Z-157f88",
  "org.scalablytyped" %%% "ent" % "2.2.0-dt-20180214Z-df27cd",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20180214Z-4402af",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-e1da01",
  "org.scalablytyped" %%% "gcp-metadata" % "0.7.0-0c826b",
  "org.scalablytyped" %%% "gcs-resumable-upload" % "0.13.0-8f8b47",
  "org.scalablytyped" %%% "google-auth-library" % "2.0.2-28df6a",
  "org.scalablytyped" %%% "google-cloud__common" % "0.27.0-289e60",
  "org.scalablytyped" %%% "google-cloud__paginator" % "0.1.2-de3ca0",
  "org.scalablytyped" %%% "google-cloud__projectify" % "0.3.2-86ebdc",
  "org.scalablytyped" %%% "google-cloud__promisify" % "0.3.1-698e8a",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-4bbabb",
  "org.scalablytyped" %%% "gtoken" % "2.3.0-d64be8",
  "org.scalablytyped" %%% "is" % "0.0-unknown-dt-20181106Z-139beb",
  "org.scalablytyped" %%% "is-buffer" % "2.0-dt-20181210Z-ac7c1f",
  "org.scalablytyped" %%% "is-stream-ended" % "0.1.4-bb6dfb",
  "org.scalablytyped" %%% "jws" % "3.1-dt-20180817Z-41ef2a",
  "org.scalablytyped" %%% "lru-cache" % "4.1-dt-20180530Z-facc5a",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-e9f135",
  "org.scalablytyped" %%% "mime-types" % "2.1-dt-20180214Z-9a229b",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181119Z-bbc75c",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20181204Z-98ebdb",
  "org.scalablytyped" %%% "once" % "1.4-dt-20180214Z-4fba00",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-f11a0a",
  "org.scalablytyped" %%% "pumpify" % "1.4-dt-20181017Z-a1657b",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-434e1e",
  "org.scalablytyped" %%% "retry-axios" % "0.3.2-fde2b9",
  "org.scalablytyped" %%% "retry-request" % "4.0.0-5e06fb",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-6ffbb3",
  "org.scalablytyped" %%% "split-array-stream" % "2.0.0-c1168c",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "stream-events" % "1.0.5-95b84e",
  "org.scalablytyped" %%% "teeny-request" % "3.11.3-af1bb3",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-c50061",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181015Z-626b78",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-766720",
  "org.scalablytyped" %%% "xdg-basedir" % "2.0-dt-20180214Z-1cf257")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
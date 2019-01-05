organization := "org.scalablytyped"
name := "cypress"
version := "3.1.4-8ab771"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-8a8082",
  "org.scalablytyped" %%% "blob-util" % "1.3-dt-20180214Z-5afcec",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-1c3671",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-485138",
  "org.scalablytyped" %%% "chai" % "4.1-dt-20181019Z-eadb87",
  "org.scalablytyped" %%% "chai-jquery" % "1.1.1-dt-20181023Z-4f242e",
  "org.scalablytyped" %%% "chalk" % "2.4.1-b7eb02",
  "org.scalablytyped" %%% "check-more-types" % "2.24.0-0f065c",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-be7dc7",
  "org.scalablytyped" %%% "commander" % "2.19.0-ad2033",
  "org.scalablytyped" %%% "common-tags" % "1.8-dt-20181205Z-79ba19",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-4790a3",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-33dc56",
  "org.scalablytyped" %%% "execa" % "0.9-dt-20180310Z-638da0",
  "org.scalablytyped" %%% "extract-zip" % "1.6-dt-20180214Z-0090d6",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-e1da01",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180706Z-c657d8",
  "org.scalablytyped" %%% "getos" % "3.0-dt-20180214Z-b1734b",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-9f5922",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180416Z-f2966e",
  "org.scalablytyped" %%% "is-installed-globally" % "0.1-dt-20181212Z-d02b0f",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20181219Z-46c2e0",
  "org.scalablytyped" %%% "lazy-ass" % "1.6.0-2f4c0a",
  "org.scalablytyped" %%% "listr" % "0.13-dt-20180306Z-8c04fc",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-8f83bf",
  "org.scalablytyped" %%% "log-symbols" % "2.0-dt-20180214Z-d6a9e3",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-9283e5",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-ab73cf",
  "org.scalablytyped" %%% "mocha" % "5.2-dt-20180806Z-50f6e7",
  "org.scalablytyped" %%% "moment" % "2.23.0-87137f",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "ramda" % "0.25-dt-20181231Z-f7b031",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-434e1e",
  "org.scalablytyped" %%% "sinon" % "7.0-dt-20181231Z-8657e3",
  "org.scalablytyped" %%% "sinon-chai" % "3.2.0-dt-20181212Z-cd67fe",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-89c527",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-581bf6",
  "org.scalablytyped" %%% "tmp" % "0.0-dt-20180214Z-70e5f7",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181015Z-626b78",
  "org.scalablytyped" %%% "yauzl" % "2.9-dt-20181229Z-bc8793")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
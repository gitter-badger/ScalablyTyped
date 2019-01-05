organization := "org.scalablytyped"
name := "electron-builder"
version := "20.38.4-d83d69"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "7zip-bin" % "4.1.0-4ee351",
  "org.scalablytyped" %%% "ajv" % "6.6.2-681e1b",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-8a8082",
  "org.scalablytyped" %%% "app-builder-bin" % "2.6.1-015a77",
  "org.scalablytyped" %%% "app-builder-lib" % "20.38.4-ba0886",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-1c3671",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.6-399d47",
  "org.scalablytyped" %%% "builder-util" % "9.6.1-2b6dc5",
  "org.scalablytyped" %%% "builder-util-runtime" % "8.1.0-105ac5",
  "org.scalablytyped" %%% "chalk" % "2.4.1-b7eb02",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-be7dc7",
  "org.scalablytyped" %%% "compare-version" % "v0.1.2-dt-20180214Z-464d42",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-4790a3",
  "org.scalablytyped" %%% "dmg-builder" % "6.5.3-a88d52",
  "org.scalablytyped" %%% "dotenv" % "6.1-dt-20181101Z-968971",
  "org.scalablytyped" %%% "dotenv-expand" % "4.2.0-be46f0",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20181126Z-606598",
  "org.scalablytyped" %%% "electron-osx-sign" % "0.4.11-cacf68",
  "org.scalablytyped" %%% "electron-publish" % "20.38.3-de14b6",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-33dc56",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-12c155",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-acc0be",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180706Z-c657d8",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.0-cad0ab",
  "org.scalablytyped" %%% "hosted-git-info" % "2.7-dt-20181031Z-93c12f",
  "org.scalablytyped" %%% "iconv-lite" % "0.4.24-4cf42f",
  "org.scalablytyped" %%% "is-ci" % "1.1-dt-20180416Z-f2966e",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20181220Z-f2aa44",
  "org.scalablytyped" %%% "json5" % "0.0-unknown-dt-20180813Z-68ad04",
  "org.scalablytyped" %%% "lazy-val" % "1.0.3-616901",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-e9f135",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-9283e5",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-ab73cf",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20180214Z-f56fcd",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20181029Z-c4e557",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-539bad",
  "org.scalablytyped" %%% "read-config-file" % "3.2.0-7f1fbe",
  "org.scalablytyped" %%% "sanitize-filename" % "v1.1.1-dt-20180214Z-f1069f",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-579628",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-6ffbb3",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180523Z-fc6353",
  "org.scalablytyped" %%% "stat-mode" % "0.2-dt-20180214Z-e78fd4",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-581bf6",
  "org.scalablytyped" %%% "temp-file" % "3.3.2-43f530",
  "org.scalablytyped" %%% "update-notifier" % "2.5-dt-20181023Z-2f1bdd",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-f36a77",
  "org.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20180925Z-17c65c",
  "org.scalablytyped" %%% "yargs" % "12.0-dt-20181231Z-f71b14")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
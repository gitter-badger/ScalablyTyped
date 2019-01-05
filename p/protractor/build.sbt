organization := "org.scalablytyped"
name := "protractor"
version := "5.4.2-05dbab"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "adm-zip" % "v0.4.4-dt-20180214Z-22d450",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-8a8082",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-8cff53",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-485138",
  "org.scalablytyped" %%% "chalk" % "2.4.1-b7eb02",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-be7dc7",
  "org.scalablytyped" %%% "del" % "3.0-dt-20180311Z-3f0abe",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-33dc56",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-e1da01",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-9f5922",
  "org.scalablytyped" %%% "ini" % "v1.3.3-dt-20181121Z-52ffe4",
  "org.scalablytyped" %%% "jasmine" % "3.3-dt-20181218Z-d53e60",
  "org.scalablytyped" %%% "jasminewd2" % "2.0-dt-20181026Z-e614d1",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-9283e5",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-ab73cf",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "optimist" % "0.0-unknown-dt-20180214Z-fce15c",
  "org.scalablytyped" %%% "q" % "1.5-dt-20181124Z-0d6d43",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-434e1e",
  "org.scalablytyped" %%% "rimraf" % "2.0-dt-20180214Z-d44863",
  "org.scalablytyped" %%% "selenium-webdriver" % "3.0-dt-20181204Z-754c41",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-6ffbb3",
  "org.scalablytyped" %%% "source-map-support" % "0.4-dt-20180523Z-fc6353",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-581bf6",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181015Z-626b78",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.1.0-611267",
  "org.scalablytyped" %%% "webdriver-manager" % "12.1.0-4e92c6",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180606Z-e97b86")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
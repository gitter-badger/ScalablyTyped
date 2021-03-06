organization := "org.scalablytyped"
name := "umzug"
version := "v2.2.0-dt-20180731Z-5fbac9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-6bd481",
  "org.scalablytyped" %%% "bson" % "1.0.6-dt-20180721Z-0a850a",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-0f07d6",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-5a27ec",
  "org.scalablytyped" %%% "mongodb" % "v3.1-dt-20181223Z-e16bad",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "sequelize" % "4.27.11-dt-20181210Z-dd79ab",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "validator" % "v10.9.0-dt-20181214Z-46403f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
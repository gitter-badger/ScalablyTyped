organization := "org.scalablytyped"
name := "dva"
version := "2.4.1-41a58d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-c53c8c",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20181017Z-71a639",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20180214Z-890639",
  "org.scalablytyped" %%% "isomorphic-fetch" % "0.0-dt-20180214Z-ed98ef",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-8f2b50",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-9a2db2",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-ba2fb9",
  "org.scalablytyped" %%% "react-redux" % "6.0-dt-20181229Z-385f06",
  "org.scalablytyped" %%% "react-router" % "4.4-dt-20190103Z-66bed2",
  "org.scalablytyped" %%% "react-router-dom" % "4.3-dt-20181211Z-34b12a",
  "org.scalablytyped" %%% "react-router-redux" % "5.0-dt-20181122Z-5673ac",
  "org.scalablytyped" %%% "redux" % "4.0.1-006f63",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-22c53e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
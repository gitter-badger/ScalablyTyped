organization := "org.scalablytyped"
name := "pouch-redux-middleware"
version := "0.5-dt-20180214Z-a21585"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-4790a3",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181119Z-bbc75c",
  "org.scalablytyped" %%% "pouchdb" % "6.3-dt-20180214Z-a2e7c6",
  "org.scalablytyped" %%% "pouchdb-adapter-fruitdown" % "6.1-dt-20180214Z-d1e047",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20180214Z-c59ee4",
  "org.scalablytyped" %%% "pouchdb-adapter-idb" % "6.1-dt-20180214Z-88a251",
  "org.scalablytyped" %%% "pouchdb-adapter-leveldb" % "6.1-dt-20180214Z-55f1a0",
  "org.scalablytyped" %%% "pouchdb-adapter-localstorage" % "6.1-dt-20180214Z-894d4b",
  "org.scalablytyped" %%% "pouchdb-adapter-memory" % "6.1-dt-20180214Z-535e23",
  "org.scalablytyped" %%% "pouchdb-adapter-node-websql" % "6.1-dt-20180214Z-3f7cb0",
  "org.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20180214Z-4c1ff5",
  "org.scalablytyped" %%% "pouchdb-browser" % "6.1-dt-20180214Z-b2798b",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20181213Z-bc21d8",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20180611Z-46c170",
  "org.scalablytyped" %%% "pouchdb-http" % "6.1-dt-20180214Z-7af1fd",
  "org.scalablytyped" %%% "pouchdb-mapreduce" % "6.1-dt-20180214Z-45cfdc",
  "org.scalablytyped" %%% "pouchdb-node" % "6.1-dt-20180214Z-be3ea9",
  "org.scalablytyped" %%% "pouchdb-replication" % "6.4-dt-20181210Z-a2c4e8",
  "org.scalablytyped" %%% "redux" % "4.0.1-006f63",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-22c53e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
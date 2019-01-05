organization := "org.scalablytyped"
name := "webtorrent"
version := "0.98-dt-20180807Z-697c3d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bittorrent-protocol" % "2.2-dt-20180214Z-9ea9d8",
  "org.scalablytyped" %%% "magnet-uri" % "5.1-dt-20180214Z-73e1e9",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "parse-torrent" % "5.8-dt-20180214Z-4cb6c2",
  "org.scalablytyped" %%% "parse-torrent-file" % "4.0-dt-20180214Z-5d247c",
  "org.scalablytyped" %%% "simple-peer" % "6.1-dt-20180721Z-9f46e6",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
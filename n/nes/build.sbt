organization := "org.scalablytyped"
name := "nes"
version := "7.0.0-dt-20181022Z-e26130"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-d6739c",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20181111Z-0840fb",
  "org.scalablytyped" %%% "hapi" % "17.8-dt-20181212Z-f6673c",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-70c78c",
  "org.scalablytyped" %%% "joi" % "14.0-dt-20181211Z-4b84e2",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180214Z-0ddad8",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180214Z-1b0236",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180214Z-359690",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-329809",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
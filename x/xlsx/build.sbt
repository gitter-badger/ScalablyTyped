organization := "org.scalablytyped"
name := "xlsx"
version := "0.14.1-22cddf"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "adler-32" % "1.2.0-d3c34b",
  "org.scalablytyped" %%% "cfb" % "1.1.0-f1913a",
  "org.scalablytyped" %%% "codepage" % "1.14.0-c9c1ca",
  "org.scalablytyped" %%% "commander" % "2.19.0-ad2033",
  "org.scalablytyped" %%% "crc-32" % "1.2.0-b1d9c8",
  "org.scalablytyped" %%% "frac" % "1.1.2-a78c93",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "printj" % "1.1.2-1554b2",
  "org.scalablytyped" %%% "ssf" % "0.10.2-12d337",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
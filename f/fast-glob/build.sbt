organization := "org.scalablytyped"
name := "fast-glob"
version := "2.2.4-9ed563"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180214Z-322687",
  "org.scalablytyped" %%% "glob-parent" % "3.1-dt-20180214Z-fe6757",
  "org.scalablytyped" %%% "glob-to-regexp" % "0.4-dt-20180607Z-de73fd",
  "org.scalablytyped" %%% "is-glob" % "4.0-dt-20180214Z-efad9e",
  "org.scalablytyped" %%% "merge2" % "1.1-dt-20180214Z-a88526",
  "org.scalablytyped" %%% "micromatch" % "3.1-dt-20180214Z-170292",
  "org.scalablytyped" %%% "mrmlnc__readdir-enhanced" % "2.2.1-8aa1f9",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-d5e59c",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "1.1.3-8a0e36",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
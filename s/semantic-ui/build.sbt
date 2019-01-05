organization := "org.scalablytyped"
name := "semantic-ui"
version := "2.2-dt-20180214Z-8a7775"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20181219Z-46c2e0",
  "org.scalablytyped" %%% "semantic-ui-accordion" % "2.2-dt-20180214Z-878d2f",
  "org.scalablytyped" %%% "semantic-ui-api" % "2.2-dt-20180214Z-076740",
  "org.scalablytyped" %%% "semantic-ui-checkbox" % "2.2-dt-20180214Z-0810d0",
  "org.scalablytyped" %%% "semantic-ui-dimmer" % "2.2-dt-20180214Z-ff7a77",
  "org.scalablytyped" %%% "semantic-ui-dropdown" % "2.2-dt-20180214Z-bcef65",
  "org.scalablytyped" %%% "semantic-ui-embed" % "2.2-dt-20180214Z-886345",
  "org.scalablytyped" %%% "semantic-ui-form" % "2.2-dt-20181124Z-92cba5",
  "org.scalablytyped" %%% "semantic-ui-modal" % "2.2-dt-20180214Z-2dd556",
  "org.scalablytyped" %%% "semantic-ui-nag" % "2.2-dt-20180214Z-41bee3",
  "org.scalablytyped" %%% "semantic-ui-popup" % "2.2-dt-20180214Z-47e553",
  "org.scalablytyped" %%% "semantic-ui-progress" % "2.2-dt-20180214Z-8a9fce",
  "org.scalablytyped" %%% "semantic-ui-rating" % "2.2-dt-20180214Z-3804f3",
  "org.scalablytyped" %%% "semantic-ui-search" % "2.2-dt-20180214Z-d204d5",
  "org.scalablytyped" %%% "semantic-ui-shape" % "2.2-dt-20180214Z-1201dc",
  "org.scalablytyped" %%% "semantic-ui-sidebar" % "2.2-dt-20180214Z-7b186f",
  "org.scalablytyped" %%% "semantic-ui-site" % "2.2-dt-20180214Z-42966f",
  "org.scalablytyped" %%% "semantic-ui-sticky" % "2.2-dt-20180214Z-5a798a",
  "org.scalablytyped" %%% "semantic-ui-tab" % "2.2-dt-20180214Z-5a3366",
  "org.scalablytyped" %%% "semantic-ui-transition" % "2.2-dt-20180214Z-d74af7",
  "org.scalablytyped" %%% "semantic-ui-visibility" % "2.2-dt-20180214Z-cd2dbd",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-89c527",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
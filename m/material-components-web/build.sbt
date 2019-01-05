organization := "org.scalablytyped"
name := "material-components-web"
version := "0.35-dt-20180511Z-c75c12"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "material__auto-init" % "0.35-dt-20180511Z-478c3a",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20180511Z-d27ab7",
  "org.scalablytyped" %%% "material__checkbox" % "0.35-dt-20180511Z-4c43d4",
  "org.scalablytyped" %%% "material__chips" % "0.35-dt-20180511Z-e4ae8a",
  "org.scalablytyped" %%% "material__dialog" % "0.35-dt-20180511Z-c77305",
  "org.scalablytyped" %%% "material__drawer" % "0.35-dt-20180511Z-2bef02",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20180511Z-2bd2c9",
  "org.scalablytyped" %%% "material__form-field" % "0.35-dt-20180511Z-392268",
  "org.scalablytyped" %%% "material__grid-list" % "0.35-dt-20180511Z-a6e50f",
  "org.scalablytyped" %%% "material__icon-toggle" % "0.35-dt-20180511Z-b77910",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20180511Z-fa5b46",
  "org.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20180511Z-09a8cf",
  "org.scalablytyped" %%% "material__menu" % "0.35-dt-20180809Z-65ad83",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20180511Z-802e72",
  "org.scalablytyped" %%% "material__radio" % "0.35-dt-20180511Z-8f8fcb",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20180511Z-dc4aeb",
  "org.scalablytyped" %%% "material__select" % "0.35-dt-20180511Z-40e9e3",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20180511Z-4598c9",
  "org.scalablytyped" %%% "material__slider" % "0.35-dt-20180511Z-62558d",
  "org.scalablytyped" %%% "material__snackbar" % "0.35-dt-20180511Z-90189d",
  "org.scalablytyped" %%% "material__tabs" % "0.35-dt-20180511Z-a7b1a5",
  "org.scalablytyped" %%% "material__textfield" % "0.35-dt-20180511Z-debca4",
  "org.scalablytyped" %%% "material__toolbar" % "0.35-dt-20180511Z-afbd8d",
  "org.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20180511Z-2fa073",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
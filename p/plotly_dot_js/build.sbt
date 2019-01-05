organization := "org.scalablytyped"
name := "plotly_dot_js"
version := "1.42-dt-20181217Z-fc2f5f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "d3" % "5.5-dt-20181216Z-d72192",
  "org.scalablytyped" %%% "d3-array" % "1.2-dt-20181015Z-ab26d8",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20180917Z-ddf083",
  "org.scalablytyped" %%% "d3-brush" % "1.0-dt-20181117Z-cef5ca",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20181115Z-884236",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20180514Z-164470",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20180520Z-992c08",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20181031Z-33d89d",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20180807Z-0fbc4b",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20181117Z-b4e8ea",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20181228Z-3f11b4",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20180214Z-7500c2",
  "org.scalablytyped" %%% "d3-fetch" % "1.1-dt-20181228Z-93609c",
  "org.scalablytyped" %%% "d3-force" % "1.1-dt-20180514Z-404409",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20180510Z-b366f5",
  "org.scalablytyped" %%% "d3-geo" % "1.10-dt-20180514Z-d498d3",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20181208Z-02ae71",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20180917Z-2e2cb3",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20180514Z-450707",
  "org.scalablytyped" %%% "d3-polygon" % "1.0-dt-20180507Z-0e388f",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20180912Z-2a610d",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20180514Z-0a2160",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20181216Z-474da3",
  "org.scalablytyped" %%% "d3-scale-chromatic" % "1.3-dt-20180918Z-d134ff",
  "org.scalablytyped" %%% "d3-selection" % "1.3-dt-20181117Z-b8b9c8",
  "org.scalablytyped" %%% "d3-shape" % "1.2-dt-20181208Z-b8356f",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20180912Z-2ca750",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20180214Z-bc8abe",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20180912Z-c3e42d",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20181115Z-f615ea",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20180831Z-beaead",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20181208Z-69b7a0",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20180619Z-ceedeb",
  "org.scalablytyped" %%% "std" % "3.2.2-3b2f2a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        
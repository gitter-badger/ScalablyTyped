package typings
package plotlyDotJsLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plotly.js/lib/core", JSImport.Namespace)
@js.native
object libCoreModMembers extends js.Object {
  val Plots: plotlyDotJsLib.plotlyDotJsMod.StaticPlots = js.native
  val d3: plotlyDotJsLib.Anon_Version = js.native
  def addFrames(
    root: plotlyDotJsLib.plotlyDotJsMod.Root,
    frames: js.Array[stdLib.Partial[plotlyDotJsLib.plotlyDotJsMod.Frame]]
  ): js.Promise[plotlyDotJsLib.plotlyDotJsMod.PlotlyHTMLElement] = js.native
  def addTraces(root: plotlyDotJsLib.plotlyDotJsMod.Root, traces: js.Array[plotlyDotJsLib.plotlyDotJsMod.Data]): js.Promise[plotlyDotJsLib.plotlyDotJsMod.PlotlyHTMLElement] = js.native
  def addTraces(
    root: plotlyDotJsLib.plotlyDotJsMod.Root,
    traces: js.Array[plotlyDotJsLib.plotlyDotJsMod.Data],
    newIndices: js.Array[scala.Double]
  ): js.Promise[plotlyDotJsLib.plotlyDotJsMod.PlotlyHTMLElement] = js.native
  def addTraces(
    root: plotlyDotJsLib.plotlyDotJsMod.Root,
    traces: js.Array[plotlyDotJsLib.plotlyDotJsMod.Data],
    newIndices: scala.Double
  ): js.Promise[plotlyDotJsLib.plotlyDotJsMod.PlotlyHTMLElement] = js.native
  def addTraces(root: plotlyDotJsLib.plotlyDotJsMod.Root, traces: plotlyDotJsLib.plotlyDotJsMod.Data): js.Promise[plotlyDotJsLib.plotlyDotJsMod.PlotlyHTMLElement] = js.native
  def addTraces(
    root: plotlyDotJsLib.plotlyDotJsMod.Root,
    traces: plotlyDotJsLib.plotlyDotJsMod.Data,
    newIndices: js.Array[scala.Double]
  ): js.Promise[plotlyDotJsLib.plotlyDotJsMod.PlotlyHTMLElement] = js.native
  def addTraces(
    root: plotlyDotJsLib.plotlyDotJsMod.Root,
    traces: plotlyDotJsLib.plotlyDotJsMod.Data,
    newIndices: scala.Double
  ): js.Promise[plotlyDotJsLib.plotlyDotJsMod.PlotlyHTMLElement] = js.native
  def deleteFrames(root: plotlyDotJsLib.plotlyDotJsMod.Root, frames: js.Array[scala.Double]): js.Promise[plotlyDotJsLib.plotlyDotJsMod.PlotlyHTMLElement] = js.native
  def deleteTraces(root: plotlyDotJsLib.plotlyDotJsMod.Root, indices: js.Array[scala.Double]): js.Promise[plotlyDotJsLib.plotlyDotJsMod.PlotlyHTMLElement] = js.native
  def deleteTraces(root: plotlyDotJsLib.plotlyDotJsMod.Root, indices: scala.Double): js.Promise[plotlyDotJsLib.plotlyDotJsMod.PlotlyHTMLElement] = js.native
  def downloadImage(root: plotlyDotJsLib.plotlyDotJsMod.Root, opts: plotlyDotJsLib.plotlyDotJsMod.DownloadImgopts): js.Promise[java.lang.String] = js.native
  def extendTraces(
    root: plotlyDotJsLib.plotlyDotJsMod.Root,
    update: js.Array[plotlyDotJsLib.plotlyDotJsMod.Data],
    indices: js.Array[scala.Double]
  ): js.Promise[plotlyDotJsLib.plotlyDotJsMod.PlotlyHTMLElement] = js.native
  def extendTraces(
    root: plotlyDotJsLib.plotlyDotJsMod.Root,
    update: js.Array[plotlyDotJsLib.plotlyDotJsMod.Data],
    indices: scala.Double
  ): js.Promise[plotlyDotJsLib.plotlyDotJsMod.PlotlyHTMLElement] = js.native
  def extendTraces(
    root: plotlyDotJsLib.plotlyDotJsMod.Root,
    update: plotlyDotJsLib.plotlyDotJsMod.Data,
    indices: js.Array[scala.Double]
  ): js.Promise[plotlyDotJsLib.plotlyDotJsMod.PlotlyHTMLElement] = js.native
  def extendTraces(
    root: plotlyDotJsLib.plotlyDotJsMod.Root,
    update: plotlyDotJsLib.plotlyDotJsMod.Data,
    indices: scala.Double
  ): js.Promise[plotlyDotJsLib.plotlyDotJsMod.PlotlyHTMLElement] = js.native
  def moveTraces(root: plotlyDotJsLib.plotlyDotJsMod.Root, currentIndices: js.Array[scala.Double]): js.Promise[plotlyDotJsLib.plotlyDotJsMod.PlotlyHTMLElement] = js.native
  def moveTraces(
    root: plotlyDotJsLib.plotlyDotJsMod.Root,
    currentIndices: js.Array[scala.Double],
    newIndices: js.Array[scala.Double]
  ): js.Promise[plotlyDotJsLib.plotlyDotJsMod.PlotlyHTMLElement] = js.native
  def moveTraces(
    root: plotlyDotJsLib.plotlyDotJsMod.Root,
    currentIndices: js.Array[scala.Double],
    newIndices: scala.Double
  ): js.Promise[plotlyDotJsLib.plotlyDotJsMod.PlotlyHTMLElement] = js.native
  def moveTraces(root: plotlyDotJsLib.plotlyDotJsMod.Root, currentIndices: scala.Double): js.Promise[plotlyDotJsLib.plotlyDotJsMod.PlotlyHTMLElement] = js.native
  def moveTraces(
    root: plotlyDotJsLib.plotlyDotJsMod.Root,
    currentIndices: scala.Double,
    newIndices: js.Array[scala.Double]
  ): js.Promise[plotlyDotJsLib.plotlyDotJsMod.PlotlyHTMLElement] = js.native
  def moveTraces(root: plotlyDotJsLib.plotlyDotJsMod.Root, currentIndices: scala.Double, newIndices: scala.Double): js.Promise[plotlyDotJsLib.plotlyDotJsMod.PlotlyHTMLElement] = js.native
  def newPlot(root: plotlyDotJsLib.plotlyDotJsMod.Root, data: js.Array[plotlyDotJsLib.plotlyDotJsMod.Data]): js.Promise[plotlyDotJsLib.plotlyDotJsMod.PlotlyHTMLElement] = js.native
  def newPlot(
    root: plotlyDotJsLib.plotlyDotJsMod.Root,
    data: js.Array[plotlyDotJsLib.plotlyDotJsMod.Data],
    layout: stdLib.Partial[plotlyDotJsLib.plotlyDotJsMod.Layout]
  ): js.Promise[plotlyDotJsLib.plotlyDotJsMod.PlotlyHTMLElement] = js.native
  def newPlot(
    root: plotlyDotJsLib.plotlyDotJsMod.Root,
    data: js.Array[plotlyDotJsLib.plotlyDotJsMod.Data],
    layout: stdLib.Partial[plotlyDotJsLib.plotlyDotJsMod.Layout],
    config: stdLib.Partial[plotlyDotJsLib.plotlyDotJsMod.Config]
  ): js.Promise[plotlyDotJsLib.plotlyDotJsMod.PlotlyHTMLElement] = js.native
  def plot(root: plotlyDotJsLib.plotlyDotJsMod.Root, data: js.Array[plotlyDotJsLib.plotlyDotJsMod.Data]): js.Promise[plotlyDotJsLib.plotlyDotJsMod.PlotlyHTMLElement] = js.native
  def plot(
    root: plotlyDotJsLib.plotlyDotJsMod.Root,
    data: js.Array[plotlyDotJsLib.plotlyDotJsMod.Data],
    layout: stdLib.Partial[plotlyDotJsLib.plotlyDotJsMod.Layout]
  ): js.Promise[plotlyDotJsLib.plotlyDotJsMod.PlotlyHTMLElement] = js.native
  def plot(
    root: plotlyDotJsLib.plotlyDotJsMod.Root,
    data: js.Array[plotlyDotJsLib.plotlyDotJsMod.Data],
    layout: stdLib.Partial[plotlyDotJsLib.plotlyDotJsMod.Layout],
    config: stdLib.Partial[plotlyDotJsLib.plotlyDotJsMod.Config]
  ): js.Promise[plotlyDotJsLib.plotlyDotJsMod.PlotlyHTMLElement] = js.native
  def prependTraces(
    root: plotlyDotJsLib.plotlyDotJsMod.Root,
    update: js.Array[plotlyDotJsLib.plotlyDotJsMod.Data],
    indices: js.Array[scala.Double]
  ): js.Promise[plotlyDotJsLib.plotlyDotJsMod.PlotlyHTMLElement] = js.native
  def prependTraces(
    root: plotlyDotJsLib.plotlyDotJsMod.Root,
    update: js.Array[plotlyDotJsLib.plotlyDotJsMod.Data],
    indices: scala.Double
  ): js.Promise[plotlyDotJsLib.plotlyDotJsMod.PlotlyHTMLElement] = js.native
  def prependTraces(
    root: plotlyDotJsLib.plotlyDotJsMod.Root,
    update: plotlyDotJsLib.plotlyDotJsMod.Data,
    indices: js.Array[scala.Double]
  ): js.Promise[plotlyDotJsLib.plotlyDotJsMod.PlotlyHTMLElement] = js.native
  def prependTraces(
    root: plotlyDotJsLib.plotlyDotJsMod.Root,
    update: plotlyDotJsLib.plotlyDotJsMod.Data,
    indices: scala.Double
  ): js.Promise[plotlyDotJsLib.plotlyDotJsMod.PlotlyHTMLElement] = js.native
  def purge(root: plotlyDotJsLib.plotlyDotJsMod.Root): scala.Unit = js.native
  def react(root: plotlyDotJsLib.plotlyDotJsMod.Root, data: js.Array[plotlyDotJsLib.plotlyDotJsMod.Data]): js.Promise[plotlyDotJsLib.plotlyDotJsMod.PlotlyHTMLElement] = js.native
  def react(
    root: plotlyDotJsLib.plotlyDotJsMod.Root,
    data: js.Array[plotlyDotJsLib.plotlyDotJsMod.Data],
    layout: stdLib.Partial[plotlyDotJsLib.plotlyDotJsMod.Layout]
  ): js.Promise[plotlyDotJsLib.plotlyDotJsMod.PlotlyHTMLElement] = js.native
  def react(
    root: plotlyDotJsLib.plotlyDotJsMod.Root,
    data: js.Array[plotlyDotJsLib.plotlyDotJsMod.Data],
    layout: stdLib.Partial[plotlyDotJsLib.plotlyDotJsMod.Layout],
    config: stdLib.Partial[plotlyDotJsLib.plotlyDotJsMod.Config]
  ): js.Promise[plotlyDotJsLib.plotlyDotJsMod.PlotlyHTMLElement] = js.native
  def redraw(root: plotlyDotJsLib.plotlyDotJsMod.Root): js.Promise[plotlyDotJsLib.plotlyDotJsMod.PlotlyHTMLElement] = js.native
  def relayout(
    root: plotlyDotJsLib.plotlyDotJsMod.Root,
    layout: stdLib.Partial[plotlyDotJsLib.plotlyDotJsMod.Layout]
  ): js.Promise[plotlyDotJsLib.plotlyDotJsMod.PlotlyHTMLElement] = js.native
  def restyle(root: plotlyDotJsLib.plotlyDotJsMod.Root, aobj: plotlyDotJsLib.plotlyDotJsMod.Data): js.Promise[plotlyDotJsLib.plotlyDotJsMod.PlotlyHTMLElement] = js.native
  def restyle(
    root: plotlyDotJsLib.plotlyDotJsMod.Root,
    aobj: plotlyDotJsLib.plotlyDotJsMod.Data,
    traces: js.Array[scala.Double]
  ): js.Promise[plotlyDotJsLib.plotlyDotJsMod.PlotlyHTMLElement] = js.native
  def restyle(
    root: plotlyDotJsLib.plotlyDotJsMod.Root,
    aobj: plotlyDotJsLib.plotlyDotJsMod.Data,
    traces: scala.Double
  ): js.Promise[plotlyDotJsLib.plotlyDotJsMod.PlotlyHTMLElement] = js.native
  def toImage(root: plotlyDotJsLib.plotlyDotJsMod.Root, opts: plotlyDotJsLib.plotlyDotJsMod.ToImgopts): js.Promise[java.lang.String] = js.native
  def update(
    root: plotlyDotJsLib.plotlyDotJsMod.Root,
    traceUpdate: plotlyDotJsLib.plotlyDotJsMod.Data,
    layoutUpdate: stdLib.Partial[plotlyDotJsLib.plotlyDotJsMod.Layout]
  ): js.Promise[plotlyDotJsLib.plotlyDotJsMod.PlotlyHTMLElement] = js.native
  def update(
    root: plotlyDotJsLib.plotlyDotJsMod.Root,
    traceUpdate: plotlyDotJsLib.plotlyDotJsMod.Data,
    layoutUpdate: stdLib.Partial[plotlyDotJsLib.plotlyDotJsMod.Layout],
    traces: js.Array[scala.Double]
  ): js.Promise[plotlyDotJsLib.plotlyDotJsMod.PlotlyHTMLElement] = js.native
  def update(
    root: plotlyDotJsLib.plotlyDotJsMod.Root,
    traceUpdate: plotlyDotJsLib.plotlyDotJsMod.Data,
    layoutUpdate: stdLib.Partial[plotlyDotJsLib.plotlyDotJsMod.Layout],
    traces: scala.Double
  ): js.Promise[plotlyDotJsLib.plotlyDotJsMod.PlotlyHTMLElement] = js.native
}


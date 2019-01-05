package typings
package htmlDashWebpackDashPluginLib.htmlDashWebpackDashPluginMod.HtmlWebpackPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hooks
  extends webpackLib.webpackMod.webpackNs.compilationNs.CompilationHooks {
  var htmlWebpackPluginAfterEmit: tapableLib.tapableMod.AsyncSeriesWaterfallHook[htmlDashWebpackDashPluginLib.Anon_HtmlOutputName, _, _]
  var htmlWebpackPluginAfterHtmlProcessing: tapableLib.tapableMod.AsyncSeriesWaterfallHook[htmlDashWebpackDashPluginLib.Anon_Html, _, _]
  var htmlWebpackPluginAlterAssetTags: tapableLib.tapableMod.AsyncSeriesWaterfallHook[htmlDashWebpackDashPluginLib.Anon_Head, _, _]
  var htmlWebpackPluginBeforeHtmlGeneration: tapableLib.tapableMod.AsyncSeriesWaterfallHook[htmlDashWebpackDashPluginLib.Anon_Assets, _, _]
  var htmlWebpackPluginBeforeHtmlProcessing: tapableLib.tapableMod.AsyncSeriesWaterfallHook[htmlDashWebpackDashPluginLib.Anon_Html, _, _]
}


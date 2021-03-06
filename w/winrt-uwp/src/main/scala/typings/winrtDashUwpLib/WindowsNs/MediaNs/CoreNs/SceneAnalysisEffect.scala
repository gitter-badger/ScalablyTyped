package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an effect that analyzes video frames to determine if any of the supported variable photo sequence capture techniques may produce a higher-quality captured image. */
@JSGlobal("Windows.Media.Core.SceneAnalysisEffect")
@js.native
abstract class SceneAnalysisEffect () extends js.Object {
  /** Gets or sets the duration of the time window during which video frames are analyzed. */
  var desiredAnalysisInterval: scala.Double = js.native
  /** Gets or sets a HighDynamicRangeControl object that is used to enable or disable High Dynamic Range (HDR) analysis. */
  var highDynamicRangeAnalyzer: HighDynamicRangeControl = js.native
  /** Raised when the scene analysis is complete. */
  @JSName("onsceneanalyzed")
  var onsceneanalyzed_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SceneAnalysisEffect, SceneAnalyzedEventArgs] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_sceneanalyzed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.sceneanalyzed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SceneAnalysisEffect, SceneAnalyzedEventArgs]
  ): scala.Unit = js.native
  /** Raised when the scene analysis is complete. */
  def onsceneanalyzed(ev: SceneAnalyzedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[SceneAnalysisEffect]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_sceneanalyzed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.sceneanalyzed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SceneAnalysisEffect, SceneAnalyzedEventArgs]
  ): scala.Unit = js.native
  /**
    * Sets properties on the IMediaExtension .
    * @param configuration The property set.
    */
  def setProperties(configuration: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet): scala.Unit = js.native
}


package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLVideoElement extends HTMLMediaElement {
  /**
    * Gets or sets the height of the video element.
    */
  var height: scala.Double = js.native
  var msHorizontalMirror: scala.Boolean = js.native
  val msIsLayoutOptimalForPlayback: scala.Boolean = js.native
  val msIsStereo3D: scala.Boolean = js.native
  var msStereo3DPackingMode: java.lang.String = js.native
  var msStereo3DRenderMode: java.lang.String = js.native
  var msZoom: scala.Boolean = js.native
  var onMSVideoFormatChanged: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onMSVideoFrameStepCompleted: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onMSVideoOptimalLayoutChanged: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Gets or sets a URL of an image to display, for example, like a movie poster. This can be a still frame from the video, or another image if no video data is available.
    */
  var poster: java.lang.String = js.native
  /**
    * Gets the intrinsic height of a video in CSS pixels, or zero if the dimensions are not known.
    */
  val videoHeight: scala.Double = js.native
  /**
    * Gets the intrinsic width of a video in CSS pixels, or zero if the dimensions are not known.
    */
  val videoWidth: scala.Double = js.native
  val webkitDisplayingFullscreen: scala.Boolean = js.native
  val webkitSupportsFullscreen: scala.Boolean = js.native
  /**
    * Gets or sets the width of the video element.
    */
  var width: scala.Double = js.native
  @JSName("addEventListener")
  def addEventListener_MSVideoFormatChanged(
    `type`: xtermLib.xtermLibStrings.MSVideoFormatChanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSVideoFormatChanged(
    `type`: xtermLib.xtermLibStrings.MSVideoFormatChanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSVideoFormatChanged(
    `type`: xtermLib.xtermLibStrings.MSVideoFormatChanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSVideoFrameStepCompleted(
    `type`: xtermLib.xtermLibStrings.MSVideoFrameStepCompleted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSVideoFrameStepCompleted(
    `type`: xtermLib.xtermLibStrings.MSVideoFrameStepCompleted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSVideoFrameStepCompleted(
    `type`: xtermLib.xtermLibStrings.MSVideoFrameStepCompleted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSVideoOptimalLayoutChanged(
    `type`: xtermLib.xtermLibStrings.MSVideoOptimalLayoutChanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSVideoOptimalLayoutChanged(
    `type`: xtermLib.xtermLibStrings.MSVideoOptimalLayoutChanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_MSVideoOptimalLayoutChanged(
    `type`: xtermLib.xtermLibStrings.MSVideoOptimalLayoutChanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  def getVideoPlaybackQuality(): VideoPlaybackQuality = js.native
  def msFrameStep(forward: scala.Boolean): scala.Unit = js.native
  def msInsertVideoEffect(activatableClassId: java.lang.String, effectRequired: scala.Boolean): scala.Unit = js.native
  def msInsertVideoEffect(activatableClassId: java.lang.String, effectRequired: scala.Boolean, config: js.Any): scala.Unit = js.native
  def msSetVideoRectangle(left: scala.Double, top: scala.Double, right: scala.Double, bottom: scala.Double): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSVideoFormatChanged(
    `type`: xtermLib.xtermLibStrings.MSVideoFormatChanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSVideoFormatChanged(
    `type`: xtermLib.xtermLibStrings.MSVideoFormatChanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSVideoFormatChanged(
    `type`: xtermLib.xtermLibStrings.MSVideoFormatChanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSVideoFrameStepCompleted(
    `type`: xtermLib.xtermLibStrings.MSVideoFrameStepCompleted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSVideoFrameStepCompleted(
    `type`: xtermLib.xtermLibStrings.MSVideoFrameStepCompleted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSVideoFrameStepCompleted(
    `type`: xtermLib.xtermLibStrings.MSVideoFrameStepCompleted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSVideoOptimalLayoutChanged(
    `type`: xtermLib.xtermLibStrings.MSVideoOptimalLayoutChanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSVideoOptimalLayoutChanged(
    `type`: xtermLib.xtermLibStrings.MSVideoOptimalLayoutChanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_MSVideoOptimalLayoutChanged(
    `type`: xtermLib.xtermLibStrings.MSVideoOptimalLayoutChanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  def webkitEnterFullScreen(): scala.Unit = js.native
  def webkitEnterFullscreen(): scala.Unit = js.native
  def webkitExitFullScreen(): scala.Unit = js.native
  def webkitExitFullscreen(): scala.Unit = js.native
}

@JSGlobal("HTMLVideoElement")
@js.native
object HTMLVideoElement
  extends org.scalablytyped.runtime.Instantiable0[HTMLVideoElement]


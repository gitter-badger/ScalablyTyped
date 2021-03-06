package typings
package winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a read-only list of video tracks, of which a single track can be selected at one time. */
@JSGlobal("Windows.Media.Playback.MediaPlaybackVideoTrackList")
@js.native
abstract class MediaPlaybackVideoTrackList ()
  extends stdLib.Array[winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.VideoTrack] {
  /** Occurs when the index of the currently selected video track changes. */
  @JSName("onselectedindexchanged")
  var onselectedindexchanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.ISingleSelectMediaTrackList, _] = js.native
  /** Gets or sets the index of the currently selected video track in the list. */
  var selectedIndex: scala.Double = js.native
  /** Gets the number of video tracks in the list. */
  var size: scala.Double = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectedindexchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.selectedindexchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.ISingleSelectMediaTrackList, _]
  ): scala.Unit = js.native
  /**
    * Returns an iterator that iterates over the items in the collection.
    * @return The iterator.
    */
  def first(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterator[winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.VideoTrack] = js.native
  /**
    * Returns the video track at the specified index.
    * @param index The zero-based index of the video track.
    * @return The video track at the specified index.
    */
  def getAt(index: scala.Double): winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.VideoTrack = js.native
  /**
    * Retrieves the video tracks that start at the specified index in the list.
    * @param startIndex The zero-based index of the start of the video tracks in the list.
    */
  def getMany(startIndex: scala.Double): winrtDashUwpLib.Anon_ItemsReturnValueNumberVideoTrack = js.native
  def indexOf(value: winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.VideoTrack, extra: js.Any*): winrtDashUwpLib.Anon_Index = js.native
  /**
    * Retrieves the index of a specified video track in the list.
    * @param value The video track to find in the vector view.
    */
  @JSName("indexOf")
  def indexOf_Anon_Index(value: winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.VideoTrack): winrtDashUwpLib.Anon_Index = js.native
  /** Occurs when the index of the currently selected video track changes. */
  def onselectedindexchanged(
    ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.ISingleSelectMediaTrackList]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectedindexchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.selectedindexchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.ISingleSelectMediaTrackList, _]
  ): scala.Unit = js.native
}


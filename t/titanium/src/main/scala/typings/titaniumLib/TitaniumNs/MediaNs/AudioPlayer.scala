package typings
package titaniumLib.TitaniumNs.MediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An audio player object used for streaming audio to the device, and low-level control of the audio playback.
		 */
trait AudioPlayer
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * Used to identify the volume of audio streams for alarms.
  			 */
  val AUDIO_TYPE_ALARM: scala.Double
  /**
  			 * Used to identify the volume of audio streams for media playback.
  			 */
  val AUDIO_TYPE_MEDIA: scala.Double
  /**
  			 * Used to identify the volume of audio streams for notifications.
  			 */
  val AUDIO_TYPE_NOTIFICATION: scala.Double
  /**
  			 * Used to identify the volume of audio streams for the phone ring.
  			 */
  val AUDIO_TYPE_RING: scala.Double
  /**
  			 * Used to identify the volume of audio streams for DTMF tones or beeps.
  			 */
  val AUDIO_TYPE_SIGNALLING: scala.Double
  /**
  			 * Used to identify the volume of audio streams for voice calls.
  			 */
  val AUDIO_TYPE_VOICE: scala.Double
  /**
  			 * Audio data is being buffered from the network.
  			 */
  val STATE_BUFFERING: scala.Double
  /**
  			 * Audio playback is being initialized.
  			 */
  val STATE_INITIALIZED: scala.Double
  /**
  			 * Playback is paused.
  			 */
  val STATE_PAUSED: scala.Double
  /**
  			 * Audio playback is active.
  			 */
  val STATE_PLAYING: scala.Double
  /**
  			 * Audio playback is starting.
  			 */
  val STATE_STARTING: scala.Double
  /**
  			 * Audio playback is stopped.
  			 */
  val STATE_STOPPED: scala.Double
  /**
  			 * Audio playback is stopping.
  			 */
  val STATE_STOPPING: scala.Double
  /**
  			 * Player is waiting for audio data from the network.
  			 */
  val STATE_WAITING_FOR_DATA: scala.Double
  /**
  			 * Player is waiting for audio data to fill the queue.
  			 */
  val STATE_WAITING_FOR_QUEUE: scala.Double
  /**
  			 * Boolean to indicate if audio should continue playing even if the associated
  			 * Android [Activity](Titanium.Android.Activity) is paused.
  			 */
  var allowBackground: scala.Boolean
  /**
  			 * Indicates whether the player allows switching to "external playback" mode.
  			 */
  var allowsExternalPlayback: scala.Boolean
  /**
  			 * Focuses on the current audio player and stops other audio playing.
  			 */
  var audioFocus: scala.Boolean
  /**
  			 * Changes the audio-stream-type.
  			 */
  var audioType: scala.Double
  /**
  			 * Bit rate of the current playback stream.
  			 */
  var bitRate: scala.Double
  /**
  			 * Size of the buffer used for streaming, in milliseconds.
  			 */
  var bufferSize: scala.Double
  /**
  			 * Estimated duration in milliseconds of the file being played.
  			 */
  val duration: scala.Double
  /**
  			 * Indicates whether the player is currently playing video in "external playback" mode.
  			 */
  val externalPlaybackActive: scala.Boolean
  /**
  			 * Boolean indicating if the player is idle.
  			 */
  val idle: scala.Boolean
  /**
  			 * Indicates whether or not audio output of the player is muted.
  			 */
  var muted: scala.Boolean
  /**
  			 * Boolean indicating if audio playback is paused.
  			 */
  var paused: scala.Boolean
  /**
  			 * Boolean indicating if audio is currently playing.
  			 */
  val playing: scala.Boolean
  /**
  			 * Current playback progress, in milliseconds.
  			 */
  val progress: scala.Double
  /**
  			 * Indicates the desired rate of playback; 0.0 means "paused", 1.0 indicates a
  			 * desire to play at the natural rate of the current item. In addition, 2.0
  			 * would mean that the audio plays twice as fast.
  			 */
  var rate: scala.Double
  /**
  			 * Current state of playback, specified using one of the `STATE` constants defined on this object.
  			 */
  val state: scala.Double
  /**
  			 * Current playback position of the audio.
  			 */
  var time: scala.Double
  /**
  			 * URL for the audio stream.
  			 */
  var url: java.lang.String
  /**
  			 * Volume of the audio, from 0.0 (muted) to 1.0 (loudest).
  			 */
  var volume: scala.Double
  /**
  			 * Boolean indicating if the playback is waiting for audio data from the network.
  			 */
  val waiting: scala.Boolean
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.allowBackground> property.
  			 */
  def getAllowBackground(): scala.Boolean
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.allowsExternalPlayback> property.
  			 */
  def getAllowsExternalPlayback(): scala.Boolean
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.audioFocus> property.
  			 */
  def getAudioFocus(): scala.Boolean
  /**
  			 * Returns the audio session id.
  			 */
  def getAudioSessionId(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.audioType> property.
  			 */
  def getAudioType(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.bitRate> property.
  			 */
  def getBitRate(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.bufferSize> property.
  			 */
  def getBufferSize(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.duration> property.
  			 */
  def getDuration(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.externalPlaybackActive> property.
  			 */
  def getExternalPlaybackActive(): scala.Boolean
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.idle> property.
  			 */
  def getIdle(): scala.Boolean
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.muted> property.
  			 */
  def getMuted(): scala.Boolean
  /**
  			 * Returns the value of the [paused](Titanium.Media.AudioPlayer.paused) property.
  			 */
  def getPaused(): scala.Boolean
  /**
  			 * Returns the value of the [playing](Titanium.Media.AudioPlayer.playing) property.
  			 */
  def getPlaying(): scala.Boolean
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.progress> property.
  			 */
  def getProgress(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.rate> property.
  			 */
  def getRate(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.state> property.
  			 */
  def getState(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.time> property.
  			 */
  def getTime(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.url> property.
  			 */
  def getUrl(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.volume> property.
  			 */
  def getVolume(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Media.AudioPlayer.waiting> property.
  			 */
  def getWaiting(): scala.Boolean
  /**
  			 * Returns the value of the [paused](Titanium.Media.AudioPlayer.paused) property.
  			 */
  def isPaused(): scala.Boolean
  /**
  			 * Returns the value of the [playing](Titanium.Media.AudioPlayer.playing) property.
  			 */
  def isPlaying(): scala.Boolean
  /**
  			 * Pauses audio playback.
  			 */
  def pause(): scala.Unit
  /**
  			 * Starts or resumes audio playback.
  			 */
  def play(): scala.Unit
  /**
  			 * Stops buffering audio data and releases audio resources.
  			 */
  def release(): scala.Unit
  /**
  			 * Restarts (stops and stars) audio playback.
  			 */
  def restart(): scala.Unit
  /**
  			 * Moves the playback cursor and invokes the specified block when the seek
  			 * operation has either been completed or been interrupted.
  			 */
  def seekToTime(time: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.allowBackground> property.
  			 */
  def setAllowBackground(allowBackground: scala.Boolean): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.allowsExternalPlayback> property.
  			 */
  def setAllowsExternalPlayback(allowsExternalPlayback: scala.Boolean): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.audioFocus> property.
  			 */
  def setAudioFocus(audioFocus: scala.Boolean): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.audioType> property.
  			 */
  def setAudioType(audioType: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.bitRate> property.
  			 */
  def setBitRate(bitRate: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.bufferSize> property.
  			 */
  def setBufferSize(bufferSize: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.muted> property.
  			 */
  def setMuted(muted: scala.Boolean): scala.Unit
  /**
  			 * Sets the value of the [paused](Titanium.Media.AudioPlayer.paused) property.
  			 */
  def setPaused(paused: scala.Boolean): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.rate> property.
  			 */
  def setRate(rate: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.time> property.
  			 */
  def setTime(time: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.url> property.
  			 */
  def setUrl(url: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioPlayer.volume> property.
  			 */
  def setVolume(volume: scala.Double): scala.Unit
  /**
  			 * Starts or resumes audio playback.
  			 */
  def start(): scala.Unit
  /**
  			 * Converts a [state](Titanium.Media.AudioPlayer.state) value into a text description
  			 * suitable for display.
  			 */
  def stateDescription(state: scala.Double): java.lang.String
  /**
  			 * Stops audio playback.
  			 */
  def stop(): scala.Unit
}


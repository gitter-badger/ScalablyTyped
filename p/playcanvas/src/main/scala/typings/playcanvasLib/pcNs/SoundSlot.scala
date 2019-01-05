package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @name pc.SoundSlot
  * @class The SoundSlot controls playback of an audio asset.
  * @description Create a new SoundSlot
  * @param {pc.SoundComponent} component The Component that created this slot.
  * @param {String} name The name of the slot.
  * @param {Object} options Settings for the slot
  * @param {Number} [options.volume=1] The playback volume, between 0 and 1.
  * @param {Number} [options.pitch=1] The relative pitch, default of 1, plays at normal pitch.
  * @param {Boolean} [options.loop=false] If true the sound will restart when it reaches the end.
  * @param {Number} [options.startTime=0] The start time from which the sound will start playing.
  * @param {Number} [options.duration=null] The duration of the sound that the slot will play starting from startTime.
  * @param {Boolean} [options.overlap=false] If true then sounds played from slot will be played independently of each other. Otherwise the slot will first stop the current sound before starting the new one.
  * @param {Boolean} [options.autoPlay=false] If true the slot will start playing as soon as its audio asset is loaded.
  * @param {Number} [options.asset=null] The asset id of the audio asset that is going to be played by this slot.
  * @property {String} name The name of the slot
  * @property {String} asset The asset id
  * @property {Boolean} autoPlay If true the slot will begin playing as soon as it is loaded
  * @property {Number} volume The volume modifier to play the sound with. In range 0-1.
  * @property {Number} pitch The pitch modifier to play the sound with. Must be larger than 0.01
  * @property {Number} startTime The start time from which the sound will start playing.
  * @property {Number} duration The duration of the sound that the slot will play starting from startTime.
  * @property {Boolean} loop If true the slot will restart when it finishes playing
  * @property {Boolean} overlap If true then sounds played from slot will be played independently of each other. Otherwise the slot will first stop the current sound before starting the new one.
  * @property {Boolean} isLoaded Returns true if the asset of the slot is loaded.
  * @property {Boolean} isPlaying Returns true if the slot is currently playing.
  * @property {Boolean} isPaused Returns true if the slot is currently paused.
  * @property {Boolean} isStopped Returns true if the slot is currently stopped.
  * @property {pc.SoundInstance[]} instances An array that contains all the {@link pc.SoundInstance}s currently being played by the slot.
  */
@JSGlobal("pc.SoundSlot")
@js.native
class SoundSlot protected () extends js.Object {
  def this(component: SoundComponent, name: java.lang.String) = this()
  def this(component: SoundComponent, name: java.lang.String, options: playcanvasLib.Anon_VolumePitch) = this()
  var asset: js.UndefOr[scala.Double] = js.native
  var autoPlay: js.UndefOr[scala.Boolean] = js.native
  var duration: js.UndefOr[scala.Double] = js.native
  var instances: js.Array[SoundInstance] = js.native
  var isLoading: scala.Boolean = js.native
  var isPaused: scala.Boolean = js.native
  var isPlaying: scala.Boolean = js.native
  var isStopped: scala.Boolean = js.native
  var loop: js.UndefOr[scala.Boolean] = js.native
  var name: java.lang.String = js.native
  var overlap: js.UndefOr[scala.Boolean] = js.native
  var pitch: js.UndefOr[scala.Double] = js.native
  var startTime: js.UndefOr[scala.Double] = js.native
  var volume: js.UndefOr[scala.Double] = js.native
  /**
    * @function
    * @name pc.SoundSlot#clearExternalNodes
    * @description Clears any external nodes set by {@link pc.SoundSlot#setExternalNodes}.
    */
  def clearExternalNodes(): scala.Unit = js.native
  /**
    * @function
    * @name pc.SoundSlot#getExternalNodes
    * @description Gets an array that contains the two external nodes set by {@link pc.SoundSlot#setExternalNodes}.
    * @returns {AudioNode[]} An array of 2 elements that contains the first and last nodes set by {@link pc.SoundSlot#setExternalNodes}.
    */
  def getExternalNodes(): js.Tuple2[stdLib.AudioNode, stdLib.AudioNode] = js.native
  /**
    * @function
    * @name pc.SoundSlot#load
    * @description Loads the asset assigned to this slot.
    */
  def load(): scala.Unit = js.native
  /**
    * @function
    * @name pc.SoundSlot#pause
    * @description Pauses all sound instances. To continue playback call {@link pc.SoundSlot#resume}.
    */
  def pause(): scala.Boolean = js.native
  /**
    * @function pc.SoundSlot#play
    * @description Plays a sound. If {@link pc.SoundSlot#overlap} is true the new sound
    * instance will be played independently of any other instances already playing.
    * Otherwise existing sound instances will stop before playing the new sound.
    * @return {pc.SoundInstance} The new sound instance
    */
  def play(): SoundInstance = js.native
  /**
    * @function
    * @name pc.SoundSlot#resume
    * @description Resumes playback of all paused sound instances.
    * @returns {Boolean} True if any instances were resumed.
    */
  def resume(): scala.Boolean = js.native
  /**
    * @function
    * @name pc.SoundSlot#setExternalNodes
    * @description Connect external Web Audio API nodes. Any sound played by this slot will
    * automatically attach the specified nodes to the source that plays the sound. You need to pass
    * the first node of the node graph that you created externally and the last node of that graph. The first
    * node will be connected to the audio source and the last node will be connected to the destination of the AudioContext (e.g. speakers).
    * @param {AudioNode} firstNode The first node that will be connected to the audio source of sound instances.
    * @param {AudioNode} [lastNode] The last node that will be connected to the destination of the AudioContext.
    * If unspecified then the firstNode will be connected to the destination instead.
    * @example
    * var context = app.systems.sound.context;
    * var analyzer = context.createAnalyzer();
    * var distortion = context.createWaveShaper();
    * var filter = context.createBiquadFilter();
    * analyzer.connect(distortion);
    * distortion.connect(filter);
    * slot.setExternalNodes(analyzer, filter);
    */
  def setExternalNodes(firstNode: stdLib.AudioNode, lastNode: stdLib.AudioNode): scala.Unit = js.native
  /**
    * @function
    * @name pc.SoundSlot#stop
    * @description Stops playback of all sound instances.
    * @returns {Boolean} True if any instances were stopped.
    */
  def stop(): scala.Boolean = js.native
}


package typings
package p5Lib.p5Mod.p5Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolySynth extends js.Object {
  /**
    *   Monosynth that generates the sound for each note
    *   that is triggered. The p5.PolySynth defaults to
    *   using the p5.MonoSynth as its voice.
    */
  var AudioVoice: js.Any = js.native
  /**
    *   An object that holds information about which notes
    *   have been played and which notes are currently
    *   being played. New notes are added as keys on the
    *   fly. While a note has been attacked, but not
    *   released, the value of the key is the audiovoice
    *   which is generating that note. When notes are
    *   released, the value of the key becomes undefined.
    */
  var notes: js.Any = js.native
  /**
    *   A PolySynth must have at least 1 voice, defaults
    *   to 8
    */
  var polyvalue: js.Any = js.native
  /**
    *   Connect to a p5.sound / Web Audio object.
    *   @param unit A p5.sound or Web Audio object
    */
  def connect(unit: js.Object): scala.Unit = js.native
  /**
    *   Disconnect all outputs
    */
  def disconnect(): scala.Unit = js.native
  /**
    *   Get rid of the MonoSynth and free up its resources
    *   / memory.
    */
  def dispose(): scala.Unit = js.native
  /**
    *   noteADSR sets the envelope for a specific note
    *   that has just been triggered. Using this method
    *   modifies the envelope of whichever audiovoice is
    *   being used to play the desired note. The envelope
    *   should be reset before noteRelease is called in
    *   order to prevent the modified envelope from being
    *   used on other notes.
    *   @param [note] Midi note on which ADSR should be
    *   set.
    *   @param [attackTime] Time (in seconds before
    *   envelope reaches Attack Level
    *   @param [decayTime] Time (in seconds) before
    *   envelope reaches Decay/Sustain Level
    *   @param [susRatio] Ratio between attackLevel and
    *   releaseLevel, on a scale from 0 to 1, where 1.0 =
    *   attackLevel, 0.0 = releaseLevel. The susRatio
    *   determines the decayLevel and the level at which
    *   the sustain portion of the envelope will sustain.
    *   For example, if attackLevel is 0.4, releaseLevel
    *   is 0, and susAmt is 0.5, the decayLevel would be
    *   0.2. If attackLevel is increased to 1.0 (using
    *   setRange), then decayLevel would increase
    *   proportionally, to become 0.5.
    *   @param [releaseTime] Time in seconds from now
    *   (defaults to 0)
    */
  def noteADSR(): scala.Unit = js.native
  def noteADSR(note: scala.Double): scala.Unit = js.native
  def noteADSR(note: scala.Double, attackTime: scala.Double): scala.Unit = js.native
  def noteADSR(note: scala.Double, attackTime: scala.Double, decayTime: scala.Double): scala.Unit = js.native
  def noteADSR(note: scala.Double, attackTime: scala.Double, decayTime: scala.Double, susRatio: scala.Double): scala.Unit = js.native
  def noteADSR(
    note: scala.Double,
    attackTime: scala.Double,
    decayTime: scala.Double,
    susRatio: scala.Double,
    releaseTime: scala.Double
  ): scala.Unit = js.native
  /**
    *   Trigger the Attack, and Decay portion of a
    *   MonoSynth. Similar to holding down a key on a
    *   piano, but it will hold the sustain level until
    *   you let go.
    *   @param [note] midi note on which attack should be
    *   triggered.
    *   @param [velocity] velocity of the note to play
    *   (ranging from 0 to 1)/
    *   @param [secondsFromNow] time from now (in seconds)
    */
  def noteAttack(): scala.Unit = js.native
  def noteAttack(note: scala.Double): scala.Unit = js.native
  def noteAttack(note: scala.Double, velocity: scala.Double): scala.Unit = js.native
  def noteAttack(note: scala.Double, velocity: scala.Double, secondsFromNow: scala.Double): scala.Unit = js.native
  /**
    *   Trigger the Release of an AudioVoice note. This is
    *   similar to releasing the key on a piano and
    *   letting the sound fade according to the release
    *   level and release time.
    *   @param [note] midi note on which attack should be
    *   triggered. If no value is provided, all notes will
    *   be released.
    *   @param [secondsFromNow] time to trigger the
    *   release
    */
  def noteRelease(): scala.Unit = js.native
  def noteRelease(note: scala.Double): scala.Unit = js.native
  def noteRelease(note: scala.Double, secondsFromNow: scala.Double): scala.Unit = js.native
  /**
    *   Play a note by triggering noteAttack and
    *   noteRelease with sustain time
    *   @param [note] midi note to play (ranging from 0 to
    *   127 - 60 being a middle C)
    *   @param [velocity] velocity of the note to play
    *   (ranging from 0 to 1)
    *   @param [secondsFromNow] time from now (in seconds)
    *   at which to play
    *   @param [sustainTime] time to sustain before
    *   releasing the envelope
    */
  def play(): scala.Unit = js.native
  def play(note: scala.Double): scala.Unit = js.native
  def play(note: scala.Double, velocity: scala.Double): scala.Unit = js.native
  def play(note: scala.Double, velocity: scala.Double, secondsFromNow: scala.Double): scala.Unit = js.native
  def play(
    note: scala.Double,
    velocity: scala.Double,
    secondsFromNow: scala.Double,
    sustainTime: scala.Double
  ): scala.Unit = js.native
  /**
    *   Set the PolySynths global envelope. This method
    *   modifies the envelopes of each monosynth so that
    *   all notes are played with this envelope.
    *   @param [attackTime] Time (in seconds before
    *   envelope reaches Attack Level
    *   @param [decayTime] Time (in seconds) before
    *   envelope reaches Decay/Sustain Level
    *   @param [susRatio] Ratio between attackLevel and
    *   releaseLevel, on a scale from 0 to 1, where 1.0 =
    *   attackLevel, 0.0 = releaseLevel. The susRatio
    *   determines the decayLevel and the level at which
    *   the sustain portion of the envelope will sustain.
    *   For example, if attackLevel is 0.4, releaseLevel
    *   is 0, and susAmt is 0.5, the decayLevel would be
    *   0.2. If attackLevel is increased to 1.0 (using
    *   setRange), then decayLevel would increase
    *   proportionally, to become 0.5.
    *   @param [releaseTime] Time in seconds from now
    *   (defaults to 0)
    */
  def setADSR(): scala.Unit = js.native
  def setADSR(attackTime: scala.Double): scala.Unit = js.native
  def setADSR(attackTime: scala.Double, decayTime: scala.Double): scala.Unit = js.native
  def setADSR(attackTime: scala.Double, decayTime: scala.Double, susRatio: scala.Double): scala.Unit = js.native
  def setADSR(
    attackTime: scala.Double,
    decayTime: scala.Double,
    susRatio: scala.Double,
    releaseTime: scala.Double
  ): scala.Unit = js.native
}


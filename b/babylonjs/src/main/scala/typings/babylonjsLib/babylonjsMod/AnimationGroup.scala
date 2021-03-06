package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Use this class to create coordinated animations on multiple targets
  */
@JSImport("babylonjs", "AnimationGroup")
@js.native
class AnimationGroup protected ()
  extends babylonjsLib.BABYLONNs.AnimationGroup {
  /**
    * Instantiates a new Animation Group.
    * This helps managing several animations at once.
    * @see http://doc.babylonjs.com/how_to/group
    * @param name Defines the name of the group
    * @param scene Defines the scene the group belongs to
    */
  def this(/** The name of the animation group */
  name: java.lang.String) = this()
  def this(/** The name of the animation group */
  name: java.lang.String, scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene]) = this()
}

/**
  * Use this class to create coordinated animations on multiple targets
  */
@JSImport("babylonjs", "AnimationGroup")
@js.native
object AnimationGroup extends js.Object {
  /**
    * Returns a new AnimationGroup object parsed from the source provided.
    * @param parsedAnimationGroup defines the source
    * @param scene defines the scene that will receive the animationGroup
    * @returns a new AnimationGroup
    */
  def Parse(parsedAnimationGroup: js.Any, scene: babylonjsLib.BABYLONNs.Scene): babylonjsLib.BABYLONNs.AnimationGroup = js.native
}


package typings
package atAngularAnimationsLib.srcAnimationUnderscoreMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationGroupMetadata extends AnimationMetadata {
  /**
    * An options object containing a delay and
    * developer-defined parameters that provide styling defaults and
    * can be overridden on invocation. Default delay is 0.
    */
  var options: AnimationOptions | scala.Null
  /**
    * One or more animation or style steps that form this group.
    */
  var steps: js.Array[AnimationMetadata]
}


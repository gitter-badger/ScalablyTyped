package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs.CssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#style/transition-animation
  */
trait TransitionAnimation extends js.Object {
  /**
    * The length of the delay in seconds before the transition occurs (e.g. 250ms).
    */
  var `transition-delay`: scala.Double
  /**
    * The length of the transition in seconds(e.g. 0.5s).
    */
  var `transition-duration`: scala.Double
  /**
    * A comma separated list of style properties to animate in this state.
    */
  var `transition-property`: java.lang.String
  /**
    * An easing function that controls the animation progress curve (a visualisation of easings serves as a reference).
    */
  var `transition-timing-function`: TransitionTimingFunction
}


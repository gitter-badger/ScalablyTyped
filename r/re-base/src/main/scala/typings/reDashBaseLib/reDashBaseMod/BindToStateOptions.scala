package typings
package reDashBaseLib.reDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindToStateOptions extends js.Object {
  /**
    * Returns the Firebase data at the specified endpoint as an Array
    * instead of an Object.
    */
  var asArray: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The context of your component.
    */
  var context: js.Object
  /**
    * A callback function that will be invoked if the current user does
    * not have read permissions at the location.
    */
  var onFailure: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Queries to be used with your read operations. See
    * [Query Options](https://github.com/tylermcginnis/re-base#queries)
    * for more details.
    */
  var queries: js.UndefOr[js.Object] = js.undefined
  /**
    * The state property you want to sync with Firebase; can be an
    * arbitrarily nested property a là `foo.bar` (no arrays).
    */
  var state: java.lang.String
  /**
    * The callback function that will be invoked when the initial listener
    * is established with Firebase. Typically used (with bindToState) to
    * change this.state.loading to false.
    */
  var `then`: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}


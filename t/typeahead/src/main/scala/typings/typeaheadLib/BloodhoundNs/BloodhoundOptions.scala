package typings
package typeaheadLib.BloodhoundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BloodhoundOptions[T] extends js.Object {
  /**
    * Given a datum, returns a unique id for it.
    * Defaults to JSON.stringify. Note that it is highly recommended
    * to override this option.
    *
    * @param datum Suggestion.
    * @returns Unique id for the suggestion.
    */
  var identify: js.UndefOr[js.Function1[/* datum */ T, scala.Double]] = js.undefined
  /**
    * If set to false, the Bloodhound instance will not be implicitly
    * initialized by the constructor function. Defaults to true.
    */
  var initialize: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An array of data or a function that returns an array of data.
    * The data will be added to the internal search index when #initialize is called.
    */
  var local: js.UndefOr[js.Array[T] | js.Function0[js.Array[T]]] = js.undefined
  /**
    * Can be a URL to a JSON file containing an array of data or,
    * if more configurability is needed, a prefetch options hash.
    */
  var prefetch: js.UndefOr[java.lang.String | PrefetchOptions[T]] = js.undefined
  /**
    * Can be a URL to fetch data from when the data provided by the internal
    * search index is insufficient or, if more configurability is needed,
    * a remote options hash.
    */
  var remote: js.UndefOr[java.lang.String | RemoteOptions[T]] = js.undefined
  /**
    * A compare function used to sort data returned from the internal search index.
    *
    * @param a First suggestion.
    * @param b Second suggestion.
    * @returns Comparison result.
    */
  var sorter: js.UndefOr[js.Function2[/* a */ T, /* b */ T, scala.Double]] = js.undefined
  /**
    * If the number of datums provided from the internal search index is
    * less than sufficient, remote will be used to backfill search
    * requests triggered by calling #search. Defaults to 5.
    */
  var sufficient: js.UndefOr[scala.Double] = js.undefined
  /**
    * Transforms a datum into an array of string tokens.
    *
    * @param datum Suggestion.
    * @returns An array of string tokens.
    */
  def datumTokenizer(datum: T): js.Array[java.lang.String]
  /**
    * Transforms a query into an array of string tokens.
    *
    * @param quiery Query.
    * @returns An array of string tokens.
    */
  def queryTokenizer(query: java.lang.String): js.Array[java.lang.String]
}


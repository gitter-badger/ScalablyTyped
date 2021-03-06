package typings
package winrtLib.WindowsNs.ApplicationModelNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Search.SearchPaneSuggestionsRequest")
@js.native
class SearchPaneSuggestionsRequest () extends ISearchPaneSuggestionsRequest {
  /* CompleteClass */
  override var isCanceled: scala.Boolean = js.native
  /* CompleteClass */
  override var searchSuggestionCollection: SearchSuggestionCollection = js.native
  /* CompleteClass */
  override def getDeferral(): SearchPaneSuggestionsRequestDeferral = js.native
}


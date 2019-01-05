package typings
package officeDashUiDashFabricDashReactLib.libComponentsPickersSuggestionsSuggestionsDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISuggestionsProps[T]
  extends reactLib.reactMod.ReactNs.Props[js.Any] {
  /**
    * The CSS classname of the suggestions root.
    */
  var className: js.UndefOr[java.lang.String] = js.native
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[js.Object]] = js.native
  /**
    * The callback that should be called when the user attempts to use the input text as as item
    */
  var createGenericItem: js.UndefOr[js.Function0[scala.Unit]] = js.native
  /**
    * The text that appears indicating to the use to force resolve the input
    */
  var forceResolveText: js.UndefOr[java.lang.String] = js.native
  /**
    * Used to indicate whether or not the suggestions are loading.
    */
  var isLoading: js.UndefOr[scala.Boolean] = js.native
  /**
    * Indicates if a short list of recent suggestions should be shown.
    */
  var isMostRecentlyUsedVisible: js.UndefOr[scala.Boolean] = js.native
  /**
    * Indicates if the text in resultsFooter or resultsFooterFull should be shown at the end of the suggestion list.
    * @defaultvalue true.
    */
  var isResultsFooterVisible: js.UndefOr[scala.Boolean] = js.native
  /**
    * Used to indicate whether or not the component is searching for more results.
    */
  var isSearching: js.UndefOr[scala.Boolean] = js.native
  /**
    * The text to display while the results are loading.
    */
  var loadingText: js.UndefOr[java.lang.String] = js.native
  /**
    * Used to indicate whether or not the user can request more suggestions.
    * Dictates whether or not the searchForMore button is displayed.
    */
  var moreSuggestionsAvailable: js.UndefOr[scala.Boolean] = js.native
  /**
    * The text that should appear at the top of the most recenty used box.
    */
  var mostRecentlyUsedHeaderText: js.UndefOr[java.lang.String] = js.native
  /**
    * The text that should appear if no results are found when searching.
    */
  var noResultsFoundText: js.UndefOr[java.lang.String] = js.native
  /**
    * The callback that should be called when the user attempts to get more results
    */
  var onGetMoreResults: js.UndefOr[js.Function0[scala.Unit]] = js.native
  /**
    * How the "no result found" should look in the suggestion list.
    */
  var onRenderNoResultFound: js.UndefOr[atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[scala.Unit]] = js.native
  /**
    * How the suggestion should look in the suggestion list.
    */
  var onRenderSuggestion: js.UndefOr[
    js.Function2[/* props */ T, /* suggestionItemProps */ T, reactLib.reactMod.Global.JSXNs.Element]
  ] = js.native
  /**
    * Function to fire when one of the optional remove buttons on a suggestion is clicked.
    */
  var onSuggestionRemove: js.UndefOr[
    js.Function3[
      /* ev */ js.UndefOr[
        reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement with stdLib.HTMLElement, reactLib.NativeMouseEvent]
      ], 
      /* item */ js.UndefOr[
        officeDashUiDashFabricDashReactLib.libComponentsPersonaPersonaDotTypesMod.IPersonaProps
      ], 
      /* index */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.native
  /**
    * A function that resets focus to the expected item in the suggestion list
    */
  var refocusSuggestions: js.UndefOr[
    js.Function1[/* keyCode */ atUifabricUtilitiesLib.libKeyCodesMod.KeyCodes, scala.Unit]
  ] = js.native
  /**
    * An ARIA label to use for the buttons to remove individual suggestions.
    */
  var removeSuggestionAriaLabel: js.UndefOr[java.lang.String] = js.native
  /**
    * A renderer that adds an element at the end of the suggestions list it has fewer items than resultsMaximumNumber.
    */
  var resultsFooter: js.UndefOr[
    js.Function1[/* props */ ISuggestionsProps[T], reactLib.reactMod.Global.JSXNs.Element]
  ] = js.native
  /**
    * A renderer that adds an element at the end of the suggestions list it has more items than resultsMaximumNumber.
    */
  var resultsFooterFull: js.UndefOr[
    js.Function1[/* props */ ISuggestionsProps[T], reactLib.reactMod.Global.JSXNs.Element]
  ] = js.native
  /**
    * Maximum number of suggestions to show in the full suggestion list.
    */
  var resultsMaximumNumber: js.UndefOr[scala.Double] = js.native
  /**
    * The text that should appear if there is a search error.
    */
  var searchErrorText: js.UndefOr[java.lang.String] = js.native
  /**
    * The text that appears indicating to the user that they can search for more results.
    */
  var searchForMoreText: js.UndefOr[java.lang.String] = js.native
  /**
    * The text to display while searching for more results in a limited sugesstions list.
    */
  var searchingText: js.UndefOr[java.lang.String] = js.native
  /**
    * The callback that should be called to see if the force resolve command should be shown
    */
  var showForceResolve: js.UndefOr[js.Function0[scala.Boolean]] = js.native
  /**
    * Indicates whether to show a button with each suggestion to remove that suggestion.
    */
  var showRemoveButtons: js.UndefOr[scala.Boolean] = js.native
  /**
    * The list of Suggestions that will be displayed
    */
  var suggestions: js.Array[
    officeDashUiDashFabricDashReactLib.libComponentsPickersSuggestionsSuggestionsControllerMod.ISuggestionModel[T]
  ] = js.native
  /**
    * Screen reader message to read when there are suggestions available.
    */
  var suggestionsAvailableAlertText: js.UndefOr[java.lang.String] = js.native
  /**
    * The CSS classname of the suggestionslist
    */
  var suggestionsClassName: js.UndefOr[java.lang.String] = js.native
  /**
    * An ARIA label for the container that is the parent of the suggestions.
    */
  var suggestionsContainerAriaLabel: js.UndefOr[java.lang.String] = js.native
  /**
    * The text that appears at the top of the suggestions list.
    */
  var suggestionsHeaderText: js.UndefOr[java.lang.String] = js.native
  /**
    * the classname of the suggestionitem.
    */
  var suggestionsItemClassName: js.UndefOr[java.lang.String] = js.native
  /**
    * The string that will be used as the suggestionsListId. Will be used by the basepicker to keep track of the list
    * for aria.
    */
  var suggestionsListId: js.UndefOr[java.lang.String] = js.native
  /**
    * What should occur when a suggestion is clicked
    */
  def onSuggestionClick(): scala.Unit = js.native
  def onSuggestionClick(
    ev: reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement with stdLib.HTMLElement, reactLib.NativeMouseEvent]
  ): scala.Unit = js.native
  def onSuggestionClick(
    ev: reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement with stdLib.HTMLElement, reactLib.NativeMouseEvent],
    item: js.Any
  ): scala.Unit = js.native
  def onSuggestionClick(
    ev: reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement with stdLib.HTMLElement, reactLib.NativeMouseEvent],
    item: js.Any,
    index: scala.Double
  ): scala.Unit = js.native
}


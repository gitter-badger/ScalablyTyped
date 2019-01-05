package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BubbleParentApiNameMODALPRESENTATIONCURRENTCONTEXT extends js.Object {
  /**
  			 * A set of constants for the styles available for <Titanium.UI.ActivityIndicator> objects.
  			 */
  val ActivityIndicatorStyleNs: Anon_BubbleParentApiNameBIG
  /**
  			 * A set of constants for the style that can be used for the `style` property of
  			 * <Titanium.UI.AlertDialog>.
  			 */
  val AlertDialogStyleNs: Anon_BubbleParentApiNameDEFAULT
  /**
  			 * A set of constants for the animation styles used for view transitions.
  			 */
  val AnimationStyleNs: Anon_BubbleParentApiNameCURLDOWNCURLUP
  /**
  			 * A set of constants for the style that can be used for the `separatorStyle` property of
  			 * <Titanium.UI.ListView>.
  			 */
  val ListViewSeparatorStyleNs: Anon_BubbleParentApiNameNONE
  /**
  			 * View presented with the same style as its parent window.
  			 */
  val MODAL_PRESENTATION_CURRENT_CONTEXT: scala.Double
  /**
  			 * Window width and height are smaller than those of the screen and the view is centered on
  			 * the screen.
  			 */
  val MODAL_PRESENTATION_FORMSHEET: scala.Double
  /**
  			 * Window covers the screen.
  			 */
  val MODAL_PRESENTATION_FULLSCREEN: scala.Double
  /**
  			 * Window height is the height of the screen and width is equal to screen width in a portrait
  			 * orientation.
  			 */
  val MODAL_PRESENTATION_PAGESHEET: scala.Double
  /**
  			 * When the window is presented, its view slides up from the bottom of the screen. On dismissal,
  			 * the view slides back down (default.)
  			 */
  val MODAL_TRANSITION_STYLE_COVER_VERTICAL: scala.Double
  /**
  			 * When the window is presented, the current view fades out while the new view fades in at the
  			 * same time. On dismissal, a similar type of cross-fade is used to return to the original view.
  			 */
  val MODAL_TRANSITION_STYLE_CROSS_DISSOLVE: scala.Double
  /**
  			 * When the window is presented, the current view initiates a horizontal 3D flip from
  			 * right-to-left, resulting in the revealing of the new view as if it were on the back of the
  			 * previous view. On dismissal, the flip occurs from left-to-right, returning to the original
  			 * view.
  			 */
  val MODAL_TRANSITION_STYLE_FLIP_HORIZONTAL: scala.Double
  /**
  			 * When the window is presented, one corner of the current view curls up to reveal the modal
  			 * view underneath. On dismissal, the curled up page unfurls itself back on top of the modal
  			 * view.
  			 */
  val MODAL_TRANSITION_STYLE_PARTIAL_CURL: scala.Double
  /**
  			 * A set of constants for the bar styles used on the `style` property of <Titanium.UI.ProgressBar>.
  			 */
  val ProgressBarStyleNs: Anon_BubbleParentApiNameBAR
  /**
  			 * A set of constants for the Animation Styles used for transition on table view rows.
  			 */
  val RowAnimationStyleNs: Anon_BubbleParentApiNameBOTTOM
  /**
  			 * A set of constants for the styles available for scrollbars used with <Titanium.UI.ScrollView.scrollIndicatorStyle> and <Titanium.UI.TableView.scrollIndicatorStyle> properties.
  			 */
  val ScrollIndicatorStyleNs: Anon_BubbleParentApiNameBLACK
  /**
  			 * A set of constants for creating standard iOS system buttons.
  			 */
  val SystemButtonNs: Anon_BubbleParentApiNameACTION
  /**
  			 * A set of constants for the system button styles that can be used for the button `style` property.
  			 */
  val SystemButtonStyleNs: Anon_BubbleParentApiNameBARBORDERED
  /**
  			 * A set of constants for the system icon styles that can be used on a tab group tab.
  			 */
  val SystemIconNs: Anon_BubbleParentApiNameBOOKMARKS
  /**
  			 * A set of constants for the style that can be used for the `selectionStyle` property of
  			 * <Titanium.UI.TableViewRow>.
  			 */
  val TableViewCellSelectionStyleNs: Anon_BubbleParentApiNameBLUE
  /**
  			 * A set of constants for the position value that can be used for the `position` property of
  			 * <Titanium.UI.TableView> when invoking `scrollToIndex`.
  			 */
  val TableViewScrollPositionNs: Anon_BubbleParentApiNameBOTTOMMIDDLE
  /**
  			 * A set of constants for the style that can be used for the `separatorStyle` property of
  			 * <Titanium.UI.TableView>.
  			 */
  val TableViewSeparatorStyleNs: Anon_BubbleParentApiNameNONE
  /**
  			 * A set of constants for the style that can be used for the button `style` property of
  			 * <Titanium.UI.TableView>.
  			 */
  val TableViewStyleNs: Anon_BubbleParentApiNameGROUPED
  /**
  			 * The name of the API that this proxy corresponds to.
  			 */
  val apiName: java.lang.String
  /**
  			 * Value of the badge for the application's springboard icon.
  			 */
  var appBadge: scala.Double
  /**
  			 * Determines whether the shake to edit system-wide capability is enabled.
  			 */
  var appSupportsShakeToEdit: scala.Boolean
  /**
  			 * Indicates if the proxy will bubble an event to its parent.
  			 */
  var bubbleParent: scala.Boolean
  /**
  			 * Adds the specified callback as an event listener for the named event.
  			 */
  def addEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit
  /**
  			 * Applies the properties to the proxy.
  			 */
  def applyProperties(props: js.Any): scala.Unit
  /**
  			 * Fires a synthesized event to any registered listeners.
  			 */
  def fireEvent(name: java.lang.String, event: js.Any): scala.Unit
  /**
  			 * Gets the value of the <Titanium.UI.iPhone.apiName> property.
  			 */
  def getApiName(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.UI.iPhone.appBadge> property.
  			 */
  def getAppBadge(): scala.Double
  /**
  			 * Gets the value of the <Titanium.UI.iPhone.appSupportsShakeToEdit> property.
  			 */
  def getAppSupportsShakeToEdit(): scala.Boolean
  /**
  			 * Gets the value of the <Titanium.UI.iPhone.bubbleParent> property.
  			 */
  def getBubbleParent(): scala.Boolean
  /**
  			 * Removes the specified callback as an event listener for the named event.
  			 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit
  /**
  			 * Sets the value of the <Titanium.UI.iPhone.appBadge> property.
  			 */
  def setAppBadge(appBadge: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.UI.iPhone.appSupportsShakeToEdit> property.
  			 */
  def setAppSupportsShakeToEdit(appSupportsShakeToEdit: scala.Boolean): scala.Unit
  /**
  			 * Sets the value of the <Titanium.UI.iPhone.bubbleParent> property.
  			 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit
}


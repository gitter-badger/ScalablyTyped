package typings
package reactDashInfiniteDashScrollDashComponentLib.reactDashInfiniteDashScrollDashComponentMod.InfiniteScrollNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfiniteScrollProps extends js.Object {
  /**
    * Children component which will be rendered
    */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * Set the length of the data.This will unlock the subsequent calls to next.
    */
  var dataLength: scala.Double
  /**
    * This message is shown to the user when he has seen all the records which means he's at the bottom and hasMore is false
    */
  var endMessage: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * Children is by default assumed to be of type array and it's length is used to determine if loader needs to be shown or not,
    * if your children is not an array, specify this prop to tell if your items are 0 or more.
    */
  var hasChildren: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * It tells the InfiniteScroll component on whether to call next function on reaching the bottom and shows an endMessage to the user
    */
  var hasMore: scala.Boolean
  /**
    * Give only if you want to have a fixed height scrolling content
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * Set a scroll y position for the component to render with.
    */
  var initialScrollY: js.UndefOr[scala.Double] = js.undefined
  /**
    * You can send a loader component to show while the component waits for the next load of data. e.g. <h3>Loading...</h3> or any fancy loader element
    */
  var loader: reactLib.reactMod.ReactNs.ReactNode
  /**
    * A function that will listen to the scroll event on the scrolling container. Note that the scroll event is throttled, so you may not receive as many events as you would expect.
    */
  var onScroll: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * To enable Pull Down to Refresh feature
    */
  var pullDownToRefresh: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Any JSX that you want to show the user, default={<h3>Pull down to refresh</h3>}
    */
  var pullDownToRefreshContent: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * Minimum distance the user needs to pull down to trigger the refresh, default=100px
    */
  var pullDownToRefreshThreshold: js.UndefOr[scala.Double] = js.undefined
  /**
    * This function will be called, it should return the fresh data that you want to show the user
    */
  var refreshFunction: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Any JSX that you want to show the user, default={<h3>Release to refresh</h3>}
    */
  var releaseToRefreshContent: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * A threshold value defining when InfiniteScroll will call next. Default value is 0.8. It means the next will be called when user comes below 80% of the total height.
    * If you pass threshold in pixels (scrollThreshold="200px"), next will be called once you scroll at least (100% - scrollThreshold) pixels down.
    */
  var scrollThreshold: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Reference to a (parent) DOM element that is already providing overflow scrollbars to the InfiniteScroll component.
    * You should provide the id of the DOM node preferably.
    */
  var scrollableTarget: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode | java.lang.String] = js.undefined
  /**
    * Set a scroll y position for the component to render with.
    */
  var style: js.UndefOr[js.Any] = js.undefined
  /**
    * A function which must be called after reaching the bottom. It must trigger some sort of action which fetches the next data.
    * The data is passed as children to the InfiniteScroll component and the data should contain previous items too.
    * e.g. Initial data = [1, 2, 3] and then next load of data should be [1, 2, 3, 4, 5, 6].
    */
  def next(): scala.Unit
}


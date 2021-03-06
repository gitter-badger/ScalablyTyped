package typings
package glidejsLib.JQueryGlideNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGlideOptions extends js.Object {
  /**
    * Default: function () {}
    * {Function} Callback after plugin init
    */
  var afterInit: js.UndefOr[js.Function] = js.undefined
  /**
    * Default: function() {}
    * {Function} Callback after slide change
    */
  var afterTransition: js.UndefOr[js.Function] = js.undefined
  /**
    * Default: 500
    * Animation time in ms
    * @type {number}
    */
  var animationDuration: js.UndefOr[scala.Double] = js.undefined
  /**
    * Default: cubic-bezier(0.165, 0.840, 0.440, 1.000)
    * cubic-bezier(0.165, 0.840, 0.440, 1.000)
    */
  var animationTimingFunc: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default: 'slider-arrow--left'
    * {String} Left arrow
    */
  var arrowLeftClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default: 'prev'
    * {String} Left arrow text
    */
  var arrowLeftText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default: 'slider-arrow'
    * {String} Main class for both arrows
    */
  var arrowMainClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default: 'slider-arrow--right'
    * {String} Right arrow
    */
  var arrowRightClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default: 'next'
    * {String} Right arrow text
    */
  var arrowRightText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default: true
    * {Bool or String} Show/hide/appendTo arrows
    * True for append arrows to slider wrapper
    * False for not appending arrows
    * Id or class name (e.g. '.class-name') for appending to specific HTML markup
    */
  var arrows: js.UndefOr[js.Any] = js.undefined
  /**
    * Default: 'slider-arrows'
    * {String} Arrows wrapper class
    */
  var arrowsWrapperClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default: 4000
    * {Int or Bool} False for turning off autoplay
    */
  var autoplay: js.UndefOr[js.Any] = js.undefined
  /**
    * Default: function () {}
    * {Function} Callback before plugin init
    */
  var beforeInit: js.UndefOr[js.Function] = js.undefined
  /**
    * Default: function () {}
    * {Function} Callback before slide change
    */
  var beforeTransition: js.UndefOr[js.Function] = js.undefined
  /**
    * Default: true {Bool} Circular play (Animation continues without starting over once it reaches the last slide)
    */
  var circular: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: true {Bool} Pause autoplay on mouseover slider
    */
  var hoverpause: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: true
    * {Bool} Slide on left / right keyboard arrows press
    */
  var keyboard: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: true
    * {Bool or String} Show/hide/appendTo bullets navigation
    * True for append arrows to slider wrapper
    * False for not appending arrows
    * Id or class name (e.g. '.class-name') for appending to specific HTML markup
    */
  var navigation: js.UndefOr[js.Any] = js.undefined
  /**
    * Default: true
    * {Bool} Center bullet navigation
    */
  var navigationCenter: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: 'slider-nav'
    * {String} Navigation class
    */
  var navigationClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default: 'slider-nav__item--current'
    * {String} Current navigation item class
    */
  var navigationCurrentItemClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default: 'slider-nav__item'
    * {String} Navigation item class
    */
  var navigationItemClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default: 60
    * {Int or Bool} Touch settings
    */
  var touchDistance: js.UndefOr[js.Any] = js.undefined
}


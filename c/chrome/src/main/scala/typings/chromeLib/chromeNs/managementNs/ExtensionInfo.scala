package typings
package chromeLib.chromeNs.managementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionInfo extends js.Object {
  /** Optional. The launch url (only present for apps). */
  var appLaunchUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional.
    * The currently available launch types (only present for apps).
    * @since Chrome 37.
    */
  var availableLaunchTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The description of this extension, app, or theme.
    * @since Chrome 9.
    */
  var description: java.lang.String
  /**
    * Optional.
    * A reason the item is disabled.
    * @since Chrome 17.
    */
  var disabledReason: js.UndefOr[java.lang.String] = js.undefined
  /** Whether it is currently enabled or disabled. */
  var enabled: scala.Boolean
  /**
    * Optional.
    * The URL of the homepage of this extension, app, or theme.
    * @since Chrome 11.
    */
  var homepageUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Returns a list of host based permissions.
    * @since Chrome 9.
    */
  var hostPermissions: js.Array[java.lang.String]
  /**
    * Optional.
    * A list of icon information. Note that this just reflects what was declared in the manifest, and the actual image at that url may be larger or smaller than what was declared, so you might consider using explicit width and height attributes on img tags referencing these images. See the manifest documentation on icons for more details.
    */
  var icons: js.UndefOr[js.Array[IconInfo]] = js.undefined
  /** The extension's unique identifier. */
  var id: java.lang.String
  /**
    * How the extension was installed.
    * @since Chrome 22.
    */
  var installType: java.lang.String
  /**
    * True if this is an app.
    * @deprecated since Chrome 33. Please use management.ExtensionInfo.type.
    */
  var isApp: scala.Boolean
  /**
    * Optional.
    * The app launch type (only present for apps).
    * @since Chrome 37.
    */
  var launchType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether this extension can be disabled or uninstalled by the user.
    * @since Chrome 12.
    */
  var mayDisable: scala.Boolean
  /** The name of this extension, app, or theme. */
  var name: java.lang.String
  /**
    * Whether the extension, app, or theme declares that it supports offline.
    * @since Chrome 15.
    */
  var offlineEnabled: scala.Boolean
  /** The url for the item's options page, if it has one. */
  var optionsUrl: java.lang.String
  /**
    * Returns a list of API based permissions.
    * @since Chrome 9.
    */
  var permissions: js.Array[java.lang.String]
  /**
    * A short version of the name of this extension, app, or theme.
    * @since Chrome 31.
    */
  var shortName: java.lang.String
  /**
    * The type of this extension, app, or theme.
    * @since Chrome 23.
    */
  var `type`: java.lang.String
  /**
    * Optional.
    * The update URL of this extension, app, or theme.
    * @since Chrome 16.
    */
  var updateUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The version of this extension, app, or theme. */
  var version: java.lang.String
}


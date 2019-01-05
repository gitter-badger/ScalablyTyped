package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alarms extends js.Object {
  /**
    * Permissions: `alarms`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val alarmsNs: Anon_Create
  /**
    * Use the `browser.bookmarks` API to create, organize, and otherwise manipulate bookmarks. Also see Override Pages,
    * which you can use to create a custom Bookmark Manager page.
    *
    * Permissions: `bookmarks`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val bookmarksNs: Anon_GetIdOrIdList
  /**
    * Use browser actions to put icons in the main browser toolbar, to the right of the address bar. In addition to its
    * icon, a browser action can also have a tooltip, a badge, and a popup.
    *
    * Manifest keys: `browser_action`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val browserActionNs: Anon_SetTitle
  /**
    * Use the `browser.browserSettings` API to control global settings of the browser.
    *
    * Permissions: `browserSettings`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val browserSettingsNs: Anon_AllowPopupsForUserEvents
  /**
    * Use the `browser.browsingData` API to remove browsing data from a user's local profile.
    *
    * Permissions: `browsingData`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val browsingDataNs: Anon_SettingsRemove
  /**
    * Offers the ability to write to the clipboard. Reading is not supported because the clipboard can already be read
    * through the standard web platform APIs.
    *
    * Permissions: `clipboardWrite`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val clipboardNs: Anon_SetImageData
  /**
    * Use the commands API to add keyboard shortcuts that trigger actions in your extension, for example, an action to
    * open the browser action or send a command to the xtension.
    *
    * Manifest keys: `commands`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val commandsNs: Anon_Update
  /** Not allowed in: Content scripts, Devtools pages */
  val contentScriptsNs: Anon_Register
  /**
    * Use the browser.contextMenus API to add items to the browser's context menu. You can choose what types of objects
    * your context menu additions apply to, such as images, hyperlinks, and pages.
    *
    * Permissions: `contextMenus`
    */
  val contextMenusNs: Anon_ACTIONMENUTOPLEVELLIMIT
  /**
    * Use the `browser.contextualIdentities` API to query and modify contextual identity, also called as containers.
    *
    * Permissions: `contextualIdentities`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val contextualIdentitiesNs: Anon_Get
  /**
    * Use the `browser.cookies` API to query and modify cookies, and to be notified when they change.
    *
    * Permissions: `cookies`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val cookiesNs: Anon_GetDetails
  /**
    * Manifest keys: `devtools_page`
    *
    * Allowed in: Devtools pages only
    */
  val devtoolsNs: Anon_InspectedWindow
  /**
    * Asynchronous DNS API
    *
    * Permissions: `dns`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val dnsNs: Anon_Resolve
  /**
    * Permissions: `downloads`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val downloadsNs: Anon_Download
  /**
    * The `browser.events` namespace contains common types used by APIs dispatching events to notify you when something
    * interesting happens.
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val eventsNs: js.Any
  /** Not allowed in: Content scripts, Devtools pages */
  val experimentsNs: js.Any
  /**
    * The `browser.extension` API has utilities that can be used by any extension page. It includes support for exchanging
    * messages between an extension and its content scripts or between extensions, as described in detail in Message
    * Passing.
    */
  val extensionNs: Anon_LastError
  /**
    * The `browser.extensionTypes` API contains type declarations for WebExtensions.
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val extensionTypesNs: js.Any
  /**
    * Use the `browser.find` API to interact with the browser's `Find` interface.
    *
    * Permissions: `find`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val findNs: Anon_Find
  /**
    * Exposes the browser's profiler.
    *
    * Permissions: `geckoProfiler`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val geckoProfilerNs: Anon_Start
  /**
    * Use the `browser.history` API to interact with the browser's record of visited pages. You can add, remove, and query
    * for URLs in the browser's history. To override the history page with your own version, see Override Pages.
    *
    * Permissions: `history`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val historyNs: Anon_Search
  /**
    * Use the `browser.i18n` infrastructure to implement internationalization across your whole app or extension.
    */
  val i18nNs: Anon_GetAcceptLanguages
  /**
    * Use the browser.identity API to get OAuth2 access tokens.
    *
    * Permissions: `identity`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val identityNs: Anon_GetAccounts
  /**
    * Use the `browser.idle` API to detect when the machine's idle state changes.
    *
    * Permissions: `idle`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val idleNs: Anon_QueryState
  /**
    * The `browser.management` API provides ways to manage the list of extensions that are installed and running.
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val managementNs: Anon_GetAll
  /**
    * Use the browser.menus API to add items to the browser's menus. You can choose what types of objects your context
    * menu additions apply to, such as images, hyperlinks, and pages.
    *
    * Permissions: `menus`, `menus`
    */
  val menusNs: Anon_ACTIONMENUTOPLEVELLIMITCreate
  /**
    * Permissions: `notifications`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val notificationsNs: Anon_CreateOptions
  /**
    * The omnibox API allows you to register a keyword with Firefox's address bar.
    *
    * Manifest keys: `omnibox`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val omniboxNs: Anon_SetDefaultSuggestion
  /**
    * Use the `browser.pageAction` API to put icons inside the address bar. Page actions represent actions that can be
    * taken on the current page, but that aren't applicable to all pages.
    *
    * Manifest keys: `page_action`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val pageActionNs: Anon_Show
  /**
    * Manifest keys: `optional_permissions`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val permissionsNs: Anon_GetAllContains
  /**
    * PKCS#11 module management API
    *
    * Permissions: `pkcs11`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val pkcs11Ns: Anon_IsModuleInstalled
  /**
    * Permissions: `privacy`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val privacyNs: Anon_Network
  /**
    * Use the browser.proxy API to register proxy scripts in Firefox. Proxy scripts in Firefox are proxy auto-config files
    * with extra contextual information and support for additional return types.
    *
    * Permissions: `proxy`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val proxyNs: Anon_Settings
  /**
    * Use the `browser.runtime` API to retrieve the background page, return details about the manifest, and listen for and
    * respond to events in the app or extension lifecycle. You can also use this API to convert the relative path of URLs
    * to fully-qualified URLs.
    *
    * Allowed in: Proxy scripts
    */
  val runtimeNs: Anon_LastErrorId
  /**
    * Use browser.search to interact with search engines.
    *
    * Permissions: `search`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val searchNs: Anon_GetSearch
  /**
    * Use the `browser.sessions` API to query and restore tabs and windows from a browsing session.
    *
    * Permissions: `sessions`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val sessionsNs: Anon_MAXSESSIONRESULTS
  /**
    * Use sidebar actions to add a sidebar to Firefox.
    *
    * Manifest keys: `sidebar_action`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val sidebarActionNs: Anon_SetTitleDetails
  /**
    * Use the `browser.storage` API to store, retrieve, and track changes to user data.
    *
    * Permissions: `storage`
    */
  val storageNs: Anon_Sync
  /**
    * Use the `browser.tabs` API to interact with the browser's tab system. You can use this API to create, modify, and
    * rearrange tabs in the browser.
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val tabsNs: Anon_TABIDNONE
  /**
    * Use the `browser.telemetry` API to send telemetry data to the Mozilla Telemetry service. Restricted to Mozilla
    * privileged webextensions.
    *
    * Permissions: `telemetry`, `mozillaAddons`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val telemetryNs: Anon_SubmitPing
  /**
    * The theme API allows customizing of visual elements of the browser.
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val themeNs: Anon_GetCurrent
  /**
    * Use the browser.topSites API to access the top sites that are displayed on the new tab page.
    *
    * Permissions: `topSites`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val topSitesNs: Anon_GetOptions
  /**
    * Contains types used by other schemas.
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val typesNs: js.Any
  /** Not allowed in: Content scripts, Devtools pages */
  val underscoreManifestNs: js.Any
  /**
    * Manifest keys: `user_scripts`, `user_scripts`
    *
    * Not allowed in: Devtools pages
    */
  val userScriptsNs: Anon_RegisterUserScriptOptions
  /**
    * Use the `browser.webNavigation` API to receive notifications about the status of navigation requests in-flight.
    *
    * Permissions: `webNavigation`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val webNavigationNs: Anon_GetFrame
  /**
    * Use the `browser.webRequest` API to observe and analyze traffic and to intercept, block, or modify requests
    * in-flight.
    *
    * Permissions: `webRequest`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val webRequestNs: Anon_MAXHANDLERBEHAVIORCHANGEDCALLSPER10MINUTES
  /**
    * Use the `browser.windows` API to interact with browser windows. You can use this API to create, modify, and
    * rearrange windows in the browser.
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val windowsNs: Anon_WINDOWIDNONE
}


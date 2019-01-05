package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Download extends js.Object {
  /**
    * When any of a DownloadItem's properties except `bytesReceived` changes, this event fires with the `downloadId`
    * and an object containing the properties that changed.
    */
  val onChanged: WebExtEvent[js.Function1[/* downloadDelta */ Anon_Id, scala.Unit]] = js.native
  /* downloads events */
  /** This event fires with the DownloadItem object when a download begins. */
  val onCreated: WebExtEvent[
    js.Function1[
      /* downloadItem */ firefoxDashWebextDashBrowserLib.browserNs.downloadsNs.DownloadItem, 
      scala.Unit
    ]
  ] = js.native
  /**
    * Fires with the `downloadId` when a download is erased from history.
    * @param downloadId The `id` of the DownloadItem that was erased.
    */
  val onErased: WebExtEvent[js.Function1[/* downloadId */ scala.Double, scala.Unit]] = js.native
  /**
    * Prompt the user to either accept or cancel a dangerous download. `acceptDanger()` does not automatically accept
    * dangerous downloads.
    * @deprecated Unsupported on Firefox at this time.
    */
  def acceptDanger(downloadId: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Cancel a download. When `callback` is run, the download is cancelled, completed, interrupted or doesn't exist
    * anymore.
    * @param downloadId The id of the download to cancel.
    */
  def cancel(downloadId: scala.Double): js.Promise[scala.Unit] = js.native
  /* downloads functions */
  /**
    * Download a URL. If the URL uses the HTTP[S] protocol, then the request will include all cookies currently set
    * for its hostname. If both `filename` and `saveAs` are specified, then the Save As dialog will be displayed,
    * pre-populated with the specified `filename`. If the download started successfully, `callback` will be called
    * with the new DownloadItem's `downloadId`. If there was an error starting the download, then `callback` will be
    * called with `downloadId=undefined` and browser.extension.lastError will contain a descriptive string. The error
    * strings are not guaranteed to remain backwards compatible between releases. You must not parse it.
    * @param options What to download and how.
    */
  def download(options: Anon_UrlFilename): js.Promise[js.UndefOr[scala.Double]] = js.native
  /**
    * Initiate dragging the file to another application.
    * @deprecated Unsupported on Firefox at this time.
    */
  def drag(downloadId: scala.Double): scala.Unit = js.native
  /** Erase matching DownloadItems from history */
  def erase(query: firefoxDashWebextDashBrowserLib.browserNs.downloadsNs.DownloadQuery): js.Promise[js.UndefOr[js.Array[scala.Double]]] = js.native
  /**
    * Retrieve an icon for the specified download. For new downloads, file icons are available after the onCreated
    * event has been received. The image returned by this function while a download is in progress may be different
    * from the image returned after the download is complete. Icon retrieval is done by querying the underlying
    * operating system or toolkit depending on the platform. The icon that is returned will therefore depend on a
    * number of factors including state of the download, platform, registered file types and visual theme. If a file
    * icon cannot be determined, browser.extension.lastError will contain an error message.
    * @param downloadId The identifier for the download.
    */
  def getFileIcon(downloadId: scala.Double): js.Promise[java.lang.String] = js.native
  def getFileIcon(downloadId: scala.Double, options: Anon_Size): js.Promise[java.lang.String] = js.native
  /** Open the downloaded file. */
  def open(downloadId: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Pause the download. If the request was successful the download is in a paused state. Otherwise
    * browser.extension.lastError contains an error message. The request will fail if the download is not active.
    * @param downloadId The id of the download to pause.
    */
  def pause(downloadId: scala.Double): js.Promise[scala.Unit] = js.native
  def removeFile(downloadId: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Resume a paused download. If the request was successful the download is in progress and unpaused. Otherwise
    * browser.extension.lastError contains an error message. The request will fail if the download is not active.
    * @param downloadId The id of the download to resume.
    */
  def resume(downloadId: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Find DownloadItems. Set `query` to the empty object to get all DownloadItems. To get a specific DownloadItem,
    * set only the `id` field.
    */
  def search(query: firefoxDashWebextDashBrowserLib.browserNs.downloadsNs.DownloadQuery): js.Promise[js.Array[firefoxDashWebextDashBrowserLib.browserNs.downloadsNs.DownloadItem]] = js.native
  /** @deprecated Unsupported on Firefox at this time. */
  def setShelfEnabled(enabled: scala.Boolean): scala.Unit = js.native
  /** Show the downloaded file in its folder in a file manager. */
  def show(downloadId: scala.Double): js.Promise[js.UndefOr[scala.Boolean]] = js.native
  def showDefaultFolder(): scala.Unit = js.native
}


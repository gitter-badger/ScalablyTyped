package typings
package chromeDashAppsLib.chromeNs.fileSystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.fileSystem")
@js.native
object fileSystemNsMembers extends js.Object {
  /** @enum */
  val ChildChangeType: chromeDashAppsLib.Anon_CREATED = js.native
  /**
    * **openFile**
    *  - Prompts the user to open an existing file and returns a FileEntry on success.
    *    From Chrome 31 onwards, the FileEntry will be writable if the application has
    *    the 'write' permission under 'fileSystem'; otherwise, the FileEntry will be read-only.
    * **openWritableFile**
    *  - Prompts the user to open an existing file and returns a writable FileEntry on success.
    *    Calls using this type will fail with a runtime error if the application doesn't have the
    *    'write' permission under 'fileSystem'.
    * **saveFile**
    *  - Prompts the user to open an existing file or a new file and returns a writable FileEntry
    *    on success. Calls using this type will fail with a runtime error if the application doesn't
    *    have the 'write' permission under 'fileSystem'.
    * **openDirectory**
    *  - Prompts the user to open a directory and returns a DirectoryEntry on success. Calls using
    *    this type will fail with a runtime error if the application doesn't have the 'directory'
    *    permission under 'fileSystem'. If the application has the 'write' permission under
    *    'fileSystem', the returned DirectoryEntry will be writable; otherwise it will be read-only.
    *    New in Chrome 31.
    * @enum
    */
  val ChooseEntryType: chromeDashAppsLib.Anon_OPENFILE = js.native
  /**
    * Called when a list of available volumes is changed.
    * @since Chrome 44.
    */
  val onVolumeListChanged: chromeDashAppsLib.chromeNs.eventsNs.Event[js.Function1[/* object */ js.Array[Volume], scala.Unit]] = js.native
  /** Ask the user to choose a file or directory. */
  def chooseEntry(
    callback: FileEntryCallback[
      ChooseFileEntryOptions, 
      filesystemLib.FileEntry | filesystemLib.DirectoryEntry | js.Array[filesystemLib.FileEntry]
    ]
  ): scala.Unit = js.native
  def chooseEntry(
    options: ChooseDirectoryEntryOptions,
    callback: FileEntryCallback[
      ChooseDirectoryEntryOptions, 
      filesystemLib.FileEntry | filesystemLib.DirectoryEntry | js.Array[filesystemLib.FileEntry]
    ]
  ): scala.Unit = js.native
  /** Ask the user to choose a file or directory. */
  def chooseEntry(
    options: ChooseEntryOptionsBase,
    callback: FileEntryCallback[
      ChooseEntryOptionsBase, 
      filesystemLib.FileEntry | filesystemLib.DirectoryEntry | js.Array[filesystemLib.FileEntry]
    ]
  ): scala.Unit = js.native
  def chooseEntry(
    options: ChooseFileEntryOptions,
    callback: FileEntryCallback[
      ChooseFileEntryOptions, 
      filesystemLib.FileEntry | filesystemLib.DirectoryEntry | js.Array[filesystemLib.FileEntry]
    ]
  ): scala.Unit = js.native
  def chooseEntry(
    options: ChooseMultipleFilesEntryOptions,
    callback: FileEntryCallback[
      ChooseMultipleFilesEntryOptions, 
      filesystemLib.FileEntry | filesystemLib.DirectoryEntry | js.Array[filesystemLib.FileEntry]
    ]
  ): scala.Unit = js.native
  def chooseEntry(
    options: ChooseSaveFileEntryOptions,
    callback: FileEntryCallback[
      ChooseSaveFileEntryOptions, 
      filesystemLib.FileEntry | filesystemLib.DirectoryEntry | js.Array[filesystemLib.FileEntry]
    ]
  ): scala.Unit = js.native
  def getDisplayPath(
    entry: filesystemLib.DirectoryEntry,
    callback: js.Function1[/* displayPath */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Get the display path of an Entry object.
    * The display path is based on the full path of the file or directory on the local file system, but may be made more readable for display purposes.
    */
  def getDisplayPath(
    entry: filesystemLib.FileEntry,
    callback: js.Function1[/* displayPath */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
    * @requires(Kiosk) Chrome OS Kiosk mode only
    * @requires Permissions: The 'fileSystem': {'requestFileSystem'} manifest permission is required.
    * Returns a list of volumes available for requestFileSystem().
    * Available to kiosk apps running in the kiosk session only.
    * In case of an error, volumes will be undefined, and chrome.runtime.lastError will be set.
    * @since Chrome 44.
    */
  def getVolumeList(callback: js.Function1[/* volumes */ js.Array[Volume], scala.Unit]): scala.Unit = js.native
  /**
    * Get a writable Entry from another Entry. This call will fail with a runtime error if the application does not have the 'write' permission under 'fileSystem'.
    * If entry is a DirectoryEntry, this call will fail if the application does not have the 'directory' permission under 'fileSystem'.
    */
  def getWritableEntry[T /* <: filesystemLib.FileEntry | filesystemLib.DirectoryEntry */](entry: T, callback: js.Function1[/* entry */ T, scala.Unit]): scala.Unit = js.native
  /**
    * Returns whether the app has permission to restore the entry with the given id.
    * @since Chrome 29.
    **/
  def isRestorable(id: java.lang.String, callback: js.Function1[/* isRestorable */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def isWritableEntry(
    entry: filesystemLib.DirectoryEntry,
    callback: js.Function1[/* isWritable */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  /** Gets whether this Entry is writable or not. */
  def isWritableEntry(entry: filesystemLib.FileEntry, callback: js.Function1[/* isWritable */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  /**
    * @requires(Kiosk) Kiosk mode only
    * @requires Permissions: The writable option requires the 'fileSystem': {'write'} permission in the manifest.
    * Requests access to a file system for a volume represented by options.volumeId.
    * If options.writable is set to true, then the file system will be writable.
    * Otherwise, it will be read-only.
    * For manual-launch kiosk mode, a confirmation dialog will be shown on top of the active app window.
    * In case of an error, fileSystem will be undefined, and chrome.runtime.lastError will be set.
    * @since Chrome 44.
    */
  def requestFileSystem(options: Volume, callback: js.Function1[/* fileSystem */ filesystemLib.FileSystem, scala.Unit]): scala.Unit = js.native
  /** Returns the file entry with the given id if it can be restored. This call will fail with a runtime error otherwise. */
  def restoreEntry(id: java.lang.String, callback: js.Function1[/* entry */ filesystemLib.FileEntry, scala.Unit]): scala.Unit = js.native
  def retainEntry(entry: filesystemLib.DirectoryEntry): java.lang.String = js.native
  /**
    * Returns an id that can be passed to restoreEntry to regain access to a given file entry.
    * Only the 500 most recently used entries are retained, where calls to retainEntry and restoreEntry count as use.
    * If the app has the 'retainEntries' permission under 'fileSystem', entries are retained indefinitely.
    * Otherwise, entries are retained only while the app is running and across restarts.
    * @since Chrome 29.
    * */
  def retainEntry(entry: filesystemLib.FileEntry): java.lang.String = js.native
}


package typings
package mockDashFsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FOK extends js.Object {
  // File Copy Constants
  /** Constant for fs.copyFile. Flag indicating the destination file should not be overwritten if it already exists. */
  val COPYFILE_EXCL: scala.Double
  /**
    * Constant for fs.copyFile. copy operation will attempt to create a copy-on-write reflink.
    * If the underlying platform does not support copy-on-write, then a fallback copy mechanism is used.
    */
  val COPYFILE_FICLONE: scala.Double
  /**
    * Constant for fs.copyFile. Copy operation will attempt to create a copy-on-write reflink.
    * If the underlying platform does not support copy-on-write, then the operation will fail with an error.
    */
  val COPYFILE_FICLONE_FORCE: scala.Double
  // File Access Constants
  /** Constant for fs.access(). File is visible to the calling process. */
  val F_OK: scala.Double
  /** Constant for fs.open(). Flag indicating that data will be appended to the end of the file. */
  val O_APPEND: scala.Double
  /** Constant for fs.open(). Flag indicating to create the file if it does not already exist. */
  val O_CREAT: scala.Double
  /** Constant for fs.open(). When set, an attempt will be made to minimize caching effects of file I/O. */
  val O_DIRECT: scala.Double
  /** Constant for fs.open(). Flag indicating that the open should fail if the path is not a directory. */
  val O_DIRECTORY: scala.Double
  /** Constant for fs.open(). Flag indicating that the file is opened for synchronous I/O with write operations waiting for data integrity. */
  val O_DSYNC: scala.Double
  /** Constant for fs.open(). Flag indicating that opening a file should fail if the O_CREAT flag is set and the file already exists. */
  val O_EXCL: scala.Double
  /**
    * constant for fs.open().
    * Flag indicating reading accesses to the file system will no longer result in
    * an update to the atime information associated with the file.
    * This flag is available on Linux operating systems only.
    */
  val O_NOATIME: scala.Double
  /**
    * Constant for fs.open(). Flag indicating that if path identifies a terminal device,
    * opening the path shall not cause that terminal to become the controlling terminal for the process
    * (if the process does not already have one).
    */
  val O_NOCTTY: scala.Double
  /** Constant for fs.open(). Flag indicating that the open should fail if the path is a symbolic link. */
  val O_NOFOLLOW: scala.Double
  /** Constant for fs.open(). Flag indicating to open the file in nonblocking mode when possible. */
  val O_NONBLOCK: scala.Double
  // File Open Constants
  /** Constant for fs.open(). Flag indicating to open a file for read-only access. */
  val O_RDONLY: scala.Double
  /** Constant for fs.open(). Flag indicating to open a file for read-write access. */
  val O_RDWR: scala.Double
  /** Constant for fs.open(). Flag indicating to open the symbolic link itself rather than the resource it is pointing to. */
  val O_SYMLINK: scala.Double
  /** Constant for fs.open(). Flag indicating that the file is opened for synchronous I/O. */
  val O_SYNC: scala.Double
  /** Constant for fs.open(). Flag indicating that if the file exists and is a regular file, and the file is opened successfully for write access, its length shall be truncated to zero. */
  val O_TRUNC: scala.Double
  /** Constant for fs.open(). Flag indicating to open a file for write-only access. */
  val O_WRONLY: scala.Double
  /** Constant for fs.access(). File can be read by the calling process. */
  val R_OK: scala.Double
  /** Constant for fs.Stats mode property for determining a file's type. File type constant for a block-oriented device file. */
  val S_IFBLK: scala.Double
  /** Constant for fs.Stats mode property for determining a file's type. File type constant for a character-oriented device file. */
  val S_IFCHR: scala.Double
  /** Constant for fs.Stats mode property for determining a file's type. File type constant for a directory. */
  val S_IFDIR: scala.Double
  /** Constant for fs.Stats mode property for determining a file's type. File type constant for a FIFO/pipe. */
  val S_IFIFO: scala.Double
  /** Constant for fs.Stats mode property for determining a file's type. File type constant for a symbolic link. */
  val S_IFLNK: scala.Double
  // File Type Constants
  /** Constant for fs.Stats mode property for determining a file's type. Bit mask used to extract the file type code. */
  val S_IFMT: scala.Double
  /** Constant for fs.Stats mode property for determining a file's type. File type constant for a regular file. */
  val S_IFREG: scala.Double
  /** Constant for fs.Stats mode property for determining a file's type. File type constant for a socket. */
  val S_IFSOCK: scala.Double
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by group. */
  val S_IRGRP: scala.Double
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by others. */
  val S_IROTH: scala.Double
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by owner. */
  val S_IRUSR: scala.Double
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by group. */
  val S_IRWXG: scala.Double
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by others. */
  val S_IRWXO: scala.Double
  // File Mode Constants
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by owner. */
  val S_IRWXU: scala.Double
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by group. */
  val S_IWGRP: scala.Double
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by others. */
  val S_IWOTH: scala.Double
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by owner. */
  val S_IWUSR: scala.Double
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by group. */
  val S_IXGRP: scala.Double
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by others. */
  val S_IXOTH: scala.Double
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by owner. */
  val S_IXUSR: scala.Double
  /** Constant for fs.access(). File can be written by the calling process. */
  val W_OK: scala.Double
  /** Constant for fs.access(). File can be executed by the calling process. */
  val X_OK: scala.Double
}


package typings
package adoneLib.adoneNs.fsNs.INs.GlobNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Set to true to always receive absolute paths for matched files
    */
  var absolute: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Pass in a previously generated cache object to save some fs calls
    */
  var cache: js.UndefOr[lodashLib.lodashMod.Global.Map[java.lang.String, java.lang.String]] = js.undefined
  /**
    * The current working directory in which to search. Defaults to process.cwd()
    */
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Include .dot files in normal matches and globstar matches
    */
  var dot: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Follow symlinked directories when expanding ** patterns.
    * Note that this can result in a lot of duplicate references in the presence of cyclic links
    */
  var follow: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Add a pattern or an array of glob patterns to exclude matches
    */
  var ignore: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * Add a / character to directory matches. Note that this requires additional stat calls
    */
  var mark: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Perform a basename-only match if the pattern does not contain any slash characters.
    * That is, *.js would be treated as equivalent to **\/ *.js, matching all js files in all directories
    */
  var matchBase: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Do not expand {a,b} and {1..3} brace sets.
    */
  var nobrace: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Perform a case-insensitive match.
    * Note: on case-insensitive filesystems, non-magic patterns will match by default, since stat and readdir will not raise errors.
    */
  var nocase: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Do not match directories, only files
    */
  var nodir: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Do not match +(a|b) "extglob" patterns.
    */
  var noext: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Do not match ** against multiple filenames. (Ie, treat it as a normal * instead.)
    */
  var noglobstar: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * By default, a pattern starting with a forward-slash will be "mounted" onto the root setting,
    * so that a valid filesystem path is returned
    */
  var nomount: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set to never return an empty set, instead returning a set containing the pattern itself.
    * This is the default in glob(3).
    */
  var nonull: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Don't sort the results
    */
  var nosort: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * In some cases, brace-expanded patterns can result in the same file showing up multiple times in the result set.
    * By default, this implementation prevents duplicates in the result set.
    * Set this flag to disable that behavior
    */
  var nounique: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set to true to call fs.realpath on all of the results
    */
  var realpath: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A cache of results of filesystem information, to prevent unnecessary realpath calls
    */
  var realpathCache: js.UndefOr[lodashLib.lodashMod.Global.Map[java.lang.String, java.lang.String]] = js.undefined
  /**
    * The place where patterns starting with / will be mounted onto
    */
  var root: js.UndefOr[java.lang.String] = js.undefined
  /**
    * When an unusual error is encountered when attempting to read a directory, a warning will be printed to stderr.
    * Set the option to true to suppress these warnings.
    */
  var silent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set to true to stat all results
    */
  var stat: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A cache of results of filesystem information, to prevent unnecessary stat calls
    */
  var statCache: js.UndefOr[
    lodashLib.lodashMod.Global.Map[java.lang.String, adoneLib.adoneNs.fsNs.INs.Stats]
  ] = js.undefined
  /**
    * When an unusual error is encountered when attempting to read a directory,
    * the process will just continue on in search of other matches.
    * Set the option to raise an error in these cases
    */
  var strict: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A cache of known symbolic links
    */
  var symlinks: js.UndefOr[js.Object] = js.undefined
}


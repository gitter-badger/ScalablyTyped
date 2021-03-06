package typings
package dtsDashGeneratorLib.dtsDashGeneratorMod.dtsGeneratorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DtsGeneratorOptions extends js.Object {
  /**
    * The base directory for the package being bundled. Any dependencies discovered outside this directory will be excluded
    * from the bundle.
    * Note this is no longer the preferred way to configure dts-generator, please see project.
    */
  var baseDir: js.UndefOr[java.lang.String] = js.undefined
  /** The end-of-line character that should be used when outputting code. Defaults to os.EOL. */
  var eol: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A list of glob patterns, relative to baseDir, that should be excluded from the bundle.
    * Use the --exclude flag one or more times on the command-line. Defaults to [ "node_modules\/ **\/ *.d.ts" ].
    */
  var exclude: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * A list of external module reference paths that should be inserted as reference comments.
    * Use the --extern flag one or more times on the command-line.
    */
  var externs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** A list of files from the baseDir to bundle. */
  var files: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The character(s) that should be used to indent the declarations in the output. Defaults to \t. */
  var indent: js.UndefOr[java.lang.String] = js.undefined
  /** The module ID that should be used as the exported value of the package’s “main” module. */
  var main: js.UndefOr[java.lang.String] = js.undefined
  /** The type of module resolution to use when generating the bundle. */
  var moduleResolution: js.UndefOr[typescriptLib.typescriptMod.tsNs.ModuleResolutionKind] = js.undefined
  /** The name of the package. Used to determine the correct exported package name for modules. */
  var name: java.lang.String
  /** The filename where the generated bundle will be created. */
  var out: java.lang.String
  /**
    * The base directory for the project being bundled. It is assumed that this directory contains a
    * tsconfig.json which will be parsed to determine the files that should be bundled as well as
    * other configuration information like target
    */
  var project: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An optional callback provided by the invoker to customize the declared module ids the output d.ts files.
    * @see {@link https://github.com/SitePen/dts-generator/blob/master/docs/resolving-module-ids.md Resolving Module Ids}
    */
  var resolveModuleId: js.UndefOr[js.Function1[/* params */ ResolveModuleIdParams, java.lang.String]] = js.undefined
  /**
    * An optional callback provided by the invoker to customize the imported module ids in the output d.ts files.
    * @see {@link https://github.com/SitePen/dts-generator/blob/master/docs/resolving-module-ids.md Resolving Module Ids}
    */
  var resolveModuleImport: js.UndefOr[js.Function1[/* params */ ResolveModuleImportParams, java.lang.String]] = js.undefined
  /** The target environment for generated code. Defaults to ts.ScriptTarget.Latest. */
  var target: js.UndefOr[typescriptLib.typescriptMod.tsNs.ScriptTarget] = js.undefined
  /**
    * A list of external @types package dependencies that should be inserted as reference comments.
    * Use the --types flag one or more times on the command-line.
    */
  var types: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}


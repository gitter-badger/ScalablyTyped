package typings
package atLinguiCoreLib.i18nMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageData extends js.Object {
  var plurals: js.UndefOr[
    js.Function2[
      /* n */ scala.Double, 
      /* pluralType */ js.UndefOr[
        atLinguiCoreLib.atLinguiCoreLibStrings.cardinal | atLinguiCoreLib.atLinguiCoreLibStrings.ordinal
      ], 
      java.lang.String
    ]
  ] = js.undefined
}


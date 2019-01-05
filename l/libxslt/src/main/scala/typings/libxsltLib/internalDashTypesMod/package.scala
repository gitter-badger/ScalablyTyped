package typings
package libxsltLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object internalDashTypesMod {
  type ApplyCallback = js.Function2[/* err */ nodeLib.Error with stdLib.Error, /* result */ ApplyResult, scala.Unit]
  type ApplyDocumentCallback = js.Function2[
    /* err */ nodeLib.Error with stdLib.Error, 
    /* result */ libxmljsLib.libxmljsMod.Document, 
    scala.Unit
  ]
  type ApplyResult = java.lang.String | libxmljsLib.libxmljsMod.Document
  type ApplyStringCallback = js.Function2[/* err */ nodeLib.Error with stdLib.Error, /* result */ java.lang.String, scala.Unit]
  type OutputFormat = libxsltLib.libxsltLibStrings.document | libxsltLib.libxsltLibStrings.string
  type ParseCallback = js.Function2[
    /* err */ nodeLib.Error with stdLib.Error, 
    /* stylesheet */ libxsltLib.libxsltMod.Stylesheet, 
    scala.Unit
  ]
}

package typings
package easyDashXapiDashSupertestLib.assertMod.internalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- stdLib.Error because var conflicts: stack. Inlined message, name */ trait AssertionError
  extends nodeLib.Error {
  var actual: js.Any
  var expected: js.Any
  var generatedMessage: scala.Boolean
  var message: java.lang.String
  var name: java.lang.String
  var operator: java.lang.String
}


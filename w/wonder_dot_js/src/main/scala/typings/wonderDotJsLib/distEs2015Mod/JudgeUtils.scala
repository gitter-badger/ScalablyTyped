package typings
package wonderDotJsLib.distEs2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "JudgeUtils")
@js.native
class JudgeUtils ()
  extends wonderDotJsLib.distEs2015UtilsJudgeUtilsMod.JudgeUtils

@JSImport("wonder.js/dist/es2015", "JudgeUtils")
@js.native
object JudgeUtils extends js.Object {
  def isClass(objInstance: js.Any, className: java.lang.String): scala.Boolean = js.native
  def isCollection(
    list: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Collection<any> */ js.Any
  ): scala.Boolean = js.native
  def isComponenet(component: wonderDotJsLib.distEs2015CoreComponentMod.Component): scala.Boolean = js.native
  def isDom(obj: js.Any): scala.Boolean = js.native
  def isEqual(target1: js.Any, target2: js.Any): scala.Boolean = js.native
  def isFloatArray(data: js.Any): scala.Boolean = js.native
  def isInterface(target: js.Any, memberOfInterface: java.lang.String): scala.Boolean = js.native
  def isPowerOfTwo(value: scala.Double): scala.Boolean = js.native
  def isSelf(
    self: wonderDotJsLib.distEs2015CoreEntityMod.Entity,
    entityObject: wonderDotJsLib.distEs2015CoreEntityMod.Entity
  ): scala.Boolean = js.native
  def isView(obj: js.Any): scala.Boolean = js.native
}


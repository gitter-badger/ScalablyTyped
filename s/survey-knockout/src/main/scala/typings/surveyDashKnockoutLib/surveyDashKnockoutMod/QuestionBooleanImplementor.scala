package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "QuestionBooleanImplementor")
@js.native
class QuestionBooleanImplementor protected () extends QuestionImplementor {
  def this(question: Question) = this()
  var koCheckedValue: js.Any = js.native
  var koIndeterminate: js.Any = js.native
  /* protected */ def updateCheckedValue(newValue: js.Any): scala.Unit = js.native
}


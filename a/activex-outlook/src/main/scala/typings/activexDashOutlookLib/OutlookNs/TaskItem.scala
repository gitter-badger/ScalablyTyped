package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.TaskItem")
@js.native
class TaskItem protected () extends js.Object {
  val Actions: Actions = js.native
  var ActualWork: scala.Double = js.native
  val Application: Application = js.native
  val Attachments: Attachments = js.native
  val AutoResolvedWinner: scala.Boolean = js.native
  var BillingInformation: java.lang.String = js.native
  var Body: java.lang.String = js.native
  var CardData: java.lang.String = js.native
  var Categories: java.lang.String = js.native
  val Class: OlObjectClass = js.native
  var Companies: java.lang.String = js.native
  var Complete: scala.Boolean = js.native
  val Conflicts: Conflicts = js.native
  var ContactNames: java.lang.String = js.native
  var Contacts: java.lang.String = js.native
  val ConversationID: java.lang.String = js.native
  val ConversationIndex: java.lang.String = js.native
  val ConversationTopic: java.lang.String = js.native
  val CreationTime: activexDashInteropLib.VarDate with stdLib.VarDate = js.native
  var DateCompleted: activexDashInteropLib.VarDate with stdLib.VarDate = js.native
  val DelegationState: OlTaskDelegationState = js.native
  val Delegator: java.lang.String = js.native
  val DownloadState: OlDownloadState = js.native
  var DueDate: activexDashInteropLib.VarDate with stdLib.VarDate = js.native
  val EntryID: java.lang.String = js.native
  val FormDescription: FormDescription = js.native
  val GetInspector: Inspector = js.native
  var Importance: OlImportance = js.native
  var InternetCodepage: scala.Double = js.native
  val IsConflict: scala.Boolean = js.native
  val IsRecurring: scala.Boolean = js.native
  val ItemProperties: ItemProperties = js.native
  val LastModificationTime: activexDashInteropLib.VarDate with stdLib.VarDate = js.native
  val Links: Links = js.native
  val MAPIOBJECT: js.Any = js.native
  var MarkForDownload: OlRemoteStatus = js.native
  var MessageClass: java.lang.String = js.native
  var Mileage: java.lang.String = js.native
  var NoAging: scala.Boolean = js.native
  var Ordinal: scala.Double = js.native
  var `Outlook.TaskItem_typekey`: TaskItem = js.native
  val OutlookInternalVersion: scala.Double = js.native
  val OutlookVersion: java.lang.String = js.native
  var Owner: java.lang.String = js.native
  val Ownership: OlTaskOwnership = js.native
  val Parent: js.Any = js.native
  var PercentComplete: scala.Double = js.native
  val PropertyAccessor: PropertyAccessor = js.native
  var RTFBody: js.Any = js.native
  val Recipients: Recipients = js.native
  var ReminderOverrideDefault: scala.Boolean = js.native
  var ReminderPlaySound: scala.Boolean = js.native
  var ReminderSet: scala.Boolean = js.native
  var ReminderSoundFile: java.lang.String = js.native
  var ReminderTime: activexDashInteropLib.VarDate with stdLib.VarDate = js.native
  val ResponseState: OlTaskResponse = js.native
  var Role: java.lang.String = js.native
  val Saved: scala.Boolean = js.native
  var SchedulePlusPriority: java.lang.String = js.native
  var SendUsingAccount: Account = js.native
  var Sensitivity: OlSensitivity = js.native
  val Session: NameSpace = js.native
  val Size: scala.Double = js.native
  var StartDate: activexDashInteropLib.VarDate with stdLib.VarDate = js.native
  var Status: OlTaskStatus = js.native
  var StatusOnCompletionRecipients: java.lang.String = js.native
  var StatusUpdateRecipients: java.lang.String = js.native
  var Subject: java.lang.String = js.native
  var TeamTask: scala.Boolean = js.native
  var ToDoTaskOrdinal: activexDashInteropLib.VarDate with stdLib.VarDate = js.native
  var TotalWork: scala.Double = js.native
  var UnRead: scala.Boolean = js.native
  val UserProperties: UserProperties = js.native
  def Assign(): TaskItem = js.native
  def CancelResponseState(): scala.Unit = js.native
  def ClearRecurrencePattern(): scala.Unit = js.native
  def Close(SaveMode: OlInspectorClose): scala.Unit = js.native
  def Copy(): js.Any = js.native
  def Delete(): scala.Unit = js.native
  def Display(): scala.Unit = js.native
  def Display(Modal: js.Any): scala.Unit = js.native
  def GetConversation(): Conversation = js.native
  def GetRecurrencePattern(): RecurrencePattern = js.native
  def MarkComplete(): scala.Unit = js.native
  def Move(DestFldr: Folder): js.Any = js.native
  def PrintOut(): scala.Unit = js.native
  def Respond(Response: OlTaskResponse, fNoUI: js.Any, fAdditionalTextDialog: js.Any): TaskItem = js.native
  def Save(): scala.Unit = js.native
  def SaveAs(Path: java.lang.String): scala.Unit = js.native
  def SaveAs(Path: java.lang.String, Type: js.Any): scala.Unit = js.native
  def Send(): scala.Unit = js.native
  def ShowCategoriesDialog(): scala.Unit = js.native
  def SkipRecurrence(): scala.Boolean = js.native
  def StatusReport(): js.Any = js.native
}


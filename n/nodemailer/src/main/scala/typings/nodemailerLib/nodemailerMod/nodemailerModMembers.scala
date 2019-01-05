package typings
package nodemailerLib.nodemailerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemailer", JSImport.Namespace)
@js.native
object nodemailerModMembers extends js.Object {
  def createTestAccount(): js.Promise[TestAccount] = js.native
  def createTestAccount(apiUrl: java.lang.String): js.Promise[TestAccount] = js.native
  def createTestAccount(
    apiUrl: java.lang.String,
    callback: js.Function2[
      /* err */ (nodeLib.Error with stdLib.Error) | scala.Null, 
      /* testAccount */ TestAccount, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def createTestAccount(
    callback: js.Function2[
      /* err */ (nodeLib.Error with stdLib.Error) | scala.Null, 
      /* testAccount */ TestAccount, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def createTransport(): nodemailerLib.libMailerMod.namespaced = js.native
  def createTransport(
    transport: nodemailerLib.libStreamDashTransportMod.StreamTransportNs.Options | nodemailerLib.libSmtpDashPoolMod.SMTPPoolNs.Options | nodemailerLib.libSendmailDashTransportMod.SendmailTransportNs.Options | nodemailerLib.libSmtpDashTransportMod.SMTPTransportNs.Options | nodemailerLib.libJsonDashTransportMod.JSONTransportNs.Options | nodemailerLib.libSesDashTransportMod.SESTransportNs.Options | nodemailerLib.libSmtpDashPoolMod.namespaced | nodemailerLib.libSmtpDashTransportMod.namespaced | nodemailerLib.libStreamDashTransportMod.namespaced | nodemailerLib.libSendmailDashTransportMod.namespaced | nodemailerLib.libJsonDashTransportMod.namespaced | nodemailerLib.libSesDashTransportMod.namespaced
  ): nodemailerLib.libMailerMod.namespaced = js.native
  def createTransport(
    transport: nodemailerLib.libStreamDashTransportMod.StreamTransportNs.Options | nodemailerLib.libSmtpDashPoolMod.SMTPPoolNs.Options | nodemailerLib.libSendmailDashTransportMod.SendmailTransportNs.Options | nodemailerLib.libSmtpDashTransportMod.SMTPTransportNs.Options | nodemailerLib.libJsonDashTransportMod.JSONTransportNs.Options | nodemailerLib.libSesDashTransportMod.SESTransportNs.Options | nodemailerLib.libSmtpDashPoolMod.namespaced | nodemailerLib.libSmtpDashTransportMod.namespaced | nodemailerLib.libStreamDashTransportMod.namespaced | nodemailerLib.libSendmailDashTransportMod.namespaced | nodemailerLib.libJsonDashTransportMod.namespaced | nodemailerLib.libSesDashTransportMod.namespaced,
    defaults: nodemailerLib.libStreamDashTransportMod.StreamTransportNs.Options | nodemailerLib.libSmtpDashPoolMod.SMTPPoolNs.Options | nodemailerLib.libSendmailDashTransportMod.SendmailTransportNs.Options | nodemailerLib.libSmtpDashTransportMod.SMTPTransportNs.Options | nodemailerLib.libJsonDashTransportMod.JSONTransportNs.Options | nodemailerLib.libSesDashTransportMod.SESTransportNs.Options
  ): nodemailerLib.libMailerMod.namespaced = js.native
  def createTransport(transport: java.lang.String): nodemailerLib.libMailerMod.namespaced = js.native
  def createTransport(
    transport: java.lang.String,
    defaults: nodemailerLib.libSmtpDashTransportMod.SMTPTransportNs.Options
  ): nodemailerLib.libMailerMod.namespaced = js.native
  def createTransport(transport: Transport): nodemailerLib.libMailerMod.namespaced = js.native
  def createTransport(transport: TransportOptions): nodemailerLib.libMailerMod.namespaced = js.native
  def createTransport(transport: TransportOptions, defaults: TransportOptions): nodemailerLib.libMailerMod.namespaced = js.native
  def createTransport(transport: Transport, defaults: TransportOptions): nodemailerLib.libMailerMod.namespaced = js.native
  def getTestMessageUrl(
    info: nodemailerLib.libSesDashTransportMod.SESTransportNs.SentMessageInfo | nodemailerLib.libSmtpDashTransportMod.SMTPTransportNs.SentMessageInfo
  ): java.lang.String | nodemailerLib.nodemailerLibNumbers.`false` = js.native
}


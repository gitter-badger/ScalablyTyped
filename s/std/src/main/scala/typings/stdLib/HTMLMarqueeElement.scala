package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLMarqueeElement extends HTMLElement {
  /** @deprecated */
  var behavior: java.lang.String = js.native
  /** @deprecated */
  var bgColor: java.lang.String = js.native
  /** @deprecated */
  var direction: java.lang.String = js.native
  /** @deprecated */
  var height: java.lang.String = js.native
  /** @deprecated */
  var hspace: scala.Double = js.native
  /** @deprecated */
  var loop: scala.Double = js.native
  /** @deprecated */
  var onbounce: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /** @deprecated */
  var onfinish: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /** @deprecated */
  var onstart: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /** @deprecated */
  var scrollAmount: scala.Double = js.native
  /** @deprecated */
  var scrollDelay: scala.Double = js.native
  /** @deprecated */
  var trueSpeed: scala.Boolean = js.native
  /** @deprecated */
  var vspace: scala.Double = js.native
  /** @deprecated */
  var width: java.lang.String = js.native
  @JSName("addEventListener")
  def addEventListener_bounce(
    `type`: stdLib.stdLibStrings.bounce,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_bounce(
    `type`: stdLib.stdLibStrings.bounce,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_bounce(
    `type`: stdLib.stdLibStrings.bounce,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_finish(
    `type`: stdLib.stdLibStrings.finish,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_finish(
    `type`: stdLib.stdLibStrings.finish,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_finish(
    `type`: stdLib.stdLibStrings.finish,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(
    `type`: stdLib.stdLibStrings.start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(
    `type`: stdLib.stdLibStrings.start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(
    `type`: stdLib.stdLibStrings.start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_bounce(
    `type`: stdLib.stdLibStrings.bounce,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_bounce(
    `type`: stdLib.stdLibStrings.bounce,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_bounce(
    `type`: stdLib.stdLibStrings.bounce,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_finish(
    `type`: stdLib.stdLibStrings.finish,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_finish(
    `type`: stdLib.stdLibStrings.finish,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_finish(
    `type`: stdLib.stdLibStrings.finish,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_start(
    `type`: stdLib.stdLibStrings.start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_start(
    `type`: stdLib.stdLibStrings.start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_start(
    `type`: stdLib.stdLibStrings.start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  /** @deprecated */
  def start(): scala.Unit = js.native
  /** @deprecated */
  def stop(): scala.Unit = js.native
}

@JSGlobal("HTMLMarqueeElement")
@js.native
object HTMLMarqueeElement
  extends org.scalablytyped.runtime.Instantiable0[HTMLMarqueeElement]


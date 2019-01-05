package typings
package koaDashSessionLib.koaDashSessionMod.sessionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextSession extends js.Object {
  var app: /* import warning: ImportType.apply Failed type conversion: koa-session.koa-session.koa.Context & koa.koa.Application.Context['app'] */ js.Any
  var ctx: koaDashSessionLib.koaDashSessionMod.koaMod.Context with koaLib.koaMod.ApplicationNs.Context
  var opts: opts
  var prevHash: java.lang.String
  var session: Session | koaDashSessionLib.koaDashSessionLibNumbers.`false`
  var store: stores
  /**
    * Commit the session changes or removal.
    */
  def commit(): js.Promise[scala.Unit]
  /**
    * internal logic of `ctx.session`
    */
  def get(): Session
  /**
    * init session from external store
    * will be called in the front of session middleware
    */
  def initFromExternal(): js.Promise[scala.Unit]
  /**
    * internal logic of `ctx.session=`
    */
  def set(`val`: js.Any): scala.Unit
}


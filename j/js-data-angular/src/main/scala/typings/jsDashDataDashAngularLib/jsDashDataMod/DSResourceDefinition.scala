package typings
package jsDashDataDashAngularLib.jsDashDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DSResourceDefinition[T] extends js.Object {
  def bindAll(
    params: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify DSFilterParams */ js.Any,
    scope: angularLib.angularMod.angularNs.IScope,
    expr: java.lang.String
  ): angularLib.angularMod.Global.Function with js.Function = js.native
  def bindAll(
    params: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify DSFilterParams */ js.Any,
    scope: angularLib.angularMod.angularNs.IScope,
    expr: java.lang.String,
    cb: js.Function2[
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify DSError */ /* err */ js.Any, 
      /* items */ js.Array[
        T with (/* import warning: QualifyReferences.resolveTypeRef Couldn't qualify DSInstanceShorthands<T> */ js.Any)
      ], 
      scala.Unit
    ]
  ): angularLib.angularMod.Global.Function with js.Function = js.native
  def bindOne(id: java.lang.String, scope: angularLib.angularMod.angularNs.IScope, expr: java.lang.String): angularLib.angularMod.Global.Function with js.Function = js.native
  def bindOne(
    id: java.lang.String,
    scope: angularLib.angularMod.angularNs.IScope,
    expr: java.lang.String,
    cb: js.Function2[
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify DSError */ /* err */ js.Any, 
      /* item */ T with (/* import warning: QualifyReferences.resolveTypeRef Couldn't qualify DSInstanceShorthands<T> */ js.Any), 
      scala.Unit
    ]
  ): angularLib.angularMod.Global.Function with js.Function = js.native
  def bindOne(id: scala.Double, scope: angularLib.angularMod.angularNs.IScope, expr: java.lang.String): angularLib.angularMod.Global.Function with js.Function = js.native
  def bindOne(
    id: scala.Double,
    scope: angularLib.angularMod.angularNs.IScope,
    expr: java.lang.String,
    cb: js.Function2[
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify DSError */ /* err */ js.Any, 
      /* item */ T with (/* import warning: QualifyReferences.resolveTypeRef Couldn't qualify DSInstanceShorthands<T> */ js.Any), 
      scala.Unit
    ]
  ): angularLib.angularMod.Global.Function with js.Function = js.native
}


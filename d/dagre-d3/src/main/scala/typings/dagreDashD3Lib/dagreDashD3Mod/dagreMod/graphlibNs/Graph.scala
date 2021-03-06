package typings
package dagreDashD3Lib.dagreDashD3Mod.dagreMod.graphlibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// coupled with dagre.d.ts' Graph
// a lot of these methods come from graphlib.core.js
trait Graph extends js.Object {
  var height: scala.Double
  // see source of http://cpettitt.github.io/project/dagre-d3/latest/demo/interactive-demo.html
  var transition: js.UndefOr[
    js.Function1[
      /* selection */ d3DashSelectionLib.d3DashSelectionMod.Selection[
        _, 
        /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
        d3DashSelectionLib.d3DashSelectionMod.BaseType, 
        /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
      ], 
      d3DashTransitionLib.d3DashTransitionMod.Transition[
        _, 
        /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for Datum */ _, 
        d3DashSelectionLib.d3DashSelectionMod.BaseType, 
        /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for PDatum */ _
      ]
    ]
  ] = js.undefined
  var width: scala.Double
  def graph(): Graph
  def predecessors(id: java.lang.String): js.Array[java.lang.String]
  def successors(id: java.lang.String): js.Array[java.lang.String]
}


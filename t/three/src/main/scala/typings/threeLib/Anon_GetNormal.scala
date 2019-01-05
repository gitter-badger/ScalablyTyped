package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_GetNormal
  extends org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.Triangle]
     with org.scalablytyped.runtime.Instantiable1[/* a */ threeLib.threeDashCoreMod.Vector3, threeLib.threeMod.Triangle]
     with org.scalablytyped.runtime.Instantiable2[
      /* a */ threeLib.threeDashCoreMod.Vector3, 
      /* b */ threeLib.threeDashCoreMod.Vector3, 
      threeLib.threeMod.Triangle
    ]
     with org.scalablytyped.runtime.Instantiable3[
      /* a */ threeLib.threeDashCoreMod.Vector3, 
      /* b */ threeLib.threeDashCoreMod.Vector3, 
      /* c */ threeLib.threeDashCoreMod.Vector3, 
      threeLib.threeMod.Triangle
    ] {
  def containsPoint(
    point: threeLib.threeDashCoreMod.Vector3,
    a: threeLib.threeDashCoreMod.Vector3,
    b: threeLib.threeDashCoreMod.Vector3,
    c: threeLib.threeDashCoreMod.Vector3
  ): scala.Boolean = js.native
  def getBarycoord(
    point: threeLib.threeDashCoreMod.Vector3,
    a: threeLib.threeDashCoreMod.Vector3,
    b: threeLib.threeDashCoreMod.Vector3,
    c: threeLib.threeDashCoreMod.Vector3,
    target: threeLib.threeDashCoreMod.Vector3
  ): threeLib.threeDashCoreMod.Vector3 = js.native
  def getNormal(
    a: threeLib.threeDashCoreMod.Vector3,
    b: threeLib.threeDashCoreMod.Vector3,
    c: threeLib.threeDashCoreMod.Vector3,
    target: threeLib.threeDashCoreMod.Vector3
  ): threeLib.threeDashCoreMod.Vector3 = js.native
}


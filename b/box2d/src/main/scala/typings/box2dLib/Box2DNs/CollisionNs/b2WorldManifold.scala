package typings
package box2dLib.Box2DNs.CollisionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Collision.b2WorldManifold")
@js.native
/**
		* Creates a new b2WorldManifold.
		**/
class b2WorldManifold () extends js.Object {
  /**
  		* World vector pointing from A to B.
  		**/
  var m_normal: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		* World contact point (point of intersection).
  		**/
  var m_points: js.Array[box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2] = js.native
  /**
  		* Evaluate the manifold with supplied transforms. This assumes modest motion from the original state. This does not change the point count, impulses, etc. The radii must come from the shapes that generated the manifold.
  		* @param manifold Manifold to evaluate.
  		* @param xfA A transform.
  		* @param radiusA A radius.
  		* @param xfB B transform.
  		* @param radiusB B radius.
  		**/
  def Initialize(
    manifold: b2Manifold,
    xfA: box2dLib.Box2DNs.CommonNs.MathNs.b2Transform,
    radiusA: scala.Double,
    xfB: box2dLib.Box2DNs.CommonNs.MathNs.b2Transform,
    radiusB: scala.Double
  ): scala.Unit = js.native
}


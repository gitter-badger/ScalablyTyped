package typings
package backboneDashAssociationsLib.backboneMod.AssociationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRelation extends js.Object {
  /** Determines the type of collection used. If used, the relatedModel property is ignored */
  var collectionType: js.UndefOr[
    java.lang.String | org.scalablytyped.runtime.Instantiable0[backboneLib.backboneMod.BackboneNs.Collection[js.Any]]
  ] = js.undefined
  /** If set to true, then the attribute will not be serialized in toJSON() calls. Defaults to false */
  var isTransient: js.UndefOr[scala.Boolean] = js.undefined
  /** The key for this relationship on this model */
  var key: java.lang.String
  /** A transformation function to convert the value before it is assigned to the key on the relatedModel */
  var map: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  /** The type of model for this relationship */
  var relatedModel: java.lang.String | org.scalablytyped.runtime.Instantiable0[AssociatedModel]
  /** Specify remoteKey to serialize the key to a different key name in toJSON() calls. Useful in ROR nested-attributes like scenarios. */
  var remoteKey: js.UndefOr[java.lang.String] = js.undefined
  /** the attributes to serialize when calling toJSON */
  var serialize: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  // meh, no string enums in TS. Just have to trust the user not to be a fool
  /** The cardinality of this relationship. */
  var `type`: java.lang.String
}


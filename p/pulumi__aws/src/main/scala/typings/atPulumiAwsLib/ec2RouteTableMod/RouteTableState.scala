package typings
package atPulumiAwsLib.ec2RouteTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteTableState extends js.Object {
  /**
    * The ID of the AWS account that owns the route table
    */
  val ownerId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of virtual gateways for propagation.
    */
  val propagatingVgws: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * A list of route objects. Their keys are documented below.
    */
  val routes: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_CidrBlockEgressOnlyGatewayId]
      ]
    ]
  ] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
  /**
    * The VPC ID.
    */
  val vpcId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}


package typings
package atPulumiAwsLib.wafregionalWebAclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebAclArgs extends js.Object {
  /**
    * The action that you want AWS WAF Regional to take when a request doesn't match the criteria in any of the rules that are associated with the web ACL.
    */
  val defaultAction: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_TypeInput]
  /**
    * The name or description for the Amazon CloudWatch metric of this web ACL.
    */
  val metricName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The name or description of the web ACL.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The rules to associate with the web ACL and the settings for each rule.
    */
  val rules: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_ActionOverrideActionPriority]
      ]
    ]
  ] = js.undefined
}


package typings
package atPulumiAwsLib.apigatewayDomainNameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainNameState extends js.Object {
  /**
    * The ARN for an AWS-managed certificate. AWS Certificate Manager is the only supported source. Used when an edge-optimized domain name is desired. Conflicts with `certificate_name`, `certificate_body`, `certificate_chain`, `certificate_private_key`, `regional_certificate_arn`, and `regional_certificate_name`.
    */
  val certificateArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The certificate issued for the domain name
    * being registered, in PEM format. Only valid for `EDGE` endpoint configuration type. Conflicts with `certificate_arn`, `regional_certificate_arn`, and
    * `regional_certificate_name`.
    */
  val certificateBody: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The certificate for the CA that issued the
    * certificate, along with any intermediate CA certificates required to
    * create an unbroken chain to a certificate trusted by the intended API clients. Only valid for `EDGE` endpoint configuration type. Conflicts with `certificate_arn`,
    * `regional_certificate_arn`, and `regional_certificate_name`.
    */
  val certificateChain: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The unique name to use when registering this
    * certificate as an IAM server certificate. Conflicts with `certificate_arn`, `regional_certificate_arn`, and
    * `regional_certificate_name`. Required if `certificate_arn` is not set.
    */
  val certificateName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The private key associated with the
    * domain certificate given in `certificate_body`. Only valid for `EDGE` endpoint configuration type. Conflicts with `certificate_arn`, `regional_certificate_arn`, and `regional_certificate_name`.
    */
  val certificatePrivateKey: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The upload date associated with the domain certificate.
    */
  val certificateUploadDate: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The hostname created by Cloudfront to represent
    * the distribution that implements this domain name mapping.
    */
  val cloudfrontDomainName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * For convenience, the hosted zone ID (`Z2FDTNDATAQYW2`)
    * that can be used to create a Route53 alias record for the distribution.
    */
  val cloudfrontZoneId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The fully-qualified domain name to register
    */
  val domainName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Configuration block defining API endpoint information including type. Defined below.
    */
  val endpointConfiguration: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_TypesInput]] = js.undefined
  /**
    * The ARN for an AWS-managed certificate. AWS Certificate Manager is the only supported source. Used when a regional domain name is desired. Conflicts with `certificate_arn`, `certificate_name`, `certificate_body`, `certificate_chain`, and `certificate_private_key`.
    */
  val regionalCertificateArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The user-friendly name of the certificate that will be used by regional endpoint for this domain name. Conflicts with `certificate_arn`, `certificate_name`, `certificate_body`, `certificate_chain`, and
    * `certificate_private_key`.
    */
  val regionalCertificateName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The hostname for the custom domain's regional endpoint.
    */
  val regionalDomainName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The hosted zone ID that can be used to create a Route53 alias record for the regional endpoint.
    */
  val regionalZoneId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}


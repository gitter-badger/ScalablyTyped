package typings
package atPulumiAwsLib.rdsGetClusterSnapshotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClusterSnapshotResult extends js.Object {
  /**
    * Specifies the allocated storage size in gigabytes (GB).
    */
  val allocatedStorage: scala.Double
  /**
    * List of EC2 Availability Zones that instances in the DB cluster snapshot can be restored in.
    */
  val availabilityZones: js.Array[java.lang.String]
  /**
    * The Amazon Resource Name (ARN) for the DB Cluster Snapshot.
    */
  val dbClusterSnapshotArn: java.lang.String
  /**
    * Specifies the name of the database engine.
    */
  val engine: java.lang.String
  /**
    * Version of the database engine for this DB cluster snapshot.
    */
  val engineVersion: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * If storage_encrypted is true, the AWS KMS key identifier for the encrypted DB cluster snapshot.
    */
  val kmsKeyId: java.lang.String
  /**
    * License model information for the restored DB cluster.
    */
  val licenseModel: java.lang.String
  /**
    * Port that the DB cluster was listening on at the time of the snapshot.
    */
  val port: scala.Double
  /**
    * Time when the snapshot was taken, in Universal Coordinated Time (UTC).
    */
  val snapshotCreateTime: java.lang.String
  val sourceDbClusterSnapshotArn: java.lang.String
  /**
    * The status of this DB Cluster Snapshot.
    */
  val status: java.lang.String
  /**
    * Specifies whether the DB cluster snapshot is encrypted.
    */
  val storageEncrypted: scala.Boolean
  /**
    * The VPC ID associated with the DB cluster snapshot.
    */
  val vpcId: java.lang.String
}


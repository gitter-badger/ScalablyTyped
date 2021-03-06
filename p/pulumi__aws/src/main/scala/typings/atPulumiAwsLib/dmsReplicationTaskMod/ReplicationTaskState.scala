package typings
package atPulumiAwsLib.dmsReplicationTaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicationTaskState extends js.Object {
  /**
    * The Unix timestamp integer for the start of the Change Data Capture (CDC) operation.
    */
  val cdcStartTime: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The migration type. Can be one of `full-load | cdc | full-load-and-cdc`.
    */
  val migrationType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the replication instance.
    */
  val replicationInstanceArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The Amazon Resource Name (ARN) for the replication task.
    */
  val replicationTaskArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The replication task identifier.
    */
  val replicationTaskId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * An escaped JSON string that contains the task settings. For a complete list of task settings, see [Task Settings for AWS Database Migration Service Tasks](http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.html).
    */
  val replicationTaskSettings: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The Amazon Resource Name (ARN) string that uniquely identifies the source endpoint.
    */
  val sourceEndpointArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * An escaped JSON string that contains the table mappings. For information on table mapping see [Using Table Mapping with an AWS Database Migration Service Task to Select and Filter Data](http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.html)
    */
  val tableMappings: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
  /**
    * The Amazon Resource Name (ARN) string that uniquely identifies the target endpoint.
    */
  val targetEndpointArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}


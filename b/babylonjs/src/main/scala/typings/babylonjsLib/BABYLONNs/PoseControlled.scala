package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing a pose controlled object in Babylon.
  * A pose controlled object has both regular pose values as well as pose values
  * from an external device such as a VR head mounted display
  */
trait PoseControlled extends js.Object {
  /**
    * The position of the device in babylon space.
    */
  var devicePosition: js.UndefOr[Vector3] = js.undefined
  /**
    * The rotation quaternion of the device in babylon space.
    */
  var deviceRotationQuaternion: Quaternion
  /**
    * The scale of the device to be used when translating from device space to babylon space.
    */
  var deviceScaleFactor: scala.Double
  /**
    * The position of the object in babylon space.
    */
  var position: Vector3
  /**
    * The raw pose coming from the device.
    */
  var rawPose: Nullable[DevicePose]
  /**
    * The rotation quaternion of the object in babylon space.
    */
  var rotationQuaternion: Quaternion
  /**
    * Updates the poseControlled values based on the input device pose.
    * @param poseData the pose data to update the object with
    */
  def updateFromDevice(poseData: DevicePose): scala.Unit
}


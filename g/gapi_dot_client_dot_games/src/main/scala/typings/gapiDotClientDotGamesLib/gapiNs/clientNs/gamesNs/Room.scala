package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Room extends js.Object {
  /** The ID of the application being played. */
  var applicationId: js.UndefOr[java.lang.String] = js.undefined
  /** Criteria for auto-matching players into this room. */
  var autoMatchingCriteria: js.UndefOr[RoomAutoMatchingCriteria] = js.undefined
  /** Auto-matching status for this room. Not set if the room is not currently in the auto-matching queue. */
  var autoMatchingStatus: js.UndefOr[RoomAutoMatchStatus] = js.undefined
  /** Details about the room creation. */
  var creationDetails: js.UndefOr[RoomModification] = js.undefined
  /**
    * This short description is generated by our servers and worded relative to the player requesting the room. It is intended to be displayed when the room
    * is shown in a list (that is, an invitation to a room.)
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the participant that invited the user to the room. Not set if the user was not invited to the room. */
  var inviterId: js.UndefOr[java.lang.String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#room. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Details about the last update to the room. */
  var lastUpdateDetails: js.UndefOr[RoomModification] = js.undefined
  /** The participants involved in the room, along with their statuses. Includes participants who have left or declined invitations. */
  var participants: js.UndefOr[js.Array[RoomParticipant]] = js.undefined
  /** Globally unique ID for a room. */
  var roomId: js.UndefOr[java.lang.String] = js.undefined
  /** The version of the room status: an increasing counter, used by the client to ignore out-of-order updates to room status. */
  var roomStatusVersion: js.UndefOr[scala.Double] = js.undefined
  /**
    * The status of the room.
    * Possible values are:
    * - "ROOM_INVITING" - One or more players have been invited and not responded.
    * - "ROOM_AUTO_MATCHING" - One or more slots need to be filled by auto-matching.
    * - "ROOM_CONNECTING" - Players have joined and are connecting to each other (either before or after auto-matching).
    * - "ROOM_ACTIVE" - All players have joined and connected to each other.
    * - "ROOM_DELETED" - The room should no longer be shown on the client. Returned in sync calls when a player joins a room (as a tombstone), or for rooms
    * where all joined participants have left.
    */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /** The variant / mode of the application being played; can be any integer value, or left blank. */
  var variant: js.UndefOr[scala.Double] = js.undefined
}


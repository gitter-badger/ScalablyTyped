package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.CurrentGameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentGameInfo extends js.Object {
  var bannedChampion: js.Array[BannedChampion]
  var gameId: scala.Double
  var gameLength: scala.Double
  var gameMode: scala.Double
  var gameQueueConfigId: scala.Double
  var gameStartTime: scala.Double
  var gameType: java.lang.String
  var mapId: scala.Double
  var observers: Observer
  var participants: js.Array[CurrentGameParticipant]
  var platformId: java.lang.String
}


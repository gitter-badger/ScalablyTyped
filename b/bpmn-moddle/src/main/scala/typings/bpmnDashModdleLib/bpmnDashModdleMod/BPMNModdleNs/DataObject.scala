package typings
package bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- bpmnDashModdleLib.bpmnDashModdleMod.BPMNModdleNs.ItemAwareElement because var conflicts: $attrs, $type, documentation, extensionDefinitions, extensionElements, id. Inlined itemSubjectRef, dataState */ trait DataObject extends FlowElement {
  var dataState: DataState
  /** @default false */
  var isCollection: scala.Boolean
  var itemSubjectRef: ItemDefinition
}


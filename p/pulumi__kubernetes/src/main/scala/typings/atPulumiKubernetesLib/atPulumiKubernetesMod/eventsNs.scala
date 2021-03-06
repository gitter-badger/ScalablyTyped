package typings
package atPulumiKubernetesLib.atPulumiKubernetesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes", "events")
@js.native
object eventsNs extends js.Object {
  @JSName("v1beta1")
  @js.native
  object v1beta1Ns extends js.Object {
    /**
      * Event is a report of an event somewhere in the cluster. It generally denotes some state
      * change in the system.
      */
    @js.native
    class Event protected ()
      extends atPulumiKubernetesLib.providerMod.eventsNs.v1beta1Ns.Event {
      /**
        * Create a events.v1beta1.Event resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.eventsNs.v1beta1Ns.Event) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.eventsNs.v1beta1Ns.Event, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * EventList is a list of Event objects.
      */
    @js.native
    class EventList protected ()
      extends atPulumiKubernetesLib.providerMod.eventsNs.v1beta1Ns.EventList {
      /**
        * Create a events.v1beta1.EventList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.eventsNs.v1beta1Ns.EventList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.eventsNs.v1beta1Ns.EventList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * Event is a report of an event somewhere in the cluster. It generally denotes some state
      * change in the system.
      */
    @js.native
    object Event extends js.Object {
      /**
        * Get the state of an existing `Event` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.eventsNs.v1beta1Ns.Event = js.native
    }
    
    /**
      * EventList is a list of Event objects.
      */
    @js.native
    object EventList extends js.Object {
      /**
        * Get the state of an existing `EventList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.eventsNs.v1beta1Ns.EventList = js.native
    }
    
  }
  
}


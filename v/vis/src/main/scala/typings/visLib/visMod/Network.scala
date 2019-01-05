package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vis", "Network")
@js.native
class Network protected () extends js.Object {
  /**
    * Creates an instance of Network.
    *
    * @param container the HTML element representing the network container
    * @param data network data
    * @param [options] optional network options
    */
  def this(container: stdLib.HTMLElement, data: Data) = this()
  def this(container: stdLib.HTMLElement, data: Data, options: Options) = this()
  /**
    * This function converts DOM coordinates to coordinates on the canvas.
    * Input and output are in the form of {x:Number,y:Number} (IPosition interface).
    * The DOM values are relative to the network container.
    *
    * @param position the DOM coordinates
    * @returns the canvas coordinates
    */
  def DOMtoCanvas(position: Position): Position = js.native
  /**
    * Go into addEdge mode.
    * The explaination from addNodeMode applies here as well.
    */
  def addEdgeMode(): scala.Unit = js.native
  /**
    * 	Go into addNode mode. Having edit mode or manipulation enabled is not required.
    * To get out of this mode, call disableEditMode().
    * The callback functions defined in handlerFunctions still apply.
    * To use these methods without having the manipulation GUI, make sure you set enabled to false.
    */
  def addNodeMode(): scala.Unit = js.native
  /**
    * This function converts canvas coordinates to coordinates on the DOM.
    * Input and output are in the form of {x:Number, y:Number} (IPosition interface).
    * The DOM values are relative to the network container.
    *
    * @param position the canvas coordinates
    * @returns the DOM coordinates
    */
  def canvasToDOM(position: Position): Position = js.native
  /**
    * The joinCondition function is presented with all nodes.
    */
  def cluster(): scala.Unit = js.native
  def cluster(options: ClusterOptions): scala.Unit = js.native
  /**
    * 	This method looks at the provided node and makes a cluster of it and all it's connected nodes.
    * The behaviour can be customized by proving the options object.
    * All options of this object are explained below.
    * The joinCondition is only presented with the connected nodes.
    *
    * @param nodeId the id of the node
    * @param [options] the cluster options
    */
  def clusterByConnection(nodeId: java.lang.String): scala.Unit = js.native
  def clusterByConnection(nodeId: java.lang.String, options: ClusterOptions): scala.Unit = js.native
  /**
    * This method checks all nodes in the network and those with a equal or higher
    * amount of edges than specified with the hubsize qualify.
    * If a hubsize is not defined, the hubsize will be determined as the average
    * value plus two standard deviations.
    * For all qualifying nodes, clusterByConnection is performed on each of them.
    * The options object is described for clusterByConnection and does the same here.
    *
    * @param [hubsize] optional hubsize
    * @param [options] optional cluster options
    */
  def clusterByHubsize(): scala.Unit = js.native
  def clusterByHubsize(hubsize: scala.Double): scala.Unit = js.native
  def clusterByHubsize(hubsize: scala.Double, options: ClusterOptions): scala.Unit = js.native
  /**
    * This method will cluster all nodes with 1 edge with their respective connected node.
    *
    * @param [options] optional cluster options
    */
  def clusterOutliers(): scala.Unit = js.native
  def clusterOutliers(options: ClusterOptions): scala.Unit = js.native
  /**
    * Delete selected.
    * Having edit mode or manipulation enabled is not required.
    */
  def deleteSelected(): scala.Unit = js.native
  /**
    * 	Remove the network from the DOM and remove all Hammer bindings and references.
    */
  def destroy(): scala.Unit = js.native
  /**
    * Programatically disable the edit mode.
    * Similar effect to pressing the close icon (small cross in the corner of the toolbar).
    */
  def disableEditMode(): scala.Unit = js.native
  /**
    * Go into editEdge mode.
    * The explaination from addNodeMode applies here as well.
    */
  def editEdgeMode(): scala.Unit = js.native
  /**
    * Edit the selected node.
    * The explaination from addNodeMode applies here as well.
    */
  def editNode(): scala.Unit = js.native
  /**
    * 	Programatically enable the edit mode.
    * Similar effect to pressing the edit button.
    */
  def enableEditMode(): scala.Unit = js.native
  /**
    * Nodes can be in clusters.
    * Clusters can also be in clusters.
    * This function returns an array of nodeIds showing where the node is.
    *
    * Example:
    * cluster 'A' contains cluster 'B', cluster 'B' contains cluster 'C',
    * cluster 'C' contains node 'fred'.
    *
    * network.clustering.findNode('fred') will return ['A','B','C','fred'].
    *
    * @param nodeId the node id.
    * @returns an array of nodeIds showing where the node is
    */
  def findNode(nodeId: IdType): js.Array[IdType] = js.native
  /**
    * Zooms out so all nodes fit on the canvas.
    *
    * @param [options] All options are optional for the fit method
    */
  def fit(): scala.Unit = js.native
  def fit(options: FitOptions): scala.Unit = js.native
  /**
    * You can focus on a node with this function.
    * What that means is the view will lock onto that node, if it is moving, the view will also move accordingly.
    * If the view is dragged by the user, the focus is broken. You can supply options to customize the effect.
    *
    */
  def focus(nodeId: IdType): scala.Unit = js.native
  def focus(nodeId: IdType, options: FocusOptions): scala.Unit = js.native
  /**
    * When a clusteredEdgeId is available, this method will return the original
    * baseEdgeId provided in data.edges ie.
    * After clustering the 'SelectEdge' event is fired but provides only the clustered edge.
    * This method can then be used to return the baseEdgeId.
    */
  def getBaseEdge(clusteredEdgeId: IdType): IdType = js.native
  /**
    * Returns a bounding box for the node including label.
    *
    */
  def getBoundingBox(nodeId: IdType): BoundingBox = js.native
  /**
    * Similar to findNode in that it returns all the edge ids that were
    * created from the provided edge during clustering.
    *
    * @param baseEdgeId the base edge id
    * @returns an array of edgeIds
    */
  def getClusteredEdges(baseEdgeId: IdType): js.Array[IdType] = js.native
  /**
    * Returns an array of edgeIds of the edges connected to this node.
    *
    * @param nodeId the node id
    */
  def getConnectedEdges(nodeId: IdType): js.Array[IdType] = js.native
  /**
    * Returns an array of nodeIds of the all the nodes that are directly connected to this node.
    * If you supply an edgeId, vis will first match the id to nodes.
    * If no match is found, it will search in the edgelist and return an array: [fromId, toId].
    *
    * @param nodeOrEdgeId a node or edge id
    */
  def getConnectedNodes(nodeOrEdgeId: IdType): js.Array[IdType] | js.Array[visLib.Anon_FromId] = js.native
  /**
    * Returns a edgeId or undefined.
    * The DOM positions are expected to be in pixels from the top left corner of the canvas.
    *
    */
  def getEdgeAt(position: Position): IdType = js.native
  /**
    * Returns a nodeId or undefined.
    * The DOM positions are expected to be in pixels from the top left corner of the canvas.
    *
    */
  def getNodeAt(position: Position): IdType = js.native
  /**
    * Returns an array of all nodeIds of the nodes that
    * would be released if you open the cluster.
    *
    * @param clusterNodeId the id of the cluster node
    */
  def getNodesInCluster(clusterNodeId: IdType): js.Array[IdType] = js.native
  /**
    * If you use the configurator, you can call this method to get an options object that contains
    * all differences from the default options caused by users interacting with the configurator.
    *
    */
  def getOptionsFromConfigurator(): js.Any = js.native
  /**
    * Returns the x y positions in canvas space of the nodes with the supplied nodeIds as an object.
    *
    * Alternative inputs are a String containing a nodeId or nothing.
    * When a String is supplied, the position of the node corresponding to the ID is returned.
    * When nothing is supplied, the positions of all nodes are returned.
    */
  def getPositions(): org.scalablytyped.runtime.StringDictionary[Position] = js.native
  def getPositions(nodeIds: js.Array[IdType]): org.scalablytyped.runtime.StringDictionary[Position] = js.native
  def getPositions(nodeId: IdType): Position = js.native
  /**
    * Returns the current scale of the network.
    * 1.0 is comparible to 100%, 0 is zoomed out infinitely.
    *
    * @returns the current scale of the network
    */
  def getScale(): scala.Double = js.native
  /**
    * If you like the layout of your network
    * and would like it to start in the same way next time,
    * ask for the seed using this method and put it in the layout.randomSeed option.
    *
    * @returns the current seed of the network.
    */
  def getSeed(): scala.Double = js.native
  /**
    * Returns an array of selected edge ids like so:
    * [edgeId1, edgeId2, ..].
    *
    */
  def getSelectedEdges(): js.Array[IdType] = js.native
  /**
    * Returns an array of selected node ids like so:
    * [nodeId1, nodeId2, ..].
    *
    */
  def getSelectedNodes(): js.Array[IdType] = js.native
  /**
    * Returns an object with selected nodes and edges ids.
    *
    */
  def getSelection(): visLib.Anon_Nodes = js.native
  /**
    * Returns the current central focus point of the view in the form: { x: {Number}, y: {Number} }
    *
    * @returns the view position;
    */
  def getViewPosition(): Position = js.native
  /**
    * Returns true if the node whose ID has been supplied is a cluster.
    *
    * @param nodeId the node id.
    */
  def isCluster(nodeId: IdType): scala.Boolean = js.native
  /**
    * You can use this to programatically move a node.
    * The supplied x and y positions have to be in canvas space!
    *
    * @param nodeId the node that will be moved
    * @param x new canvas space x position
    * @param y new canvas space y position
    */
  def moveNode(nodeId: IdType, x: scala.Double, y: scala.Double): scala.Unit = js.native
  /**
    * You can animate or move the camera using the moveTo method.
    *
    */
  def moveTo(options: MoveToOptions): scala.Unit = js.native
  /**
    * Remove an event listener.
    * The function you supply has to be the exact same as the one you used in the on function.
    * If no function is supplied, all listeners will be removed.
    *
    * @param eventName the name of the event, f.e. 'click'
    * @param [callback] the exact same callback function that was used when calling 'on'
    */
  def off(eventName: NetworkEvents): scala.Unit = js.native
  def off(eventName: NetworkEvents, callback: js.Function1[/* params */ js.UndefOr[js.Any], scala.Unit]): scala.Unit = js.native
  /**
    * Set an event listener.
    * Depending on the type of event you get different parameters for the callback function.
    *
    * @param eventName the name of the event, f.e. 'click'
    * @param callback the callback function that will be raised
    */
  def on(eventName: NetworkEvents, callback: js.Function1[/* params */ js.UndefOr[js.Any], scala.Unit]): scala.Unit = js.native
  /**
    * Set an event listener only once.
    * After it has taken place, the event listener will be removed.
    * Depending on the type of event you get different parameters for the callback function.
    *
    * @param eventName the name of the event, f.e. 'click'
    * @param callback the callback function that will be raised once
    */
  def once(eventName: NetworkEvents, callback: js.Function1[/* params */ js.UndefOr[js.Any], scala.Unit]): scala.Unit = js.native
  /**
    * Opens the cluster, releases the contained nodes and edges,
    * removing the cluster node and cluster edges.
    * The options object is optional and currently supports one option,
    * releaseFunction, which is a function that can be used to manually
    * position the nodes after the cluster is opened.
    *
    * @param nodeId the node id
    * @param [options] optional open cluster options
    */
  def openCluster(nodeId: IdType): scala.Unit = js.native
  def openCluster(nodeId: IdType, options: OpenClusterOptions): scala.Unit = js.native
  /**
    * Redraw the network.
    */
  def redraw(): scala.Unit = js.native
  /**
    * Programatically release the focussed node.
    */
  def releaseNode(): scala.Unit = js.native
  /**
    * Selects the edges corresponding to the id's in the input array.
    * This method unselects all other objects before selecting its own objects.
    * Does not fire events.
    *
    */
  def selectEdges(edgeIds: js.Array[IdType]): scala.Unit = js.native
  /**
    * Selects the nodes corresponding to the id's in the input array.
    * If highlightEdges is true or undefined, the neighbouring edges will also be selected.
    * This method unselects all other objects before selecting its own objects. Does not fire events.
    *
    */
  def selectNodes(nodeIds: js.Array[IdType]): scala.Unit = js.native
  def selectNodes(nodeIds: js.Array[IdType], highlightEdges: scala.Boolean): scala.Unit = js.native
  /**
    * Override all the data in the network.
    * If stabilization is enabled in the physics module,
    * the network will stabilize again.
    * This method is also performed when first initializing the network.
    *
    * @param data network data
    */
  def setData(data: Data): scala.Unit = js.native
  /**
    * Set the options.
    * All available options can be found in the modules above.
    * Each module requires it's own container with the module name to contain its options.
    *
    * @param options network options
    */
  def setOptions(options: Options): scala.Unit = js.native
  /**
    * Sets the selection.
    * You can also pass only nodes or edges in selection object.
    *
    */
  def setSelection(selection: visLib.Anon_Nodes): scala.Unit = js.native
  def setSelection(selection: visLib.Anon_Nodes, options: SelectionOptions): scala.Unit = js.native
  /**
    * Set the size of the canvas.
    * This is automatically done on a window resize.
    *
    * @param width width in a common format, f.e. '100px'
    * @param height height in a common format, f.e. '100px'
    */
  def setSize(width: java.lang.String, height: java.lang.String): scala.Unit = js.native
  /**
    * You can manually call stabilize at any time.
    * All the stabilization options above are used.
    * You can optionally supply the number of iterations it should do.
    *
    * @param [iterations] the number of iterations it should do
    */
  def stabilize(): scala.Unit = js.native
  def stabilize(iterations: scala.Double): scala.Unit = js.native
  /**
    * Start the physics simulation.
    * This is normally done whenever needed and is only really useful
    * if you stop the simulation yourself and wish to continue it afterwards.
    */
  def startSimulation(): scala.Unit = js.native
  /**
    * This stops the physics simulation and triggers a stabilized event.
    * Tt can be restarted by dragging a node,
    * altering the dataset or calling startSimulation().
    */
  def stopSimulation(): scala.Unit = js.native
  /**
    * 	When using the vis.DataSet to load your nodes into the network,
    * this method will put the X and Y positions of all nodes into that dataset.
    * If you're loading your nodes from a database and have this dynamically coupled with the DataSet,
    * you can use this to stablize your network once, then save the positions in that database
    * through the DataSet so the next time you load the nodes, stabilization will be near instantaneous.
    *
    * If the nodes are still moving and you're using dynamic smooth edges (which is on by default),
    * you can use the option stabilization.onlyDynamicEdges in the physics module to improve initialization time.
    *
    * This method does not support clustering.
    * At the moment it is not possible to cache positions when using clusters since
    * they cannot be correctly initialized from just the positions.
    */
  def storePositions(): scala.Unit = js.native
  /**
    * Unselect all objects.
    * Does not fire events.
    */
  def unselectAll(): scala.Unit = js.native
  /**
    * Clustered Nodes when created are not contained in the original data.nodes
    * passed on network creation. This method updates the cluster node.
    */
  def updateClusteredNode(clusteredNodeId: IdType): scala.Unit = js.native
  def updateClusteredNode(clusteredNodeId: IdType, options: NodeOptions): scala.Unit = js.native
  /**
    * Visible edges between clustered nodes are not the same edge as the ones provided
    * in data.edges passed on network creation. With each layer of clustering, copies of
    * the edges between clusters are created and the previous edges are hidden,
    * until the cluster is opened. This method takes an edgeId (ie. a base edgeId from data.edges)
    * and applys the options to it and any edges that were created from it while clustering.
    */
  def updateEdge(startEdgeId: IdType): scala.Unit = js.native
  def updateEdge(startEdgeId: IdType, options: EdgeOptions): scala.Unit = js.native
}


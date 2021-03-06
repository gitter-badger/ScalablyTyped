package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Shape")
@js.native
class Shape protected () extends js.Object {
  val ActionSettings: ActionSettings = js.native
  val Adjustments: Adjustments = js.native
  var AlternativeText: java.lang.String = js.native
  val AnimationSettings: AnimationSettings = js.native
  val Application: js.Any = js.native
  var AutoShapeType: activexDashOfficeLib.OfficeNs.MsoAutoShapeType = js.native
  var BackgroundStyle: activexDashOfficeLib.OfficeNs.MsoBackgroundStyleIndex = js.native
  var BlackWhiteMode: activexDashOfficeLib.OfficeNs.MsoBlackWhiteMode = js.native
  val Callout: CalloutFormat = js.native
  val CanvasItems: CanvasShapes = js.native
  val Chart: Chart = js.native
  val Child: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val ConnectionSiteCount: scala.Double = js.native
  val Connector: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val ConnectorFormat: ConnectorFormat = js.native
  val Creator: scala.Double = js.native
  val CustomerData: CustomerData = js.native
  val Diagram: Diagram = js.native
  val DiagramNode: DiagramNode = js.native
  val Fill: FillFormat = js.native
  val Glow: activexDashOfficeLib.OfficeNs.GlowFormat = js.native
  val GroupItems: GroupShapes = js.native
  val HasChart: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val HasDiagram: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val HasDiagramNode: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val HasSmartArt: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val HasTable: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val HasTextFrame: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  var Height: scala.Double = js.native
  val HorizontalFlip: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val Id: scala.Double = js.native
  var Left: scala.Double = js.native
  val Line: LineFormat = js.native
  val LinkFormat: LinkFormat = js.native
  var LockAspectRatio: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val MediaFormat: MediaFormat = js.native
  val MediaType: PpMediaType = js.native
  var Name: java.lang.String = js.native
  val Nodes: ShapeNodes = js.native
  val OLEFormat: OLEFormat = js.native
  val Parent: js.Any = js.native
  val ParentGroup: Shape = js.native
  val PictureFormat: PictureFormat = js.native
  val PlaceholderFormat: PlaceholderFormat = js.native
  var `PowerPoint.Shape_typekey`: Shape = js.native
  val RTF: java.lang.String = js.native
  val Reflection: activexDashOfficeLib.OfficeNs.ReflectionFormat = js.native
  var Rotation: scala.Double = js.native
  val Script: activexDashOfficeLib.OfficeNs.Script = js.native
  val Shadow: ShadowFormat = js.native
  var ShapeStyle: activexDashOfficeLib.OfficeNs.MsoShapeStyleIndex = js.native
  val SmartArt: activexDashOfficeLib.OfficeNs.SmartArt = js.native
  val SoftEdge: activexDashOfficeLib.OfficeNs.SoftEdgeFormat = js.native
  val SoundFormat: SoundFormat = js.native
  val Table: Table = js.native
  val Tags: Tags = js.native
  val TextEffect: TextEffectFormat = js.native
  val TextFrame: TextFrame = js.native
  val TextFrame2: TextFrame2 = js.native
  val ThreeD: ThreeDFormat = js.native
  var Title: java.lang.String = js.native
  var Top: scala.Double = js.native
  val Type: activexDashOfficeLib.OfficeNs.MsoShapeType = js.native
  val VerticalFlip: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val Vertices: js.Any = js.native
  var Visible: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  var Width: scala.Double = js.native
  val ZOrderPosition: scala.Double = js.native
  def Apply(): scala.Unit = js.native
  def ApplyAnimation(): scala.Unit = js.native
  def CanvasCropBottom(Increment: scala.Double): scala.Unit = js.native
  def CanvasCropLeft(Increment: scala.Double): scala.Unit = js.native
  def CanvasCropRight(Increment: scala.Double): scala.Unit = js.native
  def CanvasCropTop(Increment: scala.Double): scala.Unit = js.native
  def ConvertTextToSmartArt(Layout: activexDashOfficeLib.OfficeNs.SmartArtLayout): scala.Unit = js.native
  def Copy(): scala.Unit = js.native
  def Cut(): scala.Unit = js.native
  def Delete(): scala.Unit = js.native
  def Duplicate(): ShapeRange = js.native
  /**
    * @param number [ScaleWidth=0]
    * @param number [ScaleHeight=0]
    * @param PowerPoint.PpExportMode [ExportMode=1]
    */
  def Export(PathName: java.lang.String, Filter: PpShapeFormat): scala.Unit = js.native
  def Export(PathName: java.lang.String, Filter: PpShapeFormat, ScaleWidth: scala.Double): scala.Unit = js.native
  def Export(
    PathName: java.lang.String,
    Filter: PpShapeFormat,
    ScaleWidth: scala.Double,
    ScaleHeight: scala.Double
  ): scala.Unit = js.native
  def Export(
    PathName: java.lang.String,
    Filter: PpShapeFormat,
    ScaleWidth: scala.Double,
    ScaleHeight: scala.Double,
    ExportMode: PpExportMode
  ): scala.Unit = js.native
  def Flip(FlipCmd: activexDashOfficeLib.OfficeNs.MsoFlipCmd): scala.Unit = js.native
  def IncrementLeft(Increment: scala.Double): scala.Unit = js.native
  def IncrementRotation(Increment: scala.Double): scala.Unit = js.native
  def IncrementTop(Increment: scala.Double): scala.Unit = js.native
  def PickUp(): scala.Unit = js.native
  def PickupAnimation(): scala.Unit = js.native
  def RerouteConnections(): scala.Unit = js.native
  /** @param Office.MsoScaleFrom [fScale=0] */
  def ScaleHeight(Factor: scala.Double, RelativeToOriginalSize: activexDashOfficeLib.OfficeNs.MsoTriState): scala.Unit = js.native
  def ScaleHeight(
    Factor: scala.Double,
    RelativeToOriginalSize: activexDashOfficeLib.OfficeNs.MsoTriState,
    fScale: activexDashOfficeLib.OfficeNs.MsoScaleFrom
  ): scala.Unit = js.native
  /** @param Office.MsoScaleFrom [fScale=0] */
  def ScaleWidth(Factor: scala.Double, RelativeToOriginalSize: activexDashOfficeLib.OfficeNs.MsoTriState): scala.Unit = js.native
  def ScaleWidth(
    Factor: scala.Double,
    RelativeToOriginalSize: activexDashOfficeLib.OfficeNs.MsoTriState,
    fScale: activexDashOfficeLib.OfficeNs.MsoScaleFrom
  ): scala.Unit = js.native
  /** @param Office.MsoTriState [Replace=-1] */
  def Select(): scala.Unit = js.native
  def Select(Replace: activexDashOfficeLib.OfficeNs.MsoTriState): scala.Unit = js.native
  def SetShapesDefaultProperties(): scala.Unit = js.native
  def Ungroup(): ShapeRange = js.native
  def UpgradeMedia(): scala.Unit = js.native
  def ZOrder(ZOrderCmd: activexDashOfficeLib.OfficeNs.MsoZOrderCmd): scala.Unit = js.native
}


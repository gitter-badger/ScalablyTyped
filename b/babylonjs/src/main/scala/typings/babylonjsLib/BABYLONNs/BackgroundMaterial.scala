package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Background material used to create an efficient environement around your scene.
  */
@JSGlobal("BABYLON.BackgroundMaterial")
@js.native
class BackgroundMaterial protected () extends PushMaterial {
  /**
    * Instantiates a Background Material in the given scene
    * @param name The friendly name of the material
    * @param scene The scene to add the material to
    */
  def this(name: java.lang.String, scene: Scene) = this()
  var __perceptualColor: Nullable[Color3] = js.native
  /**
    * Compute the primary color according to the chosen perceptual color.
    */
  var _computePrimaryColorFromPerceptualColor: js.Any = js.native
  /**
    * Compute the highlights and shadow colors according to their chosen levels.
    */
  var _computePrimaryColors: js.Any = js.native
  var _diffuseTexture: Nullable[BaseTexture] = js.native
  var _enableNoise: scala.Boolean = js.native
  var _fovMultiplier: js.Any = js.native
  /**
    * Default configuration related to image processing available in the Background Material.
    */
  var _imageProcessingConfiguration: ImageProcessingConfiguration = js.native
  /**
    * Keep track of the image processing observer to allow dispose and replace.
    */
  var _imageProcessingObserver: js.Any = js.native
  var _maxSimultaneousLights: js.Any = js.native
  var _opacityFresnel: scala.Boolean = js.native
  /**
    * Experimental Internal Use Only.
    *
    * Key light Color in "perceptual value" meaning the color you would like to see on screen.
    * This acts as a helper to set the primary color to a more "human friendly" value.
    * Conversion to linear space as well as exposure and tone mapping correction will be applied to keep the
    * output color as close as possible from the chosen value.
    * (This does not account for contrast color grading and color curves as they are considered post effect and not directly
    * part of lighting setup.)
    */
  var _perceptualColor: Nullable[Color3] = js.native
  var _primaryColor: Color3 = js.native
  var _primaryColorHighlightLevel: float = js.native
  var _primaryColorShadowLevel: float = js.native
  var _primaryHighlightColor: js.Any = js.native
  var _primaryShadowColor: js.Any = js.native
  var _reflectionAmount: scala.Double = js.native
  var _reflectionBlur: float = js.native
  var _reflectionControls: js.Any = js.native
  var _reflectionFalloffDistance: scala.Double = js.native
  var _reflectionFresnel: scala.Boolean = js.native
  var _reflectionReflectance0: scala.Double = js.native
  var _reflectionReflectance90: scala.Double = js.native
  var _reflectionTexture: Nullable[BaseTexture] = js.native
  var _renderTargets: js.Any = js.native
  var _sceneCenter: Vector3 = js.native
  var _shadowLevel: float = js.native
  var _shadowLights: Nullable[js.Array[IShadowLight]] = js.native
  var _useRGBColor: scala.Boolean = js.native
  var _white: js.Any = js.native
  /**
    * The color grading curves provide additional color adjustmnent that is applied after any color grading transform (3D LUT).
    * They allow basic adjustment of saturation and small exposure adjustments, along with color filter tinting to provide white balance adjustment or more stylistic effects.
    * These are similar to controls found in many professional imaging or colorist software. The global controls are applied to the entire image. For advanced tuning, extra controls are provided to adjust the shadow, midtone and highlight areas of the image;
    * corresponding to low luminance, medium luminance, and high luminance areas respectively.
    */
  /**
    * The color grading curves provide additional color adjustmnent that is applied after any color grading transform (3D LUT).
    * They allow basic adjustment of saturation and small exposure adjustments, along with color filter tinting to provide white balance adjustment or more stylistic effects.
    * These are similar to controls found in many professional imaging or colorist software. The global controls are applied to the entire image. For advanced tuning, extra controls are provided to adjust the shadow, midtone and highlight areas of the image;
    * corresponding to low luminance, medium luminance, and high luminance areas respectively.
    */
  var cameraColorCurves: Nullable[ColorCurves] = js.native
  /**
    * Gets wether the color curves effect is enabled.
    */
  /**
    * Sets wether the color curves effect is enabled.
    */
  var cameraColorCurvesEnabled: scala.Boolean = js.native
  /**
    * Gets wether the color grading effect is enabled.
    */
  /**
    * Gets wether the color grading effect is enabled.
    */
  var cameraColorGradingEnabled: scala.Boolean = js.native
  /**
    * Gets the Color Grading 2D Lookup Texture.
    */
  /**
    * Sets the Color Grading 2D Lookup Texture.
    */
  var cameraColorGradingTexture: Nullable[BaseTexture] = js.native
  /**
    * Gets The camera contrast used on this material.
    */
  /**
    * Sets The camera contrast used on this material.
    */
  var cameraContrast: float = js.native
  /**
    * The camera exposure used on this material.
    * This property is here and not in the camera to allow controlling exposure without full screen post process.
    * This corresponds to a photographic exposure.
    */
  /**
    * The camera exposure used on this material.
    * This property is here and not in the camera to allow controlling exposure without full screen post process.
    * This corresponds to a photographic exposure.
    */
  var cameraExposure: float = js.native
  /**
    * Gets wether tonemapping is enabled or not.
    */
  /**
    * Sets wether tonemapping is enabled or not
    */
  var cameraToneMappingEnabled: scala.Boolean = js.native
  /**
    * Diffuse Texture used in the material.
    * Should be author in a specific way for the best result (refer to the documentation).
    */
  var diffuseTexture: Nullable[BaseTexture] = js.native
  /**
    * This helps reducing the banding effect that could occur on the background.
    */
  var enableNoise: scala.Boolean = js.native
  /**
    * The current fov(field of view) multiplier, 0.0 - 2.0. Defaults to 1.0. Lower values "zoom in" and higher values "zoom out".
    * Best used when trying to implement visual zoom effects like fish-eye or binoculars while not adjusting camera fov.
    * Recommended to be keep at 1.0 except for special cases.
    */
  var fovMultiplier: scala.Double = js.native
  /**
    * Gets the image processing configuration used either in this material.
    */
  /**
    * Sets the Default image processing configuration used either in the this material.
    *
    * If sets to null, the scene one is in use.
    */
  var imageProcessingConfiguration: Nullable[ImageProcessingConfiguration] = js.native
  /**
    * Number of Simultaneous lights allowed on the material.
    */
  var maxSimultaneousLights: int = js.native
  /**
    * This helps specifying that the material is falling off to the sky box at grazing angle.
    * This helps ensuring a nice transition when the camera goes under the ground.
    */
  var opacityFresnel: scala.Boolean = js.native
  /**
    * Key light Color (multiply against the environement texture)
    */
  var primaryColor: Color3 = js.native
  /**
    * Defines the level of the highliights (highlight area of the reflection map) in order to help scaling the colors.
    * The primary color is used at the level chosen to define what the white area would look.
    */
  var primaryColorHighlightLevel: float = js.native
  /**
    * Defines the level of the shadows (dark area of the reflection map) in order to help scaling the colors.
    * The color opposite to the primary color is used at the level chosen to define what the black area would look.
    */
  var primaryColorShadowLevel: float = js.native
  /**
    * This specifies the weight of the reflection against the background in case of reflection Fresnel.
    */
  var reflectionAmount: scala.Double = js.native
  /**
    * Reflection Texture level of blur.
    *
    * Can be use to reuse an existing HDR Texture and target a specific LOD to prevent authoring the
    * texture twice.
    */
  var reflectionBlur: float = js.native
  /**
    * This helps specifying the falloff radius off the reflection texture from the sceneCenter.
    * This helps adding a nice falloff effect to the reflection if used as a mirror for instance.
    */
  var reflectionFalloffDistance: scala.Double = js.native
  /**
    * This helps specifying that the material is falling off from diffuse to the reflection texture at grazing angle.
    * This helps adding a mirror texture on the ground.
    */
  var reflectionFresnel: scala.Boolean = js.native
  /**
    * This specifies the weight of the reflection at grazing angle.
    */
  var reflectionReflectance0: scala.Double = js.native
  /**
    * This specifies the weight of the reflection at a perpendicular point of view.
    */
  var reflectionReflectance90: scala.Double = js.native
  /**
    * Sets the reflection reflectance fresnel values according to the default standard
    * empirically know to work well :-)
    */
  var reflectionStandardFresnelWeight: scala.Double = js.native
  /**
    * Reflection Texture used in the material.
    * Should be author in a specific way for the best result (refer to the documentation).
    */
  var reflectionTexture: Nullable[BaseTexture] = js.native
  /**
    * In case of opacity Fresnel or reflection falloff, this is use as a scene center.
    * It is usually zero but might be interesting to modify according to your setup.
    */
  var sceneCenter: Vector3 = js.native
  /**
    * Helps adjusting the shadow to a softer level if required.
    * 0 means black shadows and 1 means no shadows.
    */
  var shadowLevel: float = js.native
  /**
    * Specify the list of lights casting shadow on the material.
    * All scene shadow lights will be included if null.
    */
  var shadowLights: Nullable[js.Array[IShadowLight]] = js.native
  /**
    * Due to a bug in iOS10, video tags (which are using the background material) are in BGR and not RGB.
    * Setting this flag to true (not done automatically!) will convert it back to RGB.
    */
  var switchToBGR: scala.Boolean = js.native
  /**
    * Enable the FOV adjustment feature controlled by fovMultiplier.
    */
  var useEquirectangularFOV: scala.Boolean = js.native
  /**
    * Helps to directly use the maps channels instead of their level.
    */
  var useRGBColor: scala.Boolean = js.native
  /**
    * Attaches a new image processing configuration to the PBR Material.
    * @param configuration (if null the scene configuration will be use)
    */
  /* protected */ def _attachImageProcessingConfiguration(configuration: Nullable[ImageProcessingConfiguration]): scala.Unit = js.native
  /**
    * Build the uniform buffer used in the material.
    */
  def buildUniformLayout(): scala.Unit = js.native
  /**
    * Checks wether the material is ready to be rendered for a given mesh.
    * @param mesh The mesh to render
    * @param subMesh The submesh to check against
    * @param useInstances Specify wether or not the material is used with instances
    * @returns true if all the dependencies are ready (Textures, Effects...)
    */
  def isReadyForSubMesh(mesh: AbstractMesh, subMesh: SubMesh): scala.Boolean = js.native
  def isReadyForSubMesh(mesh: AbstractMesh, subMesh: SubMesh, useInstances: scala.Boolean): scala.Boolean = js.native
}

/**
  * Background material used to create an efficient environement around your scene.
  */
@JSGlobal("BABYLON.BackgroundMaterial")
@js.native
object BackgroundMaterial extends js.Object {
  /**
    * Standard reflectance value at parallel view angle.
    */
  var StandardReflectance0: scala.Double = js.native
  /**
    * Standard reflectance value at grazing angle.
    */
  var StandardReflectance90: scala.Double = js.native
  /**
    * Parse a JSON input to create back a background material.
    * @param source The JSON data to parse
    * @param scene The scene to create the parsed material in
    * @param rootUrl The root url of the assets the material depends upon
    * @returns the instantiated BackgroundMaterial.
    */
  def Parse(source: js.Any, scene: babylonjsLib.BABYLONNs.Scene, rootUrl: java.lang.String): babylonjsLib.BABYLONNs.BackgroundMaterial = js.native
}


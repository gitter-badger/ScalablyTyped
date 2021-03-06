package typings
package awsDashSdkLib.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rekognition
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Rekognition: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsRekognitionMod.RekognitionNs.ClientConfiguration = js.native
  /**
    * Compares a face in the source input image with each of the 100 largest faces detected in the target input image.    If the source image contains multiple faces, the service detects the largest face and compares it with each face detected in the target image.   You pass the input and target images either as base64-encoded image bytes or as references to images in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes isn't supported. The image must be formatted as a PNG or JPEG file.  In response, the operation returns an array of face matches ordered by similarity score in descending order. For each face match, the response provides a bounding box of the face, facial landmarks, pose details (pitch, role, and yaw), quality (brightness and sharpness), and confidence value (indicating the level of confidence that the bounding box contains a face). The response also provides a similarity score, which indicates how closely the faces match.   By default, only faces with a similarity score of greater than or equal to 80% are returned in the response. You can change this value by specifying the SimilarityThreshold parameter.   CompareFaces also returns an array of faces that don't match the source image. For each face, it returns a bounding box, confidence value, landmarks, pose details, and quality. The response also returns information about the face in the source image, including the bounding box of the face and confidence value. If the image doesn't contain Exif metadata, CompareFaces returns orientation information for the source and target images. Use these values to display the images with the correct image orientation. If no faces are detected in the source or target images, CompareFaces returns an InvalidParameterException error.    This is a stateless API operation. That is, data returned by this operation doesn't persist.  For an example, see Comparing Faces in Images in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:CompareFaces action.
    */
  def compareFaces(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.CompareFacesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def compareFaces(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.CompareFacesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.CompareFacesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Compares a face in the source input image with each of the 100 largest faces detected in the target input image.    If the source image contains multiple faces, the service detects the largest face and compares it with each face detected in the target image.   You pass the input and target images either as base64-encoded image bytes or as references to images in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes isn't supported. The image must be formatted as a PNG or JPEG file.  In response, the operation returns an array of face matches ordered by similarity score in descending order. For each face match, the response provides a bounding box of the face, facial landmarks, pose details (pitch, role, and yaw), quality (brightness and sharpness), and confidence value (indicating the level of confidence that the bounding box contains a face). The response also provides a similarity score, which indicates how closely the faces match.   By default, only faces with a similarity score of greater than or equal to 80% are returned in the response. You can change this value by specifying the SimilarityThreshold parameter.   CompareFaces also returns an array of faces that don't match the source image. For each face, it returns a bounding box, confidence value, landmarks, pose details, and quality. The response also returns information about the face in the source image, including the bounding box of the face and confidence value. If the image doesn't contain Exif metadata, CompareFaces returns orientation information for the source and target images. Use these values to display the images with the correct image orientation. If no faces are detected in the source or target images, CompareFaces returns an InvalidParameterException error.    This is a stateless API operation. That is, data returned by this operation doesn't persist.  For an example, see Comparing Faces in Images in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:CompareFaces action.
    */
  def compareFaces(params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.CompareFacesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.CompareFacesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def compareFaces(
    params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.CompareFacesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.CompareFacesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.CompareFacesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a collection in an AWS Region. You can add faces to the collection using the operation.  For example, you might create collections, one for each of your application users. A user can then index faces using the IndexFaces operation and persist results in a specific collection. Then, a user can search the collection for faces in the user-specific container.  When you create a collection, it is associated with the latest version of the face model version.  Collection names are case-sensitive.  This operation requires permissions to perform the rekognition:CreateCollection action.
    */
  def createCollection(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.CreateCollectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createCollection(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.CreateCollectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.CreateCollectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a collection in an AWS Region. You can add faces to the collection using the operation.  For example, you might create collections, one for each of your application users. A user can then index faces using the IndexFaces operation and persist results in a specific collection. Then, a user can search the collection for faces in the user-specific container.  When you create a collection, it is associated with the latest version of the face model version.  Collection names are case-sensitive.  This operation requires permissions to perform the rekognition:CreateCollection action.
    */
  def createCollection(params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.CreateCollectionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.CreateCollectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createCollection(
    params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.CreateCollectionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.CreateCollectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.CreateCollectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an Amazon Rekognition stream processor that you can use to detect and recognize faces in a streaming video. Amazon Rekognition Video is a consumer of live video from Amazon Kinesis Video Streams. Amazon Rekognition Video sends analysis results to Amazon Kinesis Data Streams. You provide as input a Kinesis video stream (Input) and a Kinesis data stream (Output) stream. You also specify the face recognition criteria in Settings. For example, the collection containing faces that you want to recognize. Use Name to assign an identifier for the stream processor. You use Name to manage the stream processor. For example, you can start processing the source video by calling with the Name field.  After you have finished analyzing a streaming video, use to stop processing. You can delete the stream processor by calling .
    */
  def createStreamProcessor(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.CreateStreamProcessorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createStreamProcessor(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.CreateStreamProcessorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.CreateStreamProcessorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an Amazon Rekognition stream processor that you can use to detect and recognize faces in a streaming video. Amazon Rekognition Video is a consumer of live video from Amazon Kinesis Video Streams. Amazon Rekognition Video sends analysis results to Amazon Kinesis Data Streams. You provide as input a Kinesis video stream (Input) and a Kinesis data stream (Output) stream. You also specify the face recognition criteria in Settings. For example, the collection containing faces that you want to recognize. Use Name to assign an identifier for the stream processor. You use Name to manage the stream processor. For example, you can start processing the source video by calling with the Name field.  After you have finished analyzing a streaming video, use to stop processing. You can delete the stream processor by calling .
    */
  def createStreamProcessor(params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.CreateStreamProcessorRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.CreateStreamProcessorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createStreamProcessor(
    params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.CreateStreamProcessorRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.CreateStreamProcessorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.CreateStreamProcessorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified collection. Note that this operation removes all faces in the collection. For an example, see delete-collection-procedure. This operation requires permissions to perform the rekognition:DeleteCollection action.
    */
  def deleteCollection(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DeleteCollectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteCollection(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DeleteCollectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DeleteCollectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified collection. Note that this operation removes all faces in the collection. For an example, see delete-collection-procedure. This operation requires permissions to perform the rekognition:DeleteCollection action.
    */
  def deleteCollection(params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DeleteCollectionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DeleteCollectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteCollection(
    params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DeleteCollectionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DeleteCollectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DeleteCollectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes faces from a collection. You specify a collection ID and an array of face IDs to remove from the collection. This operation requires permissions to perform the rekognition:DeleteFaces action.
    */
  def deleteFaces(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DeleteFacesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteFaces(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DeleteFacesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DeleteFacesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes faces from a collection. You specify a collection ID and an array of face IDs to remove from the collection. This operation requires permissions to perform the rekognition:DeleteFaces action.
    */
  def deleteFaces(params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DeleteFacesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DeleteFacesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteFaces(
    params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DeleteFacesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DeleteFacesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DeleteFacesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the stream processor identified by Name. You assign the value for Name when you create the stream processor with . You might not be able to use the same name for a stream processor for a few seconds after calling DeleteStreamProcessor.
    */
  def deleteStreamProcessor(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DeleteStreamProcessorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteStreamProcessor(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DeleteStreamProcessorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DeleteStreamProcessorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the stream processor identified by Name. You assign the value for Name when you create the stream processor with . You might not be able to use the same name for a stream processor for a few seconds after calling DeleteStreamProcessor.
    */
  def deleteStreamProcessor(params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DeleteStreamProcessorRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DeleteStreamProcessorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteStreamProcessor(
    params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DeleteStreamProcessorRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DeleteStreamProcessorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DeleteStreamProcessorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the specified collection. You can use DescribeCollection to get information, such as the number of faces indexed into a collection and the version of the model used by the collection for face detection. For more information, see Describing a Collection in the Amazon Rekognition Developer Guide.
    */
  def describeCollection(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DescribeCollectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeCollection(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DescribeCollectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DescribeCollectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the specified collection. You can use DescribeCollection to get information, such as the number of faces indexed into a collection and the version of the model used by the collection for face detection. For more information, see Describing a Collection in the Amazon Rekognition Developer Guide.
    */
  def describeCollection(params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DescribeCollectionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DescribeCollectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeCollection(
    params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DescribeCollectionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DescribeCollectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DescribeCollectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides information about a stream processor created by . You can get information about the input and output streams, the input parameters for the face recognition being performed, and the current status of the stream processor.
    */
  def describeStreamProcessor(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DescribeStreamProcessorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeStreamProcessor(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DescribeStreamProcessorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DescribeStreamProcessorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides information about a stream processor created by . You can get information about the input and output streams, the input parameters for the face recognition being performed, and the current status of the stream processor.
    */
  def describeStreamProcessor(params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DescribeStreamProcessorRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DescribeStreamProcessorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeStreamProcessor(
    params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DescribeStreamProcessorRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DescribeStreamProcessorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DescribeStreamProcessorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Detects faces within an image that is provided as input.  DetectFaces detects the 100 largest faces in the image. For each face detected, the operation returns face details. These details include a bounding box of the face, a confidence value (that the bounding box contains a face), and a fixed set of attributes such as facial landmarks (for example, coordinates of eye and mouth), gender, presence of beard, sunglasses, and so on.  The face-detection algorithm is most effective on frontal faces. For non-frontal or obscured faces, the algorithm might not detect the faces or might detect faces with lower confidence.  You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the to call Amazon Rekognition operations, passing image bytes is not supported. The image must be either a PNG or JPEG formatted file.   This is a stateless API operation. That is, the operation does not persist any data.  This operation requires permissions to perform the rekognition:DetectFaces action. 
    */
  def detectFaces(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DetectFacesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def detectFaces(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DetectFacesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DetectFacesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Detects faces within an image that is provided as input.  DetectFaces detects the 100 largest faces in the image. For each face detected, the operation returns face details. These details include a bounding box of the face, a confidence value (that the bounding box contains a face), and a fixed set of attributes such as facial landmarks (for example, coordinates of eye and mouth), gender, presence of beard, sunglasses, and so on.  The face-detection algorithm is most effective on frontal faces. For non-frontal or obscured faces, the algorithm might not detect the faces or might detect faces with lower confidence.  You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the to call Amazon Rekognition operations, passing image bytes is not supported. The image must be either a PNG or JPEG formatted file.   This is a stateless API operation. That is, the operation does not persist any data.  This operation requires permissions to perform the rekognition:DetectFaces action. 
    */
  def detectFaces(params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DetectFacesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DetectFacesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def detectFaces(
    params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DetectFacesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DetectFacesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DetectFacesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Detects instances of real-world entities within an image (JPEG or PNG) provided as input. This includes objects like flower, tree, and table; events like wedding, graduation, and birthday party; and concepts like landscape, evening, and nature.  For an example, see Analyzing Images Stored in an Amazon S3 Bucket in the Amazon Rekognition Developer Guide.   DetectLabels does not support the detection of activities. However, activity detection is supported for label detection in videos. For more information, see StartLabelDetection in the Amazon Rekognition Developer Guide.  You pass the input image as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must be either a PNG or JPEG formatted file.   For each object, scene, and concept the API returns one or more labels. Each label provides the object name, and the level of confidence that the image contains the object. For example, suppose the input image has a lighthouse, the sea, and a rock. The response includes all three labels, one for each object.   {Name: lighthouse, Confidence: 98.4629}   {Name: rock,Confidence: 79.2097}    {Name: sea,Confidence: 75.061}  In the preceding example, the operation returns one label for each of the three objects. The operation can also return multiple labels for the same object in the image. For example, if the input image shows a flower (for example, a tulip), the operation might return the following three labels.   {Name: flower,Confidence: 99.0562}   {Name: plant,Confidence: 99.0562}   {Name: tulip,Confidence: 99.0562}  In this example, the detection algorithm more precisely identifies the flower as a tulip. In response, the API returns an array of labels. In addition, the response also includes the orientation correction. Optionally, you can specify MinConfidence to control the confidence threshold for the labels returned. The default is 50%. You can also add the MaxLabels parameter to limit the number of labels returned.   If the object detected is a person, the operation doesn't provide the same facial details that the DetectFaces operation provides.   DetectLabels returns bounding boxes for instances of common object labels in an array of objects. An Instance object contains a object, for the location of the label on the image. It also includes the confidence by which the bounding box was detected.  DetectLabels also returns a hierarchical taxonomy of detected labels. For example, a detected car might be assigned the label car. The label car has two parent labels: Vehicle (its parent) and Transportation (its grandparent). The response returns the entire list of ancestors for a label. Each ancestor is a unique label in the response. In the previous example, Car, Vehicle, and Transportation are returned as unique labels in the response.  This is a stateless API operation. That is, the operation does not persist any data. This operation requires permissions to perform the rekognition:DetectLabels action. 
    */
  def detectLabels(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DetectLabelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def detectLabels(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DetectLabelsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DetectLabelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Detects instances of real-world entities within an image (JPEG or PNG) provided as input. This includes objects like flower, tree, and table; events like wedding, graduation, and birthday party; and concepts like landscape, evening, and nature.  For an example, see Analyzing Images Stored in an Amazon S3 Bucket in the Amazon Rekognition Developer Guide.   DetectLabels does not support the detection of activities. However, activity detection is supported for label detection in videos. For more information, see StartLabelDetection in the Amazon Rekognition Developer Guide.  You pass the input image as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must be either a PNG or JPEG formatted file.   For each object, scene, and concept the API returns one or more labels. Each label provides the object name, and the level of confidence that the image contains the object. For example, suppose the input image has a lighthouse, the sea, and a rock. The response includes all three labels, one for each object.   {Name: lighthouse, Confidence: 98.4629}   {Name: rock,Confidence: 79.2097}    {Name: sea,Confidence: 75.061}  In the preceding example, the operation returns one label for each of the three objects. The operation can also return multiple labels for the same object in the image. For example, if the input image shows a flower (for example, a tulip), the operation might return the following three labels.   {Name: flower,Confidence: 99.0562}   {Name: plant,Confidence: 99.0562}   {Name: tulip,Confidence: 99.0562}  In this example, the detection algorithm more precisely identifies the flower as a tulip. In response, the API returns an array of labels. In addition, the response also includes the orientation correction. Optionally, you can specify MinConfidence to control the confidence threshold for the labels returned. The default is 50%. You can also add the MaxLabels parameter to limit the number of labels returned.   If the object detected is a person, the operation doesn't provide the same facial details that the DetectFaces operation provides.   DetectLabels returns bounding boxes for instances of common object labels in an array of objects. An Instance object contains a object, for the location of the label on the image. It also includes the confidence by which the bounding box was detected.  DetectLabels also returns a hierarchical taxonomy of detected labels. For example, a detected car might be assigned the label car. The label car has two parent labels: Vehicle (its parent) and Transportation (its grandparent). The response returns the entire list of ancestors for a label. Each ancestor is a unique label in the response. In the previous example, Car, Vehicle, and Transportation are returned as unique labels in the response.  This is a stateless API operation. That is, the operation does not persist any data. This operation requires permissions to perform the rekognition:DetectLabels action. 
    */
  def detectLabels(params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DetectLabelsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DetectLabelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def detectLabels(
    params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DetectLabelsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DetectLabelsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DetectLabelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Detects explicit or suggestive adult content in a specified JPEG or PNG format image. Use DetectModerationLabels to moderate images depending on your requirements. For example, you might want to filter images that contain nudity, but not images containing suggestive content. To filter images, use the labels returned by DetectModerationLabels to determine which types of content are appropriate. For information about moderation labels, see Detecting Unsafe Content in the Amazon Rekognition Developer Guide. You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must be either a PNG or JPEG formatted file. 
    */
  def detectModerationLabels(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DetectModerationLabelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def detectModerationLabels(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DetectModerationLabelsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DetectModerationLabelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Detects explicit or suggestive adult content in a specified JPEG or PNG format image. Use DetectModerationLabels to moderate images depending on your requirements. For example, you might want to filter images that contain nudity, but not images containing suggestive content. To filter images, use the labels returned by DetectModerationLabels to determine which types of content are appropriate. For information about moderation labels, see Detecting Unsafe Content in the Amazon Rekognition Developer Guide. You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must be either a PNG or JPEG formatted file. 
    */
  def detectModerationLabels(params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DetectModerationLabelsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DetectModerationLabelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def detectModerationLabels(
    params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DetectModerationLabelsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DetectModerationLabelsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DetectModerationLabelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Detects text in the input image and converts it into machine-readable text. Pass the input image as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, you must pass it as a reference to an image in an Amazon S3 bucket. For the AWS CLI, passing image bytes is not supported. The image must be either a .png or .jpeg formatted file.  The DetectText operation returns text in an array of elements, TextDetections. Each TextDetection element provides information about a single word or line of text that was detected in the image.  A word is one or more ISO basic latin script characters that are not separated by spaces. DetectText can detect up to 50 words in an image. A line is a string of equally spaced words. A line isn't necessarily a complete sentence. For example, a driver's license number is detected as a line. A line ends when there is no aligned text after it. Also, a line ends when there is a large gap between words, relative to the length of the words. This means, depending on the gap between words, Amazon Rekognition may detect multiple lines in text aligned in the same direction. Periods don't represent the end of a line. If a sentence spans multiple lines, the DetectText operation returns multiple lines. To determine whether a TextDetection element is a line of text or a word, use the TextDetection object Type field.  To be detected, text must be within +/- 90 degrees orientation of the horizontal axis. For more information, see DetectText in the Amazon Rekognition Developer Guide.
    */
  def detectText(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DetectTextResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def detectText(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DetectTextResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DetectTextResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Detects text in the input image and converts it into machine-readable text. Pass the input image as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, you must pass it as a reference to an image in an Amazon S3 bucket. For the AWS CLI, passing image bytes is not supported. The image must be either a .png or .jpeg formatted file.  The DetectText operation returns text in an array of elements, TextDetections. Each TextDetection element provides information about a single word or line of text that was detected in the image.  A word is one or more ISO basic latin script characters that are not separated by spaces. DetectText can detect up to 50 words in an image. A line is a string of equally spaced words. A line isn't necessarily a complete sentence. For example, a driver's license number is detected as a line. A line ends when there is no aligned text after it. Also, a line ends when there is a large gap between words, relative to the length of the words. This means, depending on the gap between words, Amazon Rekognition may detect multiple lines in text aligned in the same direction. Periods don't represent the end of a line. If a sentence spans multiple lines, the DetectText operation returns multiple lines. To determine whether a TextDetection element is a line of text or a word, use the TextDetection object Type field.  To be detected, text must be within +/- 90 degrees orientation of the horizontal axis. For more information, see DetectText in the Amazon Rekognition Developer Guide.
    */
  def detectText(params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DetectTextRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DetectTextResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def detectText(
    params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DetectTextRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DetectTextResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.DetectTextResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the name and additional information about a celebrity based on his or her Amazon Rekognition ID. The additional information is returned as an array of URLs. If there is no additional information about the celebrity, this list is empty. For more information, see Recognizing Celebrities in an Image in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:GetCelebrityInfo action. 
    */
  def getCelebrityInfo(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetCelebrityInfoResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getCelebrityInfo(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetCelebrityInfoResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetCelebrityInfoResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the name and additional information about a celebrity based on his or her Amazon Rekognition ID. The additional information is returned as an array of URLs. If there is no additional information about the celebrity, this list is empty. For more information, see Recognizing Celebrities in an Image in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:GetCelebrityInfo action. 
    */
  def getCelebrityInfo(params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetCelebrityInfoRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetCelebrityInfoResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getCelebrityInfo(
    params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetCelebrityInfoRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetCelebrityInfoResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetCelebrityInfoResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the celebrity recognition results for a Amazon Rekognition Video analysis started by . Celebrity recognition in a video is an asynchronous operation. Analysis is started by a call to which returns a job identifier (JobId). When the celebrity recognition operation finishes, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartCelebrityRecognition. To get the results of the celebrity recognition analysis, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetCelebrityDetection and pass the job identifier (JobId) from the initial call to StartCelebrityDetection.  For more information, see Working With Stored Videos in the Amazon Rekognition Developer Guide.  GetCelebrityRecognition returns detected celebrities and the time(s) they are detected in an array (Celebrities) of objects. Each CelebrityRecognition contains information about the celebrity in a object and the time, Timestamp, the celebrity was detected.    GetCelebrityRecognition only returns the default facial attributes (BoundingBox, Confidence, Landmarks, Pose, and Quality). The other facial attributes listed in the Face object of the following response syntax are not returned. For more information, see FaceDetail in the Amazon Rekognition Developer Guide.   By default, the Celebrities array is sorted by time (milliseconds from the start of the video). You can also sort the array by celebrity by specifying the value ID in the SortBy input parameter. The CelebrityDetail object includes the celebrity identifer and additional information urls. If you don't store the additional information urls, you can get them later by calling with the celebrity identifer. No information is returned for faces not recognized as celebrities. Use MaxResults parameter to limit the number of labels returned. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetCelebrityDetection and populate the NextToken request parameter with the token value returned from the previous call to GetCelebrityRecognition.
    */
  def getCelebrityRecognition(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetCelebrityRecognitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getCelebrityRecognition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetCelebrityRecognitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetCelebrityRecognitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the celebrity recognition results for a Amazon Rekognition Video analysis started by . Celebrity recognition in a video is an asynchronous operation. Analysis is started by a call to which returns a job identifier (JobId). When the celebrity recognition operation finishes, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartCelebrityRecognition. To get the results of the celebrity recognition analysis, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetCelebrityDetection and pass the job identifier (JobId) from the initial call to StartCelebrityDetection.  For more information, see Working With Stored Videos in the Amazon Rekognition Developer Guide.  GetCelebrityRecognition returns detected celebrities and the time(s) they are detected in an array (Celebrities) of objects. Each CelebrityRecognition contains information about the celebrity in a object and the time, Timestamp, the celebrity was detected.    GetCelebrityRecognition only returns the default facial attributes (BoundingBox, Confidence, Landmarks, Pose, and Quality). The other facial attributes listed in the Face object of the following response syntax are not returned. For more information, see FaceDetail in the Amazon Rekognition Developer Guide.   By default, the Celebrities array is sorted by time (milliseconds from the start of the video). You can also sort the array by celebrity by specifying the value ID in the SortBy input parameter. The CelebrityDetail object includes the celebrity identifer and additional information urls. If you don't store the additional information urls, you can get them later by calling with the celebrity identifer. No information is returned for faces not recognized as celebrities. Use MaxResults parameter to limit the number of labels returned. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetCelebrityDetection and populate the NextToken request parameter with the token value returned from the previous call to GetCelebrityRecognition.
    */
  def getCelebrityRecognition(params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetCelebrityRecognitionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetCelebrityRecognitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getCelebrityRecognition(
    params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetCelebrityRecognitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetCelebrityRecognitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetCelebrityRecognitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the content moderation analysis results for a Amazon Rekognition Video analysis started by . Content moderation analysis of a video is an asynchronous operation. You start analysis by calling . which returns a job identifier (JobId). When analysis finishes, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartContentModeration. To get the results of the content moderation analysis, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetCelebrityDetection and pass the job identifier (JobId) from the initial call to StartCelebrityDetection.  For more information, see Working with Stored Videos in the Amazon Rekognition Devlopers Guide.  GetContentModeration returns detected content moderation labels, and the time they are detected, in an array, ModerationLabels, of objects.  By default, the moderated labels are returned sorted by time, in milliseconds from the start of the video. You can also sort them by moderated label by specifying NAME for the SortBy input parameter.  Since video analysis can return a large number of results, use the MaxResults parameter to limit the number of labels returned in a single call to GetContentModeration. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetContentModeration and populate the NextToken request parameter with the value of NextToken returned from the previous call to GetContentModeration. For more information, see Detecting Unsafe Content in the Amazon Rekognition Developer Guide.
    */
  def getContentModeration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetContentModerationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getContentModeration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetContentModerationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetContentModerationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the content moderation analysis results for a Amazon Rekognition Video analysis started by . Content moderation analysis of a video is an asynchronous operation. You start analysis by calling . which returns a job identifier (JobId). When analysis finishes, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartContentModeration. To get the results of the content moderation analysis, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetCelebrityDetection and pass the job identifier (JobId) from the initial call to StartCelebrityDetection.  For more information, see Working with Stored Videos in the Amazon Rekognition Devlopers Guide.  GetContentModeration returns detected content moderation labels, and the time they are detected, in an array, ModerationLabels, of objects.  By default, the moderated labels are returned sorted by time, in milliseconds from the start of the video. You can also sort them by moderated label by specifying NAME for the SortBy input parameter.  Since video analysis can return a large number of results, use the MaxResults parameter to limit the number of labels returned in a single call to GetContentModeration. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetContentModeration and populate the NextToken request parameter with the value of NextToken returned from the previous call to GetContentModeration. For more information, see Detecting Unsafe Content in the Amazon Rekognition Developer Guide.
    */
  def getContentModeration(params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetContentModerationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetContentModerationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getContentModeration(
    params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetContentModerationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetContentModerationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetContentModerationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets face detection results for a Amazon Rekognition Video analysis started by . Face detection with Amazon Rekognition Video is an asynchronous operation. You start face detection by calling which returns a job identifier (JobId). When the face detection operation finishes, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartFaceDetection. To get the results of the face detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call and pass the job identifier (JobId) from the initial call to StartFaceDetection.  GetFaceDetection returns an array of detected faces (Faces) sorted by the time the faces were detected.  Use MaxResults parameter to limit the number of labels returned. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetFaceDetection and populate the NextToken request parameter with the token value returned from the previous call to GetFaceDetection.
    */
  def getFaceDetection(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetFaceDetectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getFaceDetection(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetFaceDetectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetFaceDetectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets face detection results for a Amazon Rekognition Video analysis started by . Face detection with Amazon Rekognition Video is an asynchronous operation. You start face detection by calling which returns a job identifier (JobId). When the face detection operation finishes, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartFaceDetection. To get the results of the face detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call and pass the job identifier (JobId) from the initial call to StartFaceDetection.  GetFaceDetection returns an array of detected faces (Faces) sorted by the time the faces were detected.  Use MaxResults parameter to limit the number of labels returned. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetFaceDetection and populate the NextToken request parameter with the token value returned from the previous call to GetFaceDetection.
    */
  def getFaceDetection(params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetFaceDetectionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetFaceDetectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getFaceDetection(
    params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetFaceDetectionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetFaceDetectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetFaceDetectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the face search results for Amazon Rekognition Video face search started by . The search returns faces in a collection that match the faces of persons detected in a video. It also includes the time(s) that faces are matched in the video. Face search in a video is an asynchronous operation. You start face search by calling to which returns a job identifier (JobId). When the search operation finishes, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartFaceSearch. To get the search results, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetFaceSearch and pass the job identifier (JobId) from the initial call to StartFaceSearch. For more information, see Searching Faces in a Collection in the Amazon Rekognition Developer Guide. The search results are retured in an array, Persons, of objects. EachPersonMatch element contains details about the matching faces in the input collection, person information (facial attributes, bounding boxes, and person identifer) for the matched person, and the time the person was matched in the video.   GetFaceSearch only returns the default facial attributes (BoundingBox, Confidence, Landmarks, Pose, and Quality). The other facial attributes listed in the Face object of the following response syntax are not returned. For more information, see FaceDetail in the Amazon Rekognition Developer Guide.   By default, the Persons array is sorted by the time, in milliseconds from the start of the video, persons are matched. You can also sort by persons by specifying INDEX for the SORTBY input parameter.
    */
  def getFaceSearch(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetFaceSearchResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getFaceSearch(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetFaceSearchResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetFaceSearchResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the face search results for Amazon Rekognition Video face search started by . The search returns faces in a collection that match the faces of persons detected in a video. It also includes the time(s) that faces are matched in the video. Face search in a video is an asynchronous operation. You start face search by calling to which returns a job identifier (JobId). When the search operation finishes, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartFaceSearch. To get the search results, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetFaceSearch and pass the job identifier (JobId) from the initial call to StartFaceSearch. For more information, see Searching Faces in a Collection in the Amazon Rekognition Developer Guide. The search results are retured in an array, Persons, of objects. EachPersonMatch element contains details about the matching faces in the input collection, person information (facial attributes, bounding boxes, and person identifer) for the matched person, and the time the person was matched in the video.   GetFaceSearch only returns the default facial attributes (BoundingBox, Confidence, Landmarks, Pose, and Quality). The other facial attributes listed in the Face object of the following response syntax are not returned. For more information, see FaceDetail in the Amazon Rekognition Developer Guide.   By default, the Persons array is sorted by the time, in milliseconds from the start of the video, persons are matched. You can also sort by persons by specifying INDEX for the SORTBY input parameter.
    */
  def getFaceSearch(params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetFaceSearchRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetFaceSearchResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getFaceSearch(
    params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetFaceSearchRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetFaceSearchResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetFaceSearchResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the label detection results of a Amazon Rekognition Video analysis started by .  The label detection operation is started by a call to which returns a job identifier (JobId). When the label detection operation finishes, Amazon Rekognition publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartlabelDetection. To get the results of the label detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call and pass the job identifier (JobId) from the initial call to StartLabelDetection.  GetLabelDetection returns an array of detected labels (Labels) sorted by the time the labels were detected. You can also sort by the label name by specifying NAME for the SortBy input parameter. The labels returned include the label name, the percentage confidence in the accuracy of the detected label, and the time the label was detected in the video. Use MaxResults parameter to limit the number of labels returned. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetlabelDetection and populate the NextToken request parameter with the token value returned from the previous call to GetLabelDetection.   GetLabelDetection doesn't return a hierarchical taxonomy, or bounding box information, for detected labels. GetLabelDetection returns null for the Parents and Instances attributes of the object which is returned in the Labels array.  
    */
  def getLabelDetection(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetLabelDetectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getLabelDetection(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetLabelDetectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetLabelDetectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the label detection results of a Amazon Rekognition Video analysis started by .  The label detection operation is started by a call to which returns a job identifier (JobId). When the label detection operation finishes, Amazon Rekognition publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartlabelDetection. To get the results of the label detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call and pass the job identifier (JobId) from the initial call to StartLabelDetection.  GetLabelDetection returns an array of detected labels (Labels) sorted by the time the labels were detected. You can also sort by the label name by specifying NAME for the SortBy input parameter. The labels returned include the label name, the percentage confidence in the accuracy of the detected label, and the time the label was detected in the video. Use MaxResults parameter to limit the number of labels returned. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetlabelDetection and populate the NextToken request parameter with the token value returned from the previous call to GetLabelDetection.   GetLabelDetection doesn't return a hierarchical taxonomy, or bounding box information, for detected labels. GetLabelDetection returns null for the Parents and Instances attributes of the object which is returned in the Labels array.  
    */
  def getLabelDetection(params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetLabelDetectionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetLabelDetectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getLabelDetection(
    params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetLabelDetectionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetLabelDetectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetLabelDetectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the path tracking results of a Amazon Rekognition Video analysis started by . The person path tracking operation is started by a call to StartPersonTracking which returns a job identifier (JobId). When the operation finishes, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartPersonTracking. To get the results of the person path tracking operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call and pass the job identifier (JobId) from the initial call to StartPersonTracking.  GetPersonTracking returns an array, Persons, of tracked persons and the time(s) their paths were tracked in the video.    GetPersonTracking only returns the default facial attributes (BoundingBox, Confidence, Landmarks, Pose, and Quality). The other facial attributes listed in the Face object of the following response syntax are not returned.  For more information, see FaceDetail in the Amazon Rekognition Developer Guide.  By default, the array is sorted by the time(s) a person's path is tracked in the video. You can sort by tracked persons by specifying INDEX for the SortBy input parameter. Use the MaxResults parameter to limit the number of items returned. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetPersonTracking and populate the NextToken request parameter with the token value returned from the previous call to GetPersonTracking.
    */
  def getPersonTracking(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetPersonTrackingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getPersonTracking(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetPersonTrackingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetPersonTrackingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the path tracking results of a Amazon Rekognition Video analysis started by . The person path tracking operation is started by a call to StartPersonTracking which returns a job identifier (JobId). When the operation finishes, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartPersonTracking. To get the results of the person path tracking operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call and pass the job identifier (JobId) from the initial call to StartPersonTracking.  GetPersonTracking returns an array, Persons, of tracked persons and the time(s) their paths were tracked in the video.    GetPersonTracking only returns the default facial attributes (BoundingBox, Confidence, Landmarks, Pose, and Quality). The other facial attributes listed in the Face object of the following response syntax are not returned.  For more information, see FaceDetail in the Amazon Rekognition Developer Guide.  By default, the array is sorted by the time(s) a person's path is tracked in the video. You can sort by tracked persons by specifying INDEX for the SortBy input parameter. Use the MaxResults parameter to limit the number of items returned. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetPersonTracking and populate the NextToken request parameter with the token value returned from the previous call to GetPersonTracking.
    */
  def getPersonTracking(params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetPersonTrackingRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetPersonTrackingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getPersonTracking(
    params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetPersonTrackingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetPersonTrackingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.GetPersonTrackingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Detects faces in the input image and adds them to the specified collection.  Amazon Rekognition doesn't save the actual faces that are detected. Instead, the underlying detection algorithm first detects the faces in the input image. For each face, the algorithm extracts facial features into a feature vector, and stores it in the backend database. Amazon Rekognition uses feature vectors when it performs face match and search operations using the and operations. For more information, see Adding Faces to a Collection in the Amazon Rekognition Developer Guide. To get the number of faces in a collection, call .  If you're using version 1.0 of the face detection model, IndexFaces indexes the 15 largest faces in the input image. Later versions of the face detection model index the 100 largest faces in the input image.  If you're using version 4 or later of the face model, image orientation information is not returned in the OrientationCorrection field.  To determine which version of the model you're using, call and supply the collection ID. You can also get the model version from the value of FaceModelVersion in the response from IndexFaces  For more information, see Model Versioning in the Amazon Rekognition Developer Guide. If you provide the optional ExternalImageID for the input image you provided, Amazon Rekognition associates this ID with all faces that it detects. When you call the operation, the response returns the external ID. You can use this external image ID to create a client-side index to associate the faces with each image. You can then use the index to find all faces in an image. You can specify the maximum number of faces to index with the MaxFaces input parameter. This is useful when you want to index the largest faces in an image and don't want to index smaller faces, such as those belonging to people standing in the background. The QualityFilter input parameter allows you to filter out detected faces that don’t meet the required quality bar chosen by Amazon Rekognition. The quality bar is based on a variety of common use cases. By default, IndexFaces filters detected faces. You can also explicitly filter detected faces by specifying AUTO for the value of QualityFilter. If you do not want to filter detected faces, specify NONE.   To use quality filtering, you need a collection associated with version 3 of the face model. To get the version of the face model associated with a collection, call .   Information about faces detected in an image, but not indexed, is returned in an array of objects, UnindexedFaces. Faces aren't indexed for reasons such as:   The number of faces detected exceeds the value of the MaxFaces request parameter.   The face is too small compared to the image dimensions.   The face is too blurry.   The image is too dark.   The face has an extreme pose.   In response, the IndexFaces operation returns an array of metadata for all detected faces, FaceRecords. This includes:    The bounding box, BoundingBox, of the detected face.    A confidence value, Confidence, which indicates the confidence that the bounding box contains a face.   A face ID, faceId, assigned by the service for each face that's detected and stored.   An image ID, ImageId, assigned by the service for the input image.   If you request all facial attributes (by using the detectionAttributes parameter), Amazon Rekognition returns detailed facial attributes, such as facial landmarks (for example, location of eye and mouth) and other facial attributes like gender. If you provide the same image, specify the same collection, and use the same external ID in the IndexFaces operation, Amazon Rekognition doesn't save duplicate face metadata.  The input image is passed either as base64-encoded image bytes, or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes isn't supported. The image must be formatted as a PNG or JPEG file.  This operation requires permissions to perform the rekognition:IndexFaces action.
    */
  def indexFaces(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.IndexFacesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def indexFaces(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.IndexFacesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.IndexFacesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Detects faces in the input image and adds them to the specified collection.  Amazon Rekognition doesn't save the actual faces that are detected. Instead, the underlying detection algorithm first detects the faces in the input image. For each face, the algorithm extracts facial features into a feature vector, and stores it in the backend database. Amazon Rekognition uses feature vectors when it performs face match and search operations using the and operations. For more information, see Adding Faces to a Collection in the Amazon Rekognition Developer Guide. To get the number of faces in a collection, call .  If you're using version 1.0 of the face detection model, IndexFaces indexes the 15 largest faces in the input image. Later versions of the face detection model index the 100 largest faces in the input image.  If you're using version 4 or later of the face model, image orientation information is not returned in the OrientationCorrection field.  To determine which version of the model you're using, call and supply the collection ID. You can also get the model version from the value of FaceModelVersion in the response from IndexFaces  For more information, see Model Versioning in the Amazon Rekognition Developer Guide. If you provide the optional ExternalImageID for the input image you provided, Amazon Rekognition associates this ID with all faces that it detects. When you call the operation, the response returns the external ID. You can use this external image ID to create a client-side index to associate the faces with each image. You can then use the index to find all faces in an image. You can specify the maximum number of faces to index with the MaxFaces input parameter. This is useful when you want to index the largest faces in an image and don't want to index smaller faces, such as those belonging to people standing in the background. The QualityFilter input parameter allows you to filter out detected faces that don’t meet the required quality bar chosen by Amazon Rekognition. The quality bar is based on a variety of common use cases. By default, IndexFaces filters detected faces. You can also explicitly filter detected faces by specifying AUTO for the value of QualityFilter. If you do not want to filter detected faces, specify NONE.   To use quality filtering, you need a collection associated with version 3 of the face model. To get the version of the face model associated with a collection, call .   Information about faces detected in an image, but not indexed, is returned in an array of objects, UnindexedFaces. Faces aren't indexed for reasons such as:   The number of faces detected exceeds the value of the MaxFaces request parameter.   The face is too small compared to the image dimensions.   The face is too blurry.   The image is too dark.   The face has an extreme pose.   In response, the IndexFaces operation returns an array of metadata for all detected faces, FaceRecords. This includes:    The bounding box, BoundingBox, of the detected face.    A confidence value, Confidence, which indicates the confidence that the bounding box contains a face.   A face ID, faceId, assigned by the service for each face that's detected and stored.   An image ID, ImageId, assigned by the service for the input image.   If you request all facial attributes (by using the detectionAttributes parameter), Amazon Rekognition returns detailed facial attributes, such as facial landmarks (for example, location of eye and mouth) and other facial attributes like gender. If you provide the same image, specify the same collection, and use the same external ID in the IndexFaces operation, Amazon Rekognition doesn't save duplicate face metadata.  The input image is passed either as base64-encoded image bytes, or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes isn't supported. The image must be formatted as a PNG or JPEG file.  This operation requires permissions to perform the rekognition:IndexFaces action.
    */
  def indexFaces(params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.IndexFacesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.IndexFacesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def indexFaces(
    params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.IndexFacesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.IndexFacesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.IndexFacesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns list of collection IDs in your account. If the result is truncated, the response also provides a NextToken that you can use in the subsequent request to fetch the next set of collection IDs. For an example, see Listing Collections in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:ListCollections action.
    */
  def listCollections(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.ListCollectionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listCollections(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.ListCollectionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.ListCollectionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns list of collection IDs in your account. If the result is truncated, the response also provides a NextToken that you can use in the subsequent request to fetch the next set of collection IDs. For an example, see Listing Collections in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:ListCollections action.
    */
  def listCollections(params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.ListCollectionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.ListCollectionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listCollections(
    params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.ListCollectionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.ListCollectionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.ListCollectionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns metadata for faces in the specified collection. This metadata includes information such as the bounding box coordinates, the confidence (that the bounding box contains a face), and face ID. For an example, see Listing Faces in a Collection in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:ListFaces action.
    */
  def listFaces(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.ListFacesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listFaces(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.ListFacesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.ListFacesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns metadata for faces in the specified collection. This metadata includes information such as the bounding box coordinates, the confidence (that the bounding box contains a face), and face ID. For an example, see Listing Faces in a Collection in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:ListFaces action.
    */
  def listFaces(params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.ListFacesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.ListFacesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listFaces(
    params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.ListFacesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.ListFacesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.ListFacesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a list of stream processors that you have created with . 
    */
  def listStreamProcessors(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.ListStreamProcessorsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listStreamProcessors(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.ListStreamProcessorsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.ListStreamProcessorsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a list of stream processors that you have created with . 
    */
  def listStreamProcessors(params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.ListStreamProcessorsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.ListStreamProcessorsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listStreamProcessors(
    params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.ListStreamProcessorsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.ListStreamProcessorsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.ListStreamProcessorsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns an array of celebrities recognized in the input image. For more information, see Recognizing Celebrities in the Amazon Rekognition Developer Guide.   RecognizeCelebrities returns the 100 largest faces in the image. It lists recognized celebrities in the CelebrityFaces array and unrecognized faces in the UnrecognizedFaces array. RecognizeCelebrities doesn't return celebrities whose faces aren't among the largest 100 faces in the image. For each celebrity recognized, RecognizeCelebrities returns a Celebrity object. The Celebrity object contains the celebrity name, ID, URL links to additional information, match confidence, and a ComparedFace object that you can use to locate the celebrity's face on the image. Amazon Rekognition doesn't retain information about which images a celebrity has been recognized in. Your application must store this information and use the Celebrity ID property as a unique identifier for the celebrity. If you don't store the celebrity name or additional information URLs returned by RecognizeCelebrities, you will need the ID to identify the celebrity in a call to the operation. You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must be either a PNG or JPEG formatted file.  For an example, see Recognizing Celebrities in an Image in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:RecognizeCelebrities operation.
    */
  def recognizeCelebrities(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.RecognizeCelebritiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def recognizeCelebrities(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.RecognizeCelebritiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.RecognizeCelebritiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns an array of celebrities recognized in the input image. For more information, see Recognizing Celebrities in the Amazon Rekognition Developer Guide.   RecognizeCelebrities returns the 100 largest faces in the image. It lists recognized celebrities in the CelebrityFaces array and unrecognized faces in the UnrecognizedFaces array. RecognizeCelebrities doesn't return celebrities whose faces aren't among the largest 100 faces in the image. For each celebrity recognized, RecognizeCelebrities returns a Celebrity object. The Celebrity object contains the celebrity name, ID, URL links to additional information, match confidence, and a ComparedFace object that you can use to locate the celebrity's face on the image. Amazon Rekognition doesn't retain information about which images a celebrity has been recognized in. Your application must store this information and use the Celebrity ID property as a unique identifier for the celebrity. If you don't store the celebrity name or additional information URLs returned by RecognizeCelebrities, you will need the ID to identify the celebrity in a call to the operation. You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must be either a PNG or JPEG formatted file.  For an example, see Recognizing Celebrities in an Image in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:RecognizeCelebrities operation.
    */
  def recognizeCelebrities(params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.RecognizeCelebritiesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.RecognizeCelebritiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def recognizeCelebrities(
    params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.RecognizeCelebritiesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.RecognizeCelebritiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.RecognizeCelebritiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * For a given input face ID, searches for matching faces in the collection the face belongs to. You get a face ID when you add a face to the collection using the IndexFaces operation. The operation compares the features of the input face with faces in the specified collection.   You can also search faces without indexing faces by using the SearchFacesByImage operation.   The operation response returns an array of faces that match, ordered by similarity score with the highest similarity first. More specifically, it is an array of metadata for each face match that is found. Along with the metadata, the response also includes a confidence value for each face match, indicating the confidence that the specific face matches the input face.  For an example, see Searching for a Face Using Its Face ID in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:SearchFaces action.
    */
  def searchFaces(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.SearchFacesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def searchFaces(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.SearchFacesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.SearchFacesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * For a given input face ID, searches for matching faces in the collection the face belongs to. You get a face ID when you add a face to the collection using the IndexFaces operation. The operation compares the features of the input face with faces in the specified collection.   You can also search faces without indexing faces by using the SearchFacesByImage operation.   The operation response returns an array of faces that match, ordered by similarity score with the highest similarity first. More specifically, it is an array of metadata for each face match that is found. Along with the metadata, the response also includes a confidence value for each face match, indicating the confidence that the specific face matches the input face.  For an example, see Searching for a Face Using Its Face ID in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:SearchFaces action.
    */
  def searchFaces(params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.SearchFacesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.SearchFacesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def searchFaces(
    params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.SearchFacesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.SearchFacesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.SearchFacesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * For a given input image, first detects the largest face in the image, and then searches the specified collection for matching faces. The operation compares the features of the input face with faces in the specified collection.   To search for all faces in an input image, you might first call the operation, and then use the face IDs returned in subsequent calls to the operation.   You can also call the DetectFaces operation and use the bounding boxes in the response to make face crops, which then you can pass in to the SearchFacesByImage operation.   You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must be either a PNG or JPEG formatted file.   The response returns an array of faces that match, ordered by similarity score with the highest similarity first. More specifically, it is an array of metadata for each face match found. Along with the metadata, the response also includes a similarity indicating how similar the face is to the input face. In the response, the operation also returns the bounding box (and a confidence level that the bounding box contains a face) of the face that Amazon Rekognition used for the input image.  For an example, Searching for a Face Using an Image in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:SearchFacesByImage action.
    */
  def searchFacesByImage(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.SearchFacesByImageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def searchFacesByImage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.SearchFacesByImageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.SearchFacesByImageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * For a given input image, first detects the largest face in the image, and then searches the specified collection for matching faces. The operation compares the features of the input face with faces in the specified collection.   To search for all faces in an input image, you might first call the operation, and then use the face IDs returned in subsequent calls to the operation.   You can also call the DetectFaces operation and use the bounding boxes in the response to make face crops, which then you can pass in to the SearchFacesByImage operation.   You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must be either a PNG or JPEG formatted file.   The response returns an array of faces that match, ordered by similarity score with the highest similarity first. More specifically, it is an array of metadata for each face match found. Along with the metadata, the response also includes a similarity indicating how similar the face is to the input face. In the response, the operation also returns the bounding box (and a confidence level that the bounding box contains a face) of the face that Amazon Rekognition used for the input image.  For an example, Searching for a Face Using an Image in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:SearchFacesByImage action.
    */
  def searchFacesByImage(params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.SearchFacesByImageRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.SearchFacesByImageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def searchFacesByImage(
    params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.SearchFacesByImageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.SearchFacesByImageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.SearchFacesByImageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts asynchronous recognition of celebrities in a stored video. Amazon Rekognition Video can detect celebrities in a video must be stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartCelebrityRecognition returns a job identifier (JobId) which you use to get the results of the analysis. When celebrity recognition analysis is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. To get the results of the celebrity recognition analysis, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call and pass the job identifier (JobId) from the initial call to StartCelebrityRecognition.  For more information, see Recognizing Celebrities in the Amazon Rekognition Developer Guide.
    */
  def startCelebrityRecognition(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartCelebrityRecognitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startCelebrityRecognition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartCelebrityRecognitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartCelebrityRecognitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts asynchronous recognition of celebrities in a stored video. Amazon Rekognition Video can detect celebrities in a video must be stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartCelebrityRecognition returns a job identifier (JobId) which you use to get the results of the analysis. When celebrity recognition analysis is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. To get the results of the celebrity recognition analysis, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call and pass the job identifier (JobId) from the initial call to StartCelebrityRecognition.  For more information, see Recognizing Celebrities in the Amazon Rekognition Developer Guide.
    */
  def startCelebrityRecognition(params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartCelebrityRecognitionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartCelebrityRecognitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startCelebrityRecognition(
    params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartCelebrityRecognitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartCelebrityRecognitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartCelebrityRecognitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Starts asynchronous detection of explicit or suggestive adult content in a stored video. Amazon Rekognition Video can moderate content in a video stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartContentModeration returns a job identifier (JobId) which you use to get the results of the analysis. When content moderation analysis is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. To get the results of the content moderation analysis, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call and pass the job identifier (JobId) from the initial call to StartContentModeration.  For more information, see Detecting Unsafe Content in the Amazon Rekognition Developer Guide.
    */
  def startContentModeration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartContentModerationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startContentModeration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartContentModerationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartContentModerationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Starts asynchronous detection of explicit or suggestive adult content in a stored video. Amazon Rekognition Video can moderate content in a video stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartContentModeration returns a job identifier (JobId) which you use to get the results of the analysis. When content moderation analysis is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. To get the results of the content moderation analysis, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call and pass the job identifier (JobId) from the initial call to StartContentModeration.  For more information, see Detecting Unsafe Content in the Amazon Rekognition Developer Guide.
    */
  def startContentModeration(params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartContentModerationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartContentModerationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startContentModeration(
    params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartContentModerationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartContentModerationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartContentModerationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts asynchronous detection of faces in a stored video. Amazon Rekognition Video can detect faces in a video stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartFaceDetection returns a job identifier (JobId) that you use to get the results of the operation. When face detection is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. To get the results of the face detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call and pass the job identifier (JobId) from the initial call to StartFaceDetection. For more information, see Detecting Faces in a Stored Video in the Amazon Rekognition Developer Guide.
    */
  def startFaceDetection(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartFaceDetectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startFaceDetection(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartFaceDetectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartFaceDetectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts asynchronous detection of faces in a stored video. Amazon Rekognition Video can detect faces in a video stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartFaceDetection returns a job identifier (JobId) that you use to get the results of the operation. When face detection is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. To get the results of the face detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call and pass the job identifier (JobId) from the initial call to StartFaceDetection. For more information, see Detecting Faces in a Stored Video in the Amazon Rekognition Developer Guide.
    */
  def startFaceDetection(params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartFaceDetectionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartFaceDetectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startFaceDetection(
    params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartFaceDetectionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartFaceDetectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartFaceDetectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts the asynchronous search for faces in a collection that match the faces of persons detected in a stored video. The video must be stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartFaceSearch returns a job identifier (JobId) which you use to get the search results once the search has completed. When searching is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. To get the search results, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call and pass the job identifier (JobId) from the initial call to StartFaceSearch. For more information, see procedure-person-search-videos.
    */
  def startFaceSearch(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartFaceSearchResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startFaceSearch(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartFaceSearchResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartFaceSearchResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts the asynchronous search for faces in a collection that match the faces of persons detected in a stored video. The video must be stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartFaceSearch returns a job identifier (JobId) which you use to get the search results once the search has completed. When searching is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. To get the search results, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call and pass the job identifier (JobId) from the initial call to StartFaceSearch. For more information, see procedure-person-search-videos.
    */
  def startFaceSearch(params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartFaceSearchRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartFaceSearchResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startFaceSearch(
    params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartFaceSearchRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartFaceSearchResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartFaceSearchResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts asynchronous detection of labels in a stored video. Amazon Rekognition Video can detect labels in a video. Labels are instances of real-world entities. This includes objects like flower, tree, and table; events like wedding, graduation, and birthday party; concepts like landscape, evening, and nature; and activities like a person getting out of a car or a person skiing. The video must be stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartLabelDetection returns a job identifier (JobId) which you use to get the results of the operation. When label detection is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. To get the results of the label detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call and pass the job identifier (JobId) from the initial call to StartLabelDetection. 
    */
  def startLabelDetection(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartLabelDetectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startLabelDetection(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartLabelDetectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartLabelDetectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts asynchronous detection of labels in a stored video. Amazon Rekognition Video can detect labels in a video. Labels are instances of real-world entities. This includes objects like flower, tree, and table; events like wedding, graduation, and birthday party; concepts like landscape, evening, and nature; and activities like a person getting out of a car or a person skiing. The video must be stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartLabelDetection returns a job identifier (JobId) which you use to get the results of the operation. When label detection is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. To get the results of the label detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call and pass the job identifier (JobId) from the initial call to StartLabelDetection. 
    */
  def startLabelDetection(params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartLabelDetectionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartLabelDetectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startLabelDetection(
    params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartLabelDetectionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartLabelDetectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartLabelDetectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts the asynchronous tracking of a person's path in a stored video. Amazon Rekognition Video can track the path of people in a video stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartPersonTracking returns a job identifier (JobId) which you use to get the results of the operation. When label detection is finished, Amazon Rekognition publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel.  To get the results of the person detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call and pass the job identifier (JobId) from the initial call to StartPersonTracking.
    */
  def startPersonTracking(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartPersonTrackingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startPersonTracking(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartPersonTrackingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartPersonTrackingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts the asynchronous tracking of a person's path in a stored video. Amazon Rekognition Video can track the path of people in a video stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartPersonTracking returns a job identifier (JobId) which you use to get the results of the operation. When label detection is finished, Amazon Rekognition publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel.  To get the results of the person detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call and pass the job identifier (JobId) from the initial call to StartPersonTracking.
    */
  def startPersonTracking(params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartPersonTrackingRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartPersonTrackingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startPersonTracking(
    params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartPersonTrackingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartPersonTrackingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartPersonTrackingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts processing a stream processor. You create a stream processor by calling . To tell StartStreamProcessor which stream processor to start, use the value of the Name field specified in the call to CreateStreamProcessor.
    */
  def startStreamProcessor(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartStreamProcessorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startStreamProcessor(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartStreamProcessorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartStreamProcessorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts processing a stream processor. You create a stream processor by calling . To tell StartStreamProcessor which stream processor to start, use the value of the Name field specified in the call to CreateStreamProcessor.
    */
  def startStreamProcessor(params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartStreamProcessorRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartStreamProcessorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startStreamProcessor(
    params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartStreamProcessorRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartStreamProcessorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StartStreamProcessorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops a running stream processor that was created by .
    */
  def stopStreamProcessor(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StopStreamProcessorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopStreamProcessor(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StopStreamProcessorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StopStreamProcessorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops a running stream processor that was created by .
    */
  def stopStreamProcessor(params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StopStreamProcessorRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StopStreamProcessorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopStreamProcessor(
    params: awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StopStreamProcessorRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StopStreamProcessorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRekognitionMod.RekognitionNs.StopStreamProcessorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}


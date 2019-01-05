package typings
package gapiDotClientDotPlusdomainsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content extends js.Object {
  /** If the attachment is an article, this property contains a snippet of text from the article. It can also include descriptions for other types. */
  var content: js.UndefOr[java.lang.String] = js.undefined
  /** The title of the attachment, such as a photo caption or an article title. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** If the attachment is a video, the embeddable link. */
  var embed: js.UndefOr[Anon_Type] = js.undefined
  /** The full image URL for photo attachments. */
  var fullImage: js.UndefOr[Anon_Height] = js.undefined
  /** The ID of the attachment. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The preview image for photos or videos. */
  var image: js.UndefOr[Anon_Height] = js.undefined
  /**
    * The type of media object. Possible values include, but are not limited to, the following values:
    * - "photo" - A photo.
    * - "album" - A photo album.
    * - "video" - A video.
    * - "article" - An article, specified by a link.
    */
  var objectType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * When previewing, these are the optional thumbnails for the post. When posting an article, choose one by setting the attachment.image.url property. If
    * you don't choose one, one will be chosen for you.
    */
  var previewThumbnails: js.UndefOr[js.Array[Anon_Url]] = js.undefined
  /** If the attachment is an album, this property is a list of potential additional thumbnails from the album. */
  var thumbnails: js.UndefOr[js.Array[Anon_Description]] = js.undefined
  /** The link to the attachment, which should be of type text/html. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}


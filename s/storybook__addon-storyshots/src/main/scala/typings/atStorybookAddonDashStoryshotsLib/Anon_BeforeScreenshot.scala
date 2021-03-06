package typings
package atStorybookAddonDashStoryshotsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BeforeScreenshot extends js.Object {
  var beforeScreenshot: js.UndefOr[
    js.Function2[
      /* page */ puppeteerLib.puppeteerMod.Page, 
      /* options */ atStorybookAddonDashStoryshotsLib.atStorybookAddonDashStoryshotsMod.ImageSnapshotOptions, 
      js.Promise[scala.Unit]
    ]
  ] = js.undefined
  var chromeExecutablePath: js.UndefOr[java.lang.String] = js.undefined
  var getGotoOptions: js.UndefOr[
    js.Function1[
      /* options */ atStorybookAddonDashStoryshotsLib.atStorybookAddonDashStoryshotsMod.ImageSnapshotOptions, 
      puppeteerLib.puppeteerMod.NavigationOptions
    ]
  ] = js.undefined
  var getMatchOptions: js.UndefOr[
    js.Function1[
      /* options */ atStorybookAddonDashStoryshotsLib.atStorybookAddonDashStoryshotsMod.ImageSnapshotOptions, 
      Anon_FailureThreshold
    ]
  ] = js.undefined
  var getScreenshotOptions: js.UndefOr[
    js.Function1[
      /* options */ atStorybookAddonDashStoryshotsLib.atStorybookAddonDashStoryshotsMod.ImageSnapshotOptions, 
      puppeteerLib.puppeteerMod.ScreenshotOptions
    ]
  ] = js.undefined
  var storybookUrl: js.UndefOr[java.lang.String] = js.undefined
}


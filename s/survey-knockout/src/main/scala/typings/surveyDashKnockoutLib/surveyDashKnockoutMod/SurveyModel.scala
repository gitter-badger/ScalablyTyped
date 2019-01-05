package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- surveyDashKnockoutLib.surveyDashKnockoutMod.ISurvey because var conflicts: isLoadingFromJson. Inlined currentPage, pages, isPageStarted, pageVisibilityChanged, panelVisibilityChanged, questionVisibilityChanged, questionsOrder, questionAdded, panelAdded, questionRemoved, panelRemoved, questionRenamed, validateQuestion, validatePanel, hasVisibleQuestionByValueName, questionCountByValueName, processHtml, getSurveyMarkdownHtml, isDisplayMode, isDesignMode, areInvisibleElementsShowing, requiredText, getQuestionTitleTemplate, getUpdatedQuestionTitle, questionStartIndex, questionTitleLocation, questionErrorLocation, storeOthersAsComment, maxTextLength, maxOthersLength, clearValueOnDisableItems, uploadFiles, downloadFile, clearFiles, updateChoicesFromServer, updateQuestionCssClasses, updatePanelCssClasses, afterRenderQuestion, afterRenderPanel, afterRenderPage, matrixRowAdded, matrixBeforeRowAdded, matrixRowRemoved, matrixCellCreated, matrixAfterCellRender, matrixCellValueChanged, matrixCellValidate, dynamicPanelAdded, dynamicPanelRemoved, dynamicPanelItemValueChanged, dragAndDropAllow */ @JSImport("survey-knockout", "SurveyModel")
@js.native
class SurveyModel ()
  extends Base
     with ISurveyData
     with ISurveyImpl
     with ISurveyTriggerOwner
     with ILocalizableOwner
     with /* index */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  def this(jsonObj: js.Any) = this()
  /**
    * depricated, misspelling, use pageCount property
    */
  val PageCount: scala.Double = js.native
  val areInvisibleElementsShowing: scala.Boolean = js.native
  /**
    * Change this property from 'onNextPage' to 'onValueChanged' to check erorrs on every question value changing.
    * By default, library checks errors on changing current page to the next or on completing the survey.
    */
  var checkErrorsMode: java.lang.String = js.native
  /**
    * Set it to 'none' to include the invisible values into the survey data.
    * </br> Set it to 'onHidden' to clear the question value when it becomes invisible.
    * </br> Leave it equals to 'onComplete', to remove from data property values of invisible questions on survey complete. In this case, the invisible questions will not be stored on the server.
    * </br> The default value is 'onComplete'.
    * @see Question.visible
    * @see onComplete
    */
  var clearInvisibleValues: js.Any = js.native
  /**
    * Set this value to true, to clear value on disable items in checkbox, dropdown and radiogroup questions.
    * By default values are not cleared on disabled the corresponded items. This property is not persisted in survey json and you have to set it in code.
    */
  var clearValueOnDisableItems: scala.Boolean = js.native
  /**
    * Use this property as indentificator for a user, for example e-mail or unique customer id in your web application. If you are loading survey or posting survey results  from/to [dxsurvey.com](http://www.dxsurvey.com) service, then the library do not allow to run the same survey the second time. On the second run, the user will see the 'Thank you' page.
    */
  var clientId: java.lang.String = js.native
  /**
    * You may show comments input for the most of questions. The entered text in the comment input will be saved as 'question name' + 'commentPrefix'.
    * @see data
    */
  var commentPrefix: java.lang.String = js.native
  /**
    * Returns all comments from the data.
    * @see data
    */
  val comments: js.Any = js.native
  /**
    * A text that renders on the 'Complete' button. Set it to change the default text.
    * @see locale
    */
  var completeText: java.lang.String = js.native
  /**
    * The html that shows if the end user has already completed the survey.
    * @see clientId
    * @see locale
    */
  var completedBeforeHtml: java.lang.String = js.native
  /**
    * The html that shows on completed ('Thank you') page. Set it to change the default text.
    * @see showCompletedPage
    * @see locale
    */
  var completedHtml: java.lang.String = js.native
  val completedState: java.lang.String = js.native
  val completedStateText: java.lang.String = js.native
  /**
    * If the property is not empty, before starting to run the survey, the library checkes if the cookie with this name exists. If it is true, the survey goes to complete mode and an user sees the 'Thank you' page. On completing the survey the cookie with this name is created.
    */
  var cookieName: java.lang.String = js.native
  /**
    * Returns the current survey page. If survey is rendred then it is a page that a user can see/edit.
    */
  var currentPage: js.Any | IPage = js.native
  /**
    * The index of the current page in the visible pages array. It starts from 0.
    */
  var currentPageNo: scala.Double = js.native
  /**
    * An object that stores the survey results/data. You may set it directly as { 'question name': questionValue, ... }
    * @see setValue
    * @see getValue
    */
  var data: js.Any = js.native
  /**
    * Returns the text that renders when there is no any visible page and question.
    */
  val emptySurveyText: java.lang.String = js.native
  /**
    * Set this property to true, to make the first page your starting page. The end-user could not comeback to the start page and it is not count in the progress.
    */
  var firstPageIsStarted: scala.Boolean = js.native
  /**
    * On showing the next or previous page, a first input is focused, if the property set to true.
    */
  var focusFirstQuestionAutomatic: scala.Boolean = js.native
  /**
    * Set it to the one of the following constants if you want to go to the next page without pressing 'Next' button when all questions are anwered.
    * true - go next page and submit automatically
    * "autogonext" - go next page automatically but do not submit
    * false - do not go next page and not submit automatically
    * @see showNavigationButtons
    */
  var goNextPageAutomatic: scala.Boolean | surveyDashKnockoutLib.surveyDashKnockoutLibStrings.autogonext = js.native
  /**
    * Returns true, if a user has already completed the survey on this browser and there is a cookie about it. Survey goes to 'completed' state if the function returns true.
    * @see cookieName
    * @see setCookie
    * @see deleteCookie
    * @see state
    */
  val hasCookie: scala.Boolean = js.native
  /**
    * Returns true, if there is any error on the current page. For example, the required question is empty or a question validation is failed.
    * @see nextPage
    */
  val isCurrentPageHasErrors: scala.Boolean = js.native
  /**
    * Returns true if the survey in the design mode. It is used by SurveyJS Editor
    * @see setDesignMode
    */
  val isDesignMode: scala.Boolean = js.native
  /**
    * Returns true if the survey in the display mode.
    * @see mode
    */
  val isDisplayMode: scala.Boolean = js.native
  /**
    * Returns true if the survey in the edit mode.
    * @see mode
    */
  val isEditMode: scala.Boolean = js.native
  /**
    * Returns true if there is no any page in the survey. The survey is empty.
    */
  val isEmpty: scala.Boolean = js.native
  /**
    * Returns true if the current page is the first one.
    */
  val isFirstPage: scala.Boolean = js.native
  /**
    * Returns true if the current page is the last one.
    */
  val isLastPage: scala.Boolean = js.native
  /**
    * Returns true if navigation buttons: 'Prev', 'Next' or 'Complete' are shown.
    */
  val isNavigationButtonsShowing: scala.Boolean = js.native
  val isShowPrevButton: scala.Boolean = js.native
  val isShowProgressBarOnBottom: scala.Boolean = js.native
  val isShowProgressBarOnTop: scala.Boolean = js.native
  /**
    * Set this property to true, if you want to combine all your pages in one page. Pages will be converted into panels.
    */
  var isSinglePage: scala.Boolean = js.native
  val isTimerPanelShowingOnBottom: scala.Boolean = js.native
  val isTimerPanelShowingOnTop: scala.Boolean = js.native
  /**
    * Returns true, if at the current moment the question values on the current page are validating on the server.
    * @see onServerValidateQuestions
    */
  val isValidatingOnServer: scala.Boolean = js.native
  /**
    * The list of errors on loading survey json. If the list is empty after loading a json then the json is correct and there is no errors in it.
    * @see JsonError
    */
  var jsonErrors: js.Array[JsonError] = js.native
  /**
    * The html that shows on loading survey Json from the dxsurvey.com service.
    * @see surveyId
    * @see locale
    */
  var loadingHtml: java.lang.String = js.native
  val locCompleteText: LocalizableString = js.native
  val locCompletedBeforeHtml: LocalizableString = js.native
  val locCompletedHtml: LocalizableString = js.native
  val locLoadingHtml: LocalizableString = js.native
  val locPageNextText: LocalizableString = js.native
  val locPagePrevText: LocalizableString = js.native
  val locQuestionTitleTemplate: LocalizableString = js.native
  val locStartSurveyText: LocalizableString = js.native
  val locTitle: LocalizableString = js.native
  /**
    * Use it to change the survey locale. By default it is empty, 'en'. You may set it to 'de' - german, 'fr' - french and so on. The library has built-in localization for several languages. The library has a multi-language support as well.
    */
  var locale: java.lang.String = js.native
  /**
    * The default maximum length for question comments and others
    * The default value is 0, it is unlimited maxLength - 524288 characters: https://www.w3schools.com/tags/att_input_maxlength.asp
    * @see Question.hasComment
    * @see Question.hasOther
    * @see maxTextLength
    */
  var maxOthersLength: scala.Double = js.native
  /**
    * The default maximum length for questions like text and comment, including matrix cell questions.
    * The default value is 0, it is unlimited maxLength - 524288 characters: https://www.w3schools.com/tags/att_input_maxlength.asp
    * @see maxOthersLength
    */
  var maxTextLength: scala.Double = js.native
  /**
    * The maximum time in seconds that end-user has to complete the survey. If the value is 0 or less, the end-user has unlimited number of time to finish the survey.
    * @see startTimer
    * @see maxTimeToFinishPage
    */
  var maxTimeToFinish: scala.Double = js.native
  /**
    * The maximum time in seconds that end-user has to complete a page in the survey. If the value is 0 or less, the end-user has unlimited time. You may override this value for every page.
    * @see startTimer
    * @see maxTimeToFinish
    * @see PageModel.maxTimeToFinish
    */
  var maxTimeToFinishPage: scala.Double = js.native
  /**
    * Set this mode to 'display' to make the survey read-only. The default value is 'edit'.
    */
  var mode: java.lang.String = js.native
  /**
    * The event is fired right after a page is rendred in DOM. Use it to modify html elements. There are two parameters in options: options.currentPage, options.htmlElement
    * <br/> sender the survey object that fires the event
    * <br/> options.page a page object for which the event is fired. Typically the current/active page.
    * <br/> options.htmlElement an html element binded with the page object
    */
  var onAfterRenderPage: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired right after a panel is rendred in DOM. Use it to modify html elements. There are two parameters in options: options.panel, options.htmlElement
    * <br/> sender the survey object that fires the event
    * <br/> options.panel a panel object for which the event is fired
    * <br/> options.htmlElement an html element binded with the panel object
    */
  var onAfterRenderPanel: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired right after a question is rendred in DOM. Use it to modify html elements. There are two parameters in options: options.question, options.htmlElement
    * <br/> sender the survey object that fires the event
    * <br/> options.question a question object for which the event is fired
    * <br/> options.htmlElement an html element binded with the question object
    */
  var onAfterRenderQuestion: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired right after survey is rendered in DOM. options.htmlElement is the root element.
    * <br/> sender the survey object that fires the event
    * <br/> options.htmlElement a root html element binded with the survey object
    */
  var onAfterRenderSurvey: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired on clearing the value in QuestionFile. You may use it to remove files stored on your server. There are three properties in options: options.name, options.value and options.callback.
    * <br/> sender the survey object that fires the event
    * name: name, value: value
    * <br/> name the question name
    * <br/> value the question value
    * <br/> fileName of the removed file, pass null to clear all files
    * <br/> callback a call back function to get the status on clearing the files operation
    * @see clearFiles
    */
  var onClearFiles: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired after a user click on 'Complete' button and finished the survey. You may use it to send the data to your web server.
    * <br/> sender the survey object that fires the event
    * <br/> options.showDataSaving(text) call this method to show that the survey is saving the data on your server. The text is an optional parameter to show your message instead of default.
    * <br/> options.showDataSavingError(text) call this method to show that there is an error on saving the data on your server. If you want to show a custom error, use an optional text parameter.
    * <br/> options.showDataSavingSuccess(text) call this method to show that the data were successful saved on the server.
    * <br/> options.showDataSavingClear call this method to hide the text about the saving progress.
    * @see data
    * @see clearInvisibleValues
    * @see completeLastPage
    * @see surveyPostId
    */
  var onComplete: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired before the survey is completed and onComplete event is fired. You may prevent the survey from completing by setting options.allowComplete to false
    * <br/> sender the survey object that fires the event
    * <br/> options.allowComplete set it false to prevent the survey from completing. The default value is true.
    * @see onComplete
    */
  var onCompleting: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired when another page becomes the current. Typically it happens when a user click on 'Next' or 'Prev' buttons.
    * <br/> sender the survey object that fires the event
    * <br/> option.oldCurrentPage the previous current/active page
    * <br/> option.newCurrentPage a new current/active page
    * @see currentPage
    * @see currentPageNo
    * @see nextPage
    * @see prevPage
    * @see completeLastPage
    * @see onCurrentPageChanging
    */
  var onCurrentPageChanged: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired before another page becomes the current. Typically it happens when a user click on 'Next' or 'Prev' buttons.
    * <br/> sender the survey object that fires the event
    * <br/> option.oldCurrentPage the previous current/active page
    * <br/> option.newCurrentPage a new current/active page
    * <br/> option.allowChanging set it to false to disable the current page changing. It is true by default.
    * @see currentPage
    * @see currentPageNo
    * @see nextPage
    * @see prevPage
    * @see completeLastPage
    * @see onCurrentPageChanged
    **/
  var onCurrentPageChanging: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired on downloading the file in QuestionFile. You may use it to pass the file for the preview. There are four properties in options: options.name, options.content, optins.fileValue and options.callback.
    * <br/> sender the survey object that fires the event
    * name: name, content: content, fileValue: fileValue
    * <br/> name the question name
    * <br/> content the file content
    * <br/> fileValue single file question value
    * <br/> callback a call back function to get the status on downloading the file and the downloaded file content
    * @see downloadFile
    */
  var onDownloadFile: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * Use this event to control drag&drop operations during design mode.
    * <br/> sender the survey object that fires the event.
    * <br/> options.allow set it to false to disable dragging.
    * <br/> options.target a target element that is dragging.
    * <br/> options.source a source element. It can be null, if it is a new element, dragging from toolbox.
    * <br/> options.parent a page or panel where target element is dragging.
    * <br/> options.insertBefore an element before the target element is dragging. It can be null if parent container (page or panel) is empty or dragging an element under the last element of the container.
    * <br/> options.insertAfter an element after the target element is dragging. It can be null if parent container (page or panel) is empty or dragging element to the top of the parent container.
    * @see setDesignMode
    * @see isDesignMode
    */
  var onDragDropAllow: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired on adding a new panel in Panel Dynamic question.
    * <br/> sender the survey object that fires the event
    * <br/> options.question a panel question.
    * @see QuestionPanelDynamicModel
    * @see QuestionPanelDynamicModel.panels
    */
  var onDynamicPanelAdded: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired when item value is changed in Panel Dynamic question.
    * <br/> options.question - the panel question
    * <br/> options.panel - the dynamic panel item
    * <br/> options.name - the item name
    * <br/> options.value - a new value
    * <br/> options.itemIndex - the panel item index
    * <br/> options.itemValue - the panel item object
    * @see onDynamicPanelAdded
    * @see QuestionPanelDynamicModel
    */
  var onDynamicPanelItemValueChanged: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired on removing a panel from Panel Dynamic question.
    * <br/> sender the survey object that fires the event
    * <br/> options.question a panel question.
    * <br/> options.panelIndex a removed panel index.
    * @see QuestionPanelDynamicModel
    * @see QuestionPanelDynamicModel.panels
    */
  var onDynamicPanelRemoved: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * Use this event to change the question title in the code.
    * <br/> sender the survey object that fires the event
    * <br/> options.title a calcualted question title, based on question title, name, isRequired, visibleIndex (no)
    * <br/> options.question a question object.
    */
  var onGetQuestionTitle: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * Use it to get results after calling the getResult method. It returns a simple analytic from [dxsurvey.com](http://www.dxsurvey.com) service.
    * <br/> sender the survey object that fires the event
    * <br/> options.success it is true if the results were got from the service successful
    * <br/> options.data the object {AnswersCount, QuestionResult : {} }. AnswersCount is the number of posted survey results. QuestionResult is an object with all possible unique answers to the question and number of these answers.
    * <br/> options.dataList an array of objects {name, value}, where 'name' is an unique value/answer to the question and value is a number/count of such answers.
    * <br/> options.response the server response
    * @see getResult
    */
  var onGetResult: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * Use this event to define, if the answer on the question is correct or not.
    * <br/> sender the survey object that fires the event
    * <br/> options.question a question on which you have to decide if the answer is correct or not.
    * <br/> options.result return true, if the answer is correct or false if the answer is not correct. Use questions value and correctAnswer properties to return the correct value.
    * @see Question.value
    * @see Question.correctAnswer
    */
  var onIsAnswerCorrect: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired after choices for radiogroup, checkbox and dropdown has been loaded from the RESTful service and before they are assign to the question.
    * You may change the choices, before it was assign or disable/enabled make visible/invisible question, based on loaded results
    * <br/> question - the question where loaded choices are going to be assigned
    * <br/> choices - the loaded choices. You may change them to assign the correct one
    * <br> serverResult - a result that comes from the server as it is.
    */
  var onLoadChoicesFromServer: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired for every cell after is has been rendered in DOM.
    * <br/> options.question - the matrix question
    * <br/> options.cell - the matrix cell
    * <br/> options.cellQuestion - the question/editor in the cell.
    * <br/> options.htmlElement a html element binded with the cellQuestion object
    * <br/> options.column - the matrix column object
    * <br/> options.row - the matrix row object
    * @see onMatrixCellCreated
    * @see QuestionMatrixDynamicModel
    * @see QuestionMatrixDropdownModel
    */
  var onMatrixAfterCellRender: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired before adding a new row in Matrix Dynamic question.
    * <br/> sender the survey object that fires the event
    * <br/> options.question a matrix question.
    * <br/> options.canAddRow an allowing flag.
    * @see QuestionMatrixDynamicModel
    * @see QuestionMatrixDynamicModel.visibleRows
    */
  var onMatrixBeforeRowAdded: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired for every cell created in Matrix Dymic and Matrix Dropdown questions.
    * <br/> options.question - the matrix question
    * <br/> options.cell - the matrix cell
    * <br/> options.cellQuestion - the question/editor in the cell. You may customize it, change it's properties, like choices or visible.
    * <br/> options.rowValue - the value of the current row. To access the value of paticular column use: options.rowValue["columnValue"]
    * <br/> options.column - the matrix column object
    * <br/> options.columName - the matrix column name
    * <br/> options.row - the matrix row object
    * @see onMatrixBeforeRowAdded
    * @see onMatrixRowAdded
    * @see QuestionMatrixDynamicModel
    * @see QuestionMatrixDropdownModel
    */
  var onMatrixCellCreated: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired when Matrix Dymic and Matrix Dropdown questions validate the cell value.
    * <br/> options.question - the matrix question
    * <br/> options.columName - the matrix column name
    * <br/> options.value - a cell value
    * <br/> options.row - the matrix row object
    * <br/> options.getCellQuestion(columnName) - the function that returns the cell question by column name.
    * @see onMatrixBeforeRowAdded
    * @see onMatrixRowAdded
    * @see QuestionMatrixDynamicModel
    * @see QuestionMatrixDropdownModel
    */
  var onMatrixCellValidate: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired when cell value is changed in Matrix Dymic and Matrix Dropdown questions.
    * <br/> options.question - the matrix question
    * <br/> options.columName - the matrix column name
    * <br/> options.value - a new value
    * <br/> options.row - the matrix row object
    * <br/> options.getCellQuestion(columnName) - the function that returns the cell question by column name.
    * @see onMatrixBeforeRowAdded
    * @see onMatrixRowAdded
    * @see QuestionMatrixDynamicModel
    * @see QuestionMatrixDropdownModel
    */
  var onMatrixCellValueChanged: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired on adding a new row in Matrix Dynamic question.
    * <br/> sender the survey object that fires the event
    * <br/> options.question a matrix question.
    * @see QuestionMatrixDynamicModel
    * @see QuestionMatrixDynamicModel.visibleRows
    */
  var onMatrixRowAdded: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired on removing a row from Matrix Dynamic question.
    * <br/> sender the survey object that fires the event
    * <br/> options.question a matrix question.
    * <br/> options.rowIndex a removed row index.
    * <br/> options.row a removed row object.
    * @see QuestionMatrixDynamicModel
    * @see QuestionMatrixDynamicModel.visibleRows
    */
  var onMatrixRowRemoved: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired on adding a page into survey
    * <br/> sender the survey object that fires the event
    * <br/> options.page a newly added panel object.
    * @see PanelModel
    */
  var onPageAdded: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired on changing a page visibility.
    * <br/> sender the survey object that fires the event
    * <br/> options.page a page  which visibility has been changed
    * <br/> options.visible a page visible boolean value
    * @see PageModel.visibile
    * @see PageModel.visibileIf
    */
  var onPageVisibleChanged: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired on adding a panel into survey
    * <br/> sender the survey object that fires the event
    * <br/> options.panel a newly added panel object.
    * <br/> options.name a panel name
    * <br/> options.index a index of the panel in the container (page or panel)
    * <br/> options.parentPanel a container where question is located. It can be page or panel.
    * <br/> options.rootPanel typically it is a page.
    * @see PanelModel
    */
  var onPanelAdded: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired on removing a panel from survey
    * <br/> sender the survey object that fires the event
    * <br/> options.panel a removed panel object.
    * <br/> options.name a panel name
    * @see PanelModel
    */
  var onPanelRemoved: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired on changing a panel visibility.
    * <br/> sender the survey object that fires the event
    * <br/> options.panel a panel which visibility has been changed
    * <br/> options.visible a panel visible boolean value
    * @see PanelModel.visibile
    * @see PanelModel.visibileIf
    */
  var onPanelVisibleChanged: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired on clicking 'Next' page if sendResultOnPageNext is set to true. You may use it to save the intermediate results, for example, if your survey is large enough.
    * <br/> sender the survey object that fires the event
    * @see sendResultOnPageNext
    */
  var onPartialSend: Event[js.Function1[/* sender */ this.type, _], _] = js.native
  var onProcessHtml: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired on processing the text when it finds a text in brackets: {somevalue}. By default it uses the value of survey question values and variables.
    * For example, you may use the text processing in loading choices from the web. If your choicesByUrl.url equals to "UrlToServiceToGetAllCities/{country}/{state}",
    * you may set on this event options.value to "all" or empty string when the "state" value/question is non selected by a user.
    * <br/> name - the name of the processing value, for example, "state" in our example
    * <br/> value - the value of the processing text
    * <br/> isExists - a boolean value. Set it to true if you want to use the value and set it to false if you don't.
    */
  var onProcessTextValue: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired on adding a new question into survey.
    * 'question': question, 'name': question.name, 'index': index, 'parentPanel': parentPanel, 'rootPanel': rootPanel
    * <br/> sender the survey object that fires the event
    * <br/> options.question a newly added question object.
    * <br/> options.name a question name
    * <br/> options.index a index of the question in the container (page or panel)
    * <br/> options.parentPanel a container where question is located. It can be page or panel.
    * <br/> options.rootPanel typically it is a page.
    * @see Question
    */
  var onQuestionAdded: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired on removing a question from survey
    * <br/> sender the survey object that fires the event
    * <br/> options.question a removed question object.
    * <br/> options.name a question name
    * @see Question
    */
  var onQuestionRemoved: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event fires when it get response from the [dxsurvey.com](http://www.dxsurvey.com) service on saving survey results. Use it to find out if the results have been saved successful.
    * <br/> sender the survey object that fires the event
    * <br/> options.success it is true if the results were sent to the service successful
    * <br/> options.response a response from the service
    */
  var onSendResult: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * Use this event to validate data on your server.
    * <br/> sender the survey object that fires the event
    * <br/> options.data the values of all non-empty questions on the current page. You can get a question value as options.data["myQuestionName"].
    * <br/> options.errors set your errors to this object as: options.errors["myQuestionName"] = "Error text";. It will be shown as a question error.
    * <br/> options.complete() call this function to tell survey that your server callback has been processed.
    * @see onValidateQuestion
    * @see onValidatePanel
    */
  var onServerValidateQuestions: js.Any = js.native
  /**
    * The event is fired after the survey changed it's state from "starting" to "running". The "starting" state means that survey shows the started page.
    * The firstPageIsStarted property should be set to the true, if you want to have the started page in your survey. The end-user should click on the "Start" button to start the survey.
    * @see firstPageIsStarted
    */
  var onStarted: Event[js.Function1[/* sender */ this.type, _], _] = js.native
  /**
    * Use this event to process the markdown text.
    * <br/> sender the survey object that fires the event
    * <br/> options.element SurveyJS element where the string is going to be rendered. It is a question, panel, page or survey
    * <br/> options.text a text that is going to be rendered
    * <br/> options.html a html. It is null by default. Set it and survey will use it instead of options.text
    */
  var onTextMarkdown: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired every second if the method startTimer has been called.
    * @see startTimer
    * @see timeSpent
    * @see Page.timeSpent
    */
  var onTimer: Event[js.Function1[/* sender */ this.type, _], _] = js.native
  /**
    * The event is fired before displaying a new information in the Timer Panel. Use it to change the default text.
    * <br/> options.text - the timer panel info text.
    */
  var onTimerPanelInfoText: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired before rendering a panel or page. Use it to override the default panel/page css classes.
    * There are two parameters in options: options.panel and options.cssClasses
    * <br/> sender the survey object that fires the event
    * <br/> options.panel a panel for which you may change the css classes
    * <br/> options.cssClasses an object with css classes. For example {title: "sv_p_title", description: "small"}. You may change them to your own css classes.
    */
  var onUpdatePanelCssClasses: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired before rendering a question. Use it to override the default question css classes.
    * There are two parameters in options: options.question and options.cssClasses
    * <br/> sender the survey object that fires the event
    * <br/> options.question a question for which you may change the css classes
    * <br/> options.cssClasses an object with css classes. For example {root: "table", button: "button"}. You may change them to your own css classes.
    */
  var onUpdateQuestionCssClasses: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired on uploading the file in QuestionFile. You may use it to change the file name or tells the library do not accept the file. There are three properties in options: options.name, options.file and options.accept.
    * <br/> sender the survey object that fires the event
    * name: name, file: file, accept: accept
    * <br/> name the file name
    * <br/> file the Javascript File object
    * <br/> accept a boolean value, true by default. Set it to false to deny this file to upload
    * @see uploadFile
    */
  var onUploadFiles: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired on validating a panel. Set your error to options.error and survey will show the error for the panel and block completing the survey or going to the next page.
    * <br/> sender the survey object that fires the event
    * <br/> options.name a panel name
    * <br/> options.error an error string. It is empty by default.
    * @see onValidateQuestion
    */
  var onValidatePanel: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired on validating value in a question. Set your error to options.error and survey will show the error for the question and block completing the survey or going to the next page.
    * <br/> sender the survey object that fires the event
    * <br/> options.question a question
    * <br/> options.name a question name
    * <br/> options.value the current question value
    * <br/> options.error an error string. It is empty by default.
    * @see onServerValidateQuestions
    */
  var onValidateQuestion: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired when the question value is changed. It can be done via UI by a user or programmatically on calling setValue method.
    * Please use onDynamicPanelItemValueChanged and onMatrixCellValueChanged events to handle changes a question in the Panel Dynamic and a cell question in matrices.
    * <br/> sender the survey object that fires the event
    * <br/> options.name the value name that has been changed
    * <br/> options.question a question which question.name equals to the value name. If there are several questions with the same name, the first question is taken. If there is no such questions, the options.question is null.
    * <br/> options.value a new value
    * @see setValue
    * @see onValueChanging
    * @see onDynamicPanelItemValueChanged
    * @see onMatrixCellValueChanged
    */
  var onValueChanged: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired before the question value is changed. It can be done via UI by a user or programmatically on calling setValue method.
    * <br/> sender the survey object that fires the event
    * <br/> options.name the value name that has being changed
    * <br/> options.question a question which question.name equals to the value name. If there are several questions with the same name, the first question is taken. If there is no such questions, the options.question is null.
    * <br/> options.value a new value. You may change it
    * @see setValue
    * @see onValueChanged
    */
  var onValueChanging: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  /**
    * The event is fired on changing a question visibility.
    * <br/> sender the survey object that fires the event
    * <br/> options.question a question which visibility has been changed
    * <br/> options.name a question name
    * <br/> options.visible a question visible boolean value
    * @see Question.visibile
    * @see Question.visibileIf
    */
  var onVisibleChanged: Event[js.Function2[/* sender */ this.type, /* options */ _, _], _] = js.native
  var origionalPages: js.Any = js.native
  /**
    * Returns the survey pages count.
    * @see visiblePageCount
    * @see pages
    */
  val pageCount: scala.Double = js.native
  /**
    * A text that renders on the 'Next' button. Set it to change the default text.
    * @see locale
    */
  var pageNextText: java.lang.String = js.native
  /**
    * A text that renders on the 'Prev' button. Set it to change the default text.
    * @see locale
    */
  var pagePrevText: java.lang.String = js.native
  /**
    * The list of all pages in the survey, including invisible.
    * @see PageModel
    * @see visiblePages
    */
  val pages: js.Array[IPage | PageModel] = js.native
  val platformName: java.lang.String = js.native
  /**
    * Returns the html showing that the user has already completed the survey
    * @see completedHtml
    */
  val processedCompletedBeforeHtml: java.lang.String = js.native
  /**
    * Returns the html for completed 'Thank you' page.
    * @see completedHtml
    */
  val processedCompletedHtml: java.lang.String = js.native
  /**
    * Returns the html that shows on loading the json.
    */
  val processedLoadingHtml: java.lang.String = js.native
  /**
    * Returns the text/html that renders as survey title.
    */
  val processedTitle: java.lang.String = js.native
  /**
    * Returns the text for the current progress.
    */
  val progressText: java.lang.String = js.native
  /**
    * Set this property to 'bottom' to show question error(s) under the question.
    */
  var questionErrorLocation: java.lang.String = js.native
  /**
    * By default the first question index is 1. You may start it from 100 or from 'A', by setting 100 or 'A' to this property.
    * @see Question.title
    * @see requiredText
    */
  var questionStartIndex: java.lang.String = js.native
  /**
    * Set this property to 'bottom' or 'left' to show question title under the question or on the left.
    * <br/><b>Note:</b> Some questions, for example matrixes, do not support 'left' value. The title for them will be displayed on the top.
    */
  var questionTitleLocation: java.lang.String = js.native
  /**
    * A template for a question title.
    * @see QuestionModel.title
    */
  var questionTitleTemplate: java.lang.String = js.native
  /**
    * Use this property to randomize questions. Set it to 'random' to randomize questions, 'initial' to keep them in the same order. You can randomize questions on a specific page.
    * @see SurveyPage.questionsOrder
    */
  var questionsOrder: java.lang.String = js.native
  /**
    * A char/string that will be rendered in the title required questions.
    * @see Question.title
    */
  var requiredText: java.lang.String = js.native
  /**
    * Set it to true, to save results on completing every page. onPartialSend event is fired.
    * @see onPartialSend
    * @see clientId
    */
  var sendResultOnPageNext: scala.Boolean = js.native
  /**
    * On finishing the survey the 'Thank you', page on complete, is shown. Set the property to false, to hide the 'Thank you' page.
    * @see data
    * @see onComplete
    */
  var showCompletedPage: scala.Boolean = js.native
  /**
    * Set this property to true, to show all elements in the survey, regardless their visibility. It is false by default.
    */
  var showInvisibleElements: scala.Boolean = js.native
  /**
    * Set it to false to hide 'Prev', 'Next' and 'Complete' buttons. It makes sense if you are going to create a custom navigation or have just one page or on setting goNextPageAutomatic property.
    * @see goNextPageAutomatic
    * @see showPrevButton
    */
  var showNavigationButtons: scala.Boolean = js.native
  /**
    * Set this property to false to turn off the numbering on pages titles.
    */
  var showPageNumbers: scala.Boolean = js.native
  /**
    * Set it to false to hide page titles.
    * @see PageModel.title
    */
  var showPageTitles: scala.Boolean = js.native
  /**
    * Set it to false to hide the 'Prev' to disable for end-users go back to their answers.
    * @see showNavigationButtons
    */
  var showPrevButton: scala.Boolean = js.native
  /**
    * Set this property to "top" to show the progress bar on the bottom or to "bottom" to show it on the bottom.
    */
  var showProgressBar: java.lang.String = js.native
  /**
    * Set this property to "off" to turn off the numbering on questions titles or "onpage" to start numbering on every page. The default value is "on".
    */
  var showQuestionNumbers: java.lang.String = js.native
  /**
    * Set it to 'top' or 'bottom' if you want to show the Panel with information about how much time the end-user spent of the survey/page.
    * If the value doesn't equal 'none' then survey calls startTimer() method on survey rendering.
    * @see showTimerPanelMode
    * @see startTimer
    * @see stopTimer
    */
  var showTimerPanel: java.lang.String = js.native
  /**
    * Set this property to 'page' or 'survey' to show the timer information for page or survey only.
    * Use onTimerPanelInfoText event to change the default text.
    * @see showTimerPanel
    * @see onTimerPanelInfoText
    */
  var showTimerPanelMode: java.lang.String = js.native
  /**
    * Set it to false hide survey title.
    * @see title
    */
  var showTitle: scala.Boolean = js.native
  /**
    * A text that renders on the 'Start' button. Set it to change the default text.
    * The start button is shown on the started page. You have to set firstPageIsStarted property to true, to have the started page.
    * @see firstPageIsStarted
    * @see locale
    */
  var startSurveyText: java.lang.String = js.native
  /**
    * Returns the started Page. firstPageIsStarted property should be equals to true
    * @see firstPageIsStarted
    */
  val startedPage: PageModel = js.native
  /**
    * Returns the current survey state: 'loading' - loading from the json, 'completed' - a user has completed the survey,
    * 'starting' - the started page is showing, running' - a user answers a questions right now, 'empty' - there is nothing to show in the current survey.
    */
  val state: java.lang.String = js.native
  /**
    * By default the entered text in the others input in the checkbox/radiogroup/dropdown are stored as "question name " + "-Comment". The value itself is "question name": "others". Set this property to false, to store the entered text directly in the "question name" key.
    * @see commentPrefix
    */
  var storeOthersAsComment: scala.Boolean = js.native
  /**
    * Set this property to automatically load survey Json from [dxsurvey.com](http://www.dxsurvey.com) service.
    * @see loadSurveyFromService
    */
  var surveyId: java.lang.String = js.native
  /**
    * Set this property to automatically save the data into the [dxsurvey.com](http://www.dxsurvey.com) service.
    * @see onComplete
    * @see surveyShowDataSaving
    */
  var surveyPostId: java.lang.String = js.native
  /**
    * Set this property to true, to show the progress on saving/sending data into the [dxsurvey.com](http://www.dxsurvey.com) service.
    * @see surveyPostId
    */
  var surveyShowDataSaving: scala.Boolean = js.native
  /**
    * Returns the time in seconds end-user spends on the survey
    * @see startTimer
    * @see PageModel.timeSpent
    */
  var timeSpent: scala.Double = js.native
  val timerInfoText: java.lang.String = js.native
  /**
    * Survey title.
    */
  var title: java.lang.String = js.native
  /**
    * The list of triggers in the survey.
    * @see SurveyTrigger
    */
  var triggers: js.Array[SurveyTrigger] = js.native
  /**
    * Returns the survey visible pages count
    * @see pageCount
    * @see visiblePages
    */
  val visiblePageCount: scala.Double = js.native
  /**
    * Returns the list of visible pages. If all pages are visible then it is the same as pages property.
    * @see pages
    * @see PageModel.visible
    * @see PageModel.visibleIf
    */
  val visiblePages: js.Array[PageModel] = js.native
  /**
    * Creates a new page and adds it into the survey. Genarates a new name if the name parameter is not set.
    * @param name a page name
    * @see addPage
    */
  def addNewPage(): PageModel = js.native
  def addNewPage(name: java.lang.String): PageModel = js.native
  /**
    * Add a page into the survey
    * @param page
    * @see addNewPage
    */
  def addPage(page: PageModel): scala.Unit = js.native
  def afterRenderPage(htmlElement: js.Any): scala.Unit = js.native
  @JSName("afterRenderPage")
  def afterRenderPage_Any(htmlElement: js.Any): js.Any = js.native
  def afterRenderPanel(panel: IElement, htmlElement: js.Any): scala.Unit = js.native
  @JSName("afterRenderPanel")
  def afterRenderPanel_Any(panel: IElement, htmlElement: js.Any): js.Any = js.native
  def afterRenderQuestion(question: IQuestion, htmlElement: js.Any): scala.Unit = js.native
  @JSName("afterRenderQuestion")
  def afterRenderQuestion_Any(question: IQuestion, htmlElement: js.Any): js.Any = js.native
  /* protected */ def afterRenderSurvey(htmlElement: js.Any): scala.Unit = js.native
  /**
    * Clear the survey data and state. If the survey has a 'completed' state, it will have a 'running' state.
    * @param clearData clear the data
    * @param gotoFirstPage make the first page as a current page.
    * @see data
    * @see state
    * @see currentPage
    */
  def clear(): scala.Unit = js.native
  def clear(clearData: scala.Boolean): scala.Unit = js.native
  def clear(clearData: scala.Boolean, gotoFirstPage: scala.Boolean): scala.Unit = js.native
  /**
    * Clear files from server
    * @param name question name
    * @param value file question value
    * @param callback a call back function to get the status of the clearing operation
    */
  def clearFiles(
    name: java.lang.String,
    value: js.Any,
    fileName: java.lang.String,
    callback: js.Function2[/* status */ java.lang.String, /* data */ js.Any, _]
  ): scala.Unit = js.native
  @JSName("clearFiles")
  def clearFiles_Any(
    name: java.lang.String,
    value: js.Any,
    fileName: java.lang.String,
    clearCallback: js.Function2[/* status */ java.lang.String, /* data */ js.Any, _]
  ): js.Any = js.native
  /**
    * Call this function to remove all question values from the survey, that end-user will not be able to enter.
    * For example the value that doesn't exists in a radigroup/dropdown/checkbox choices or matrix rows/columns.
    * Please note, this function doesn't clear values for invisible questions or values that doesn't associated with questions.
    * In fact this function just call clearIncorrectValues function of all questions in the survery
    * @see Question.clearIncorrectValues
    * @see Page.clearIncorrectValues
    * @see Panel.clearIncorrectValues
    */
  def clearIncorrectValues(): scala.Unit = js.native
  /**
    * Remove the value from the survey result.
    * @param {string} name The name of the value. Typically it is a question name
    */
  def clearValue(name: java.lang.String): scala.Unit = js.native
  /**
    * Call it to complete the survey, if the current page is the last one. It returns false if there is an error on the page. If there is no errors on the page, it calls doComplete and returns true.
    * @see isCurrentPageHasErrors
    * @see nextPage
    * @see doComplete
    */
  def completeLastPage(): scala.Boolean = js.native
  /* CompleteClass */
  override def copyTriggerValue(name: java.lang.String, fromName: java.lang.String): js.Any = js.native
  /* protected */ def createNewPage(name: java.lang.String): PageModel = js.native
  /* protected */ def createSurveyService(): dxSurveyService = js.native
  /* protected */ def currentPageChanged(newValue: PageModel, oldValue: PageModel): scala.Unit = js.native
  /* protected */ def currentPageChanging(newValue: PageModel, oldValue: PageModel): scala.Boolean = js.native
  /**
    * Delete the cookie with cookieName in the browser.
    * @see cookieName
    * @see hasCookie
    * @see setCookie
    */
  def deleteCookie(): scala.Unit = js.native
  def deleteDataValueCore(valuesHash: js.Any, key: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def doComplete(): js.Any = js.native
  /* protected */ def doNextPage(): scala.Unit = js.native
  /* protected */ def doOnPageAdded(page: PageModel): scala.Unit = js.native
  /* protected */ def doServerValidation(): scala.Boolean = js.native
  /* protected */ def doSurveyValueChanged(question: IQuestion, newValue: js.Any): scala.Unit = js.native
  /* protected */ def doTimer(): scala.Unit = js.native
  def downloadFile(
    name: java.lang.String,
    content: java.lang.String,
    callback: js.Function2[/* status */ java.lang.String, /* data */ js.Any, _]
  ): js.Any = js.native
  /**
    * Download the file from server
    * @param name question name
    * @param fileValue single file question value
    * @param callback a call back function to get the status on downloading the file and the downloaded file content
    */
  def downloadFile(
    questionName: java.lang.String,
    fileValue: js.Any,
    callback: js.Function2[/* status */ java.lang.String, /* data */ js.Any, _]
  ): scala.Unit = js.native
  def dragAndDropAllow(options: js.Any): scala.Boolean = js.native
  def dynamicPanelAdded(question: IQuestion): scala.Unit = js.native
  @JSName("dynamicPanelAdded")
  def dynamicPanelAdded_Any(question: IQuestion): js.Any = js.native
  def dynamicPanelItemValueChanged(question: IQuestion, options: js.Any): scala.Unit = js.native
  @JSName("dynamicPanelItemValueChanged")
  def dynamicPanelItemValueChanged_Any(question: IQuestion, options: js.Any): js.Any = js.native
  def dynamicPanelRemoved(question: IQuestion, panelIndex: scala.Double): scala.Unit = js.native
  @JSName("dynamicPanelRemoved")
  def dynamicPanelRemoved_Any(question: IQuestion, panelIndex: scala.Double): js.Any = js.native
  /**
    * Set the input focus to the first question with the input.
    */
  def focusFirstQuestion(): scala.Unit = js.native
  /* CompleteClass */
  override def geSurveyData(): ISurveyData = js.native
  /**
    * Returns the list of all panels in the survey
    */
  def getAllPanels(): js.Array[IPanel] = js.native
  def getAllPanels(visibleOnly: scala.Boolean): js.Array[IPanel] = js.native
  def getAllPanels(visibleOnly: scala.Boolean, includingDesignTime: scala.Boolean): js.Array[IPanel] = js.native
  /**
    * Returns the list of all questions in the survey
    * @param visibleOnly set it true, if you want to get only visible questions
    */
  def getAllQuestions(): js.Array[IQuestion] = js.native
  def getAllQuestions(visibleOnly: scala.Boolean): js.Array[IQuestion] = js.native
  def getAllQuestions(visibleOnly: scala.Boolean, includingDesignTime: scala.Boolean): js.Array[IQuestion] = js.native
  /* CompleteClass */
  override def getAllValues(): js.Any = js.native
  /* CompleteClass */
  override def getComment(name: java.lang.String): java.lang.String = js.native
  /**
    * Returns the number of corrected answers on quiz
    */
  def getCorrectedAnswerCount(): scala.Double = js.native
  def getCorrectedAnswers(): scala.Double = js.native
  def getDataValueCore(valuesHash: js.Any, key: java.lang.String): js.Any = js.native
  /* CompleteClass */
  override def getFilteredProperties(): js.Any = js.native
  /* CompleteClass */
  override def getFilteredValues(): js.Any = js.native
  /**
    * Returns the number of incorrected answers on quiz
    */
  def getInCorrectedAnswerCount(): scala.Double = js.native
  def getInCorrectedAnswers(): scala.Double = js.native
  def getLocString(str: java.lang.String): js.Any = js.native
  /* CompleteClass */
  override def getLocale(): java.lang.String = js.native
  /* CompleteClass */
  override def getMarkdownHtml(text: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def getObjects(pages: js.Array[java.lang.String], questions: js.Array[java.lang.String]): js.Array[_] = js.native
  def getPage(index: scala.Double): PageModel = js.native
  /**
    * Returns a page on which an element (question or panel) is placed.
    * @param element Question or Panel
    */
  def getPageByElement(element: IElement): PageModel = js.native
  /**
    * Returns a page by it's name.
    * @param name
    */
  def getPageByName(name: java.lang.String): PageModel = js.native
  /**
    * Returns a page on which a question is located
    * @param question
    */
  def getPageByQuestion(question: IQuestion): PageModel = js.native
  /**
    * Rertuns a list of pages by their names
    * @param names a list of pages names
    */
  def getPagesByNames(names: js.Array[java.lang.String]): js.Array[PageModel] = js.native
  /**
    * Returns a panel by its name
    * @param name a panel name
    * @param caseInsensitive
    * @see getQuestionByName
    */
  def getPanelByName(name: java.lang.String): IPanel = js.native
  def getPanelByName(name: java.lang.String, caseInsensitive: scala.Boolean): IPanel = js.native
  /**
    * Returns survey result data as an array of plain objects: with question title, name, value and displayValue.
    * For complex questions (like matrix, etc.) isNode flag is set to true and data contains array of nested objects (rows)
    * set options.includeEmpty to false if you want to skip empty answers
    */
  def getPlainData(): js.Array[_] = js.native
  def getPlainData(options: surveyDashKnockoutLib.Anon_IncludeEmpty): js.Array[_] = js.native
  /* CompleteClass */
  override def getProcessedText(text: java.lang.String): java.lang.String = js.native
  /**
    * Returns the progress that a user made by answering on the survey.
    */
  def getProgress(): scala.Double = js.native
  /**
    * Returns a question by its name
    * @param name a question name
    * @param caseInsensitive
    * @see getQuestionByValueName
    */
  def getQuestionByName(name: java.lang.String): IQuestion = js.native
  def getQuestionByName(name: java.lang.String, caseInsensitive: scala.Boolean): IQuestion = js.native
  /**
    * Returns a question by its value name
    * @param valueName a question name
    * @param caseInsensitive
    * @see getQuestionByName
    * @see Question.valueName
    */
  def getQuestionByValueName(valueName: java.lang.String): IQuestion = js.native
  def getQuestionByValueName(valueName: java.lang.String, caseInsensitive: scala.Boolean): IQuestion = js.native
  /**
    * Returns the question title template
    * @see questionTitleTemplate
    * @see QuestionModel.title
    */
  def getQuestionTitleTemplate(): java.lang.String = js.native
  /**
    * Get a list of questions by their names
    * @param names the array of names
    * @param caseInsensitive
    */
  def getQuestionsByNames(names: js.Array[java.lang.String]): js.Array[IQuestion] = js.native
  def getQuestionsByNames(names: js.Array[java.lang.String], caseInsensitive: scala.Boolean): js.Array[IQuestion] = js.native
  /**
    * Returns quiz questions. All visible questions that has input(s) widgets.
    */
  def getQuizQuestions(): js.Array[IQuestion] = js.native
  /**
    * It calls the [dxsurvey.com](http://www.dxsurvey.com) service and on callback fires onGetResult event with all answers that your users made for a question.
    * @param resultId [dxsurvey.com](http://www.dxsurvey.com) service resultId
    * @param name The question name
    * @see onGetResult
    */
  def getResult(resultId: java.lang.String, name: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def getSurvey(): ISurvey = js.native
  def getSurveyMarkdownHtml(element: Base, text: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def getTextProcessor(): ITextProcessor = js.native
  /* protected */ def getUnbindValue(value: js.Any): js.Any = js.native
  def getUpdatedQuestionTitle(question: IQuestion, title: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def getValue(name: java.lang.String): js.Any = js.native
  /**
    * Returns a variable value. Variable, unlike values, are not stored in the survey results.
    * @param name A variable name
    * @see SetVariable
    */
  def getVariable(name: java.lang.String): js.Any = js.native
  def hasVisibleQuestionByValueName(valueName: java.lang.String): scala.Boolean = js.native
  def isPageStarted(page: IPage): scala.Boolean = js.native
  /**
    * Loads the survey Json from the [dxsurvey.com](http://www.dxsurvey.com) service. If clientId is not null and user has already completed the survey, the survey will go into "completedbefore" state.
    * @param surveyId [dxsurvey.com](http://www.dxsurvey.com) service surveyId
    * @param clientId indentificator for a user, for example e-mail or unique customer id in your web application.
    * @see state
    */
  def loadSurveyFromService(): scala.Unit = js.native
  def loadSurveyFromService(surveyId: java.lang.String): scala.Unit = js.native
  def loadSurveyFromService(surveyId: java.lang.String, cliendId: java.lang.String): scala.Unit = js.native
  def matrixAfterCellRender(question: IQuestion, options: js.Any): scala.Unit = js.native
  @JSName("matrixAfterCellRender")
  def matrixAfterCellRender_Any(question: IQuestion, options: js.Any): js.Any = js.native
  def matrixBeforeRowAdded(options: js.Any): scala.Unit = js.native
  def matrixBeforeRowAdded(options: surveyDashKnockoutLib.Anon_Question): js.Any = js.native
  def matrixCellCreated(question: IQuestion, options: js.Any): scala.Unit = js.native
  @JSName("matrixCellCreated")
  def matrixCellCreated_Any(question: IQuestion, options: js.Any): js.Any = js.native
  def matrixCellValidate(question: IQuestion, options: js.Any): SurveyError = js.native
  def matrixCellValueChanged(question: IQuestion, options: js.Any): scala.Unit = js.native
  @JSName("matrixCellValueChanged")
  def matrixCellValueChanged_Any(question: IQuestion, options: js.Any): js.Any = js.native
  def matrixRowAdded(question: IQuestion): scala.Unit = js.native
  @JSName("matrixRowAdded")
  def matrixRowAdded_Any(question: IQuestion): js.Any = js.native
  def matrixRowRemoved(question: IQuestion, rowIndex: scala.Double, row: js.Any): scala.Unit = js.native
  @JSName("matrixRowRemoved")
  def matrixRowRemoved_Any(question: IQuestion, rowIndex: scala.Double, row: js.Any): js.Any = js.native
  def mergeValues(src: js.Any, dest: js.Any): scala.Unit = js.native
  /**
    * Call it to go to the next page. It returns false, if it is the last page. If there is an error, for example required question is empty, the function returns false as well.
    * @see isCurrentPageHasErrors
    * @see prevPage
    * @see completeLastPage
    */
  def nextPage(): scala.Boolean = js.native
  /* protected */ def notifyQuestionOnValueChanged(valueName: java.lang.String, newValue: js.Any): scala.Unit = js.native
  /* protected */ def onBeforeCreating(): scala.Unit = js.native
  /* protected */ def onCreating(): scala.Unit = js.native
  /* protected */ def onFirstPageIsStartedChanged(): scala.Unit = js.native
  /* protected */ def onIsSinglePageChanged(): scala.Unit = js.native
  /* protected */ def onIsValidatingOnServerChanged(): scala.Unit = js.native
  /* protected */ def onLoadSurveyFromService(): scala.Unit = js.native
  /* protected */ def onLoadingSurveyFromService(): scala.Unit = js.native
  /* protected */ def onLocaleChanged(): scala.Unit = js.native
  def pageVisibilityChanged(page: IPage, newValue: scala.Boolean): scala.Unit = js.native
  @JSName("pageVisibilityChanged")
  def pageVisibilityChanged_Any(page: IPage, newValue: scala.Boolean): js.Any = js.native
  def panelAdded(panel: IElement, index: scala.Double, parentPanel: js.Any, rootPanel: js.Any): scala.Unit = js.native
  @JSName("panelAdded")
  def panelAdded_Any(panel: IElement, index: scala.Double, parentPanel: js.Any, rootPanel: js.Any): js.Any = js.native
  def panelRemoved(panel: IElement): scala.Unit = js.native
  @JSName("panelRemoved")
  def panelRemoved_Any(panel: IElement): js.Any = js.native
  def panelVisibilityChanged(panel: IPanel, newValue: scala.Boolean): scala.Unit = js.native
  @JSName("panelVisibilityChanged")
  def panelVisibilityChanged_Any(panel: IPanel, newValue: scala.Boolean): js.Any = js.native
  /**
    * Call it to go to the previous page. It returns false if the current page is the first page already. It doesn't perform any checks, required questions can be empty.
    * @see isFirstPage
    */
  def prevPage(): scala.Boolean = js.native
  def processHtml(html: java.lang.String): java.lang.String = js.native
  def processText(text: java.lang.String, returnDisplayValue: scala.Boolean): java.lang.String = js.native
  def processTextEx(text: java.lang.String, returnDisplayValue: scala.Boolean, doEncoding: scala.Boolean): js.Any = js.native
  def questionAdded(question: IQuestion, index: scala.Double, parentPanel: js.Any, rootPanel: js.Any): scala.Unit = js.native
  @JSName("questionAdded")
  def questionAdded_Any(question: IQuestion, index: scala.Double, parentPanel: js.Any, rootPanel: js.Any): js.Any = js.native
  def questionCountByValueName(valueName: java.lang.String): scala.Double = js.native
  /* protected */ def questionOnValueChanging(valueName: java.lang.String, newValue: js.Any): js.Any = js.native
  def questionRemoved(question: IQuestion): scala.Unit = js.native
  @JSName("questionRemoved")
  def questionRemoved_Any(question: IQuestion): js.Any = js.native
  def questionRenamed(question: IQuestion, oldName: java.lang.String, oldValueName: java.lang.String): js.Any = js.native
  def questionVisibilityChanged(question: IQuestion, newValue: scala.Boolean): scala.Unit = js.native
  @JSName("questionVisibilityChanged")
  def questionVisibilityChanged_Any(question: IQuestion, newValue: scala.Boolean): js.Any = js.native
  /**
    * Remove the page from the survey
    * @param page
    */
  def removePage(page: PageModel): scala.Unit = js.native
  def scrollToTopOnPageChange(): scala.Unit = js.native
  /**
    * Send the survey result into [dxsurvey.com](http://www.dxsurvey.com) service.
    * @param postId [dxsurvey.com](http://www.dxsurvey.com) service postId
    * @param clientId Typically a customer e-mail or an identificator
    * @param isPartialCompleted Set it to true if the survey is not completed yet and it is an intermediate results
    * @see surveyPostId
    * @see clientId
    */
  def sendResult(): scala.Unit = js.native
  def sendResult(postId: java.lang.String): scala.Unit = js.native
  def sendResult(postId: java.lang.String, clientId: java.lang.String): scala.Unit = js.native
  def sendResult(postId: java.lang.String, clientId: java.lang.String, isPartialCompleted: scala.Boolean): scala.Unit = js.native
  /* CompleteClass */
  override def setComment(name: java.lang.String, newValue: java.lang.String): js.Any = js.native
  /* protected */ def setCompleted(): scala.Unit = js.native
  /* protected */ def setCompletedState(value: java.lang.String, text: java.lang.String): scala.Unit = js.native
  /**
    * Set the cookie with cookieName in the browser. It is done automatically on survey complete if cookieName is not empty.
    * @see cookieName
    * @see hasCookie
    * @see deleteCookie
    */
  def setCookie(): scala.Unit = js.native
  def setDataValueCore(valuesHash: js.Any, key: java.lang.String, value: js.Any): scala.Unit = js.native
  /**
    * Call it to set the survey into the design mode.
    * @param value use true to set the survey into the design mode.
    */
  def setDesignMode(value: scala.Boolean): scala.Unit = js.native
  def setJsonObject(jsonObj: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def setTriggerValue(name: java.lang.String, value: js.Any, isVariable: scala.Boolean): js.Any = js.native
  /* CompleteClass */
  override def setValue(name: java.lang.String, newValue: js.Any): js.Any = js.native
  /**
    * Sets a variable value. Variable, unlike values, are not stored in the survey results.
    * @param name A variable name
    * @param newValue
    * @see GetVariable
    */
  def setVariable(name: java.lang.String, newValue: js.Any): scala.Unit = js.native
  /**
    * Start the survey. Change the mode from "starting" to "running". You need to call it, if there is a started page in your survey, otherwise it does nothing.
    * @see firstPageIsStarted
    */
  def start(): scala.Unit = js.native
  /**
    * Call this method to start timer that will calculate how much time end-user spends on the survey or on pages
    * @see stopTimer
    * @see timeSpent
    */
  def startTimer(): scala.Unit = js.native
  def startTimerFromUI(): scala.Unit = js.native
  /**
    * Stop the timer.
    * @see startTimer
    * @see timeSpent
    */
  def stopTimer(): scala.Unit = js.native
  /* protected */ def tryGoNextPageAutomatic(name: java.lang.String): scala.Unit = js.native
  def updateChoicesFromServer(question: IQuestion, choices: js.Array[_ | ItemValue], serverResult: js.Any): js.Array[ItemValue] = js.native
  /* protected */ def updateCustomWidgets(page: PageModel): scala.Unit = js.native
  def updatePanelCssClasses(panel: IPanel, cssClasses: js.Any): scala.Unit = js.native
  @JSName("updatePanelCssClasses")
  def updatePanelCssClasses_Any(panel: IPanel, cssClasses: js.Any): js.Any = js.native
  def updateQuestionCssClasses(question: IQuestion, cssClasses: js.Any): scala.Unit = js.native
  @JSName("updateQuestionCssClasses")
  def updateQuestionCssClasses_Any(question: IQuestion, cssClasses: js.Any): js.Any = js.native
  /**
    * Upload the file into server
    * @param name question name
    * @param file uploading file
    * @param storeDataAsText set it to true to encode file content into the survey results
    * @param uploadingCallback a call back function to get the status on uploading the file
    */
  def uploadFiles(
    name: java.lang.String,
    files: js.Array[stdLib.File],
    uploadingCallback: js.Function2[/* status */ java.lang.String, /* data */ js.Any, _]
  ): scala.Unit = js.native
  /* protected */ def uploadFilesCore(
    name: java.lang.String,
    files: js.Array[stdLib.File],
    uploadingCallback: js.Function2[/* status */ java.lang.String, /* data */ js.Any, _]
  ): scala.Unit = js.native
  @JSName("uploadFiles")
  def uploadFiles_Any(
    name: java.lang.String,
    files: js.Array[stdLib.File],
    uploadingCallback: js.Function2[/* status */ java.lang.String, /* data */ js.Any, _]
  ): js.Any = js.native
  def validatePanel(panel: IPanel): SurveyError = js.native
  def validateQuestion(question: IQuestion): SurveyError = js.native
}

@JSImport("survey-knockout", "SurveyModel")
@js.native
object SurveyModel extends js.Object {
  var platform: java.lang.String = js.native
}


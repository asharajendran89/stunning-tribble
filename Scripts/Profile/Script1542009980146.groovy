import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.comment('STEPS TO CLICK ON UPDATE PROFILE OF LOGGED IN USER')

'Click on drow-arrow icon on top right corner'
WebUI.click(findTestObject('Object Repository/Page_Dashboard/i_arrow_drop_down'))

'Click \'Profile\''
WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Profile'))

'Click \'Create\''
WebUI.click(findTestObject('Object Repository/Page_User Profile/i_create'))

'Verify profile update page '
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Basic Info/a_Basic Info'), 0)


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

'Address 1'
WebUI.setText(findTestObject('Object Repository/Page_Basic Info/textarea__addr1'), '#1/2 ,5th A Cross ')

WebUI.comment('TO UPDATE BASIC INFORMATION OF LOGGED IN USER ')

'Address 2'
WebUI.setText(findTestObject('Object Repository/Page_Basic Info/textarea__addr2'), 'Subbanna Garden , Vijayanagar')

'City'
WebUI.setText(findTestObject('Object Repository/Page_Basic Info/input_Address line 2_city'), 'Bengaluru')

'State'
WebUI.setText(findTestObject('Object Repository/Page_Basic Info/input__state'), 'Karnataka')

'Pin-code'
WebUI.setText(findTestObject('Object Repository/Page_Basic Info/input__pin'), '560040')

'Emergency Contact Number'
WebUI.setText(findTestObject('Object Repository/Page_Basic Info/input__emergencyContact'), '8123258018')

'Emergency Contact Number'
WebUI.setText(findTestObject('Object Repository/Page_Basic Info/input__emergencyContactRelatio'), 'Father')

'Click \'Update\' button'
WebUI.click(findTestObject('Object Repository/Page_Basic Info/button_Update'))


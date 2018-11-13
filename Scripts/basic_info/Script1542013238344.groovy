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

WebUI.comment('TO UPDATE BASIC INFORMATION OF LOGGED IN USER ')

'Address 1'
WebUI.setText(findTestObject('Page_Basic Info/textarea__addr1'), findTestData('basic_info').getValue(1, 
        1))

'Address 2'
WebUI.setText(findTestObject('Page_Basic Info/textarea__addr2'), findTestData('basic_info').getValue(2, 
        1))

'City'
WebUI.setText(findTestObject('Page_Basic Info/input_Address line 2_city'), findTestData('basic_info').getValue(
        3, 1))

'State'
WebUI.setText(findTestObject('Page_Basic Info/input__state'), findTestData('basic_info').getValue(4, 1))

'Pin-code'
WebUI.setText(findTestObject('Page_Basic Info/input__pin'), findTestData('basic_info').getValue(5, 1))

'Emergency Contact Number'
WebUI.setText(findTestObject('Page_Basic Info/input__emergencyContact'), findTestData('basic_info').getValue(
        6, 1))

'Emergency Contact Relationship'
WebUI.setText(findTestObject('Page_Basic Info/input__emergencyContactRelatio'), findTestData('basic_info').getValue(
        7, 1))

'Click \'Update\' button'
WebUI.click(findTestObject('Page_Basic Info/button_Update'))

WebUI.delay(5)


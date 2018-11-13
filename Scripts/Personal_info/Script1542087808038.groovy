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

WebUI.comment('TEST CASE TO UPDATE LOGGED IN USER PRSONAL INFORMATION ')

'Click "Personal Information\' tab\r\n\r\n'
WebUI.click(findTestObject('Page_Personal Info/a_Personal Information'))

'Enter \'Father\'s Name\'\r\n'
WebUI.setText(findTestObject('Page_Personal Info/input_Update_fatherName'), findTestData('personal_info').getValue(1, 1))

'Enter \'Pan Number\'\r\n'
WebUI.setText(findTestObject('Page_Personal Info/input_Blood Group_panNo'), findTestData('personal_info').getValue(2, 1))

'Enter \'Adhar Number\''
WebUI.setText(findTestObject('Page_Personal Info/input__adharNo'), findTestData('personal_info').getValue(3, 1))

'Enter \'Driving Licesen No\''
WebUI.setText(findTestObject('Page_Personal Info/input__drivingLicenceNo'), findTestData('personal_info').getValue(4, 1))

'Enter \'Passport Number\''
WebUI.setText(findTestObject('Page_Personal Info/input_Driving Licence No_passp'), findTestData('personal_info').getValue(
        5, 1))

'Click \'Update\' button'
WebUI.click(findTestObject('Page_Personal Info/button_Update'))

WebUI.delay(5)


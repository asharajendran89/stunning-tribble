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

WebUI.comment('TEST TO UPDATE ACCOUNT INFORMATION OF LOGGED IN USER')

'Click \'Account Information\' tab\r\n'
WebUI.click(findTestObject('Page_Account Info/a_Account Information'))

'Enter \'Bank Name\''
WebUI.setText(findTestObject('Page_Account Info/input_Update_nameOfBank'), findTestData('account_info').getValue(1, 1))

'Enter \'Name as per Bank \''
WebUI.setText(findTestObject('Page_Account Info/input__name'), findTestData('account_info').getValue(2, 1))

'Enter \'Account Number\''
WebUI.setText(findTestObject('Page_Account Info/input__accountNo'), findTestData('account_info').getValue(3, 1))

WebUI.click(findTestObject('Page_Account Info/button_Update'))

WebUI.delay(5)


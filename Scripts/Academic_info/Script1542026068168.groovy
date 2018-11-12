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

WebUI.comment('TO UPDATE LOGGED IN USER ACADEMIC INFORMATION ')

'Click \'Academic Inforomation\' tab'
WebUI.click(findTestObject('Page_Academic Info/a_Academic Information'))

'Enter \'Qualification\''
WebUI.setText(findTestObject('Page_Academic Info/input_CGPAPercentage_qualifica'), 'B.E')

'Enter \'Degree\''
WebUI.setText(findTestObject('Page_Academic Info/input_CGPAPercentage_degree'), 'UG')

'Enter \'Specialization\''
WebUI.setText(findTestObject('Page_Academic Info/input_CGPAPercentage_specializ'), 'COMPUTER SCIENCE')

'Enter \'Name Of The Institution\''
WebUI.setText(findTestObject('Page_Academic Info/input_CGPAPercentage_nameOfThe'), 'VTU')

'Enter \'University\''
WebUI.setText(findTestObject('Page_Academic Info/input_CGPAPercentage_universit'), 'VISES')

'Enter \'Year Of Passing\''
WebUI.setText(findTestObject('Page_Academic Info/input_CGPAPercentage_text-cent'), '2012')

'Enter \'Percentage\''
WebUI.setText(findTestObject('Page_Academic Info/input_CGPAPercentage_percentage'), '90.00')

'Click \'Update\' button'
WebUI.click(findTestObject('Page_Academic Info/button_Update'))

WebUI.delay(5)


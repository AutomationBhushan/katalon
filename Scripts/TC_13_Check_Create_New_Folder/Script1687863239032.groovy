import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('TC_01_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('KSD/Page_Product FAQs/button_Accept All Cookies'))

WebUI.click(findTestObject('Object Repository/KSD/Page_Project Folder Landing Page/Page_Product FAQs/i_OK_fal fa-folder'))

WebUI.scrollToElement(findTestObject('Object Repository/KSD/Page_Project Folder Landing Page/Page_Project Folder Landing Page/h2_Create new folder'), 
    0)

WebUI.click(findTestObject('Object Repository/KSD/Page_Project Folder Landing Page/Page_Project Folder Landing Page/h2_Create new folder'))

WebUI.setText(findTestObject('Object Repository/KSD/Page_Project Folder Landing Page/Page_Project Folder Landing Page/input_Folder Name_create-folder-name'), 
    'test folder')

WebUI.setText(findTestObject('Object Repository/KSD/Page_Project Folder Landing Page/Page_Project Folder Landing Page/textarea_Project Folder Details_create-note'), 
    'test folder Description')

WebUI.click(findTestObject('Object Repository/KSD/Page_Project Folder Landing Page/Page_Project Folder Landing Page/button_Create Folder'))

WebUI.verifyElementVisible(findTestObject('Object Repository/KSD/Page_Project Folder Landing Page/Page_Project Folder Landing Page/h2_test folder'))

WebUI.click(findTestObject('Object Repository/KSD/Page_Project Folder Landing Page/Page_Project Folder Landing Page/i_test folder_fal fa-trash-alt'))

WebUI.click(findTestObject('Object Repository/KSD/Page_Project Folder Landing Page/Page_Project Folder Landing Page/button_Delete Folder'))

WebUI.verifyElementNotPresent(findTestObject('Object Repository/KSD/Page_Project Folder Landing Page/Page_Project Folder Landing Page/h2_test folder'), 
    0)


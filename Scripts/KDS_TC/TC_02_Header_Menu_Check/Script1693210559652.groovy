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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.studiokohler.com/en-us/faqs')

WebUI.maximizeWindow()

WebUI.verifyElementVisible(findTestObject('Object Repository/KSD/Page_Product FAQs/a_Products'))

WebUI.verifyElementVisible(findTestObject('Object Repository/KSD/Page_Product FAQs/a_Resources'))

WebUI.verifyElementVisible(findTestObject('Object Repository/KSD/Page_Product FAQs/a_Services'))

WebUI.verifyElementVisible(findTestObject('Object Repository/KSD/Page_Product FAQs/a_Inspiration'))

WebUI.click(findTestObject('Object Repository/KSD/Page_Product FAQs/button_OK'))

WebUI.verifyElementVisible(findTestObject('Object Repository/KSD/Page_Product FAQs/a_Events'))

WebUI.verifyElementVisible(findTestObject('Object Repository/KSD/Page_Product FAQs/a_About'))

WebUI.verifyElementVisible(findTestObject('Object Repository/KSD/Page_Product FAQs/a_India'))

WebUI.verifyElementVisible(findTestObject('Object Repository/KSD/Page_Product FAQs/i_OK_fal fa-folder'))

WebUI.verifyElementVisible(findTestObject('Object Repository/KSD/Page_Product FAQs/i_OK_fal fa-map-marker-alt'))

WebUI.verifyElementVisible(findTestObject('Object Repository/KSD/Page_Product FAQs/i_OK_fal fa-user'))

WebUI.verifyElementVisible(findTestObject('Object Repository/KSD/Page_Product FAQs/i_Project Folder_fal fa-search'))

WebUI.verifyElementVisible(findTestObject('Object Repository/KSD/Page_Product FAQs/img_OK_black-version logo_js'))

WebUI.takeScreenshotAsCheckpoint('Header Menu')

WebUI.closeBrowser()


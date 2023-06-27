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

WebUI.callTestCase(findTestCase('TC_03_Search_Functionality'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/KSD/Page_Search Results/span_Search Results for Toilets'))

WebUI.verifyElementVisible(findTestObject('Object Repository/KSD/Page_Search Results/span_Products'))

WebUI.verifyElementVisible(findTestObject('Object Repository/KSD/Page_Search Results/span_Technical Specifications'))

WebUI.verifyElementVisible(findTestObject('Object Repository/KSD/Page_Search Results/span_Articles'))

WebUI.verifyElementVisible(findTestObject('Object Repository/KSD/Page_Search Results/div_Choose Category'))

WebUI.verifyElementVisible(findTestObject('Object Repository/KSD/Page_Search Results/a_All Categories (129)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/KSD/Page_Search Results/a_Relevancy'))


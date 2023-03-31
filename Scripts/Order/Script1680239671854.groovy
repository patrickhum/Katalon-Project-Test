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

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.click(findTestObject('Object Repository/Page_Food Order Service/button_Order Now (1)'))

WebUI.setText(findTestObject('Object Repository/Page_/input_email (1)'), 'pat@example.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_password (1)'), '4nvbrPglk7k=')

WebUI.click(findTestObject('Object Repository/Page_/button_Log in (1)'))

WebUI.click(findTestObject('Object Repository/Page_/button_Appetizer (1)'))

WebUI.click(findTestObject('Object Repository/Page_/Add to cart (1)'))

WebUI.click(findTestObject('Object Repository/Page_/Cart'))

WebUI.click(findTestObject('Object Repository/Page_/a_'))

WebUI.click(findTestObject('Object Repository/Page_/button_Place Order (1)'))

WebUI.setText(findTestObject('Object Repository/Page_/input_Delivery Address (1)'), 'camt')

WebUI.click(findTestObject('Object Repository/Page_/button_Locate (1)'))


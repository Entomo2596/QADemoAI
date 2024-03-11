package katalon.truetest

import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
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

public class TrueTestScripts {
    
    public static void login() {
        try {
            
            WebUI.openBrowser('')
            
            WebUI.maximizeWindow()
            
            WebUI.navigateToUrl(GlobalVariable.URL)
            
            //WebUI.click(findTestObject('Object Repository/Healthscreening/Page_Health Screening/Page_Health Screening/Page_My Sejahtera CheckIns/button_Tutup'))
            WebUI.setText(findTestObject('Object Repository/Healthscreening/Page_Health Screening/Page_Health Screening/Page_My Sejahtera CheckIns/input_Email Address_username'),
            'nanthakumar27@gmail.com')
            
            WebUI.delay(25)
            
            WebUI.click(findTestObject('Object Repository/Healthscreening/Page_Health Screening/Page_Health Screening/Page_My Sejahtera CheckIns/input_Email Address_login'))
            
            WebUI.setEncryptedText(findTestObject('Object Repository/Healthscreening/Page_Health Screening/Page_Health Screening/Page_My Sejahtera CheckIns/input_Password_password'),
            'Dx0po2/VQxGQPhgoys3RJQ==')
            
            WebUI.delay(4)
            
            WebUI.click(findTestObject('Object Repository/Healthscreening/Page_Health Screening/Page_Health Screening/Page_My Sejahtera CheckIns/input_Email Address_login'))
            
            WebUI.delay(5)
            
            WebUI.click(findTestObject('Object Repository/Healthscreening/Page_Health Screening/Page_Health Screening/Page_My Sejahtera/Page_MyVAS Home/h5_Health Screening'),
            FailureHandling.STOP_ON_FAILURE)
        } catch(Exception e) {
            if (e.getCause() instanceof WebElementNotFoundException) {
                KeywordUtil.logInfo(e.getMessage())
                KeywordUtil.markWarning(e.getMessage())
            } else {
                throw e
            }
        }
    }
}



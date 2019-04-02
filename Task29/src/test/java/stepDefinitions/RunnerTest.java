package stepDefinitions;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import pageObjects.AbstractPage;
import pageObjects.MailBoxPage;
import webDriver.Singleton;

import java.io.File;
import java.io.IOException;


@CucumberOptions(features = {"src/test/resources/features/"},
        tags = {"@Run"})
public class RunnerTest extends AbstractTestNGCucumberTests {

    @BeforeClass(alwaysRun = true)
    public void getWebDriver() {
        AbstractPage abstractPage = new AbstractPage();
        abstractPage.getWebDriver();
    }

    @Before(value="~@ignoreHookBefore",order=1)
    public void getWebDriver1() {
        AbstractPage abstractPage = new AbstractPage();
        abstractPage.getWebDriver();
    }

   @After(value = "~@ignoreHookAfter",order = 2)
    public void afterScenario() {
        MailBoxPage mailBoxPage = new MailBoxPage(Singleton.getSingletoneWebDriver());
        mailBoxPage.quitFromMail();
    }

    @After(value = "~@ignoreHookAfterClass",order = 3)
    public void afterSClass() {
        Singleton.getSingletoneWebDriver().quit();
    }

    @AfterClass(alwaysRun = true)
    public static void closeResources() {
        Singleton.getSingletoneWebDriver().quit();
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            File scrFile = ((TakesScreenshot) Singleton.getSingletoneWebDriver()).getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(scrFile, new File("C:\\1\\29"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
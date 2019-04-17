package Test_Lesson3;

import Library.ScreenshotTaking;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;


public class SignUpForFreeButtonWithScreenshootTest
{
    WebDriver driver;

    @BeforeMethod
    public void applicationSetup()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\stepanyuk\\IdeaProjects\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://leantesting.com/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Test
    public void buttonTest() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div/div/main/div[1]/div/div[1]/a")).click();
        Thread.sleep(5000);

        Assert.assertTrue(driver.getTitle().contains("Register a CrowdTesting account"));
        System.out.println("SignUpForFree button submit successfully");
    }

    @AfterMethod
    public void endTest(ITestResult result)
    {
        if (ITestResult.FAILURE==result.getStatus()) {
            ScreenshotTaking screen = new ScreenshotTaking();
            screen.screenShotCapture(result.getName());
        }

        driver.close();
    }

    }
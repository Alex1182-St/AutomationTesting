package Test_Lesson3;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class PageSwitch {

    public WebDriver driver;
    public String chromeDriverPath = "C:\\Users\\stepanyuk\\IdeaProjects\\chromedriver_win32\\chromedriver.exe";


    @BeforeMethod
    public void applicationSetup () {
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://itc.ua/articles/ubisoft-v-ukraine-igrovye-studii-ubisoft-kiev-i-ubisoft-odesa/");

    }

    @Test
    public void linkTest ()  {

        // Store the current window handle
        String winHandleBefore = driver.getWindowHandle();

        // Perform the click operation that opens new window
        WebElement link = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[2]/main[1]/article[1]/div[1]/div[2]/p[4]/a[1]"));
        link.click();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        // Switch to new window opened
        for(String handle : driver.getWindowHandles()){
            driver.switchTo().window(handle); }

        String currentURL = driver.getCurrentUrl();

        Assert.assertEquals(currentURL,"https://itc.ua/articles/assassin-s-creed-odyssey-lyudi-kak-bogi/");


        // Switch back to original browser (first window)
        driver.switchTo().window(winHandleBefore);
    }

    @AfterMethod
    public void browserClose ()
    { driver.close();
    }
}

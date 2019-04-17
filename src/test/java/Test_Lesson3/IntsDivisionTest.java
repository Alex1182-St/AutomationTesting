package Test_Lesson3;

import Lesson3.A1_Methods.IntsDivision;
import Library.ScreenshotTaking;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IntsDivisionTest {

    IntsDivision newDivision = new IntsDivision();



    @Test
    public void testDivisionMethod() {

        newDivision.setA(10);
        newDivision.getA();
        newDivision.setB(5);
        newDivision.getB();

        Assert.assertEquals(3.0, newDivision.divisionMethod());
    }

    @AfterMethod
    public void endTest(ITestResult result)
    {
        if (ITestResult.FAILURE==result.getStatus()) {
            ScreenshotTaking screen = new ScreenshotTaking();
            screen.screenShotCapture(result.getName());
        }
    }

}
package Test_Lesson3;

import Lesson3.A1_Methods.SumOfNumbsInString;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SumOfNumbsInStringTest {


    SumOfNumbsInString newTestSNIS = new SumOfNumbsInString();

    @Test
    public void testNumbsSumInString() {

        String a = "123FFFttt1";

        Assert.assertEquals(7, newTestSNIS.numbsSumInString(a));


    }
}
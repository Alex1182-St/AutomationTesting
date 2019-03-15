package Test_Lesson3;
import Lesson3.A1_Methods.ArabicToRoman;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestArabicToRoman {

    ArabicToRoman testArabicToRoman = new ArabicToRoman();

    @Test

    public void testAtR () throws Exception {
        Assert.assertEquals("MCMXCIX", testArabicToRoman.arabToRom(1999));
    }

}
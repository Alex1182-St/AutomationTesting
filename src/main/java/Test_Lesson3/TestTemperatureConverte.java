package Test_Lesson3;

import Lesson3.A1_Methods.TemperatureConverter;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTemperatureConverte {


    TemperatureConverter testTempConverter = new TemperatureConverter();

    @Test
    public void testTempC () {
        Assert.assertEquals("-273.15", testTempConverter.tempConvert());

    }

}

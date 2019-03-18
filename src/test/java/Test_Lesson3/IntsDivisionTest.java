package Test_Lesson3;

import Lesson3.A1_Methods.IntsDivision;
import org.testng.Assert;
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

        Assert.assertEquals(2.0, newDivision.divisionMethod());
    }


}
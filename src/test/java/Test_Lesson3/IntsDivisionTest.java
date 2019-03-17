package Test_Lesson3;

import Lesson3.A1_Methods.IntsDivision;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IntsDivisionTest {

    IntsDivision newDivision = new IntsDivision();

    @Test
    public void testSetA() {

        Assert.assertEquals(10, newDivision.setA(10));
    }

    @Test
    public void testGetA() {

        Assert.assertEquals(10, newDivision.getA());
    }

    @Test
    public void testSetB() {
    }

    @Test
    public void testGetB() {
    }


    @Test
    public void testDivisionMethod() {

        Assert.assertEquals(2, newDivision.divisionMethod());
    }
}
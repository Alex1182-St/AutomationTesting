package Test_Lesson3;

import Lesson3.A1_Methods.MultiplicationArrayList;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;


public class MultiplicationArrayListTest {

    MultiplicationArrayList newTest = new MultiplicationArrayList();

    @Test
    public void testArrayMult() {

        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(5);

        int mult = 2;

        ArrayList<Integer> result = new ArrayList<>();
        result.add(2);
        result.add(4);
        result.add(10);

        Assert.assertEquals(result,newTest.arrayMult(arr1,mult));

    }
}
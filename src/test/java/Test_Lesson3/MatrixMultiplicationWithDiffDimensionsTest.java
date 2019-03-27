package Test_Lesson3;


import org.testng.Assert;
import org.testng.annotations.Test;

import static Lesson3.Training_Source_Library.MatrixMultiplicationWithDiffDimensions.matrixMultiplay;


public class MatrixMultiplicationWithDiffDimensionsTest {

// без обьекта класса, потому, что метод static в MatrixMultiplicationWithDiffDimensions

    @Test
    public void testMatrixMultiplay() {

        double [][] matrix1 = {{1,2},{3,4},{5,6}};
        double [][] matrix2 = {{3,5,7,9},{2,4,6,8}};
        double [][] result1 = {{7,13,19,25},{17,31,45,59},{27,49,71,93}};

        double [][] result2 = matrixMultiplay(matrix1,matrix2);

        for (int i = 0; i < result2.length; i++) {
            for (int j = 0; j < result2[i].length; j++) {
                Assert.assertEquals(result1[i][j],result2[i][j]);
            }

    }
}}
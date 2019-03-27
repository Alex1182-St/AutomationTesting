package Lesson3.Training_Source_Library;

import static Lesson3.Training_Source_Library.MatrixMultiplicationWithDiffDimensions.matrixMultiplay;

public class MatrixMultiplication {


    public static void main(String[] args) {

        double [][] matrix1 = {{1,2},{3,4},{5,6}};
        double [][] matrix2 = {{3,5,7,9},{2,4,6,8}};


        double[][] result = matrixMultiplay(matrix1,matrix2); // без обьекта класса, потому, что метод static в MatrixMultiplicationWithDiffDimensions


        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length ; j++) {
                System.out.println(result[i][j]);
            }

}}}

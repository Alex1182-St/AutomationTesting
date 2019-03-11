package Lesson3.A1_Methods;

public class MatrixSum {

    public int [][] sumOfMatrix (int matrix1 [][], int matrix2 [] []) {


        int matrixSum [][] = new int[matrix1.length][matrix1[0].length];

        for (int i = 0; i < matrix1.length ; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {

             matrixSum [i][j] = matrix1 [i][j] + matrix2 [i][j];

            }
        }
        return matrixSum;

    }




}

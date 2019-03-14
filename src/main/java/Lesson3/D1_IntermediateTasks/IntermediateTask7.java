package Lesson3.D1_IntermediateTasks;

import Lesson3.A1_Methods.MatrixSum;
import Lesson3.A1_Methods.TaskDescriptionRead;

import java.io.IOException;


public class IntermediateTask7 {

    public static void main(String[] args) throws IOException {

        String taskDescriptionPath = "C:\\Users\\stepanyuk\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\IntermediateTask7.txt";
        int m1 [][] = {{1, 2, 3}, {1, 5, 7}};
        int m2 [][] = {{3, 5, 5}, {5, 5, 3}};


        System.out.println("\nTask7. Intermediate level");
        TaskDescriptionRead TaskDescription31 = new TaskDescriptionRead();
        TaskDescription31.taskDescriptionReading(taskDescriptionPath);

        MatrixSum mSum = new MatrixSum();
        int m3 [] [] = mSum.sumOfMatrix(m1, m2);

        System.out.println("\nSum of the matrices:");


        for (int i = 0; i < m3.length ; i++) {
            for (int j = 0; j < m3[i].length; j++)

                System.out.print(m3[i][j] + "\t");
                System.out.println();

    }}}


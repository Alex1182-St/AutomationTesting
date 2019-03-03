package Lesson3;

import Lesson3.Methods.*;

import java.io.IOException;
import java.util.ArrayList;

public class PreIntermediateTask8 {

    public static void main(String[] args) throws IOException {

        String taskDescriptionPath = "C:\\Users\\oleks\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\PreIntermediateTask8.txt";
        int fiboLength = 100;


        System.out.println("Task8. PreIntermediate level");
        TaskDescriptionRead TaskDescription8 = new TaskDescriptionRead();
        TaskDescription8.taskDescriptionReading(taskDescriptionPath);

        FibonacciArray newFiboArr = new FibonacciArray();
        newFiboArr.fiboArr(fiboLength);
        System.out.println("\nYour Fibonacci sequence is \n" + newFiboArr.fiboArr(fiboLength));
        OddNumbersArr newOddarr = new OddNumbersArr();
        newOddarr.oddArr(newFiboArr.fiboArr(fiboLength));
        ArrayList<Integer> newFibOddArr = newOddarr.oddArr(newFiboArr.fiboArr(fiboLength));
        System.out.println("\nYour odd numbers from Fibonacci are \n" + newFibOddArr);
        ArrElementsSum newOddsum = new ArrElementsSum();
        newOddsum.arrSum(newFibOddArr);
        System.out.println("\nSum of odd numbers of Fibonacci sequence is \n" + newOddsum.arrSum(newFibOddArr));

    }}


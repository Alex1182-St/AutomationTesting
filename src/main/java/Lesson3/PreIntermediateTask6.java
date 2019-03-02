package Lesson3;

import Lesson3.Methods.*;

import java.io.IOException;

public class PreIntermediateTask6 {

    public static void main(String[] args) throws IOException {

        String taskDescriptionPath = "C:\\Users\\oleks\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\PreIntermediateTask6.txt";
        String arrayDataAddress = "C:\\Users\\oleks\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\ArrayData4.xlsx";



        System.out.println("Task6. PreIntermediate level");
        TaskDescriptionRead TaskDescription4 = new TaskDescriptionRead();
        TaskDescription4.taskDescriptionReading(taskDescriptionPath);
        IntArrayListFromExcel newArr = new IntArrayListFromExcel();
        newArr.arrListIntCreat(arrayDataAddress);
        System.out.println("\nYour array is " + newArr.arrListIntCreat(arrayDataAddress));
        ArrElementsSum newSum = new ArrElementsSum();
        System.out.println("\n Elements sum - " + newSum.arrSum(newArr.arrListIntCreat(arrayDataAddress)));
        ArrElementsAverage newAverage = new ArrElementsAverage();
        System.out.println("\n Elements average - " + newAverage.arrAverage(newArr.arrListIntCreat(arrayDataAddress)));
    }}


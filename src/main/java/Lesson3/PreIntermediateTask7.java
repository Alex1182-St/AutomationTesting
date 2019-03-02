package Lesson3;

import Lesson3.Methods.*;

import java.io.IOException;

public class PreIntermediateTask7 {

    public static void main(String[] args) throws IOException {

        String taskDescriptionPath = "C:\\Users\\oleks\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\PreIntermediateTask7.txt";
        String arrayDataAddress = "C:\\Users\\oleks\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\ArrayData4.xlsx";


        System.out.println("Task7. PreIntermediate level");
        TaskDescriptionRead TaskDescription7 = new TaskDescriptionRead();
        TaskDescription7.taskDescriptionReading(taskDescriptionPath);
        IntArrayListFromExcel newArr = new IntArrayListFromExcel();
        newArr.arrListIntCreat(arrayDataAddress);
        System.out.println("\nYour array is " + newArr.arrListIntCreat(arrayDataAddress));
        ArrMaxMinMultiplication multMaxMin = new ArrMaxMinMultiplication();
        System.out.println("\nMax element multiplication by 2 - " + multMaxMin.maxMult(newArr.arrListIntCreat(arrayDataAddress)));
        System.out.println("\nMin element multiplication by 2 -  " + multMaxMin.minMult(newArr.arrListIntCreat(arrayDataAddress)));


    }}


package Lesson3.C1_PreIntermediateTasks;


import Lesson3.A1_Methods.IntArrayListFromExcel;
import Lesson3.A1_Methods.SecondHalfArray;
import Lesson3.A1_Methods.TaskDescriptionRead;

import java.io.IOException;

public class PreIntermediateTask4 {

    public static void main(String[] args) throws IOException {

        String taskDescriptionPath = "C:\\Users\\stepanyuk\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\BeginnerTask4.txt";
        String arrayDataAddress = "C:\\Users\\stepanyuk\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\ArrayData3.xlsx";

        System.out.println("Task4. PreIntermediate level");
        TaskDescriptionRead TaskDescription4 = new TaskDescriptionRead();
        TaskDescription4.taskDescriptionReading(taskDescriptionPath);
        IntArrayListFromExcel newArr = new IntArrayListFromExcel();
        newArr.arrListIntCreat(arrayDataAddress);
        System.out.println("\nYour array is " + newArr.arrListIntCreat(arrayDataAddress));
        SecondHalfArray arrHlf = new SecondHalfArray();
        arrHlf.arrHalf(newArr.arrListIntCreat(arrayDataAddress));
    }}


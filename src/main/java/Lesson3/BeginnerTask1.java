package Lesson3;

import java.io.IOException;

public class BeginnerTask1 {

    public static void main(String[] args) throws IOException {

        String taskDescriptionPath = "C:\\Users\\stepanyuk\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\BeginnerTask1.txt";
        String arrayDataAddress = "C:\\Users\\stepanyuk\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\ArrayData1.xlsx";

        System.out.println("Task1. Beginner level");
        TaskDescriptionRead TaskDescription1 = new TaskDescriptionRead();
        TaskDescription1.taskDescriptionReading(taskDescriptionPath);
        IntArrayListFromExcel arrFromExcelFile = new IntArrayListFromExcel();
        arrFromExcelFile.arrListIntCreat(arrayDataAddress);
        System.out.println("\nFirst array is\n" + arrFromExcelFile.arrListIntCreat(arrayDataAddress));
        MultiplicationArrayByInt multiplicationResult = new MultiplicationArrayByInt();
        System.out.println("\nResult is\n" + multiplicationResult.arrayMult(arrFromExcelFile.arrListIntCreat(arrayDataAddress),3));



    }}


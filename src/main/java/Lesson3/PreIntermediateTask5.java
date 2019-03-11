package Lesson3;

import Lesson3.Methods.FindPresenceNmInArr;
import Lesson3.Methods.IntArrayListFromExcel;

import Lesson3.Methods.TaskDescriptionRead;

import java.io.IOException;

public class PreIntermediateTask5 {

    public static void main(String[] args) throws IOException {

        String taskDescriptionPath = "C:\\Users\\oleks\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\PreIntermediateTask5.txt";
        String arrayDataAddress = "C:\\Users\\oleks\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\ArrayData4.xlsx";
        int nm1 = 7;
        int nm2 = 9;


        System.out.println("Task5. PreIntermediate level");
        TaskDescriptionRead TaskDescription4 = new TaskDescriptionRead();
        TaskDescription4.taskDescriptionReading(taskDescriptionPath);
        IntArrayListFromExcel newArr = new IntArrayListFromExcel();
        newArr.arrListIntCreat(arrayDataAddress);
        System.out.println("\nYour array is " + newArr.arrListIntCreat(arrayDataAddress));

        FindPresenceNmInArr findObj = new FindPresenceNmInArr();

         System.out.println("Presence of numbers: " + findObj.checkForNm(newArr.arrListIntCreat(arrayDataAddress), nm1, nm2));
    }}


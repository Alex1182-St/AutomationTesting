package Lesson3;

import Lesson3.Methods.EvenNumbers;
import Lesson3.Methods.IntArrayListFromExcel;
import Lesson3.Methods.TaskDescriptionRead;

import java.io.IOException;

public class BeginnerTask6 {

    public static void main(String[] args) throws IOException {

        String taskDescriptionPath = "C:\\Users\\stepanyuk\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\BeginnerTask6.txt";
        String arrPath = "C:\\Users\\stepanyuk\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\ArrayRange_0-50.xlsx";

        System.out.println("Task6. Beginner level");
        TaskDescriptionRead TaskDescription4 = new TaskDescriptionRead();
        TaskDescription4.taskDescriptionReading(taskDescriptionPath);
        IntArrayListFromExcel rangeArray = new IntArrayListFromExcel();
        rangeArray.arrListIntCreat(arrPath);
        EvenNumbers newEvens = new EvenNumbers();
        newEvens.returnEven(rangeArray.arrListIntCreat(arrPath));
        newEvens.returnEven2(rangeArray.arrListIntCreat(arrPath));


    }





}

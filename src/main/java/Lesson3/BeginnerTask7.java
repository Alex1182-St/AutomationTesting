package Lesson3;

import Lesson3.Methods.IntArrayListFromExcel;
import Lesson3.Methods.MaxNumInArrList;
import Lesson3.Methods.TaskDescriptionRead;

import java.io.IOException;

public class BeginnerTask7 {

    public static void main(String[] args) throws IOException {

        String taskDescriptionPath = "C:\\Users\\stepanyuk\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\BeginnerTask7.txt";
        String arrPath = "C:\\Users\\stepanyuk\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\ArrayData3.xlsx";

        System.out.println("Task7. Beginner level");
        TaskDescriptionRead TaskDescription4 = new TaskDescriptionRead();
        TaskDescription4.taskDescriptionReading(taskDescriptionPath);
        IntArrayListFromExcel rangeArray = new IntArrayListFromExcel();
        rangeArray.arrListIntCreat(arrPath);
        MaxNumInArrList maxNum = new MaxNumInArrList();
        maxNum.returnMax(rangeArray.arrListIntCreat(arrPath));

    }

}

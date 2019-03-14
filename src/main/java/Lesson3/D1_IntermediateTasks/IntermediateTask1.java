package Lesson3.D1_IntermediateTasks;


import Lesson3.A1_Methods.ArrElementsSum;
import Lesson3.A1_Methods.IntArrayListFromNumber;
import Lesson3.A1_Methods.StringFromIntWithScan;
import Lesson3.A1_Methods.TaskDescriptionRead;

import java.io.IOException;
import java.util.ArrayList;


public class IntermediateTask1 {

    public static void main(String[] args) throws IOException {

        String taskDescriptionPath = "C:\\Users\\stepanyuk\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\IntermediateTask1.txt";


        System.out.println("Task1. Intermediate level");
        TaskDescriptionRead TaskDescription12 = new TaskDescriptionRead();
        TaskDescription12.taskDescriptionReading(taskDescriptionPath);

        StringFromIntWithScan newStr = new StringFromIntWithScan();
        String a = newStr.stringFromInt();

        IntArrayListFromNumber newIntArr = new IntArrayListFromNumber();
        ArrayList<Integer> arr = newIntArr.amountOfDigs(a);

        ArrElementsSum newSum = new ArrElementsSum();
        System.out.println(newSum.arrSum(arr));


    }}


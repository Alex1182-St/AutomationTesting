package Lesson3;

import Lesson3.Methods.EvenNumbers;
import Lesson3.Methods.IntArrayListFromExcel;
import Lesson3.Methods.IntArrayListRandom;
import Lesson3.Methods.TaskDescriptionRead;

import java.io.IOException;
import java.util.ArrayList;

public class BeginnerTask6 {

    public static void main(String[] args) throws IOException {

        String taskDescriptionPath = "C:\\Users\\stepanyuk\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\BeginnerTask6.txt";

        int low = 0;
        int up = 50;
        int size = 20;

        System.out.println("Task6. Beginner level");
        TaskDescriptionRead TaskDescription6 = new TaskDescriptionRead();
        TaskDescription6.taskDescriptionReading(taskDescriptionPath);
        IntArrayListRandom arrRand = new IntArrayListRandom();
        arrRand.arrCreatRandom(low,up,size);
        ArrayList<Integer> rand = arrRand.arrCreatRandom(low,up,size);
        EvenNumbers newEvens = new EvenNumbers();
        newEvens.returnEven(rand);
        newEvens.returnEven2(rand);

    }

}

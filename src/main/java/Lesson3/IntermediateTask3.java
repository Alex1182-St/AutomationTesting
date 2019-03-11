package Lesson3;


import Lesson3.A1_Methods.*;

import java.io.IOException;
import java.util.ArrayList;


public class IntermediateTask3 {

    public static void main(String[] args) throws IOException {

        String taskDescriptionPath = "C:\\Users\\stepanyuk\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\IntermediateTask3.txt";


        System.out.println("\nTask3. Intermediate level");
        TaskDescriptionRead TaskDescription12 = new TaskDescriptionRead();
        TaskDescription12.taskDescriptionReading(taskDescriptionPath);

        ArrayList<String> ourArr = new ArrayList<>();
        ourArr.add("1");
        ourArr.add("2");
        ourArr.add("3");
        ourArr.add("4");
        ourArr.add("5");
        ourArr.add("6");
        ourArr.add("7");

        System.out.println("\nOur array is " + ourArr);

        ReversedArr newRevArr = new ReversedArr();
        newRevArr.reversArr(ourArr);

    }}


package Lesson3;



import Lesson3.A1_Methods.SumOfNumbsInString;
import Lesson3.A1_Methods.TaskDescriptionRead;

import java.io.IOException;



public class IntermediateTask4 {

    public static void main(String[] args) throws IOException {

        String taskDescriptionPath = "C:\\Users\\stepanyuk\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\IntermediateTask4.txt";
        String ourStr = "AbraKadabra127TrahTibiDoh577";

        System.out.println("\nTask4. Intermediate level");
        TaskDescriptionRead TaskDescription28 = new TaskDescriptionRead();
        TaskDescription28.taskDescriptionReading(taskDescriptionPath);

        SumOfNumbsInString newNmInStrSum = new SumOfNumbsInString();

        System.out.println("\nYour string - " + ourStr);
        System.out.println("\nSum of numbers in your string - " + newNmInStrSum.numbsSumInString(ourStr));
    }}


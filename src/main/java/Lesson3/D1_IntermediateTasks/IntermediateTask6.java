package Lesson3.D1_IntermediateTasks;


import Lesson3.A1_Methods.LongestWord;
import Lesson3.A1_Methods.TaskDescriptionRead;
import Lesson3.A1_Methods.TemperatureConverter;

import java.io.IOException;


public class IntermediateTask6 {

    public static void main(String[] args) throws IOException {

        String taskDescriptionPath = "C:\\Users\\stepanyuk\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\IntermediateTask6.txt";
        String str = "Write a method which returns the longest word in the input string";

        System.out.println("\nTask6. Intermediate level");
        TaskDescriptionRead TaskDescription31 = new TaskDescriptionRead();
        TaskDescription31.taskDescriptionReading(taskDescriptionPath);

        LongestWord longest = new LongestWord();
        longest.longWord(str);

    }}


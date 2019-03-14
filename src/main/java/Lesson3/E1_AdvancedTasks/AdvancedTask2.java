package Lesson3.E1_AdvancedTasks;


import Lesson3.A1_Methods.ArabicToRoman;
import Lesson3.A1_Methods.TaskDescriptionRead;

import java.io.IOException;


public class AdvancedTask2 {

    public static void main(String[] args) throws IOException {

        String taskDescriptionPath = "C:\\Users\\stepanyuk\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\AdvancedTask2.txt";
        int arabicNum = 1999;

        System.out.println("\nTask2. Advanced level");
        TaskDescriptionRead TaskDescription31 = new TaskDescriptionRead();
        TaskDescription31.taskDescriptionReading(taskDescriptionPath);

        ArabicToRoman newConvert = new ArabicToRoman();
        newConvert.arabToRom(arabicNum);


    }}


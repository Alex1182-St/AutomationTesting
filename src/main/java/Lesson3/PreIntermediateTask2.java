package Lesson3;

import Lesson3.Methods.CharactersSwap;
import Lesson3.Methods.Smile;
import Lesson3.Methods.TaskDescriptionRead;

import java.io.IOException;

public class PreIntermediateTask2 {


    public static void main(String[] args) throws IOException {

        String taskDescriptionPath = "C:\\Users\\stepanyuk\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\PreIntermediateTask2.txt";

        System.out.println("Task2. PreIntermediate level");
        TaskDescriptionRead TaskDescription = new TaskDescriptionRead();
        TaskDescription.taskDescriptionReading(taskDescriptionPath);

        CharactersSwap swap = new CharactersSwap();

        swap.setS("Cool text");
        swap.getS();

        swap.CharSwap();

}}

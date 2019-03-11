package Lesson3;

import Lesson3.Methods.StringToDiagMatrix;
import Lesson3.Methods.TaskDescriptionRead;

import java.io.IOException;

public class IntermediateTask1 {

    public static void main(String[] args) throws IOException {

        String taskDescriptionPath = "C:\\Users\\stepanyuk\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\IntermediateTask1.txt";


        System.out.println("Task1. Intermediate level");
        TaskDescriptionRead TaskDescription12 = new TaskDescriptionRead();
        TaskDescription12.taskDescriptionReading(taskDescriptionPath);


    }}


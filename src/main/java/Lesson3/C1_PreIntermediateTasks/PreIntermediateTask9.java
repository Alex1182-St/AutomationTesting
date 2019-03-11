package Lesson3.C1_PreIntermediateTasks;

import Lesson3.A1_Methods.*;

import java.io.IOException;

public class PreIntermediateTask9 {

    public static void main(String[] args) throws IOException {

        String taskDescriptionPath = "C:\\Users\\stepanyuk\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\PreIntermediateTask9.txt";

        System.out.println("Task9. PreIntermediate level");
        TaskDescriptionRead TaskDescription8 = new TaskDescriptionRead();
        TaskDescription8.taskDescriptionReading(taskDescriptionPath);
        MultiplicationTable table = new MultiplicationTable();
        System.out.println("\nYour multiplication table:");
        table.multTable(3);
    }}


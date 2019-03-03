package Lesson3;

import Lesson3.Methods.*;

import java.io.IOException;
import java.util.ArrayList;

public class PreIntermediateTask9 {

    public static void main(String[] args) throws IOException {

        String taskDescriptionPath = "C:\\Users\\oleks\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\PreIntermediateTask9.txt";

        System.out.println("Task9. PreIntermediate level");
        TaskDescriptionRead TaskDescription8 = new TaskDescriptionRead();
        TaskDescription8.taskDescriptionReading(taskDescriptionPath);
        MultiplicationTable table = new MultiplicationTable();
        System.out.println("\nYour multiplication table:");
        table.multTable(3);
    }}


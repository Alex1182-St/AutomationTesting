package Lesson3.B1_BeginnerTasks;

import Lesson3.A1_Methods.ComparisonWithNumber;
import Lesson3.A1_Methods.TaskDescriptionRead;

import java.io.IOException;

public class BeginnerTask2 {

    public static void main(String[] args) throws IOException {

        String taskDescriptionPath = "C:\\Users\\stepanyuk\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\BeginnerTask2.txt";

        System.out.println("Task2. Beginner level");
        TaskDescriptionRead TaskDescription2 = new TaskDescriptionRead();
        TaskDescription2.taskDescriptionReading(taskDescriptionPath);
        ComparisonWithNumber newComparison = new ComparisonWithNumber();
        newComparison.setX(7);
        newComparison.setY(3);
        newComparison.setComparable(10);
        newComparison.getX();
        newComparison.getY();
        newComparison.getComparable();
        System.out.println("\nNumbers are " + newComparison.getX()+ " and " + newComparison.getY() + " Comparable is " + newComparison.getComparable());
        newComparison.comparisonIntsWithInts();

    }}


package Lesson3.C1_PreIntermediateTasks;

import Lesson3.A1_Methods.ComparisonWithNumber;
import Lesson3.A1_Methods.TaskDescriptionRead;

import java.io.IOException;

public class PreIntermediateTask3 {

    public static void main(String[] args) throws IOException {

        String taskDescriptionPath = "C:\\Users\\stepanyuk\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\BeginnerTask3.txt";

        System.out.println("Task3. PreIntermediate level");
        TaskDescriptionRead TaskDescription2 = new TaskDescriptionRead();
        TaskDescription2.taskDescriptionReading(taskDescriptionPath);
        ComparisonWithNumber newComparison = new ComparisonWithNumber();
        newComparison.setX(5);
        newComparison.setY(25);
        newComparison.setComparable(21);
        newComparison.getX();
        newComparison.getY();
        newComparison.getComparable();
        System.out.println("\nNumbers are " + newComparison.getX()+ " and " + newComparison.getY() + " Comparable is " + newComparison.getComparable());
        newComparison.comparisonIntsWithInts();

    }}


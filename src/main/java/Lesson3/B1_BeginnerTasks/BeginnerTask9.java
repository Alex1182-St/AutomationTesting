package Lesson3.B1_BeginnerTasks;

import Lesson3.A1_Methods.IntsDivision;
import Lesson3.A1_Methods.TaskDescriptionRead;

import java.io.IOException;

public class BeginnerTask9 {

    public static void main(String[] args) throws IOException {

        String taskDescriptionPath = "C:\\Users\\stepanyuk\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\BeginnerTask9.txt";

        System.out.println("Task9. Beginner level");
        TaskDescriptionRead TaskDescription8 = new TaskDescriptionRead();
        TaskDescription8.taskDescriptionReading(taskDescriptionPath);

        IntsDivision divisionOfInts = new IntsDivision();
        divisionOfInts.setA(7);
        divisionOfInts.setB(2);
        divisionOfInts.getA();
        divisionOfInts.getB();

        System.out.println("\nResul of division of "  + divisionOfInts.divisionMethod());

    }}
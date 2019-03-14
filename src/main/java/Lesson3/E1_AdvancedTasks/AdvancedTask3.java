package Lesson3.E1_AdvancedTasks;



import Lesson3.A1_Methods.StableOrNot;
import Lesson3.A1_Methods.TaskDescriptionRead;

import java.io.IOException;


public class AdvancedTask3 {

    public static void main(String[] args) throws IOException {

        String taskDescriptionPath = "C:\\Users\\stepanyuk\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\AdvancedTask3.txt";
        double passedTC = 100;
        double failedTC = 15;
        double allUnresolved = 100;
        double highUnres = 3;
        double blockCritUnres = 2;



        System.out.println("\nTask3. Advanced level");
        TaskDescriptionRead TaskDescription31 = new TaskDescriptionRead();
        TaskDescription31.taskDescriptionReading(taskDescriptionPath);

        StableOrNot newSt = new StableOrNot();
        newSt.stableBuild(passedTC,failedTC,allUnresolved,highUnres,blockCritUnres);

    }}


package Lesson3.C1_PreIntermediateTasks;


import Lesson3.A1_Methods.QuadraticEquation;
import Lesson3.A1_Methods.TaskDescriptionRead;

import java.io.IOException;

public class PreIntermediateTask13 {

    public static void main(String[] args) throws IOException {

        String taskDescriptionPath = "C:\\Users\\oleks\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\PreIntermediateTask13.txt";


        System.out.println("Task13. PreIntermediate level");
        TaskDescriptionRead TaskDescription12 = new TaskDescriptionRead();
        TaskDescription12.taskDescriptionReading(taskDescriptionPath);

        QuadraticEquation newQE = new QuadraticEquation();
        newQE.quadraticEquationSol();



    }}


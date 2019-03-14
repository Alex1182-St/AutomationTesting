package Lesson3.D1_IntermediateTasks;


import Lesson3.A1_Methods.*;

import java.io.IOException;



public class IntermediateTask2 {

    public static void main(String[] args) throws IOException {

        String taskDescriptionPath = "C:\\Users\\stepanyuk\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\IntermediateTask2.txt";


        System.out.println("Task2. Intermediate level");
        TaskDescriptionRead TaskDescription12 = new TaskDescriptionRead();
        TaskDescription12.taskDescriptionReading(taskDescriptionPath);

        LuckyTickets newTicQty = new LuckyTickets();
        newTicQty.luckyTicCalc(1,999999, 6);

    }}


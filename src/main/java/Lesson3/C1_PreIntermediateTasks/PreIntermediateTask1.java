package Lesson3.C1_PreIntermediateTasks;

import Lesson3.A1_Methods.Smile;
import Lesson3.A1_Methods.TaskDescriptionRead;

import java.io.IOException;

public class PreIntermediateTask1 {


    public static void main(String[] args) throws IOException {

        String taskDescriptionPath = "C:\\Users\\stepanyuk\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\PreIntermediateTask1.txt";

        System.out.println("Task1. PreIntermediate level");
        TaskDescriptionRead TaskDescription = new TaskDescriptionRead();
        TaskDescription.taskDescriptionReading(taskDescriptionPath);

        Smile theirSmile = new Smile();

        theirSmile.setHeSmile(true);
        theirSmile.setSheSmile(false);
        theirSmile.isHeSmile();
        theirSmile.isSheSmile();

        theirSmile.visitCinema(theirSmile.isHeSmile(), theirSmile.isSheSmile());

}}

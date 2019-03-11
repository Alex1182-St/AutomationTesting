package Lesson3.B1_BeginnerTasks;

import Lesson3.A1_Methods.Stars;
import Lesson3.A1_Methods.TaskDescriptionRead;

import java.io.IOException;

public class BeginnerTask10 {

    public static void main(String[] args) throws IOException {

        String taskDescriptionPath = "C:\\Users\\stepanyuk\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\BeginnerTask10.txt";

        System.out.println("Task10. Beginner level");
        TaskDescriptionRead TaskDescription = new TaskDescriptionRead();
        TaskDescription.taskDescriptionReading(taskDescriptionPath);

        Stars yourStars = new Stars();
        yourStars.stars();


    }}
package Lesson3;

import Lesson3.A1_Methods.PasswordGenerator;

import Lesson3.A1_Methods.TaskDescriptionRead;

import java.io.IOException;


public class AdvancedTask1 {

    public static void main(String[] args) throws IOException {

        String taskDescriptionPath = "C:\\Users\\oleks\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\AdvancedTask1.txt";

        System.out.println("\nTask1. Advanced level");
        TaskDescriptionRead TaskDescription31 = new TaskDescriptionRead();
        TaskDescription31.taskDescriptionReading(taskDescriptionPath);

        PasswordGenerator pass = new PasswordGenerator();
        pass.passGen();

    }}


package Lesson3;

import Lesson3.Methods.MultipleOfNumber;
import Lesson3.Methods.TaskDescriptionRead;

import java.io.IOException;

public class BeginnerTask3 {

    public static void main(String[] args) throws IOException {


        String taskDescriptionPath = "C:\\Users\\stepanyuk\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\BeginnerTask3.txt";

    System.out.println("Task3. Beginner level");
    TaskDescriptionRead TaskDescription3 = new TaskDescriptionRead();
    TaskDescription3.taskDescriptionReading(taskDescriptionPath);
    MultipleOfNumber newMultipleOf = new MultipleOfNumber();
    newMultipleOf.setA(3);
    newMultipleOf.setB(5);
    newMultipleOf.getA();
    newMultipleOf.getB();
    newMultipleOf.MultipleOfMethod();

}}

package Lesson3;

import Lesson3.Methods.QuadraticEquation;
import Lesson3.Methods.StringToDiagMatrix;
import Lesson3.Methods.TaskDescriptionRead;

import java.io.IOException;

public class PreIntermediateTask14 {

    public static void main(String[] args) throws IOException {

        String taskDescriptionPath = "C:\\Users\\oleks\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\PreIntermediateTask14.txt";
        String word = "Test";

        System.out.println("Task14. PreIntermediate level");
        TaskDescriptionRead TaskDescription12 = new TaskDescriptionRead();
        TaskDescription12.taskDescriptionReading(taskDescriptionPath);

        StringToDiagMatrix diagWord = new StringToDiagMatrix();
        diagWord.stringToMatrix(word);


    }}


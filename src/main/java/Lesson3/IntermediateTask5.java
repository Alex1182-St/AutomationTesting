package Lesson3;


import Lesson3.A1_Methods.TaskDescriptionRead;
import Lesson3.A1_Methods.TemperatureConverter;

import java.io.IOException;


public class IntermediateTask5 {

    public static void main(String[] args) throws IOException {

        String taskDescriptionPath = "C:\\Users\\stepanyuk\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\IntermediateTask5.txt";

        System.out.println("\nTask5. Intermediate level");
        TaskDescriptionRead TaskDescription31 = new TaskDescriptionRead();
        TaskDescription31.taskDescriptionReading(taskDescriptionPath);

        TemperatureConverter newTempConvert = new TemperatureConverter();
        System.out.println(newTempConvert.tempConvert());





    }}


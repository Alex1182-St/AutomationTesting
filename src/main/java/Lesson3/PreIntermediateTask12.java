package Lesson3;

import Lesson3.Methods.ArrElementsSum;
import Lesson3.Methods.IntArrayListFromNumber;

import Lesson3.Methods.TaskDescriptionRead;

import java.io.IOException;


public class PreIntermediateTask12 {

    public static void main(String[] args) throws IOException {

        String taskDescriptionPath = "C:\\Users\\oleks\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\PreIntermediateTask12.txt";
        String number = "12345";

        System.out.println("Task12. PreIntermediate level");
        TaskDescriptionRead TaskDescription12 = new TaskDescriptionRead();
        TaskDescription12.taskDescriptionReading(taskDescriptionPath);

        IntArrayListFromNumber newNumber = new IntArrayListFromNumber();
        newNumber.amountOfDigs(number);
        ArrElementsSum sumNumberDigs = new ArrElementsSum();
        sumNumberDigs.arrSum(newNumber.amountOfDigs(number));

        System.out.println("\n Your number is " + number);
        System.out.println("\n Sum of digits of your number is " + sumNumberDigs.arrSum(newNumber.amountOfDigs(number)));

    }}


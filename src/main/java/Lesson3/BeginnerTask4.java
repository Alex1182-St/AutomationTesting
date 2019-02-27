package Lesson3;

import java.io.IOException;

public class BeginnerTask4 {

    public static void main(String[] args) throws IOException {


    String taskDescriptionPath = "C:\\Users\\stepanyuk\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\BeginnerTask4.txt";
    String arrayDataAddress = "C:\\Users\\stepanyuk\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\ArrayData2.xlsx";
    int yourNumber = 0;

    System.out.println("Task4. Beginner level");
    TaskDescriptionRead TaskDescription4 = new TaskDescriptionRead();
    TaskDescription4.taskDescriptionReading(taskDescriptionPath);
    IntArrayListFromExcel newArr = new IntArrayListFromExcel();
    newArr.arrListDoubleCreat(arrayDataAddress);
    System.out.println("\nYour array is " + newArr.arrListDoubleCreat(arrayDataAddress));
    FindQtyOfNmInArray nMQuantity = new FindQtyOfNmInArray();
        System.out.println("\n Your number is " + yourNumber);
        System.out.println("Qty of your number in array is " + nMQuantity.qTyOfNmInArr(newArr.arrListDoubleCreat(arrayDataAddress),yourNumber));



}}

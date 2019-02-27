package Lesson3;

import java.io.IOException;

public class BeginnerTask1 {

    public static void main(String[] args) throws IOException {

        String taskDescriptionPath = "C:\\Users\\stepanyuk\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\BeginnerTask1.txt";
        String arrayDataAddress = "C:\\Users\\stepanyuk\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\ArrayData1.xlsx";

        System.out.println("Task1. Beginner level");
        TaskDescriptionRead TaskDescription1 = new TaskDescriptionRead();
        TaskDescription1.taskDescriptionReading(taskDescriptionPath);
        IntArrayListFromExcel arrFromExcelFile = new IntArrayListFromExcel();
        arrFromExcelFile.arrListDoubleCreat(arrayDataAddress);
        System.out.println("\nFirst array is\n" + arrFromExcelFile.arrListDoubleCreat(arrayDataAddress));
        MultiplicationArrayByInt multiplicationResult = new MultiplicationArrayByInt();
        System.out.println("\nResult is\n" + multiplicationResult.arrayMult(arrFromExcelFile.arrListDoubleCreat(arrayDataAddress),3));


/*

        System.out.println("\nЗначення однієї ячейки");
        ExcelGetCellData readExcCell = new ExcelGetCellData();
        System.out.println(readExcCell.excelReadCell(arrayDataAddress, sheetNumber, rowNumber, cellNumber));


        System.out.println("\n Один стовпчик (колонка) з Ексель-файлу");
        ExcelGetColumnAllData columnFromExcl = new ExcelGetColumnAllData();
        System.out.println(columnFromExcl.excelReadColumn(arrayDataAddress,sheetNumber,rowNumber,cellNumber));


        System.out.println("\nМасив з стовпчика(колонки) Ексель-файлу");
        ArrayListCellFromExcel arrFromEcl = new ArrayListCellFromExcel();
        System.out.println(arrFromEcl.arrListCreat(arrayDataAddress,sheetNumber,rowNumber,cellNumber));


        System.out.println("\nArray1 from Excel");
        ArrayListIntFromExcel arrFromExcl = new ArrayListIntFromExcel();
        System.out.println(arrFromExcl.arrListIntCreat(arrayDataAddress));


        System.out.println("\nArray2 from Excel");
        ArrayListIntFromExcel_2 arrFromExcl2 = new ArrayListIntFromExcel_2();
        System.out.println(arrFromExcl2.arrListIntCreat2(arrayDataAddress));

        System.out.println("\nArrayString from Excel");
        ArrayListStringFromExcel arrFromExcl3 = new ArrayListStringFromExcel();
        System.out.println(arrFromExcl3.arrListStringCreat(arrayDataAddress));

      */


    }}


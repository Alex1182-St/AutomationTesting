package Lesson3;

import Lesson3.GetExcelData.ExcelGetCellData;
import Lesson3.GetExcelData.ExcelGetColumnAllData;

import java.io.IOException;

public class BeginnerTask1 {

    public static void main(String[] args) throws IOException {


        String arrayDataAddress = "C:\\Users\\stepanyuk\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\ArrayData1.xlsx";
        int sheetNumber = 0;
        int rowNumber = 2;
        int cellNumber = 3;


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



        /*
        System.out.println("\nInteger Масив з Ексель-файлу");
        ArrayListIntFromExcel intArrFromExc = new ArrayListIntFromExcel();
        System.out.println(intArrFromExc.arrListIntCreat2(arrayDataAddress));
        */

      /*
        System.out.println("\nМноження масиву");
        ArrayMultiplicationByInt arrMult = new ArrayMultiplicationByInt();
        System.out.println(arrMult.arrayMult(arrFromEcl,3));
      */


    }}


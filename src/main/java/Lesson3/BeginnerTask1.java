package Lesson3;

import java.io.IOException;

public class BeginnerTask1 {

    public static void main(String[] args) throws IOException {


        System.out.println("\nМасив");
        ArrayListCreation newArray = new ArrayListCreation();
        int a = 5;
        System.out.println(newArray.arrListCreat(a));


        System.out.println("\nВесь Excel-файл");
        String arrayDataAddress = "C:\\Users\\oleks\\IdeaProjects\\AutomationTesting\\src\\main\\DataSource\\ArrayData1.xlsx";
        ExcelGetAllData readExcel = new ExcelGetAllData();
        readExcel.excelReadMethod(arrayDataAddress);


        System.out.println("\nЗначення однієї ячейки");
        int sheetNumber = 0;
        int rowNumber = 5;
        int cellNumber = 2;
        ExcelGetCellData readExcCell = new ExcelGetCellData();
        System.out.println(readExcCell.excelReadCell(arrayDataAddress, sheetNumber, rowNumber, cellNumber));


        System.out.println("\nЗначення однієї колонки");
        ExcelGetColumnAllData readEcxColumn = new ExcelGetColumnAllData();
        System.out.println(readEcxColumn.excelReadColumn(arrayDataAddress,sheetNumber,rowNumber,cellNumber));


        System.out.println("\nМасив з Ексель-файла");
        ArrayListCreationFromExcel arrFromEcl = new ArrayListCreationFromExcel();
        System.out.println(arrFromEcl.arrListCreat(arrayDataAddress,sheetNumber,rowNumber,cellNumber));


        System.out.println("\nВесь Ексель + номер ячейки");
        int sheetNM = 0;
        ExcelGetAllCellDataAndReference allExc = new ExcelGetAllCellDataAndReference();
        allExc.excelGetAll(arrayDataAddress,sheetNM);

        System.out.println("\n №2 - Весь Ексель + номер ячейки");
        ExcelGetAllCellDataAndReference2 allExc2 = new ExcelGetAllCellDataAndReference2();
        allExc2.excelGetAll2(arrayDataAddress,sheetNM);

    }}


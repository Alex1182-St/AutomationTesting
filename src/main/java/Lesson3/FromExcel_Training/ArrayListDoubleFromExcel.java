package Lesson3.FromExcel_Training;


import org.apache.poi.ss.usermodel.*;



import java.io.File;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListDoubleFromExcel {

    public ArrayList arrListIntCreat (String excelPath) {

        ArrayList<Double> myArr = new ArrayList<Double>();

            try {
                Workbook excelWB = WorkbookFactory.create(new File(excelPath));
                Sheet excelSheet = excelWB.getSheetAt(0);

                Iterator<Row> rowIterator = excelSheet.iterator();

                while (rowIterator.hasNext()){
                    Row row = rowIterator.next();
                    
                    Iterator<Cell> cellIterator = row.cellIterator();

                    while (cellIterator.hasNext()) {
                        Cell cell = cellIterator.next();

                        myArr.add(cell.getNumericCellValue());

                        } }
                excelWB.close();
            }
            catch (Exception e) {
                System.out.println("Error");
            } return myArr;
    }}
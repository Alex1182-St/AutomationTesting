package Lesson3.Methods;


import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;


public class IntArrayListFromExcel {

    public ArrayList arrListIntCreat(String excelPath) throws IOException {

        ArrayList<Double> myArr = new ArrayList<Double>();
        ArrayList<Integer> myIntArr = new ArrayList<Integer>();

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

        // перетворюю ArrayList<Double> в ArrayList<Integer>

            for(Double i : myArr){
            myIntArr.add(i.intValue());
            }

        excelWB.close();

        return myIntArr;


    }}
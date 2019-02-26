package Lesson3;


import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class ArrayListStringFromExcel {

    public ArrayList arrListStringCreat (String excelPath) throws IOException {

        ArrayList<String> myArr = new ArrayList<String>();

        Workbook excelWB = WorkbookFactory.create(new File(excelPath));

        Sheet sheet1 = excelWB.getSheetAt(0);

        for (Row row : sheet1) {
            for (Cell cell : row) {

                switch (cell.getCellType()) {
                    case NUMERIC:
                        myArr.add(String.valueOf(cell.getNumericCellValue()));
                    case STRING:
                myArr.add(cell.getStringCellValue());
                    break;
                    case BLANK:
                 myArr.add(String.valueOf(cell.getNumericCellValue()));
                    break;



            }}
            excelWB.close();}
        return myArr;
    }}

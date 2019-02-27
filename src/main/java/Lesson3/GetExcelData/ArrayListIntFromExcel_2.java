package Lesson3.GetExcelData;


import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class ArrayListIntFromExcel_2 {

    // нужно проверить на правильность

    public ArrayList arrListIntCreat2(String excelPath) throws IOException {

        ArrayList<Double> myArr = new ArrayList<Double>();

        Workbook excelWB = WorkbookFactory.create(new File(excelPath));

        Sheet sheet1 = excelWB.getSheetAt(0);

        for (Row row : sheet1) {
            for (Cell cell : row) {

                switch (cell.getCellType()) {
                    case NUMERIC:
                myArr.add(cell.getNumericCellValue());
                    break;
                    case BLANK:
                 myArr.add(Double.valueOf(cell.getNumericCellValue()));
                    break;
                // как переписать бланк, чтобы выводилось пустое значение, а не 0????????????????


            }}
            excelWB.close();}
        return myArr;
    }}

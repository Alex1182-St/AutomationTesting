package Lesson3.GetExcelData_Training;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class StringArrayListFromExcel {

    public ArrayList<String> stringArrCreat (String excelPath, int sheet) throws IOException {

        ArrayList<String> myStringArr = new ArrayList<String>();

        Workbook excelWB = WorkbookFactory.create(new File(excelPath));

        DataFormatter formatter = new DataFormatter();


        Sheet sheet1 = excelWB.getSheetAt(sheet);

        for (Row row : sheet1) {
            for (Cell cell : row) {
                String text = formatter.formatCellValue(cell);
                myStringArr.add(text);
            }
    }
        excelWB.close();
        return myStringArr;

    }}

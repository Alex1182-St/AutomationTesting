package Lesson3;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.IOException;


public class ExcelGetColumnAllData {

    public Cell excelReadColumn (String excelPath, int sheet, int cell) throws IOException {


        Workbook excelWB = WorkbookFactory.create(new File(excelPath));

        int row = 0;

        Cell ce = null;

        while (row <= excelWB.getSheetAt(sheet).getLastRowNum()) {

            ce = excelWB.getSheetAt(sheet).getRow(row).getCell(cell);

            row = row + 1;

        }

        excelWB.close();
        return ce;

           }

}





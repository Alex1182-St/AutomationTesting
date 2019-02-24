package Lesson3;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.IOException;


public class ExcelGetColumnAllData {

    public Cell excelReadColumn (String excelPath, int sheet, int row, int cell) throws IOException {


        Workbook excelWB = WorkbookFactory.create(new File(excelPath));

        int ro = 0;

        Cell ce = null;

        while (ro <= excelWB.getSheetAt(sheet).getLastRowNum()) {

            ce = excelWB.getSheetAt(sheet).getRow(row).getCell(cell);

            ro = ro + 1;

        }

        excelWB.close();
        return ce;

           }

}





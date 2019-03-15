package Lesson3.Training_Source_Library;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;

import java.io.IOException;


public class ExcelGetCellData {

    public Cell excelReadCell (String excelPath, int sheet, int row, int cell) throws IOException {


        Workbook excelWB = WorkbookFactory.create(new File(excelPath));

        /* WorkbookFactory (менше пам'яті) замість -
        FileInputStream fileInStr = new FileInputStream(new File(fileAddress));
        XSSFWorkbook excelWB = new XSSFWorkbook(fileInStr);
        */

        Cell ce = excelWB.getSheetAt(sheet).getRow(row).getCell(cell);

        excelWB.close();

        return ce;

    }
}





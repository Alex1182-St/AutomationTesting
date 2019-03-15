package Lesson3.Training_Source_Library;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.IOException;


public class ExcelGetColumnAllData {

    public Cell excelReadColumn (String excelPath, int sheet, int row, int cell) throws IOException {


        //ВЫВОД В КОНСОЛЬ

        Workbook excelWB = WorkbookFactory.create(new File(excelPath));


        Cell ce = null;

        while (row <= excelWB.getSheetAt(sheet).getLastRowNum()) {

           ce = excelWB.getSheetAt(sheet).getRow(row).getCell(cell);

            System.out.println(ce);

            row = row + 1;

        }

        excelWB.close();
        return ce;

           }

}





package Training_FromExcl_and_LoopWork;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class ExcelGetColumnAllData_2 {

    public ArrayList<Cell> excelReadColumn (String excelPath, int sheet, int row, int cell) throws IOException {


        //ВЫВОД В МАСИВ

        Workbook excelWB = WorkbookFactory.create(new File(excelPath));

        ArrayList<Cell> arr = new ArrayList();

        while (row <= excelWB.getSheetAt(sheet).getLastRowNum()) {

           arr.add(excelWB.getSheetAt(sheet).getRow(row).getCell(cell));

            row = row + 1;

        }

        excelWB.close();
        return arr;

           }

}





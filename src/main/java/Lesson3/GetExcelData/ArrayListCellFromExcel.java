package Lesson3.GetExcelData;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;



public class ArrayListCellFromExcel {

    public ArrayList arrListCreat (String excelPath, int sheet,int row, int cell) throws IOException {


        Workbook excelWB = WorkbookFactory.create(new File(excelPath));

        ArrayList<Cell> myArr = new ArrayList<Cell>();


        while (row <= excelWB.getSheetAt(sheet).getLastRowNum()) {
            myArr.add(excelWB.getSheetAt(sheet).getRow(row).getCell(cell));
            row = row+1;
        }
        excelWB.close();

    return myArr;


    }

}

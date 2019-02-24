package Lesson3;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;



public class ArrayListCreationFromExcel {

    public ArrayList arrListCreat (String excelPath, int sheet,int row, int cell) throws IOException {


        Workbook excelWB = WorkbookFactory.create(new File(excelPath));

        ArrayList<Cell> myArr = new ArrayList<>();

        int ro = 0;

        while (ro <= excelWB.getSheetAt(sheet).getLastRowNum()) {
            myArr.add(excelWB.getSheetAt(sheet).getRow(row).getCell(cell));
            ro = ro+1;
        }
        excelWB.close();

    return myArr;


    }

}

package Lesson3;

import org.apache.poi.ss.usermodel.*;


import java.io.File;
import java.io.IOException;


public class ExcelGetSomethingForTraining {

    public Cell excelGetAll3 (String fileAddress, int sheet) throws IOException {

        Workbook excelWB = WorkbookFactory.create(new File(fileAddress));

        Sheet sheet1 = excelWB.getSheetAt(sheet);


        for (Row row : sheet1) {
            for (Cell cell : row) {


                Cell ce = cell.getCell();


            }}

        excelWB.close();

        return ce;
    }}


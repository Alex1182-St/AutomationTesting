package Lesson3.GetExcelData_Training;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellReference;

import java.io.File;
import java.io.IOException;


public class ExcelGetAllCellDataAndReference_2 {

    public void  excelGetAll2 (String fileAddress, int sheet) throws IOException {

        Workbook excelWB = WorkbookFactory.create(new File(fileAddress));
        DataFormatter formatter = new DataFormatter();
        Sheet sheet1 = excelWB.getSheetAt(sheet);

        for (Row row : sheet1) {
            for (Cell cell : row) {
                CellReference cellRef = new CellReference(row.getRowNum(), cell.getColumnIndex());
                System.out.print(cellRef.formatAsString());
                System.out.print(" - ");
                String text = formatter.formatCellValue(cell);
                System.out.println(text);

                excelWB.close();

            }}}}


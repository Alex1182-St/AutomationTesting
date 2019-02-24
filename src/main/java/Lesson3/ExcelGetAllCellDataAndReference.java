package Lesson3;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class ExcelGetAllCellDataAndReference {

    public void  excelGetAll (String fileAddress, int sheet) throws IOException {

        FileInputStream fileInStr = new FileInputStream(new File(fileAddress));

        XSSFWorkbook excelWB = new XSSFWorkbook(fileInStr);

        DataFormatter formatter = new DataFormatter();
        Sheet sheet1 = excelWB.getSheetAt(sheet);
        for (Row row : sheet1) {
            for (Cell cell : row) {
                CellReference cellRef = new CellReference(row.getRowNum(), cell.getColumnIndex());
                System.out.print(cellRef.formatAsString());
                System.out.print(" - ");
                String text = formatter.formatCellValue(cell);
                System.out.println(text);

                fileInStr.close();

            }}}}


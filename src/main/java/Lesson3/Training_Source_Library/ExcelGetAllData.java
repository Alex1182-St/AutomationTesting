package Lesson3.Training_Source_Library;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

public class ExcelGetAllData {

    public void excelReadMethod (String excelPath)  {

    try {
    //cоздаем обьект типа FileInputStream
        FileInputStream fileInStr = new FileInputStream(new File(excelPath));
     // объект для доступа к файлу
        XSSFWorkbook excelWB = new XSSFWorkbook(fileInStr);
    /* обьект для доступа к листу в файле
     excelWB.getSheetAt(0) - доступ к первому листу (0-индекс первого листа) */
        XSSFSheet excelSheet = excelWB.getSheetAt(0);
       // "проход" по всем строкам первого листа
        Iterator<Row> rowIterator = excelSheet.iterator();

        //цикл while для прохода по всем строкам
        while (rowIterator.hasNext()){
            /* cоздаем объект интерфейса Row и присваиваем позицию в первой строке нашего файла,
            пока есть данные в строке - hasNext() */
            Row row = rowIterator.next();
            //Итератор для прохода по всем ячейкам (Cell) файла
            Iterator<Cell> cellIterator = row.cellIterator();
            //Цикл для перебора всех ячеек построчно
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                switch (cell.getCellType()) {

                    case STRING:
                        System.out.println(cell.getRichStringCellValue().getString());
                        break;
                    case NUMERIC:
                        if (DateUtil.isCellDateFormatted(cell)) {
                            System.out.println(cell.getDateCellValue());
                        } else {
                            System.out.println(cell.getNumericCellValue());
                        }
                        break;
                    case BOOLEAN:
                        System.out.println(cell.getBooleanCellValue());
                        break;
                    case FORMULA:
                        System.out.println(cell.getCellFormula());
                        break;
                    case BLANK:
                        System.out.println();
                        break;
                    default:
                        System.out.println();

                } } }

        fileInStr.close();
    }

    catch (Exception e) {
        System.out.println("Error");
    }}}



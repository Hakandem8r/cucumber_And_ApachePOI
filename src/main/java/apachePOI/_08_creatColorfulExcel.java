package apachePOI;

import gherkin.lexer.Fi;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _08_creatColorfulExcel {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("Sayfa1");
        Row row=sheet.createRow(1);

        //Setting Background color
        CellStyle style=workbook.createCellStyle();
        style.setFillBackgroundColor(IndexedColors.BRIGHT_GREEN.getIndex());
        style.setFillPattern(FillPatternType.BIG_SPOTS);

        Cell cell=row.createCell(1);
        cell.setCellValue("Hello");
        cell.setCellStyle(style);

        //Setting Foreground color
        style=workbook.createCellStyle();
        style.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        cell=row.createCell(2);
        cell.setCellValue("World");
        cell.setCellStyle(style);

        FileOutputStream fos=new FileOutputStream("src\\main\\resources\\styles.xlsx");
        workbook.write(fos);
        workbook.close();
        fos.close();

        System.out.println("The misson is completed");
    }
}

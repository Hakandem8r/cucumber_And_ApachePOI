package apachePOI;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class _05_ {
    public static void main(String[] args) {
        File src=new File("C:\\IDEA_PROJECTS\\POI\\01.xlsx");

        Workbook wb = null;

        try {
            FileInputStream fis=new FileInputStream(src);
            wb=WorkbookFactory.create(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Sheet sheet1=wb.getSheetAt(0);
        String data1=sheet1.getRow(0).getCell(0).getStringCellValue();
        System.out.println("Data from Excel is= "+data1);
    }
}

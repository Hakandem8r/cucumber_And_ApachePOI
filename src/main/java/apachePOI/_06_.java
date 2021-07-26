package apachePOI;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class _06_ {
    public static void main(String[] args) throws IOException {
        File src=new File("C:\\IDEA_PROJECTS\\POI\\01.xlsx");
        Workbook wb=null;

        try {
            FileInputStream fis=new FileInputStream(src);
            wb= WorkbookFactory.create(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Sheet sheet=wb.getSheetAt(0);
        int rowCount=sheet.getPhysicalNumberOfRows();

        System.out.println("Total rows is "+rowCount);

        for (int i = 0; i < rowCount; i++) {

            String data=sheet.getRow(i).getCell(0).getStringCellValue();

            //System.out.println("Test Data from Excel is "+data);
            System.out.println("Data from row "+i+ " is "+data);
        }

        wb.close();
    }
}

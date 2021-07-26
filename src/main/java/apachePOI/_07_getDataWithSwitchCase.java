package apachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class _07_getDataWithSwitchCase {
    public static void main(String[] args) throws IOException {


        File src = new File("C:\\IDEA_PROJECTS\\POI\\shirler.xlsx");

        Workbook wb=null;

        {
            try {
                FileInputStream fis = new FileInputStream(src);
                wb = WorkbookFactory.create(src);
            } catch (IOException e) {
                e.printStackTrace();
            }

            Sheet sheet = wb.getSheetAt(0);
            //Sheet sheet1=wb.getSheet("Sayfa1");

            int rows = sheet.getPhysicalNumberOfRows();
            int cols = sheet.getRow(1).getPhysicalNumberOfCells();

            for (int i = 0; i < rows; i++) {
                Row row = sheet.getRow(i);

                for (int j = 0; j < cols; j++) {
                    Cell cell = row.getCell(j);

                    switch (cell.getCellType()) {
                        case STRING:
                            System.out.print(cell.getStringCellValue());
                            break;
                        case NUMERIC:
                            System.out.print(cell.getNumericCellValue());
                            break;
                        case BOOLEAN:
                            System.out.print(cell.getBooleanCellValue());
                            break;
                    }
                    System.out.print(" | ");
                }
                System.out.println(); //önce run yap sonra yukarıdaki "ln" leri çek
            }

        }
        wb.close();
    }
}

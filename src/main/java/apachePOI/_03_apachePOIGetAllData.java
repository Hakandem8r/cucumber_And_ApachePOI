package apachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_apachePOIGetAllData {
    public static void main(String[] args) throws IOException {
        String path = "src\\main\\resources\\New Microsoft Excel Çalışma Sayfası.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet = workbook.getSheetAt(0);

        //Çalışma sayfasındaki toplam satır sayısını verir
        int rowCount = sheet.getPhysicalNumberOfRows(); //Sayfada kaç satır var onu aldım

        System.out.println("Satır sayısı= "+rowCount);

        for (int i = 0; i < rowCount; i++) {//rowCount'ın miktarını aldım -> Satır sayısı kadar dönecek
            //int cellCount=sheet.getRow(i).getPhysicalNumberOfCells(); //her bir satırdaki hücre sayısı, sheet'ten alıyoruz
            //veya bunun yerine aşağıdaki gibi yaparız
            Row row = sheet.getRow(i); //Satırı aldım => i.ci satır alındı
            int cellCount = row.getPhysicalNumberOfCells(); //o satırdaki toplam hücre sayısını aldım

            for (int j = 0; j < cellCount; j++) { //ikinci for cellCount'a kadar gidecek => i. ci satırdaki hücre sayısı kadar dönecek
                Cell cell=row.getCell(j); //bu satırdaki hücreyi aldım
                System.out.print(cell+" ");
                System.out.printf("%-10s",cell);
            }
            System.out.println();
        }


    }
}

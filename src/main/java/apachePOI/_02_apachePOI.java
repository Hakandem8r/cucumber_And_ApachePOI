package apachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _02_apachePOI {
    /*
    Interview: Excel'den veri okuma aracı, kütüphanesi.
    -NASIL KULLANIRISIN?
    -FileInputStream oluşturuyorum.(Dosyayı yani Excel'i okumak için açarım)
    FileInputStream=> Java'nın dosya okumak için kullandığı fonksiyon, kütüphane
    todo=Bir dosya ya okumak için ya da yazmak için açabiliyorum
    FileInputStream -> workBook -> Sheet -> row -> cell => ilişki sırasına göre okuyorum
     */

    public static void main(String[] args) throws IOException {
        String path = "src\\main\\resources\\New Microsoft Excel Çalışma Sayfası.xlsx"; //Excel'i bir yerden okumam lazım, yani bana bir path lazım.

        // todo=>mavi javanın altındaki resources bu tür dosyalar için yapılmış. Excel'i buraya atarız.

        //Excel'in yolunu nasıl alırım=> sağ tuş, copy, copy path, from content root => al ve path'e yapıştır

        //1. Okumak için birinci adım=> FileInputStream
        FileInputStream inputStream = new FileInputStream(path);//Bu şekilde kabul etmiyor o yüzden try catch yap

        //2. Bunun üzerinden çalışmaKitabını al=>WorkBook'u
        Workbook workbook = WorkbookFactory.create(inputStream); //add exception

        //3. İstediğim isimdeki çalışma sayfasını alıyorum
        Sheet sheet = workbook.getSheet("Sheet1");//diğeri getSheetAt index'e göre alıyor; sıfırıncıyı ver, birinciyi ver
        // Sheet sheet1=workbook.getSheetAt(0); //getSheet isme göre alıyor => String, ben burada isme göre aldım

        //4. Şimdi de istenen satırı alacağım
        Row row=sheet.getRow(0);

        //5. Benden istenen satırdaki istenen hücre alınacak
        Cell cell = row.getCell(0);

        System.out.println(cell);

    }
}

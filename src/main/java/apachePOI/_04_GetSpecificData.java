package apachePOI;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

//Exceldeki address'i bir metod aracılığıyla bul ve yazdır. Metod'a "password" kelimesi gönder
//dönen değer password'un kendisi olacak
public class _04_GetSpecificData {
    public static void main(String[] args) {

        System.out.print("Aranacak Kelime= "); //Burayı en son ekle
        Scanner sc=new Scanner(System.in);
        String arananKelime=sc.nextLine();//sadece next->tek bir kelime yapar, nextLine birden fazla kelime varsa alır

        String donenKelime=find(arananKelime);
        System.out.println(donenKelime);
    }

    //Burada String yerine istediğimizi yazabiliriz; Cell, WorkBook... Bunlar da class
    static String find(String aranacakKelime) {//Static yaptık çünkü metodun içerisinde Static olmalı  =>void değil, döndürmez
        String donecekKelime=" ";



        String path="src\\main\\resources\\log1 - Copy.xlsx";
        Workbook workbook=null; //Buraya bir değer atarız ki daha alttaki kızarmasın
        try {
            FileInputStream inputStream = new FileInputStream(path);
            workbook = WorkbookFactory.create(inputStream);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }

        Sheet sheet = workbook.getSheetAt(0); //içeride kaldığı için kızardı. WorkBook'u hepsinde geçerli olsun diye DIŞARI
        int rowCount=sheet.getPhysicalNumberOfRows();



        for (int i = 0; i <rowCount ; i++) { //elemanları 0'ıncı satırda ara-bulunca yanındakileri (1. satır) yaz. ARAMA İŞLEMİMİZ BÖYLE

            //i. satırdaki 0'ıncı hücrenin değeri aranan kelimeye eşit mi?
            if (sheet.getRow(i).getCell(0).toString().equalsIgnoreCase(aranacakKelime)){//todo=>eğer böyleyse
                                            //toString (String) olmadan çıkaramaz
                //todo=>ilk for'la aratıyoruz, ikinci for'u yazmak için kullanıyoruz
                int cellCount=sheet.getRow(i).getPhysicalNumberOfCells(); //bu satırdaki maksimum hücre sayısı
                for (int j=0; j<cellCount; j++){
                    System.out.println(sheet.getRow(i).getCell(j));
                }
            }
        }



        return donecekKelime;
    }
}

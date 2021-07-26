package apachePOI;

public class _01 {
    public static void main(String[] args) {
        //iki boyutlu bir array oluştur
        String[][] cars={  {"VW", "5" },{"Skoda","2" }, {"Dodge","7"}, {"Seat","9","23"}  };

        System.out.println(cars[2][0]);
        System.out.println(cars[2][1]);
        System.out.println(cars[3][2]);
        System.out.println("*****************************************************");

        for (int i=0; i<cars.length;i++){//satırların miktarını veriyor
            for (int j=0;j<cars[i].length;j++){//her bir satırdaki elemanın uzunluğu

                // System.out.println(cars[i][j]);

                System.out.print(cars[i][j]+" "); //yanyana yazsın diye "ln" siz
            }
            System.out.println(); //yanyana yazıldığında arada boşluk kalsın diye
        }
    }
}

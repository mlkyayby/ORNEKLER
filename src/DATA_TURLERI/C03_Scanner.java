package DATA_TURLERI;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {
        //kullanicidan yaricap isteyin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isim ve soyisminizi giriniz");
        String isim=scan.next();
        String isminiz="leyla";

        String soyisim= scan.nextLine();
        String soyIsim="Yeseren";
        System.out.println("isim-soyisim: leyla Yeseren");


    }
}

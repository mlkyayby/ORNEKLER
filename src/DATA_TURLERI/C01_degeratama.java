package DATA_TURLERI;

import com.company.Main;

public class C01_degeratama {
    public static void main(String[] args) {

        int sayi1=4;
        System.out.println(sayi1);
        short sayi2=25;
        System.out.println(sayi2);
        double sayi3=526.6;
        System.out.println(sayi3);

        String isim="Ali";
        System.out.println("isminiz:Ali");
        String soyIsim="Ozkan";
        System.out.println("soyisminiz:Ozkan");

        int sayi4=20;
        int sayi5=10;
        System.out.println(sayi4+sayi5);

        int sayi6=35;
        double sayi7=35.9;
        System.out.println(sayi6+sayi7);

        char harf='B';
        System.out.println(harf);

        int sayi8=12;
        char harf1='C';
        System.out.println(sayi8+harf1);


        int sayi9=10;
        int sayi10=20;
        System.out.println("Swaptan once sayi9:"+sayi9+",sayi10+:"+sayi10);

        int zaman=sayi9;

        sayi9=sayi10;

        sayi10=zaman;
        System.out.println("Swaptan sonra sayi9:"+sayi9+",sayi10:"+sayi10);

        int sayi11=20;
        int sayi12=30;
        System.out.println("Swaptan once sayi11:"+sayi11+",sayi12:"+sayi12);

        sayi11=sayi11+sayi12;
        sayi12=sayi11-sayi12;
        sayi11=sayi11- sayi12;
        System.out.println("Swaptan saonra sayi11:"+sayi11+",sayi12:"+sayi12);


    }
}

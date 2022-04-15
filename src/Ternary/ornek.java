package Ternary;

import java.util.Scanner;

public class ornek {
    public static void main(String[] args) {
        /*
         * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO|
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen Y / N karakerlerini giriniz");
        char karakter=scan.next().charAt(0);

        if(karakter=='Y'|| karakter=='y'){
            System.out.println("yes");

        } else if(karakter=='N'|| karakter=='n'){

        System.out.println("no");

        } else System.out.println("yanlis giris yaptiniz,lutfen tekrar deneyiniz");

    }
}

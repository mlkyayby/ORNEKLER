package Ternary;

import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {
        /*Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore kontrol

        edin ve sifredeki hatalari yazdirin.
                Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli sifre
        girdiginde “Sifreniz Kabul edilmistir” yazdirin.

                - Sifre kucuk harf icermelidir
                - Sifre buyuk harf icermelidir
                - Sifre ozel karakter icermelidir
                - Sifre en az 8 karakter olmalidir.


         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz");
        String sifre = scan.next().toLowerCase();

        if (sifre.contains("A") && sifre.contains("Z")) {
            System.out.println("kucuk harf icermelidir");
        } else if (sifre.contains("a") && sifre.contains("z")) {
            System.out.println("sifre buyuk harf icermelidir");
        } else if (sifre.charAt(0) >= '!' && sifre.charAt(0) <= '@') {
            System.out.println("ozel karakter icermelidir");

        } else if (sifre.length()>=8) {
            System.out.println("sifreniz kabul edildi");

        } else System.out.println("sifre gecersiz");

    }
}

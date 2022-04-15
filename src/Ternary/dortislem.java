package Ternary;

import java.util.Scanner;

public class dortislem {
    public static void main(String[] args) {


        /* TASK :
         * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
         *  dort islemden biri ile isleme koyup sonucun yazdiriniz
         */
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen birinci sayiyi giriniz");
        int sayi1=scan.nextInt();

        System.out.println("lutfen ikinci sayiyi girirniz");
        int sayi2=scan.nextInt();

        int sonuc=sayi1-sayi2;
        System.out.println("int sonuc:"+sonuc);
        int sonuc1=sayi1/sayi2;
        System.out.println("int sonuc1:"+sonuc1);
        int sonuc2=sayi1*sayi2;
        System.out.println("int sonuc2:"+sonuc2);
        int sonuc3=sayi1-sayi2;
        System.out.println("int sonuc3:"+sonuc3);


    }
}

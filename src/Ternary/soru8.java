package Ternary;

import java.util.Scanner;

public class soru8 {
    public static void main(String[] args) {

        //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.


       Scanner scan=new Scanner(System.in);
        System.out.println("Kelime1:");
        String str1=scan.next().toLowerCase();
        System.out.println("Kelime2:");
        String str2=scan.next().toLowerCase();

        System.out.println("kelimelerin method birlesimi:"+str1+" "+str2);

        String ilkHarfsizstr1=str1.substring(1).toUpperCase();
        String ilkHarfsizstr2=str2.substring(1).toUpperCase();

        System.out.println("sonuc:"+ilkHarfsizstr1+" "+ilkHarfsizstr2);



    }
}

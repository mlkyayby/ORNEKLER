package Ternary;

import java.util.Scanner;

public class santimetre {
    public static void main(String[] args) {
  /*
    cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
     */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen metre ve kilometreyi donusturen bir deger giriniz");
        double santimetre= scan.nextDouble();

        donusturensm(santimetre);

    }
    private static void donusturensm(double santimetre) {

        double metre= santimetre/100;
        double kilometre=santimetre/100000;

        System.out.println("sayiniz: "+ santimetre+" esittir "+metre+" metre "+kilometre+" kilometre ");


    }
}

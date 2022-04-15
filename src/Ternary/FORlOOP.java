package Ternary;

import java.util.Scanner;

public class FORlOOP {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String gunIsmi= scan.next();

        if(gunIsmi.equals("cuma"));{
            System.out.println("muslumanlar icin kutsal gundur");
        }
        if(gunIsmi.equals("cumartesi")){
            System.out.println("Yahudiler icin kutsal gun");
        }
        if (gunIsmi.equals("pazar")) {
            System.out.println("Hiristiyanlar icin kutsal gun");
        }
    }

}

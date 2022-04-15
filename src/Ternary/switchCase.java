package Ternary;

import java.util.Locale;
import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        /*gun Pazartesi veya Sali ise:
        Java dersi gunleri

        gun Persembe veya Cuma ise:
        Selenyum dersi gunleri

        gun carsamba veya cumartesi ise:
        SQL dersi gunleri

        aksi halde: izin gunu
        (if deyimini KULLANMAYIN
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kacinci gun oldugunu giriniz");
        String gun=scan.next().toLowerCase();

        switch (gun){
            case "pazartesi":
            case "sali":
                System.out.println("Java dersi gunleri");
                break;
            case "persembe" :
            case "cuma"   :
                System.out.println("Selenyum dersi gunleri");
                break;
            case"carsamba":
            case"cumartesi":
                System.out.println("SQL dersi gunleri");
               break;
            default:
                System.out.println("izin gunu");

        }

    }
}

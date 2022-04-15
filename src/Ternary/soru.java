package Ternary;

import java.util.Scanner;

public class soru {
    public static void main(String[] args) {


        /*gunleri gösterebilen bir program yazın
        gun Pazartesi veya Sali ise:
        Java dersi gunleri

        gun Persembe veya Cuma ise:
        Selenyum dersi gunleri

        gun carsamba veya cumartesi ise:
        SQL dersi gunleri

        aksi halde: izin gunu
        (if deyimini KULLANMAYIN
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("gun giriniz");
        String gun=scan.next().toLowerCase();

        if(gun.equals("pazartesi") || gun.equals("sali")){
            System.out.println("Java dersi gunleri");

        } else if(gun.equals("persembe") || gun.equals("cuma")){
            System.out.println("Selenyum dersi gunleri");

        }else if(gun.equals("carsamba")|| gun.equals("cumartesi")){
            System.out.println("SQL");

            }else System.out.println("izin gunu");




    }
}

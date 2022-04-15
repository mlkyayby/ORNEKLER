package Ternary;

import java.util.Scanner;

public class kelimeyazdir {
    public static void main(String[] args) {
         //Kulanicidan bir kelime isteyin eger kelime 7 ve daha fazla harfden olusuyorsa
         // ortadaki uc harfini uc kere alt alta yazdirin. degil baska sonuc yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kelime giriniz");
        String kelime=scan.next();

        if(kelime.length()>=7){
            System.out.println(kelime.substring(2,5)+"\n"+kelime.substring(2,5)+ "\n" +kelime.substring(2,5));

        }else System.out.println("eksik kelime");
    }
}

package forloppp;

import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
         /*
    Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
    ve x girildiğinde ise "Program bitti" yazan programı yazınız.
    */

        Scanner scanner=new Scanner(System.in);
        String girilen="";

        do{
            System.out.println("Lutfen harf giriniz");
            girilen= scanner.next();
            System.out.println("program calisiyor");

        } while(!girilen.equalsIgnoreCase("x"));
        System.out.println("program bitti");
    }
}

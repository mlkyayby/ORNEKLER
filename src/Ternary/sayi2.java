package Ternary;

import java.util.Scanner;

public class sayi2 {
    public static void main(String[] args) {
        //Interview Question Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen sayiya kadar tum sayilari yazdirin. Ancak;
        //        - Sayi 3’un kati ise sayi yerine "Java" yazdirin.
        //        - Sayi 5’in kati ise sayi yerine "Guzeldir" yazdirin.
        //         -sayi 3 un ve ya 5 in kati ise java gueldir yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 100 den kucuk bir tamsayi giriniz");
        int sayi = scan.nextInt();

        for (int i = 1; i <= 100; i++) {

        }
        if (sayi % 3 == 0 || sayi % 5 == 0) {
            System.out.println("Java Guzeldir");
        } else if (sayi % 3 == 0) {
            System.out.println("Java");

        } else if (sayi % 5 == 0) {
            System.out.println("Guzeldir");
        } else System.out.println(sayi + "");


    }
}

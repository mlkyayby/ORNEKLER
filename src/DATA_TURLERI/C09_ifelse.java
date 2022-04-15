package DATA_TURLERI;

import java.util.Scanner;

public class C09_ifelse {
    public static void main(String[] args) {

        Scanner scan =new Scanner (System.in);
        System.out.println("Lutfen ucgenin kenar uzunlugunu giriniz");
        int kenar= scan.nextInt();

        if(kenar>50 && kenar<70){
            System.out.println("ucgen eskenar ucgendir");

        }else System.out.println("ucgen eskenar ucgen degildir");


    }
}

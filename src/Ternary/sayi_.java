package Ternary;

import java.util.Scanner;

public class sayi_ {
    public static void main(String[] args) {
        // String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        // String  str 1= "$13.99"
        // String str 2= "$10.55"
        // ipucu: Double parseDouble() methodunu kullanabilirsiniz.


        String  str1="$13.99";
       str1= str1.replaceAll("\\D","");
        System.out.println("str1:1399");//1399


        String str2= "$10.55";
        str2=str2.replaceAll("\\D","");
        System.out.println("str2:1055");//1055

        System.out.println("String sonuc:"+str1+str2);

    }
}

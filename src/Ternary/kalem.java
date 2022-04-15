package Ternary;

import java.util.Locale;

public class kalem {
    public static void main(String[] args) {
        // soru: "   Java ogrenmek123 Cok guzel@      " Stringini "Java ogrenmek cok guzel" seklinde yazdirin.

        String str1="Java ogrenmek123 Cok guzel@";


  str1=str1.trim().replaceAll("\\d","").replaceAll("\\w"," ").replace('C','c').replace("x","");
        System.out.println(str1);

    }
}

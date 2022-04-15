package Arrayssorular;

import java.util.ArrayList;
import java.util.Arrays;

public class arraylist {
    public static void main(String[] args) {

        ArrayList<String>isimler=new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
        ArrayList<String>aOLmayanIsimler=new ArrayList<>();

        for (String each:isimler
             ) {
            if (!each.toLowerCase().contains("a")){
                aOLmayanIsimler.add(each);
            }

        }

        System.out.println("a olmayan isimler:"+ aOLmayanIsimler);
    }


}

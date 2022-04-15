package Arrayssorular;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        /*  you have a string "HeySiri"
         * with arrays change it to "ByeSiri" and write changing array
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
         ** Array olan bir "HeySiri" dizginiz var, onu "ByeSiri" olarak değiştirin ve değişen array yazın
         */

        String str="HeySiri";
        str=str.replace("Hey","Bye");

        String arr[]=new String[1];
        arr[0]=str;

        System.out.println(Arrays.toString(arr));






    }
}

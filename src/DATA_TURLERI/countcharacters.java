package DATA_TURLERI;

import java.util.Arrays;
import java.util.Scanner;

public class countcharacters {
    public static void main(String[] args) {
        /*
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini ekrana yazdiriniz.
     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            abaa   ==> a=3  b=1
    */

         Scanner scanner=new Scanner(System.in);
        System.out.println("bir string giriniz:");
        String str= scanner.nextLine();

        String arr[]=str.split("");
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int count=0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1].equals(arr[i])) {

                count++;

            } else {
                System.out.println(arr[i - 1] + " harfi " + (count + 1));

                count = 0;

            }
            if (i == arr.length - 1) {
                System.out.println(arr[i] + " harfi " + (count + 1));

            }

        }}
}

package Ternary;

import java.util.Scanner;

public class karakter {
    public static void main(String[] args) {
        /*
		Kullanicidan bir kelime girmesini isteyin.
		* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
		* kelimenin ortasindaki karakteri yazdirin.
		*/

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime=scan.nextLine();
        char ortaKarakter=kelime.charAt((kelime.length()-1)/2);

        if(kelime.length()%2==1 && kelime.length()>=3){
            System.out.println("ortaKarakter:"+ortaKarakter);
        }
    }
}

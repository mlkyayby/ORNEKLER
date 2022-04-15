package Arrayssorular;

import java.util.ArrayList;
import java.util.Arrays;

public class removeArray {
    public static void main(String[] args) {
        /*
Problem Tanımı :
getSum isminde bir method oluşturun.
Parametresi ArrayList'tir.
Dizideki tüm $ ları kaldır ve tüm sayıları topla
return yaptğımız veri tipi 'int' olmalıdır.
sonuç 0'dan küçükse, -1 yazdırın.

Örnek1:
ArrayList = $13, $15, $20
Cevap = 48 olmalı

Örnek 2 :
ArrayList= $-13, $0, $0
Cevap = -1 olmalı.
 */

        ArrayList<String>arrayList=new ArrayList<>(Arrays.asList("$13", "$15", "$20"));

        System.out.println("toplam:"+getSum(arrayList));
    }

    private static int getSum(ArrayList<String> arrayList) {

        int toplam=0;
        for (String each:arrayList) {
           String str=each.replace("$","");

           toplam+=Integer.parseInt(str);//string olan sayi degerlerini integer a cevirdik

        }
        if (toplam<0){
            return-1;
        }else
            return toplam;

    }
}

package Arrayssorular;

import java.util.ArrayList;

public class list {
    public static void main(String[] args) {
        // int array list oluşturun 10 elemandan oluşmalı
// random ekle isinde void bir metod oluşturun  ve parametresi int array list olsun.
// bu metod array list içinde 0' dan 20 ye kadar değer atasın.
// eğer çift sayı atarsa o elemaının yerine 111 yazsın
// eğer çift sayı yoksa çift sayı yoktur mesajını versin.

        ArrayList<Integer>list=new ArrayList<Integer>();
        randomEkle(list);
    }

    private static void randomEkle(ArrayList<Integer> list) {
        for (int i = 0; i <10 ; i++) {
            list.add((int) (Math.random() * 20));
        }
        System.out.println("random liste:"+list);

        int sayac=0;
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i)%2==0){
                sayac++;
                list.set(i,111);

            }

        }
        System.out.println("111 ler eklendikten sonra random liste:"+list);

        if(sayac==0){
            System.out.println("listede cift sayi yoktur..");
        }
        System.out.println("listen son hali :" + list);

    }
}

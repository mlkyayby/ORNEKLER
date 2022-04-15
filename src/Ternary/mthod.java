package Ternary;


import org.w3c.dom.ls.LSOutput;

public class mthod {
    public static void main(String[] args) {
        String cumle= "Nerede o 'hello world' yazdiramayan ogrenciler?";

        char harf='n';

        harfKacKezKullanildi(cumle,harf);

    }

    private static void harfKacKezKullanildi(String cumle, char harf) {
        int sayac=0;
        String harfstr=""+harf;
        String kelimeler[]=cumle.split("");
        for (int i = 0; i <kelimeler.length ; i++) {
            if (kelimeler[i].equals(harfstr)){
                sayac++;
            }


        }
        System.out.println("Aradiginiz " + harf + " verilen cumlede " + sayac + " adet kullanilmis");

    }

}

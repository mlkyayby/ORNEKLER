package DATA_TURLERI;

public class C05_datacasting {
    public static void main(String[] args) {

        /* byte veri tipinde bir degisken olusturun,short,int,
        loat ve double data tiplerinde degisken olusturup narroving yapiniz
         */


       byte sayi1=6;
       short sayi2=10;
        System.out.println(sayi1/sayi2);

        short sayi3=10;
        int sayi4=sayi3;
        System.out.println(sayi4);

       int sayi5=6;
       byte sayi6= (byte) sayi5;
        System.out.println(sayi5/sayi6);
       double sayi7=9;
       byte sayi8=(byte)sayi7;

        System.out.println(sayi8);

    }
}

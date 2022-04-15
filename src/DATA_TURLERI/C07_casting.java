package DATA_TURLERI;

public class C07_casting {
    public static void main(String[] args) {
      int sayi1=20;
      short sayi2=6;

        System.out.println(sayi1/sayi2);

        int sayi3=9;
        double sayi4=sayi3;
        System.out.println(sayi4);
        byte sayi5=8;
        short sayi6=sayi5;
        System.out.println(sayi6);
        int sayi7=824;
        double sayi8=10;
        System.out.println(sayi7/sayi8);

        //Narrowing

        int sayi9=34;
        byte sayi10=(byte)sayi9;
        System.out.println(sayi10);

        double sayi11=66;
        int sayi12=(int)sayi11;
        System.out.println(sayi12);
        System.out.println(sayi11/sayi12);

    }
}

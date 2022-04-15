package DATA_TURLERI;

public class C06_narrowing {

    public static void main(String[] args) {

        int sayi1=6;
        byte sayi2=(byte)sayi1;
        System.out.println(sayi1);

        double sayi7=478.2;
        int sayi8=(int)sayi7;
        System.out.println(sayi7);


        byte sayi3=16;
        int sayi4=sayi3;
        System.out.println(sayi3);
        short sayi5=456;
        double sayi6=sayi5;
        System.out.println(sayi5);


     float sayi9=4522;
        System.out.println(sayi9);

    double sayi10=255.36;
    int sayi11=(int)sayi10;

    byte sayi12=(byte)sayi11;
        System.out.println(sayi10 + sayi11);


        int sayi13=60;
        int sayi14=6;
        System.out.println(sayi13/sayi14);

        int sayi15=96;
        double sayi16=9.2;
        System.out.println(sayi15/sayi16);



    }
}

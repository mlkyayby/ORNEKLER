package forloppp;

public class forloop1 {
    public static void main(String[] args) {
        /*
         * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
         * yaziniz
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         *
         * OUTPUT : Arraydeki cift sayilarin toplami : 30
         */
        int input[][] = {{1, 3, 6}, {2, 8}, {5, 7, 9, 14}};
        int ciftSayilar = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if (input[i][j] % 2 == 0) {
                    ciftSayilar += input[i][j];
                }
            }
        }
        System.out.println(ciftSayilar);
    }
}

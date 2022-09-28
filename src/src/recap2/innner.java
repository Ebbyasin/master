package src.recap2;

import java.util.Arrays;

public class innner {

    public static void main(String[] args) {

        int[][] input= { {1,2,3}, {4,5}, {6,7} };

        int yeni[]=new int [input.length];

        int toplam=0;

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                toplam+=input[i][j];

            }
            yeni[i]=toplam;
            toplam=0;


        }
        System.out.println("istenen yeni array " + Arrays.toString(yeni));



    }
}

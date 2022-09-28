package javaPracticeMiracHoca;

import java.util.Arrays;

public class soru_1 {

    public static void main(String[] args) {
        int[] num = {-4,-1,0,3,10};
        // System.out.println(Arrays.toString(sortedArray(num)));
        int[] num2 = Arrays.stream(num).map(x->x*x).sorted().toArray();
        System.out.println(Arrays.toString(num2));

    }

    /*public static int[] sortedArray(int[] num){

        int i =0;
        for( ; i< num.length; i++) {
            num[i] = num[i] * num[i] ;
        }
        Arrays.sort(num);

        return num;
    }*/

}

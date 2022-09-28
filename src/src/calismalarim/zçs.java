package src.calismalarim;

import java.util.Arrays;
import java.util.Scanner;

public class zçs {

    public static void main(String[] args) {


        int sayilar []=birArrayOlustur();
        System.out.println(Arrays.toString(sayilar));
    }

    private static int[] birArrayOlustur() {
        Scanner scan=new Scanner(System.in);
        System.out.println("kac elemanli bir array olusturmami istersiniz");
        int uzunluk=scan.nextInt();
        int olusturulan[]=new int[uzunluk];

        for (int i = 0; i < uzunluk; i++) {
            System.out.println(i + ". index icin sayi giriniz");
            olusturulan[i]= scan.nextInt();

        }


        return olusturulan;
    }


}


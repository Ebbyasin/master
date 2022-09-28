package src.day2;

import java.util.Scanner;

public class Q01_Modulus {
    public static void main(String[] args) {
        /*
         *  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
         *
         *   Ex :
         *   input  : 12345
         *   output : 12
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 5 basamaklı bir sayı giriniz");
        int sayi=scan.nextInt();
        int rakam=0;
        int rakamlarToplami=0;
        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;
        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;
        sayi/=10;
        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;
        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;
        System.out.println("rakamlarToplami = " + rakamlarToplami);

        /*
         public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("lutfen 5 basamakli sayi giriniz :");
        int num=scan.nextInt();
        int ilkIki= num/1000;
        int sonIki= num%100; //100 e bolumunden kalani verir
        int ilkIkiTop = (ilkIki/10) + (ilkIki%10);
        System.out.println("ilkIkiTop = " + ilkIkiTop);
        int sonIkiTop = (sonIki/10) + (sonIki%10);
        System.out.println("sonIkiTop = " + sonIkiTop);
        System.out.println("sayilarin toplami :" + (ilkIkiTop+ sonIkiTop));
         */
    }
}

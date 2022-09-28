package src;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arRRayLIST {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi girin");
        int sayi1 = scan.nextInt();
        System.out.println("bir sayi daha girin");
        int sayi2 = scan.nextInt();

        int sayi3;

        System.out.println("sayi1 ilk durum " + sayi1);
        System.out.println("sayi2 ilk durum " + sayi2);

        sayi3 = sayi1;
        sayi1 = sayi2;
        sayi2 = sayi3;

        System.out.println();

        System.out.println("sayi1 son durum " + sayi1);
        System.out.println("sayi2 son durum " + sayi2);




    }
}

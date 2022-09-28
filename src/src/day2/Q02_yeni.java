package src.day2;

import java.util.Scanner;

public class Q02_yeni {
    public static void main(String[] args) {
        /*
        Soru 8) Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gere cevap yazdirin.
        Teklif 80.000'in uzerinde ise "Kabul ediyorum" ,
        60 - 80.000 arasinda ise "Konusabiliriz",
        60.000'nin altinda ise "Maalesef Kabul edemem" yazdirin
        */

        Scanner scan =new Scanner(System.in);
        System.out.println("Maas teklifiniz nedir ? ");
        int x = scan.nextInt();

        if (x>=80000){
            System.out.println("kabul");
        }else if (x>60000 && x<80000){
            System.out.println("konusabilriz");
        }else {
            System.out.println("kabul edemem");
        }

    }

}

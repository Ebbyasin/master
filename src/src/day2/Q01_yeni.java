package src.day2;

import java.util.Scanner;

public class Q01_yeni {
    public static void main(String[] args) {
        /*
        Soru 6) Kullanicidan iki sayi isteyin,
        sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
        sayilarin ikisi de negative ise sayilarin carpimini yazdirin,
        sayilarin ikisi farkli isaretlere sahipse "farkli isaretlerde sayilarla islem yapamazsin" yazdirin,
        sayilardan sifira esit olan varsa "sifir carpmaya gere yutan elemandir" yazdirin.
        */
        Scanner scan =new Scanner(System.in);
        int x,y;
        System.out.println("ilk sayiyi giriniz");
        x = scan.nextInt();
        System.out.println("ikinci sayiyi giriniz");
        y=scan.nextInt();

        if (x>0 && y>0){
            System.out.println(" Toplami : " + (x+y));
        }else if(x<0 && y<0){
            System.out.println("Carpimi : " + (x*y));
        }else if (x==0 || y==0){
            System.out.println("Sifir carpmaya gore yutan elemandır");
        }else {
            System.out.println("farkli isaretlerde sayilarla islem yapamazsınız");
        }


    }
}

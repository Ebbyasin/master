package src.recap2;

import java.util.Scanner;

public class Q05_StringManipulation {

    //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soyisminizi giriniz");
        String firsName=scan.nextLine(),   //Multiple declaration
                lastName=scan.nextLine();

        String fullName= firsName.concat(" "+ lastName).toUpperCase();
        System.out.println("fullName = " + fullName);

    }


}

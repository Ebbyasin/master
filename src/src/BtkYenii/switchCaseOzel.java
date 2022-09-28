package src.BtkYenii;

import java.util.Scanner;

public class switchCaseOzel {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        char not=scan.next().charAt(0);

        switch (not){
            case 'A':
                System.out.println("mukemmel :+gectiniz");
                break;
            case 'B':
                System.out.println("basarili : gectiniz");
                break;
            case'C':
                System.out.println("iyi : gectiniz");
                break;
            default:
                System.out.println("lutfen gecerli bir not giriniz");

        }
    }
}

package src.calismalarim;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class scannrr {
    public static void main(String[] args) {

       /* Soru 5) (iterator ile index kullanimina ornek) Bir listedeki ilk n elemani iterator kullanarak 5 artirin.
                Orn :  list : [2,13,56,23,45,14,40]
        artirilmasi istenen eleman sayisi : 3 output: [7,18,61,23,45,14,40]

        */

        List<Integer> liste = new ArrayList<>();
        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);
        System.out.println("Liste Başlangıç Hali : " + liste); // Liste Başlangıç Hali : [2, 13, 56, 23, 45, 14, 40]


        Scanner scan = new Scanner(System.in);
        System.out.println(" Kaç Eleman 5 Artırılacak : ");

        int index = scan.nextInt();
        int i = 1;
        int temp;
        ListIterator lit1 = liste.listIterator();

        while (lit1.hasNext()) {
            temp = (Integer) lit1.next();
            if (i <= index) {
                lit1.set(temp + 5);
            }
            i++;
        }
        System.out.println(liste);

    }
}












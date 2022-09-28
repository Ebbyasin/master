package src;

import java.util.Scanner;

public class jgfd {
    public static void main(String[] args) {
        String [] isimler= {"Basak", "Nurullah", "Fatih","Adem","Enes"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Aradiginiz ismi yaziniz");
        String arananIsim=scan.nextLine();
        boolean sonuc= contains(isimler,arananIsim);

        if (sonuc){
            System.out.println("Girilen isim listede var");
        } else {
            System.out.println("girilen isim listede yok");
        }
        }

    private static boolean contains(String[] isimler, String arananIsim) {

        boolean methodSonuc=false;
        for (int i = 0; i < isimler.length; i++) {
            if (isimler[i].equalsIgnoreCase(arananIsim)){
                methodSonuc=true;

            }

        }
        return methodSonuc;




    }


}

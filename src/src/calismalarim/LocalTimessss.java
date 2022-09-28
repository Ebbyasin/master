package src.calismalarim;

import java.time.LocalTime;

public class LocalTimessss {
    public static void main(String[] args) {
        LocalTime baslangic=LocalTime.now();

        String str="ahhh java";

        for (int i = 0; i < 10000; i++) {
            str+=".";

            
        }
        LocalTime bitis=LocalTime.now();
        System.out.println("baslangic = " + baslangic);
        System.out.println("bitis = " + bitis);

        System.out.println("bitis.getNano()-baslangic.getNano() = " + (bitis.getNano() - baslangic.getNano()));

         baslangic=LocalTime.now();

        StringBuilder sb=new StringBuilder("ahhh java");

        for (int i = 0; i < 10000; i++) {
            sb.append(".");


        }
        bitis=LocalTime.now();
        System.out.println("baslangic = " + baslangic);
        System.out.println("bitis = " + bitis);

        System.out.println("bitis.getNano()-baslangic.getNano() = " + (bitis.getNano() - baslangic.getNano()));



    }
}


package src;

public class yeniGun {

    public static void main(String[] args) {
        // Soru 1- Verilen bir int array’deki en buyuk sayiyi yazdiran bir method olusturun.
        int[] sayilar = {3, 5, 7, 1, 4, 9,10, 5, 2};
        int max=sayilar[0];

        for (int sylr:sayilar) {
            if (max<sylr){
                max=sylr;
            }
        }
        System.out.println("max sayi :" +max);
        System.out.println();

        String [] isimler={"elif,betul,yasin,birgul"};
        System.out.println();

        for (String isim:isimler) {
            System.out.println("mesekoparan ailesi :" + isim);
        }

        maxiSayiYaz(sayilar);

    }

    public static void maxiSayiYaz(int[] sayilar) {

        int maxiSayi=sayilar[0];
        for (int i = 1; i <sayilar.length ; i++) {
             if (sayilar[i]>maxiSayi) {
                 maxiSayi=sayilar[i];
             }


        }
        System.out.println();
        System.out.println("arraydeki en buyuk sayi : " +maxiSayi);
    }
}

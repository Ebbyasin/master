package src;

public class heyecan {
    public static void main(String[] args) {
        //Soru 2- Verilen String bir array’de en uzun ve en kisa String’leri yazdiran bir method olusturun

        String[] isimler ={"Erdal","Onur","Mehmet","Hayrullah","Mihrican"};

        uzunVeKisa(isimler);
    }

    public static void uzunVeKisa(String[] isimler) {

        String uzun=isimler[0];
        String kisa=isimler[0];

        for (int i = 1; i < isimler.length ; i++) {

            if (isimler[i].length()>uzun.length()){
                uzun=isimler[i];
            }

            if (isimler[i].length()<kisa.length()){
                kisa=isimler[i];
            }



        }
        System.out.println("Arraydeki en uzun kelime : " + uzun);
        System.out.println("Arraydeki en kisa kelime : " + kisa);




    }
}

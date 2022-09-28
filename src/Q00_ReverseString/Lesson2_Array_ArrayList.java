package Q00_ReverseString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson2_Array_ArrayList {
    public static void main(String[] args) {

        String[] pazarSepeti = new String[5]; // uzunlugunu biliyorsam array iyidir...uygundur..pazara gidiyoruz,
        // ne alacagimiz belli,sayisi belli...o zaman array,,ama aklina geleni al derlerse array uygun degil..giderken
        // belliydi ,telefon geldi sunu da al dediler,yine sıkıntı..aldin geri gotur,yine olmaz,arrayin eleman
        // sayisiyla oynayamazsin.en basinda net olmali.sayi net belli olmali,bu problemlerin cozumu collection yapilar
        // .array bizim icin nimet,ama bu cozumsuzlukte cozum icin java collectionlari yapmis.list,vb yapilar, OGREN..

        String[] pazarSepeti2 = {"elma","patates","kivi","karpuz","muz"};

        List<String > listPazarSepeti = new ArrayList<>();
        listPazarSepeti.add("elma");
        listPazarSepeti.add("patates");
        listPazarSepeti.remove("patates");


        List<String> listPazarSepeti2 = Arrays.asList(pazarSepeti2); // TODO

        System.out.println(listPazarSepeti2.size());
        listPazarSepeti.add(1,"çikolata");

        listPazarSepeti.set(0,"pasta");

        System.out.println(listPazarSepeti2.get(0));

        if(!listPazarSepeti.contains("ketcap")) listPazarSepeti.add("ketcap");


    }
}

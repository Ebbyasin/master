package lambda_functional_programming;

import java.util.ArrayList;
import java.util.List;

public class Fp01 {
    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);
        listElemanlariniYazdirStructured(liste);
        System.out.println();
        listElemanlariniYazdirfunctional(liste);
        System.out.println();
        ciftElemanlariYazdirStructured(liste);
        System.out.println();
        System.out.println("Functional:");
        ciftElemanlariYazdirFunctional(liste);
        System.out.println();
        tekElemanlarinKareleriniYazdir(liste);
        System.out.println();
        tekrarsizElemanlarinKupunuYazdir(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKareToplami(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKareToplami(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKuplerininToplami(liste);
        System.out.println();
        getMaxEleman(liste);




        //1-ardisik list elementlerini ayni satirda aralarinda bosluk birakarak yazdiran bir method olusturun.(structured)



        }
    public static void listElemanlariniYazdirStructured(List<Integer>list){
        for (Integer w:list) {//once listedeki 8 i alip w ya koyacak sonra loopta kullancak,
                               // sonra 9 sonra 131....
            System.out.print(w+" ");//bu methodu ustte cagirmam gerekiyor,cagırmazsam buradaki
                                // sekliyle yazmaz.
        }

    }
    //1-ardisik list elementlerini ayni satirda aralarinda bosluk birakarak yazdiran bir method olusturun.(functional)

    //stream metodunu kullanarak lambdayi kullanilir hale getirecegiz.
    public static void listElemanlariniYazdirfunctional(List<Integer>list){

        //benim list imi tek tek foreach gibi kullanabilmem icin (foreach loop u bir method ile yapacam) oncelikle
        //stream a tabi tutmam lazim.yoksa foreach loop u kullanamam.stream bir cok yeni method elde edebilmemiz icin
        //lambda icin gelistirilmis bir method,stream methodu..lamd da da encok karsimiza cikacak sey lambda expresion(t)
        //t element(u ve v de olabilir,variable,,ok isareti arrow..arrow kullanildiginda asagida listten aldigim
        // variable yerine gececek,
        //lambda expression t->
        list.stream().forEach(t-> System.out.print(t+" "));

        //stream() methodu collection dan elementleri akisa dahil etmek icin ve methodlara ulasmak icin kullanilir.

        // *****listedeki elemanlarin foreach a ulasmasi icin  stream a ihtiyac var*****

    }
    //2- cift list elemanlarini ayni satirda aralarinda bosluk birakarak yazdiran bir method olusturun.(structured)

    public static void ciftElemanlariYazdirStructured(List<Integer>list){
        for (Integer w:list) {
            if (w%2==0){
                System.out.print(w+" ");
            }

        }

    }
    //2-cift sayi olan cift list elemanlarini ayni satirda aralarinda bosluk birakarak yazdiran bir method
    // olusturun.(structured)

    public static void ciftElemanlariYazdirFunctional(List<Integer>list){// +++++ONEMLİ+++++burda sagdaki list dinamic,
        // oraya mahmut yazip
        // alt tarafa da mahmut.stream yapabilirsin.burdaki (List<Integer>list) in manasi:"bu bir integer list ile
        // calisacak" diye bir kosuldur. demek.biz buraya list koymuyoruz,burada list yok,list yukarda,bu su demek :
        // "buraya bir list koy,parametre olarak.isimlerin farkli olmasi anlasilabilir olmasi acisindan..sagdaki list
        // konteynir oluyor.o konteynirin ne oldugunu belli etmem lazim."List>Integer>"kismi integer dan olusan bir
        // List bu diyor.String olabilirdi ama foreach le String kullanilamaz,compleyn olur,collection yada arrays e
        // cevirmen gerekir.su ana kadar gordugumuz corjava structured programing di bundan sonra lambda expressionlar
        // functional olacak

        list.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" "));

    }

    //3-ARDİSİK tek list elemanlarinin karelerini ayni satirda aralarinda bosluk birakarak yazdiran bir method
    // olusturun.(functinola)

    public static void tekElemanlarinKareleriniYazdir(List<Integer>list){

        list.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t+" "));
       //elemanlarin degerleri degisecekse map() methodu kullanilir.
        //bu islemler esnasinda list in ici degismiyor.atama yok.map methodu donusturur.farkli bir sayiya donusur.
    }

    //4-ardisik tek list elementlerinin kuplerini tekrarsiz olarak ayni satirda aralarinda bosluk birakarak yazdiran
    // bir method olusturun.

    public static void tekrarsizElemanlarinKupunuYazdir(List<Integer>list){

        list.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t-> System.out.print(t+" "));

        /*1. yazdigimizda bize herhangi bir method onermez neden bu primitive value.
        biz bunu "ali". yaparsak (String bir ifade) yanda secmemiz icin bir suru method cikar,sonra yine string
         donen bir method secip nokta koyunca yine birsuru method lar cikacaktir.yani bir onceki value neyse("ali") o
        degiskene uygun olan methodlari bize verecektir
        "ali".toLowerCase().toUpperCase().split("").artik burda split bize array verecegi icin en basta String
        olan ifade array oldu bizi lambda kullanabilir hale getirdi..method chain -zincirleme method- budur.

         */
    }

    //5-Tekrarsiz cift elemanlarin karelerinin toplamini hesaplayan bir method olusturun.

    public static void tekrarsizCiftElemanlarinKareToplami(List<Integer>list){

        Integer toplam=list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u);

        System.out.print(toplam);
        //neden integer yerine Integer(wrapper class) kullandik,cunku nonprimitive bizim farkli method kullanmamiza olanak
        // sagliyor.mesela list olusturmak istiyorsak integer lari nonprimitive kullanmak zorundayiz.kabul etmez.


    }
    //6-)tekrarsiz cift elemanlarin kupunun carpimini hesaplayan bir method?

    public static void tekrarsizCiftElemanlarinKuplerininToplami(List<Integer>list){

        Integer toplam=list.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1,(t,u)->t*u);

        System.out.println(toplam);
    }

    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.

    public static void getMaxEleman(List<Integer> list){
        Integer max=list.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)->t>u ? t : u);
        System.out.println(max);





        


    }





}

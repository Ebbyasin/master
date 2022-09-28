package src.calismalarim;

public class ilki {

    public static void main(String[] args) {

        int sayi1=10;
        int sayi2=5;

        int sonuc=carpGetir(sayi1,sayi2);
        System.out.println("sonuc : " + sonuc);

    }

    public static int carpGetir(int sayi1, int sayi2) {

        int sonuc=sayi1*sayi2;
        return sonuc;
    }
}

package Oop_polimorphism;

public class Runner001 {

    public static void main(String[] args) {       //   Animal
        Civciv civciv1=new Civciv();
        Animal animal= new Civciv();
        Ordek ordek1 =new Ordek();


        hayvanSesCikar(civciv1);
        hayvanSesCikar(ordek1);
    }

    public static void hayvanSesCikar(Animal bos){ //bir methodun icine birden cok sey koyabiliyorsak polimorphism
        bos.sesiCikar();
    }

}

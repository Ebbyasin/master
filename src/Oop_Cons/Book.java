package Oop_Cons;


public class Book {

    public String name  ;
    public int pageNumber;
    public String author;
    public String publisher;
    public double price ;

    public Book(String name, int pageNumber, String author, String publisher, double price) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    public Book() {
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.name="Şeker Portakalı";
        book1.author="Jose Mauro de Vasconcelos";
        book1.pageNumber= 180 ;
        book1.price=25 ;
        book1.publisher="Can Yayınları";

        Book book2 = new Book("Kiraz Mevsimi",145,"Mirac","abc yayınları",75);






        /*
        Java Encapsulation aslında java sınıfı içerisinde tanımladığımız değişkenlerimizi
        korumak veya saklamak anlamına gelmektedir. Tanımladığımız bir
        sınıf içerisindeki değişkenin direk olarak değiştirilememesi,
        bunun yerine bizim izin verdiğimiz ölçüde, metotlar aracılığıyla
        değiştirilmesi gerekmektedir. Bir değişkene sadece okuma yetkisi
        verebilir, sadece yazma yetkisi verebilir veya hem okuma hem yazma
        yetkisi verebiliriz.

         Abstraction yapısı kurularak kullanıcıya yapılacak işlemin
         fonksiyonelliği sunulur. Bu şekilde kullanıcı kullandığı metodun
         ne yaptığıyla ilgilenirken, nasıl yaptığıyla ilgilenmez.
         Bu durumda fonksiyonellik ön plana çıkarken, işin nasıl yapıldığı
         gizle     nir


         */

    }
}

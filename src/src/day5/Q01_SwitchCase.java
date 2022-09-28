package src.day5;

public class Q01_SwitchCase {

    public static void main(String[] args) {

         /*
         gunleri gösterebilen bir program yazın
          gun Pazartesi veya Sali ise:     bu arada interwiew ne demek sor

          gun Persembe veya Cuma ise:
         Selenyum dersi gunleri

         gun carsamba veya cumartesi ise:
         SQL dersi gunleri

         aksi halde: izin gunu
         (if deyimini KULLANMAYIN)
         */

        String gun = "xxxx"; //long boolean double kullanılmıyor switch case de

        switch (gun) {
            case "pazartesi":
            case "Sali":
                System.out.println("java dersi");
                break;
            case "Carsamba":
            case "Cumartesi":
                System.out.println("sql dersi");
                break;
            case "Persembe":
            case "Cuma":
                System.out.println("selenium dersi");
                break;

            default:
                System.out.println("izin gunu");


        }


    }
}

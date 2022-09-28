package src.calismalarim;

public class tekrarDene {

    public static void main(String[] args) {
        
        String input="Birgul Mesekoparan";
        TekrarsizVer(input);
        
    }

    public static void TekrarsizVer(String input) {
        String tekrarsizKelime = "";



        String degisecekCumle=input.replaceAll("\\W","");
        System.out.print(degisecekCumle.substring(0,1));
        tekrarsizKelime = degisecekCumle.substring(0, 1);

        for (int i = 1; i < degisecekCumle.length(); i++) {


            if (!tekrarsizKelime.contains(degisecekCumle.substring(i,i+1))){
                System.out.print(" ," + degisecekCumle.substring(i,i+1));
                tekrarsizKelime+=degisecekCumle.substring(i,i+1);

            }

        }

        System.out.println("");
        System.out.println("inpt :" + input);
        System.out.println("tekrarsiz Kelime :" + tekrarsizKelime );

    }
}

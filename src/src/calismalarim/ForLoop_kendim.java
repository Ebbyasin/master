package src.calismalarim;

public class ForLoop_kendim {

    public static void main(String[] args) {

       String input="Elif Betul Mesekoparan";
       tekrarsızYaz(input);
    }

    public static void tekrarsızYaz(String input) {
        String tekrarlanmayanInput="";

        String islenecekCumle=input.replaceAll("\\W","");
        System.out.print(islenecekCumle.substring(0,1));
        tekrarlanmayanInput+=islenecekCumle.substring(0,1);

        for (int i = 1; i < islenecekCumle.length(); i++) {

            if (!tekrarlanmayanInput.contains(islenecekCumle.substring(i,i+1))){


            System.out.print(" ," +islenecekCumle.substring(i,i+1));
            tekrarlanmayanInput+=islenecekCumle.substring(i,i+1);

            }

        }

        System.out.println("");
        System.out.println("inpt: " + input); // bunu neden yazdirdik??
        System.out.println("tekrarlanmayan input : " + tekrarlanmayanInput);








    }
}

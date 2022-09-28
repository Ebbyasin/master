package src.calismalarim;

public class sondan {
    public static void main(String[] args) {

        /*
        yasin
        yasi
        yas
        ya
        y
        seklinde yaz?
         */

        String input="yasin";


        for (int i = input.length(); i >=1 ; i--){
            for (int j = i; j >=1 ; j--) {
                System.out.print(input.substring(j-1,j));

            }
            System.out.println("");

        }

    }
}


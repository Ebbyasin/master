package src.calismalarim;

public class mmm {

    public static void main(String[] args) {
        String input="elifbetul";

        for (int i = input.length() ; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(input.substring(j - 1, j));
            }
            System.out.println("");
        }
    }
}

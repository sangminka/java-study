package ex03;

public class Star01 {
    public static void main(String[] args) {

        String star = "*";

        for (int k = 1; k <= 6; k++) {
            for (int i = 0; i < k; i++) {
                System.out.print(star);
            }
            System.out.println();
        }



    }
}

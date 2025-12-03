package ex03;

public class Star02 {
    public static void main(String[] args) {
        String star = "*";

        for (int k = 5; k >= 1; k--) {
            for (int i = 0; i < k; i++) {
                System.out.print(star);
            }
            System.out.println();
        }
    }
}

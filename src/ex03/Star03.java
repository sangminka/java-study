package ex03;

public class Star03 {
    public static void main(String[] args) {

        String space = " ";
        String star = "*";

        int low = 10;
        int n1 = low -1;
        int n2 = 1;

        for (int k = 0; k < low; k++) {
            for (int i = 0; i < n1; i++) {
                System.out.print(space);
            }
            for (int i = 0; i < n2; i++) {
                System.out.print(star);
            }
            System.out.println();
            n1--;
            n2++;

        }
    }
}

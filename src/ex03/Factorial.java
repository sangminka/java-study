package ex03;

public class Factorial {
    public static void main(String[] args) {
        long fact = 1;
        int n = 20;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;


        }
        System.out.printf("%d!은 %d입니다.\n", n, fact);
    }
}

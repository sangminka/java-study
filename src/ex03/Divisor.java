package ex03;

public class Divisor {
    public static void main(String[] args) {
        int n = 100;

        System.out.println(n + "의 약수는 다음과 같습니다");
        for (int i = 1; i <= n; ++i) {
            if(n%i == 0) {
                System.out.print(" " + i);
            }
        }
    }
}

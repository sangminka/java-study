package algo;

/**
 * 12의 약수를 출력하시오?!
 * (1) 비지니스 이해 (12를 1부터 12까지 다 나눠서 나누어 떨어지면 약수
 * (2) 샘플링 6의 약수 구하기
 * (3)노가다
 * (4)패턴 찾기
 *
 * 1. 약수구하기 (여기까지 목표)
 *
 * 2. 두 수의 최대공약수 구하기 (도전)
 * (1) 12의 약수 [1,2,3,4,6,12] 배열에 담기
 * (2) 6의 약수 [1,2,3,6] 배열에 담기
 * (3) 두수의 최대 공약수 구하기 6 (배열을 비교해야함)
 *
 * 3. GCD 최대공약수 공식으로 풀기 (도전)
 * 
 */
public class Divisior01 {
    public static void main(String[] args) {

        int n = 1;
        int k = 6;
        String result ="맞음";

        for (int i = 0; i < k; i++) {
            if (k%n == 0){
                result = "맞음";
            }else {
                result = "아님";
            }
            System.out.println(n+" 은 약수"+result+".");
            n++;
        }


    }
}

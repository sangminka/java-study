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
public class Divisior02 {

    int count(int a){
        int n = 1;
        int count = 0;
        for (int i = 0; i < a; i++) {
            if (a%n == 0){

                count++;
            }
            n++;
        }
        return count;
    }

    void insert(int a){
        for (int i = 0; i <a ; i++) {

        }
    }

    public static void main(String[] args) {
        Divisior02 divisior02  = new Divisior02();
        int n1 = divisior02.count(12);
        int n2 = divisior02.count(6);
        System.out.println(n1);
        System.out.println(n2);

        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
    }
}

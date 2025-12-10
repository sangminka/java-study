package algo;

import java.util.Random;

public class LottoApp02 {
    public static void main(String[] args) {

        int count = 0;
        int[] arr = new int[6];
        int[] ball = new int[45];
        int temp = 0;
        //랜덤 함수 생성
        Random r= new Random();
        int n;

        // ball 1 ~ 6 까지 생성
        for (int i = 0; i < ball.length; i++) {
            ball[i] = i + 1;
        }
        // Ball 체크

        System.out.println("현재 볼 상태");
        for (int i = 0; i < ball.length; i++) {
            System.out.print(ball[i] +  " ");
        }
        System.out.println(" ");
        while (count < 6){
            n= r.nextInt(45);

            if (ball[n] != 0){
                arr[count++] = ball[n];
                ball[n] = 0;
            }
        }


        // Ball 체크
        System.out.println("현재 볼 상태");
        for (int i = 0; i < ball.length; i++) {
            System.out.print(ball[i] +  " ");
        }
        System.out.println(" ");


        // 당첨 번호
        System.out.println("추첨 번호");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }
}

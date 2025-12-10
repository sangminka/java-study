package algo;

import java.util.Random;

public class LottoApp {
    public static void main(String[] args) {

        int[] arr = new int[6];
        int count = 0;
        Random r = new Random();

        while (count < 6) {
            // 랜덤 수 생성
            boolean bool = false;
            int n = r.nextInt(6) + 1;
            // 배열 체크
            //count = 현재 배열 index 개수
            for (int i = 0; i <= count; i++) {
                if (arr[i] == n) {
                    bool = true;
                }
            }
            if (bool) {
                continue;
            }
            arr[count] = n;
            count++;

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

package algo;
/**
 * 달팽이 알고리즘 구현
 * (1) 비지니스
 *      2의 배수 출력 나머지가 0일때만
 * (2) 샘플링
 *      2,2 까지
 * (3) 노가다
 *
 * (4) 패턴
 */
public class Snail01 {
    public static void main(String[] args) {
        int insert = 1;
        int[][] arr = new int[5][5];

        int i = 0;
        int j = 0;
        /**\
         *  y값 최대 까지 이동
         */

        for (i = 0; i < 5; i++) {
            arr[j][i] = insert++;
        }


        /**
         * x값 최대 까지 이동
         */
        for (j = 0; j <5; j++) {
            arr[j][i] = insert++;

        }


        /**
         * y값 0까지 감소
         */
        arr[4][3] = insert++;
        arr[4][2] = insert++;
        arr[4][1] = insert++;
        arr[4][0] = insert++;

        /**
         * x값 0 + 1 까지 감소
         */
        arr[3][0] = insert++;
        arr[2][0] = insert++;
        arr[1][0] = insert++;

        /**
         * y값 (최대 -1) 까지 증가
         */
        arr[1][1] = insert++;
        arr[1][2] = insert++;
        arr[1][3] = insert++;

        /**
         * x값 (최대 -1) 까지 증가
         */
        arr[2][3] = insert++;
        arr[3][3] = insert++;

        /**
         * y값 (0 + 1) 까지 감소
         */
        arr[3][2] = insert++;
        arr[3][1] = insert++;

        /**
         * x 값 (0 + 2) 까지 감소
         */
        arr[2][1] = insert++;

        /**
         * y값 (최대 - 2) 까지 감소
         */
        arr[2][2] = insert++;


        for (int k = 0; k < 5; k++) {
            for (int l = 0; l < 5; l++) {
                System.out.print(arr[k][l]+ " ");
            }
        }


    }
}

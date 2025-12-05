package snail;

/**
 * 달팽이 알고리즘 구현
 * (1) 비지니스
 * <p>
 * (2) 샘플링
 * 2,2 까지
 * (3) 노가다
 * <p>
 * (4) 패턴
 * <p>
 * 2,2 배열 노가다
 */
public class Snail05 {
    public static void main(String[] args) {
/**
 *  배열의 크기가 5,5 인 2차원 배열 생성
 */
        int len = 6;
        int[][] arr = new int[len][len];
        int input = 1;
/**
 * 배열에 집어 넣기
 *  01  02  03  04  05  06
 *  20  21  22  23  24  07
 *  19  32  33  34  25  08
 *  18  31  36  35  26  09
 *  17  30  29  28  27  10
 *  16  15  14  13  12  11
 */
        arr[0][0] = input;
        input++;

        arr[0][1] = input;
        input++;
        arr[0][2] = input;
        input++;
        // 3 -> 4 추가
        arr[0][3] = input;
        input++;
        // 4 -> 5 추가
        arr[0][4] = input;
        input++;
        // 5 -> 6 추가
        arr[0][5] = input;
        input++;

        arr[1][5] = input;
        input++;
        arr[2][5] = input;
        input++;
        // 3 -> 4 추가
        arr[3][5] = input;
        input++;
        // 4 -> 5 추가
        arr[4][5] = input;
        input++;
        // 5 -> 6 추가
        arr[5][5] = input;
        input++;



        arr[5][4] = input;
        input++;
        arr[5][3] = input;
        input++;
        // 3->4 추가
        arr[5][2] = input;
        input++;
        // 4->5 추가
        arr[5][1] = input;
        input++;
        // 5 -> 6 추가
        arr[5][0] = input;
        input++;


        arr[4][0] = input;
        input++;
        // 3->4 추가
        arr[3][0] = input;
        input++;
        // 4->5 추가
        arr[2][0] = input;
        input++;
        // 5 -> 6 추가
        arr[1][0] = input;
        input++;


        arr[1][1] = input;
        input++;
        // 3->4 추가
        arr[1][2] = input;
        input++;
        // 4->5 추가
        arr[1][3] = input;
        input++;
        // 5->6 추가
        arr[1][4] = input;
        input++;

        // 3->4 추가
        arr[2][4] = input;
        input++;
        // 4->5 추가
        arr[3][4] = input;
        input++;
        // 5->6 추가
        arr[4][4] = input;
        input++;

        // 3->4 추가
        arr[4][3] = input;
        input++;
        // 4->5 추가
        arr[4][2] = input;
        input++;
        // 5->6 추가
        arr[4][1] = input;
        input++;


        // 4->5 추가
        arr[3][1] = input;
        input++;
        // 5->5 추가
        arr[2][1] = input;
        input++;

        // 4->5 추가
        arr[2][2] = input;
        input++;
        // 5->6 추가
        arr[2][3] = input;
        input++;

        // 5->6 추가
        arr[3][3] = input;
        input++;
        // 5->6 추가
        arr[3][2] = input;
        input++;
/**
 * 배열 확인 하기
 */
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }

    }
}

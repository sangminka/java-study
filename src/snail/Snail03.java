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
public class Snail03 {
    public static void main(String[] args) {
/**
 *  배열의 크기가 4,4 인 2차원 배열 생성
 */
        int len = 4;
        int[][] arr = new int[len][len];
        int input = 1;
/**
 * 배열에 집어 넣기
 *  01  02  03  04
 *  12  13  14  05
 *  11  16  15  06
 *  10  09  08  07
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


        arr[1][3] = input;
        input++;
        arr[2][3] = input;
        input++;
        // 3 -> 4 추가
        arr[3][3] = input;
        input++;


        arr[3][2] = input;
        input++;
        arr[3][1] = input;
        input++;
        // 3->4 추가
        arr[3][0] = input;
        input++;


        arr[2][0] = input;
        input++;
        // 3->4 추가
        arr[1][0] = input;
        input++;

        arr[1][1] = input;
        input++;
        // 3->4 추가
        arr[1][2] = input;
        input++;

        // 3->4 추가
        arr[2][2] = input;
        input++;

        // 3->4 추가
        arr[2][1] = input;
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

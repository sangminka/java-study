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
public class Snail01 {
    public static void main(String[] args) {
/**
 *  배열의 크기가 2,2 인 2차원 배열 생성
 */
        int len = 2;
        int[][] arr = new int[len][len];
        int input = 1;
/**
 * 배열에 집어 넣기
 *  1  2
 *  4  3
 */
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][1] = 3;
        arr[1][0] = 4;

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

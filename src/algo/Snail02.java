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
public class Snail02 {
    public static void main(String[] args) {
        int insert = 1;
        int arrLen = 3;

        int[][] arr = new int[arrLen][arrLen];


        int x = 0;
        int y = 0;
        /**\
         *  y값 최대 까지 이동
         */
        // y 2 증가

        for (int i = 0; i < 2; i++) {
            arr[x][y] = insert++;
            y++;
        }


    
        // x2증가
        for (int i = 0; i < 2; i++) {
            arr[x][y] = insert++;
            x++;
        }
        

        // y = 2 감소

        for (int i = 0; i < 2; i++) {
            arr[x][y] = insert++;
            y--;
        }
        


        // x = 1 감소
        for (int i = 0; i < 1; i++) {
            arr[x][y] = insert++;
            x--;
        }

        

        // y = 1증가
        for (int i = 0; i < 1; i++) {
            arr[x][y] = insert++;
            y++;
        }

        //1,1
        for (int i = 0; i < 1; i++) {
            arr[x][y] = insert++;
            x++;
        }


        for (int k = 0; k < arrLen; k++) {
            for (int l = 0; l < arrLen; l++) {
                System.out.print(arr[k][l]+ " ");
            }
        }


    }
}

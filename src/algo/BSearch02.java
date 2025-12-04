package algo;

import java.util.Arrays;


// 10 찾기
public class BSearch02 {
    public static void main(String[] args) {
        int[] arr= {10,4,1,2,3,6,7};

        // 1. 정렬    {1,2,3,4,6,8,10}
        Arrays.sort(arr);

        int target = 10;
        int mid =arr.length/2;

        // 2. 검색
        /**
         * target이 가운데 있을때
         */
        if(target == arr[mid]){
            System.out.println("arr["+mid+"]번지에"+ target+ "이 있습니다.");
        }

        System.out.println("main 끝");
    }
}

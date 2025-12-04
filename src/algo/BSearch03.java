package algo;

import java.util.Arrays;


// 10 찾기
public class BSearch03 {
    public static void main(String[] args) {
        int[] arr= {10, 4, 1, 2, 3, 0, 11};


        // 1. 정렬
        Arrays.sort(arr);//0, 1, 2, 3, 4, 10, 11

        int target = 10;
        int start = 0;
        int end = arr.length-1;
        int mid =(end +start)/2;  // 3


        // 2. 검색
        /**
         * target이 가운데 있을때
         */
        if(target == arr[mid]){ //0, 1, 2, [3], 4, 10, 11
            System.out.println("arr["+mid+"]번지에 "+ target+ " 이 있습니다.");
            return;
        }

        if (target > arr[mid]){ //0, 1, 2, 3, 4, [10], 11
            start = mid +1;
            mid = (end +start)/2;
        }

        if (target < arr[mid]){ //0, [1], 2, 3, 4, [10], 11
            end = mid -1;
            mid = (end +start)/2;
        }

        if(target == arr[mid]){ //0, 1, 2, 3, 4, [10], 11
            System.out.println("arr["+mid+"]번지에 "+ target+ " 이 있습니다.");
            return;
        }

        if (target > arr[mid]){ //0, 1, 2, 3, 4, [10], 11
            start = mid +1;
            mid = (end +start)/2;
        }

        if (target < arr[mid]){ //0, [1], 2, 3, 4, [10], 11
            end = mid -1;
            mid = (end +start)/2;
        }
        if(target == arr[mid]){ //0, 1, 2, 3, 4, 10, [11]
            System.out.println("arr["+mid+"]번지에 "+ target+ " 이 있습니다.");
            return;
        }


        System.out.println("main 끝");
    }
}

package ex08;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int[] array = {9,4,5,6,2,1};
        Arrays.sort(array);         // 배열을 정렬한다
        printArray(array);
        System.out.println(Arrays.binarySearch(array,9));   // 9을 탐색한다.
        Arrays.fill(array,8);
        printArray(array);
    }

    private static void printArray(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println("]");
    }
}

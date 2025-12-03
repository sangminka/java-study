package algo;


// ChangeData3 {7,4,2,3,1,5,6}
public class ChangeData3 {
    public static void main(String[] args) {
        // Sort 정렬 (오름차순 1,2,3)
        int[] arr = {7, 4, 2, 3, 1, 5, 6};
        int temp;
        int row = arr.length;

        // 0,1 비교
        for (int k = 0; k <= arr.length - 1; k++) {
            for (int i = 0; i < row - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i]; // temp = arr[0]
                    arr[i] = arr[i + 1];    // arr[0] = arr[1]
                    arr[i + 1] = temp;    // arr[1] = arr[0]
                }
            }
            row--;
        }




        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}

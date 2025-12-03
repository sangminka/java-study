package algo;

public class ChangeData2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int temp;
        int a = arr.length - 1;
        int b = 0;
        int row = arr.length / 2;

        for (int i = 0; i < row; i++) {
            temp = arr[a];  // temp = arr[6]
            arr[a] = arr[b];    // {1,2,3,4,5,6,1}
            arr[b] = temp;    // {7,2,3,4,5,6,1}
            a--;
            b++;
        }


        for (int i = 0; i < 7; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

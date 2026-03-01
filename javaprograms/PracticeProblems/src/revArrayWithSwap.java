import java.util.Arrays;

public class revArrayWithSwap {

    public static void main(String[] args) {
        //          {45,32,22,24,7,3,1}
        int[] arr = {1,3,7,24,22,32,45}; // 1<->45,3<->32,7<->22,24
        System.out.println(Arrays.toString(reverseArray(arr)));
    }

/*
    static int[] reverseArray(int[] arr){

        for (int i = 0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }

        return arr;
    }
 */
static int[] reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}

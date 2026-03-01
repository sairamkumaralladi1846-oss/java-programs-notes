import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,3,7,24,22,32,45};
        int[] revArray = reverseArray(arr);

        for (int value: revArray) {
            System.out.println(value);
        }
        System.out.println(Arrays.toString(revArray));

    }

    static int[] reverseArray(int[] arr){
        int[] newArray = new int[arr.length];

        int j = 0;
        for(int i=arr.length-1;i>=0 ;i--){
//            System.out.println(i);
            int temp = arr[i];
            newArray[j] = temp;
            j++;
        }
        return newArray;

    }
}

import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] array2D = new int[3][3];

        // Row 0
        array2D[0][0] = 1;
        array2D[0][1] = 2;
        array2D[0][2] = 3;

        // Row 1
        array2D[1][0] = 4;
        array2D[1][1] = 5;
        array2D[1][2] = 6;

        // Row 2
        array2D[2][0] = 7;
        array2D[2][1] = 8;
        array2D[2][2] = 9;


        System.out.println("===================2D Arrary===========================");
        for (int[] row:array2D){
            System.out.println(Arrays.toString(row));
        }

        int[][] jaggedArray = {
                {1,2,3},
                {4,5},
                {6}
        };

        System.out.println("===================Jagged Arrary===========================");
        for (int[] row:jaggedArray){
            System.out.println(Arrays.toString(row));
        }
    }
}

import java.util.Scanner;
public class SquareOfN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        for(int i = 1; i<=n; i++){
            // System.out.print(i + " ");
            int num = input.nextInt();
            int square = num * num;
            System.out.print((square) + " ");
            sum+=square;
        }
          System.out.println();
          System.out.println(sum);
    }
}


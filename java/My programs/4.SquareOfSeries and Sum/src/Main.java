import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        for(int i = 0; i < n; i++){
            int num = input.nextInt();
            int square = num * num;
            sum+=num;
            System.out.print(square + " ");
        }
        System.out.println(" ");
        System.out.println(sum);

        input.close();
    }
}
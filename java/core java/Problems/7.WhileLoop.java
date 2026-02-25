package Problems;
import java.util.Scanner;
class WhileLoop {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    boolean condition = true;
    int total = 0;
    while(condition){
        System.out.println("Enter a number:");
        int num = input.nextInt();

        if(num>0){
            total += num;
        }
        else{
            condition = false;  
        }
    }
    System.out.println(total);
}


    
}

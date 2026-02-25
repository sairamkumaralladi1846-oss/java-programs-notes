package Problems;
import java.util.Scanner;
class StringMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter input:" );
        String str = input.nextLine();
        String str1 = str + " ";
        int len = str.length();
        String r = str1.repeat(3);
        System.out.println(r);
        String str2 = str1.substring(1,10);
        System.out.println(str2);
        input.close();
    }
    
}

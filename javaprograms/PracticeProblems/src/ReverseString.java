import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter input String:");
        Scanner input = new Scanner(System.in);
        String info = input.next();
        int len = info.length();
        String out = "";
        for (int i = len-1; i>=0 ; i--){
            out += info.charAt(i);
        }
        System.out.println(out);
    }
}


import java.util.Scanner;


public class TraingleString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Input String:");
        String info = input.next();
        int len = info.length();

        for (int k=0; k<len; k++) {
            for (int i = k; i < len; i++) {
                for (int j = k; j < i + 1; j++) {
                    System.out.print(info.charAt(j) + " ");
                }
                System.out.println();
            }
        }

    }
}

package Problems;

import java.util.Scanner;
class loopsTraingle{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 1; i<=n; i++){
            String out = "";
            for(int k=1;k<=(n-i); k++){
                    out = "  " + out;
            }

             for (int j=1; j<=i; j++){
                 out += " *"; 
             }
             
              System.out.println(out);
        }
        input.close();
    }
}

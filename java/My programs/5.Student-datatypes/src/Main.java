import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Student name:");
        String name = input.nextLine();
        System.out.println("Enter Student age:");
        int age = input.nextInt();
        System.out.println("Enter Student Average Grade:");
        double grade = input.nextDouble();

        System.out.println("---Student Profile---");
        System.out.println("Name:" +name);
        System.out.println("Age:" +age);
        System.out.println("Average Grade:" + grade);
    }
}
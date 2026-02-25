import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in celsius");
        //Reading input as a string
        String CelsiusString = input.nextLine();
        Object temp = CelsiusString;
        System.out.println(temp.getClass().getSimpleName());
        //Explicit type conversion string to float
        float CelsiusFloat = Float.parseFloat(CelsiusString);
        Object temp1 = CelsiusFloat;
        System.out.println(temp1.getClass().getSimpleName());
        //Explicit type conversion float to double
        double fahrenheit = CelsiusFloat * 9/5 + 32;
        Object temp2 = fahrenheit;
        System.out.println(temp2.getClass().getSimpleName());
        //Explicit type conversion from float to Int
        int fahrenheitInt = (int)fahrenheit;

        String fahrenheitresult = String.valueOf(fahrenheitInt);
        System.out.println(fahrenheitresult.getClass().getSimpleName());
        System.out.println("Temperature in fahrenheit:" +fahrenheitresult);
    }
}
package Problems;

class TypeConversion {
    public static void main(String[] args) {
        //byte b = 127;
        int a = 518; //implicit type conversion : lower range of byte converted to higer range of int implicitly
        byte k = (byte)a; //explicit type conversion : higher range of int to byte but byte range is 256 we can store upto 127. So, the resultant value 518 % 256
        System.out.println(a % 256); 
        System.out.println(k);
        float f = 5.6f;
        int t = (int)f;//explicit type conversion
        System.out.println(t);

        String num = "625";
        int num2 = Integer.parseInt(num);
        System.out.println(num2);
        String num3 = String.valueOf(num2);
        System.out.println(num3);
        char ch = '5';
        int n = Character.getNumericValue(ch);
        System.out.println(n);
        int num4 = 5;
        char ch1 = Character.forDigit(num4, 10);
        System.out.println(ch1);
        byte unicode = 65;
        char ch2 = (char)unicode;
        System.out.println(ch2);
        int unicode2 = ch2;
        System.out.println(unicode2);
    }
    
}

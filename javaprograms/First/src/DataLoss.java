public class DataLoss {

    public static void main(String[] args) {
        byte a = 126;
        byte b = a++;
        System.out.println(b);
        System.out.println(a);
        byte c = ++a;
        System.out.println(c);
        System.out.println(a);

        byte d = -128;
        System.out.println(--a);
    }

}

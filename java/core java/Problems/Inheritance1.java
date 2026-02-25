class Main{
    public static void main(String[] args) {
        Inheritance obj = new Inheritance();
        int r1 = obj.add(5,4);
        int r2 = obj.sub(6,3);
        int r3 = obj.multi(4,2);
        int r4 = obj.div(8,2);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
    }
}    
public class Inheritance1 extends Inheritance{
    public int multi(int n1, int n2){
        return n1 * n2;
    }
    public int div(int n1, int n2){
        return n1 / n2;
    }    
}

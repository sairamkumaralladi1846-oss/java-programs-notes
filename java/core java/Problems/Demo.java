public class Demo{
    public static void main(String[]args){
        MethodOverriding obj = new MethodOverriding();
        int r1 = obj.add(3,4);
        System.out.println(r1);
    }
}
    
class MethodOverriding {
    public int add(int n1, int n2){
        return n1 + n2;
    }
    class Calc extends MethodOverriding{
    public int add(int n1, int n2){
        return n1 + n2 + 1;
    }
}
}

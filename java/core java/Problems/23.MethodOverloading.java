public class Main{
    public static void main(String[]args){
        MethodOverloading m1 = new MethodOverloading();
        double sum1 = m1.add(1.2,4);
        System.out.println(sum1);
    }
}
class MethodOverloading {

    public int add(int a,int b){
        return a + b;
    }
    public int add(int a, int b, int c){
        return a + b + c;
    }
    public double add(double a, int b){
        return a + b ;
    } 
}



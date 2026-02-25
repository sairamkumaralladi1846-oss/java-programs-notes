class Main{
    public static void main(String[]args){
            Inheritance obj = new Inheritance();
            int r1 = obj.add(5,4);
            int r2 = obj.sub(6,4);

            System.out.println(r1 + " " +r2);
        }
}
class Inheritance 
{
    public int add(int n1, int n2){
        return n1 + n2; 
    }
    public int sub(int n1, int n2){
        return n1 - n2;
    }
}
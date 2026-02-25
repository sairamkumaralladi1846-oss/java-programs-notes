class Main{
        public static void main(String[] args) {
            Encapsulation obj = new Encapsulation();
            obj.setAge(28);
            obj.setName("IntelliJ");

            System.out.println(obj.getName() + ":" + obj.getAge());
        }
    }
class Encapsulation {
    private int age;
    private String name;

    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age = a;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

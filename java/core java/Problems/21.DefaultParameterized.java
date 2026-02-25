class Main{
    public static void main(String[]args){
        DefaultParameterized obj = new DefaultParameterized();
        DefaultParameterized obj1 = new DefaultParameterized("John");
        System.out.println(obj1.getName() + ":" + obj1.getAge());
        obj.setAge(18);
        obj.setName("Constructor");

        System.out.println(obj.getName() + ":" + obj.getAge());

        }
}

class DefaultParameterized {
    int age;
    String name;

    public DefaultParameterized(){
        age = 28;
        name = "Default"; 
    }
    public DefaultParameterized(String name){
        this.name = name;
    } 
    public DefaultParameterized(int age, String name){ //parameterized Constructor
        this.age = age;
        this.name = name;
    }
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

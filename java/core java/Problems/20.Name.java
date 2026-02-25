class Main{
        public static void main(String[]args){
            Name obj = new Name();
            Name obj1 = new Name();
            System.out.println(obj.getName() + ":" + obj.getAge());
            obj.setAge(28);
            obj.setName("IntelliJ");

            //System.out.println(obj.getName() + ":" + obj.getAge());
        }
    }
class Name {
    int age;
    String name;

    public Name(){
        age = 28;
        name = "Constructor";
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}

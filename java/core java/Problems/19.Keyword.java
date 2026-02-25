class Main{
        public static void main(String[]args){
            Keyword obj = new Keyword();
            obj.setAge(28);
            obj.setName("InteliJ");

            System.out.println(obj.getName() + ":" + obj.getAge());
        }
    }
class Keyword {
    int age;
    String name;

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

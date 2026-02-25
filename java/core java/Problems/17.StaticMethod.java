    
public class StaticMethod {
    public static void main(String[]args)
    {
    Mobile obj1 = new Mobile();
    obj1.brand = "Oneplus";
    obj1.price = 32000;
    obj1.name = "Smartphone";

    Mobile obj2 = new Mobile();
    obj2.brand = "Samsung";
    obj2.price = 25000;
    obj2.name = "Smartphone";

    Mobile obj3 = new Mobile();
    obj3.brand = "Realme";
    obj3.price = 28000;
    obj2.name = "Smartphone";

    obj1.show();
    obj2.show();
    obj3.show();

    Mobile.show1(obj1);
    }
    class Mobile{
        String brand;
        int price;
        static String name;
    
    public void show(){
        System.out.println(brand + ":" + price + ":" + name);
    }
    public static void show1(Mobile obj){
        System.out.println(obj.brand + ":" + obj.price + ":" + obj.name);
    }
}
}

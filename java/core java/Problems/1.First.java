 package Problems;

 class Main{
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(3,5);
        rect.getWidth();
       int area =  rect.getArea();
       System.out.println(area);
        rect.getName("Hello World");
    }
}

 class Rectangle{
    int width;
    int height;
 Rectangle(int width, int height){
    this.width = width;
    this.height = height;
 }
 void getWidth(){
    System.out.println(this.width);
 }
 int getArea(){
    return this.width * this.height;
}
void getName(String s){
    System.out.println(s);
}
}


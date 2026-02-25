package Problems;

class Main{
        public static void main(String[] args) {
            Rectangle rect = new Rectangle(4,5);
            int width = rect.getWidth();
            System.out.println("width");
            rect.getName("Hey java");
            int area = rect.getArea();
            System.out.println("area");
        }
    }

class Rectangle {
    int width;
    int height;
    Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    public int getWidth(){
        return this.width;
    }
    public void getName(String s){
        System.out.println(s);
    }
    public int getArea(){
        if (this.width <= 0 || this.height <= 0){
            return 0;
        } 
        return this.width * this.height;
    }
}

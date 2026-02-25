class Rectangle {
    int height;
    int width;

    Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }
    int getWidth(){
        return this.width;
    }
    void printArea(){
        System.out.println(this.height * this.width);
    }
    void printHello(String name){
        System.out.println("Hello this is:" + name);
    }
}

    class Main {
        public static void main(String[] args) {
            Rectangle r = new Rectangle(10, 20);
            System.out.println(r.height);
            int num = r.getWidth();
            System.out.println(num);
            r.printArea();
            r.printHello(" intellij");
        }

    }

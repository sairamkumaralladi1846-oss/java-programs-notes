class First {
    int width;
    int height;

    First(int width, int height){
        this.width = width;
        this.height = height;
    }
   int getWidth(){
        return this.width;
    }
    void getName(String s){
        System.out.println(s);
    }
}

class Main{
    public static void main(String[] args) {
        First obj = new First(5,3);
        obj.getWidth();
        obj.getName("Hey java");
    }
}
    

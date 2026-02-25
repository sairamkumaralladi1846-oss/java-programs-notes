package Problems;

class Loops {
    public static void main(String[]args){
    int num = 5;
    System.out.println("-------------For Loop----------------"  );
    for(int i = 1; i<=num; i++){
        System.out.println("Hello" + i);
    }
    System.out.println("-------------While Loop---------------");
    int i = 1;
    while(i<=num){
        System.out.println("Hello" + i);
        i++;
    }
     System.out.println("-------------do-While Loop---------------");
     
     i=6;
    do { 
        
        System.out.println("Hello" + i);
        i++;
    } while (i<=num);

}
    
}

class Array {
    public static void main(String[] args) {
        int num[] = {5,6,7,8,9} ;
        
        System.out.println(num[2]); //accessing array element
        num[2] = 10;  //updating array element
        System.out.println(num[2]);

        int num2[] = new int[5]; //dynamic array
        System.out.println(num2[1]);
        num2[0] = 5;
        num2[1] = 6;
        num2[2] = 7;
        num2[3] = 8;
        num2[4] = 9;
        System.out.println(num2[0]);
        System.out.println(num2[1]);
        System.out.println(num2[2]);
        System.out.println(num2[3]);
        System.out.println(num2[4]);

        for(int i = 0; i <= 4; i++){
            System.out.println(num2[i]);
        }
    }
}
    

public class EnhancedForloop {
    
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Java";
        s1.marks = 68;
        
        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Python";
        s2.marks = 89;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Springboot";
        s3.marks = 98;


        Student student[] = new Student[3];
        student[0] = s1; 
        student[1] = s2;
        student[2] = s3;

        for(Student stud : student){
            System.out.println(stud.name + ":" + stud.marks);
        }
        
    }
   
}
     class Student{
        int rollno;
        String name;
        int marks;
    }
 // int num[] =  new int[5];
        // num[0] = 2;
        // num[1] = 4;
        // num[2] = 6;
        // num[3] = 8;
        // num[4] = 10;

        // for(int num : n){
        //     System.out.println(n);
        // }

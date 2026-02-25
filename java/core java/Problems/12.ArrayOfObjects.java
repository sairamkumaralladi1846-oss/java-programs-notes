class ArrayOfObjects{
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
        s3.marks = 92;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i=0; i<students.length; i++){
            System.out.println(students[i].name + ":" + students[i].marks);
        }
    }

        // int num[] = new int[4];

        // num[0] = 2;
        // num[1] = 4;
        // num[2] = 6;
        // num[3] = 8;

        // for(int i=0; i<num.length; i++){
        //     System.out.println(num[i]);
        // }
    }

class Student{
    int rollno;
    String name;
    int marks;
}

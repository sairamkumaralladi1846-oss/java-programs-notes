public class Main {
    public static void main(String[] args) {
      String name = "IntelliJ";
      String country = "India";
      int age = 26;
      String company = "freeCodeCamp";
      double gpa = 8.5;
      char percentSign = '%';

      String formattedString = String.format("My name is %s. Iam from %s .Iam %d years old. I work for %s. My GPA is %f.I have attended 100%c of my university classes",name, country, age, company,gpa,percentSign);

      System.out.println(formattedString);
    }
}
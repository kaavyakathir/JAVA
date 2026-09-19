class Student {
    String name;
    int marks;
}

public class Problem_L1_SimpleStudentRecord {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Divya";
        s1.marks = 88;

        System.out.println("Name: " + s1.name + " | Marks: " + s1.marks);
    }
}
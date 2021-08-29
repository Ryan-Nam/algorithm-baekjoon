package Others;

public class Static_Practice {
    public static void main(String[] args) {
        Student a = new Student("Tom");
        Student b = new Student("John");
        Student v = new Student("Kate");

        System.out.println(Student.count);
    }
}

class Student {
    static int count = 0;
    String name;

    //Constructor
    Student(String n) {
        name = n;
        count++;
    }
}

package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Bob", "7B");
        Teacher teacher = new Teacher("Alex", "Geography");

        System.out.println(student.getGroupName());
        System.out.println();
        System.out.println(teacher.getSubjectName());
        System.out.println();
        student.printInfo();
        System.out.println();
        teacher.printInfo();
    }
}

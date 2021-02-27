package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Иванова Мария Ивановна", "Высшая математика");
        Student student = new Student("Петров Василий Герасимович");
        teacher.evaluate(student);
    }
}

package day12.task5;

public class Members {
    private String name;
    private int age;

    public Members(String name , int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Members{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

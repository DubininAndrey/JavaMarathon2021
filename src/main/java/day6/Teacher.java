package day6;

import java.util.Random;

public class Teacher {
    private final String name;
    private String lesson;

    public Teacher(String name, String lesson) {
        this.name = name;
        this.lesson = lesson;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public String getName() {
        return name;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        int min = 2;
        int max = 5;
        String strScore = "";
        int score = random.nextInt(max - min + 1) + min;
        switch (score) {
            case 5:
                strScore = "отлично";
                break;
            case 4:
                strScore = "хорошо";
                break;
            case 3:
                strScore = "удовлетворительно";
                break;
            case 2:
                strScore = "неудовлетворительно";
                break;
        }
        System.out.println("Преподаватель " + this.name + " оценил студента с именем " + student.getName() + " по предмету "
                + this.lesson + " на оценку " + strScore + ".");
    }
}

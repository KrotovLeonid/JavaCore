package Lesson1_JavaCore;

public class Main {
    public static void main(String[] args) {
        Team team = new Team("Победители", new Cat("Барсик"), new Dog("Жучка"), new Human("Человек"), new Dog("Барбос"));
        Course course = new Course(new Cross(300), new Wall(10), new Water(10));

        course.doIt(team);
        team.info();
    }
}
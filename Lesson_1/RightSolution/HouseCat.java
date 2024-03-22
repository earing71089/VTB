package Lesson_1.RightSolution;

public class HouseCat extends CatSecond {
    public static int count;

    public HouseCat(String name, int maxRunDistance) {
        super("Домашний Кот", name, maxRunDistance, 0);
        count++;
    }
}

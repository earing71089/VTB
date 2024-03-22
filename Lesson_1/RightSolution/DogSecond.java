package Lesson_1.RightSolution;

public class DogSecond extends Animals {
    public static int count;

    public DogSecond(String name, int maxRunDistance, int maxSwimDistance) {
        super("Пес", name, maxRunDistance, maxSwimDistance);
        count++;
    }

}

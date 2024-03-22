package Lesson_1.RightSolution;

public class Tiger extends CatSecond {
    public static int count;

    public Tiger( String name, int maxRunDistance, int maxSwimDistance) {
        super("Тигр", name, maxRunDistance, maxSwimDistance);
        count++;
    }

}

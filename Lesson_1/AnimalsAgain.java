package Lesson_1.HomeWork;

public class AnimalsAgain {
    protected int run;
    protected int swim;
    protected String name;

    protected static int AnimalCount;

    public static int getAnimalCount() {
        return AnimalCount;
    }

    public AnimalsAgain() {
        AnimalCount++;
    }

    public AnimalsAgain(int run) {
        this.run = run;
    }

    public AnimalsAgain(int run, int swim) {
        this.run = run;
        this.swim = run;
    }

    public AnimalsAgain(String name, int run, int swim) {
        this();
        this.run = run;
        this.swim = run;
        this.name = name;
    }

    public void run() {

    }

    public void swim() {

    }


}

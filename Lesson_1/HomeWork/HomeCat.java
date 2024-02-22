package Lesson_1.HomeWork;

public class HomeCat extends AnimalsAgain {
    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    protected static int HomeCatCount;

    public static int getAnimalCount() {
        return HomeCatCount;
    }

    public HomeCat() {
        HomeCatCount++;
    }

    public HomeCat(int run) {
        this.run = run;
    }

    public HomeCat(int run, int swim) {
        this.run = run;
        this.swim = swim;
    }

    public HomeCat(String name, int run, int swim) {
        this();
        this.run = run;
        this.swim = swim;
        this.name = name;
    }


    @Override
    public void run() {
        if (run <= 200) {
            System.out.println(name + " пробежал " + run + " метров");
        } else {
            System.out.println("Кошки и Коты не могут столько пробежать");
        }
    }

    @Override
    public void swim() {
        System.out.println(name + " не умеет плавать");

    }
}


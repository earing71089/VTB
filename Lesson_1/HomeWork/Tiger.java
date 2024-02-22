package Lesson_1.HomeWork;

public class Tiger extends AnimalsAgain {
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



    protected static int TigerCount;

    public static int getAnimalCount() {
        return TigerCount;
    }

    public Tiger() {
        TigerCount++;
    }

    public Tiger(int run) {
        this.run = run;
    }

    public Tiger(int run, int swim) {
        this.run = run;
        this.swim = swim;
    }

    public Tiger(String name, int run, int swim) {
        this();
        this.run = run;
        this.swim = swim;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Тигр " + name + " пробежал " + run + " метров");

    }

    @Override
    public void swim() {
        System.out.println("Тигр " + name + " проплыл " + swim + " метров");

    }
}


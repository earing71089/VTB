package HomeWork;

public class Dog2 extends AnimalsAgain {

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

    protected static int Dog2Count;

    public static int getAnimalCount() {
        return Dog2Count;
    }

    public Dog2() {
        Dog2Count++;
    }

    public Dog2(int run) {
        this.run = run;
    }

    public Dog2(int run, int swim) {
        this.run = run;
        this.swim = swim;
    }

    public Dog2(String name, int run, int swim) {
        this();
        this.run = run;
        this.swim = swim;
        this.name = name;
    }



    @Override
    public void run() {
        if (run <= 500) {
            System.out.println(name + " пробежал " + run + " метров");
        } else {
            System.out.println("Собаки не могут столько пробежать");
        }

    }

    @Override
    public void swim() {
        if (swim <= 10) {
            System.out.println(name + " проплыл " + swim + " метров");
        } else {
            System.out.println("Собаки не могут столько проплыть");
        }

    }
}

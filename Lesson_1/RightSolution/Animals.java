package Lesson_1.RightSolution;

public abstract class Animals {
    public static int count;
    String type;
    String name;
    int maxRunDistance;
    int maxSwimDistance;

    public Animals(String type, String name, int maxRunDistance, int maxSwimDistance) {
        count++;
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }

    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(type + " " + name + " успешно справился с кросом" + distance + " m.");
        } else {
            System.out.println(type + " " + name + " не смог справился с кросом"+ distance + " m.");
        }
    }

    public void swim(int distance) {
        if (maxSwimDistance == 0) {
            System.out.println(type + " " + name + " не умеет плавать");
        }
        if (distance <= maxRunDistance) {
            System.out.println(type + " " + name + " успешно справился с заплывом" + distance + " m.");
        } else {
            System.out.println(type + " " + name + " не смог справился с заплывом" + distance + " m.");
        }
    }
}

package Lesson_1.RightSolution;

public class SecondMain {
    public static void main(String[] args) {
        Animals[] animals = {
                new HouseCat("Барсик", 200),
                new DogSecond("Бобик", 1000, 500),
                new Tiger("Тигра", 10000, 500)
        };
        for (Animals o : animals) {
            o.run(800);
            o.swim(40);
        }
        System.out.println("Animals count: " + Animals.count);
        System.out.println("Cats count: " + HouseCat.count);
        System.out.println("Dogs count: " + DogSecond.count);
        System.out.println("Cats count: " + Tiger.count);
    }

}

package Lesson_1.Animal;

public class Cat extends  Animal {
    //private defoult protected public
    // static поле для всех КОТОВ age будет одинаковым,
    // записывается в память последние данные экземплра класса
    //private String name;
    //private String color;
    //private int age;
    //статический блок инициальзации, загружаетвсе поля
    int clawsLenght;

    static {
        int field1 = 1;
        int field2 = 2;
    }

    public Cat (String name, String color, int age, int clawsLenght) {
        super(name, color, age);
        this.clawsLenght = clawsLenght;
    }

    @Override
    public void voice() {
        System.out.println(name + " Meow");
    }
    //public void info() {
        //System.out.println(name + " " + color + " " + age);


    //public void meow() {
        //System.out.println(name + "meow ");


    // статический метод может выполнятся без создания класса
    public static void doSoemThing() {
        System.out.println(123);
    }
}

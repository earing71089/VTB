package Lesson_1;

import Lesson_1.Animal.Animal;

import javax.xml.namespace.QName;

public class Cow extends Animal {
    //public Cat (String name, String color, int age) {
        //this.name = name;
        //this.color = color;
        //this.age = age;
    String name = "Буренка";


    @Override
    public void info() {
        System.out.println(name + " " + color + " " + age);
    }

    @Override
    public void voice() {
        System.out.println(name + " Мууу");
    }

}

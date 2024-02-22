package Lesson_1;

import HomeWork.AnimalsAgain;
import HomeWork.Dog2;
import HomeWork.HomeCat;
import HomeWork.Tiger;
import Lesson_1.Animal.Cat;
import Lesson_1.Animal.Dog;
import Lesson_1.Animal.SameCat;

public class MainApp {
    public static void main(String[] agrs) {

        Dog2[] dog2s = new Dog2[2];
        dog2s[0] = new Dog2("Псина", 440, 5);
        dog2s[1] = new Dog2("Пес", 520, 17);
        dog2s[0].run();
        dog2s[1].run();
        dog2s[1].setRun(500);
        dog2s[1].run();
        dog2s[0].swim();
        dog2s[1].swim();
        dog2s[1].setSwim(10);
        dog2s[1].swim();
        System.out.println("Кол-во Собак = " + Dog2.getAnimalCount());

        HomeCat[] homeCats = new HomeCat[2];
        homeCats[0] = new HomeCat("Мразь", 170, 11);
        homeCats[1] = new HomeCat("СкАтина", 201, 22);
        homeCats[0].run();
        homeCats[1].run();
        homeCats[1].setRun(189);
        homeCats[1].run();
        homeCats[0].swim();
        homeCats[1].swim();
        System.out.println("Кол-во Кошек = " + HomeCat.getAnimalCount());

        Tiger[] tigers = new Tiger[2];
        tigers[0] = new Tiger("Пушок", 2000, 1000);
        tigers[1] = new Tiger("Ширхан", 2100, 900);
        tigers[0].run();
        tigers[1].run();
        tigers[0].swim();
        tigers[1].swim();
        System.out.println("Кол-во Tигров = " + Tiger.getAnimalCount());
        System.out.println("Общее Кол-во животных = " + AnimalsAgain.getAnimalCount());


        // Cat cat = new Cat();
        // cat.name = "Барсик";
        // cat.color = "Белый";
        // cat.age = 2;
        // cat.info();

        // Cat cat2 = new Cat();
        // cat2.name = "Мурзик";
        // cat2.color = "Черный";
        // cat2.age = 3;
        // cat2.info();

        Cat cat3 = new Cat("Рыжик", "Рыжий", 4, 60);
        Cat cat4 = new Cat("Котэ", "Серый", 5, 60);
        cat3.info();
        cat4.info();

        cat3.voice();
        Cat.doSoemThing();

        Dog dog = new Dog("Бобик", "Черный", 2);
        dog.info();
        dog.voice();

        Cow cow = new Cow();
        cow.voice();

        new MainApp().doSomeThing();

        SameCat sameCat = new SameCat("Пупс","Коричневый", 7);
        sameCat.setName("ПУПС");
        System.out.println(sameCat.getName());
        sameCat.info();

        Cat[] cats = new Cat[2];
        cats[0] = new Cat("A", "B", 8,53);
        cats[1] = new Cat("C", "D", 9,66);
        cats[0].info();
        cats[1].info();

    }
    public void doSomeThing() {
        System.out.println(1234);
    }


}

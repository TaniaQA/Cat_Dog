package HomeWorks.HWforLesson16.main;

import HomeWorks.HWforLesson16.cat_dog.animal.Animal;
import HomeWorks.HWforLesson16.cat_dog.cat.Cat;
import HomeWorks.HWforLesson16.cat_dog.dog.Dog;

import java.util.ArrayList;
import java.util.List;

public class Practice_cat_dog {

    public static void main(String... args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog("Tuzik"));
        animals.add(new Cat("Vasya"));

        for (Animal animal : animals) {
            animal.sound();
            System.out.println("I am a " + animal.type() + ". My name is " + animal.name() + ". " + animal.sound());
        }
    }
}

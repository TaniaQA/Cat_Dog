package HomeWorks.HWforLesson16.cat_dog.cat;

import HomeWorks.HWforLesson16.cat_dog.animal.Animal;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String type() {
        return "Cat";
    }

    @Override
    public String sound() {
        return "Mew";
    }
}

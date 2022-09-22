package HomeWorks.HWforLesson16.cat_dog.dog;

import HomeWorks.HWforLesson16.cat_dog.animal.Animal;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String type() {
        return "Dog";
    }

    @Override
    public String sound() {
        return "Gav";
    }

}

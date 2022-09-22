package HomeWorks.HWforLesson16.cat_dog.animal;

public class Animal {

    protected String name;


    public Animal(String name) {

        this.name = name;
    }

    public String sound() {
        return "animal sound";
    }
    public String type() {
        return "animal type";
    }
    public String name() {
        return this.name;
    }

}

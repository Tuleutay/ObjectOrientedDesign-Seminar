package sem01;

import sem01.ex2.Dog;

public class Exaple01 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setAge(5);
        cat.setColor("white");
        cat.setName("Petya");
        cat.jump();
        cat.voice();
        cat.animalInfo();
        Dog dog = new Dog("Alfa", "white",10);

        dog.animalInfo();
        dog.voice();

    }
}


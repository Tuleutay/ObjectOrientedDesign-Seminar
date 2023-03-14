package sem02;

import java.util.ArrayList;

public class ExSem2 {
    public static void main(String[] args) {

        Animal[] animals = {new Dog("Bobik"), new home_Cat("Barsik"), new Dog("Rex"), new Tiger("Sherhan",50),
        new Tiger("Goga", 40), new home_Cat("Snow"), new home_Cat("Mursik")};
        for (Animal item: animals) {
            item.run(150);
            item.swim(10);


        }
        System.out.println("Cats " + Cat.catCount);
        System.out.println("Dogs " +Dog.dogCount);
        System.out.println("Domestic  " + home_Cat.homeCatsCount);
        System.out.println("Tigers " + Tiger.tigerCount);
        System.out.println("Животные " + Animal.countAnimal);

    }
}

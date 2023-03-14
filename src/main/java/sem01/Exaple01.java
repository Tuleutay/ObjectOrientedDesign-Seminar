package sem01;

import sem01.ex2.Dog;

public class Exaple01 {
    public static void main(String[] args) {
        Cat cat = new Cat("Roma", "black", 6);
//        cat.setAge(5);
//        cat.setColor("white");
//        cat.setName("Petya");
//        cat.jump();
//        cat.voice();
//        cat.animalInfo();
        Dog dog = new Dog("Alfa", "white",10);

//        dog.animalInfo();
//        dog.voice();

        Animal animal = new Cat();
//        animal.voice();

        Animal[] catsAndDogs = {
                new Dog("redq","lygk",2),
                new Cat("rew","ew",5),
                new Dog("req","lk",1)
        };
        for (Animal o: catsAndDogs) {
            o.voice();
            o.toString();
            o.animalInfo();
        }

        System.out.println("-------------------------".repeat(7));

        Animal catBarsik = new Cat("barsik","krasniy",77);
        if (catBarsik instanceof  Cat){
        ((Cat)catBarsik).klubok();
        }else {
            System.out.println("this is not cat");
        }
    }
}


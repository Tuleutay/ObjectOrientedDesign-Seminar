package sem01.ex2;

import sem01.Animal;

public class Dog extends Animal {

    private String color;
    private int age;
    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Dog() {
    }


    public void swim(){
        System.out.println("bulk SWIM");

    }

    @Override
    public void voice(){
        System.out.println("Gav gav auu");
    }
}

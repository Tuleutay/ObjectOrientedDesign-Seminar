package sem02;



public class Dog extends Animal {

    static int dogCount;
    public Dog(String name) {
        super(name, 500, 10, "DOG");
        dogCount++;
    }
}
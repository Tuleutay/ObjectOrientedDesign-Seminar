package sem02;

public abstract class Animal {

    protected String name;

    protected int maxRunDistance;
    protected int maxSwimDistance;

    static int countAnimal;

    String type;


    public Animal() {
    }

    public Animal(String name, int maxRunDistance, int maxSwimDistance, String type) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.type = type;
        countAnimal++;
    }

    public Animal(String name, int maxSwimDistance, String type) {
    }

    public void swim(int distance) {
        if (maxSwimDistance == 0) {
            System.out.println(this.name + " не умеет плавать.");
            return;
        }
        if (distance <= maxRunDistance) {
            System.out.println(this.name + " может проплыть " + distance + " м.");
        } else {
            System.out.println(this.name + " не может проплыть " + distance + " м.");
        }
    }

    ;

    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(this.name + " может пробежать " + distance + " м.");
        } else {
            System.out.println(this.name + " не может пробежать " + distance + " м.");
        }
    }

    ;

//    public void animalInfo() {
//        System.out.println("animal name: " + name);
//    }
//
//    protected abstract void voice();
//
//    public void jump() {
//        System.out.println(" I am jumping");
//    }
//
//
//    public String toString() {
//        return null;
//    }
}

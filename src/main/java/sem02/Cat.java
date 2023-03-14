package sem02;



public class Cat extends Animal {

    static int catCount;


    public Cat(String name, int maxRunDistance, int maxSwimDistance, String type) {
        super(name, 200, maxSwimDistance, type);
        catCount++;
    }
}








package sem01;

public abstract class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

    public void swim(){
        System.out.println("I am SWIM");
    }

    public void animalInfo(){
        System.out.println("animal name: " +name);
    }

    protected abstract void voice();

    public void jump(){
        System.out.println(" I am jumping");
    }


    public String toString() {
        return null;
    }
}

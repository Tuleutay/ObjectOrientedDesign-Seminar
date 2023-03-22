package sem03.task2;

public class TASK2 {
    public static void main(String[] args) {
        Fruit fruit = Fruit.STRAWBERRY;

        switch (fruit){
            case PEAR -> {
                System.out.println("Груша");
            }
            case APPLE -> {
                System.out.println("Яблоко");
            }
            case BANANA -> {
                System.out.println("бананы");
            }
            case ORANGE -> {
                System.out.println("апельсин");
            }
            case PINEAPPLE -> {
                System.out.println("Ананас");
            }
            case STRAWBERRY -> {
                System.out.println("клубника");
            }
        }
    }
}

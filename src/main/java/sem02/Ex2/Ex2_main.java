package sem02.Ex2;

public class Ex2_main {
    public static void main(String[] args) {
        Human human = new Human();
        Bicycle bicycle = new Bicycle();
        human.stop();
        human.drive(bicycle);
        human.stop();
        Roliki roliki=new Roliki();
        human.drive(roliki);
        Transport transport = new Bicycle();
        human.stop();
        human.drive(transport);
        Car car = new Car();
        human.drive(car);
        human.stop();
        human.stop();
        human.drive(car);
    }

}

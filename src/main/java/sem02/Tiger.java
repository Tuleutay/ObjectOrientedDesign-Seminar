package sem02;

public class Tiger extends Cat{

    static int tigerCount;
    public Tiger(String name, int maxSwimDistance) {
        super(name, 200, maxSwimDistance, "ТигрррРР");
        tigerCount++;
    }
}

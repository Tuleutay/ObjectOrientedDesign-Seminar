package sem02;

public class home_Cat extends Cat{
    static int homeCatsCount;
    public home_Cat(String name) {
        super(name, 200, 0, "home_Cat");
        homeCatsCount++;
    }
}

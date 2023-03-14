package sem02.Ex2;


public class Roliki implements Transport{
    @Override
    public void start() {
        System.out.println(" Поехали на роликах ");
    }

    @Override
    public void stop() {
        System.out.println(" Снимай ролики");
    }
}

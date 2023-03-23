package sem04.task2;

public class Program {
    public static void main(String[] args) {
        BoxWithNumber<Integer> bwn1 = new BoxWithNumber<>(1,2,3,4,5);
        BoxWithNumber<Integer> bwn2 = new BoxWithNumber<>(2,4,6,7,8);
        BoxWithNumber<Double> bwn3 = new BoxWithNumber<>(2.0,4.0,6.0,7.0,8.0);
        System.out.println(bwn1.average());
        System.out.println(bwn2.average());
        System.out.println();
        System.out.println(bwn1.compareAverage(bwn2));
        System.out.println(bwn2.compareAverage(bwn3));


    }
}

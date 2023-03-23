package sem04.Task03;

import java.util.ArrayList;
import java.util.Arrays;

public class program {
    public static void main(String[] args) {
//        Calc<Integer> calc1 = new Calc<>();
//        Calc<Double> calc2 = new Calc<>();
//        System.out.println(calc1.sum(new ArrayList<>(Arrays.asList(1,2,3))));
//        System.out.println(calc2.sum(new ArrayList<>(Arrays.asList(3.5,6.4,3.7))));

        Calc calc3 = new Calc();
        System.out.println(calc3.sum(new ArrayList<>(Arrays.asList(3.5,6.4,3.7))));
    }
}

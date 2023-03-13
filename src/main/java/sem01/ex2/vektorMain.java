package sem01.ex2;

import java.util.ArrayList;

public class vektorMain {
    public static void main(String[] args) {

        point3D point1 = new point3D(2, 3, 4);

        System.out.println(point1.distance());

        point3D point2 = new point3D(3,4,5);

        System.out.println(point1.sqalarMultiply(point2));
        System.out.println(point1.multy(point2).x + ", " + point1.multy(point2).y + ", " + point1.multy(point2).z);

        System.out.println(point1.cornerCosinus(point2));


    }
}

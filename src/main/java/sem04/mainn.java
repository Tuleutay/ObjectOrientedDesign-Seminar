package sem04;

public class mainn {
    public static void main(String[] args) {
        SimplBox mySB1 = new SimplBox(10);
        SimplBox mySB2 = new SimplBox(20);
//        mySB1.setMyObject("67");
//        int sum = (Integer) mySB1.getMyObject() + (Integer) mySB2.getMyObject();
//        System.out.println(sum);


        GenBox<String> stringGenBox = new GenBox<>();
        GenBox<Integer> integerGenBox2 = new GenBox<>(10);
        GenBox<Integer> integerGenBox1 = new GenBox<>(33);
        //integerGenBox1.setObj("88");
        int sum = integerGenBox1.getObj() + integerGenBox2.getObj();
        System.out.println("sum = " + sum);

    }
}


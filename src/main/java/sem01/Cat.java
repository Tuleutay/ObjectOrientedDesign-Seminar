package sem01;


public class Cat extends Animal{

    private String color;
    private int age;

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;

    }

    public Cat() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age <31){
            this.age = age;
        } else {
            System.out.println("Введен неверный возраст");
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void animalInfo(){
        System.out.println(" This cat name is :"+ name + " and age = "+ age + " and color: " + color);

    }

    @Override
    public void voice(){
        System.out.println("MUR MUR");
    }

    @Override
    public void jump(){
        System.out.println("Cat jamping");
    }
}

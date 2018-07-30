/**
 * @version 30.07.2018
 * @author Viktor Chernyaev
 * @Java1 homework Lesson-6
 * @link https://github.com/des1z
 */
public class Java1Homework6 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.run(200);
        cat.swim(0);
        cat.jump(2);

        Dog dog = new Dog();
        dog.run(500);
        dog.jump(0.5);
        dog.swim(10);

    }
}

abstract class Animal{
    private final int run = 0;
    private final int swim = 0;
    private final int jump = 0;
    abstract void run(int lenght);
    abstract void swim(int lenght);
    abstract void jump(double height);


}

class Cat extends Animal{
    private final int run = 200;
    private final double jump = 2;

    @Override
    void run(int lenght){
        if ((lenght >= 0) && (lenght <= run)) System.out.println("Cat run: true");
        else System.out.println("Cat run: false");
}

    @Override
    void swim(int lenght) {
        System.out.println("Cat swim: false");
    }

    @Override
    void jump(double height) {
        if((height >= 0) && (height <= jump)) System.out.println("Cat jump: true");
        else System.out.println("Cat jump: false");

    }
}

class Dog extends Animal{
    private final int run = 500;
    private final double jump = 0.5;
    private final int swim = 10;

    @Override
    void run(int lenght) {
        if ((lenght >= 0) && (lenght <= run)) System.out.println("Dog run: true");
        else System.out.println("Dog run: false");
    }

    @Override
    void jump(double height) {
        if ((height >= 0) && (height <= jump)) System.out.println("Dog jump: true");
        else System.out.println("Dog jump: false");
    }

    @Override
    void swim(int lenght) {
        if((lenght >= 0) && (lenght <= swim)) System.out.println("Dog swim: true");
        else System.out.println("Dog swim: false");
    }
}




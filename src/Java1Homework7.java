/**
 * @version 03.08.2018
 * @author Viktor Chernyaev
 * @Java1 homework Lesson-7
 * @link https://github.com/des1z
 */
import java.io.IOException;

public class Java1Homework7 {
    public static void main(String[] args) {
        /*Cat[] x = {
                new Cat("Alex", 10),
                new Cat("Myrzik", 8),
                new Cat("Barsik", 6),
                new Cat("Odri", 12)
        };*/
        Cat cat = new Cat("Barsik", 10);
        Plate plate = new Plate(10);
        System.out.println(plate);
        cat.eat(plate);
        System.out.println(plate);

    }
}

class Cat {
    private String name;
    private int appetite;

    Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
    }

    void eat(Plate plate){
        plate.discreaseFood(appetite);
    }
}

class Plate{
    private int food;

    Plate(int food) {
        this.food = food;
    }

    void discreaseFood(int food) {
        this.food -= food;
    }

    @Override
    public String toString() {
        return "Food: " + food;
    }
}

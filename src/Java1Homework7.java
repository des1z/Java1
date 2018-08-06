/**
 * @version 03.08.2018
 * @author Viktor Chernyaev
 * @Java1 homework Lesson-7
 * @link https://github.com/des1z
 */

public class Java1Homework7 {
    public static void main(String[] args) {
        System.out.println("List of cats:");
        Cat[] x = {
                new Cat("Alex", 15),
                new Cat("Myrzik", 11),
                new Cat("Barsik", 14),
                new Cat("Odri", 12)
        };
        Plate plate = new Plate(0);
        for (Cat c : x) {
            System.out.println(c);
        }
        System.out.println(plate);
        System.out.println("increase food by 50");
        plate.increaseFood(50);
        System.out.println(plate);
        System.out.println("Cats take food:");
        for (Cat c : x) {
            c.eat(plate);
            System.out.println(c);
            System.out.println(plate);
        }
    }
}

class Cat {
    private String name;
    private int appetite;
    private boolean satisfied;

    Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        this.satisfied = false;
    }

    @Override
    public String toString() {
        return "CAT: " + name + " | APPETITE: " + appetite + "| SATISFIED: " + satisfied;
    }

    void eat(Plate plate){
        if (plate.getFood() > appetite){
            plate.decreaseFood(appetite);
            satisfied = true;
        }
    }
}

class Plate{
    private int food;

    Plate(int food) {
        this.food = food;
    }

    void decreaseFood(int appetite) {
        if (food >= appetite) {
            food -= appetite;
        }
    }

    @Override
    public String toString() {
        return "Plate: " + food;
    }

    int getFood() {
        return food;
    }

    void increaseFood(int amount) {
        food += amount;
    }
}

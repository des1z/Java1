/**
 * @version 03.08.2018
 * @author Viktor Chernyaev
 * @Java1 homework Lesson-7
 * @link https://github.com/des1z
 */

public class Java1Homework7 {
    public static void main(String[] args) {
        
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

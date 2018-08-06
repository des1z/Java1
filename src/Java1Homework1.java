/**
 * @version 12.07.2018
 * @authors Viktor Chernyaev
 * @Java1 homework Lesson-1
 */

class Java1Homework1 {

    public static void main(String[] args) {

    }

    public static void task2(){
        byte a = 10;
        short b = 2404;
        int c = 200000;
        long d = 15000L;
        float e = 120.0f;
        double f = 15.72775;
        boolean g = true;
        char r = 'A';
    }
    public static int task3(int a, int b, int c, int d){
        a = 2;
        b = 3;
        c = 7;
        d = 16;
        return a * (b + (c / d));
    }

    public static boolean task4(int a, int b){
        a = 11;
        b = 21;
        if (a >= 10 && a <= 20 || b >=10 && b <= 20){
            return true;
        }
        else return false;

    }

    public static void task5(){
    int a = 3;
        if (a >= 0){
        System.out.println("Ваше число - Положительное число");
        }
        if (a < 0){
        System.out.println("Ваше число - отрицательное");
        }
    }

    public static boolean task6(int a) {
        a = -6;
        if (a < 0) {
            return true;
        }
        else return false;
    }

    public static void task7(){
        String myString = "Виктор";
        System.out.println("Привет, " + myString);
    }

}

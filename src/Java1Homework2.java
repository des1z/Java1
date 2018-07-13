/**
 * @version 13.07.2018
 * @author Viktor Chernyaev
 * @Java1 homework Lesson-2
 */

class Java1Homework2 {
    public static void main(String args[]) {
        System.out.println("Задание 1:");
        task1();
    }

    public static void task1() {
        int[] arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print("До: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
        System.out.print("После:  ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

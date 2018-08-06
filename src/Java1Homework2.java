/**
 * @version 13.07.2018
 * @author Viktor Chernyaev
 * @Java1 homework Lesson-2
 */

class Java1Homework2 {
    public static void main(String args[]) {
        System.out.println("Задание 1:");
        task1();
        System.out.println("Задание 2:");
        task2();
        System.out.println("Задание 3:");
        task3();
        System.out.println("Задание 5:");
        task5();
    }

    public static void task1() {
        int[] nums = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print("До: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
            if (nums[i] == 0) nums[i] = 1;
            else nums[i] = 0;
        }
        System.out.print("После:  ");
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    public static void task2() {
        int[] nums = new int[8];
        for (int i = 0, j = 0; i < nums.length; i++, j += 3) {
            nums[i] = j;
            System.out.println(nums[i] + "");

        }
    }

    public static void task3() {
        int[] nums = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("До: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
            if (nums[i] < 6) nums[i] *= 2;

        }
        System.out.print("После:  ");
        for (int i : nums) {
            System.out.print(i + " ");
        }

    }
    public static void task5() {
        int[] nums = {1, 3, 5, 10, 13, 7, 5, 2, 4, 8, 9, 1, -4};
        int min = nums[0];
        int max = nums[0];
        System.out.print("массив: ");
        for (int i : nums) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < nums.length; i++) {
            min = (min < nums[i]) ? min : nums[i];
            max = (max > nums[i]) ? max : nums[i];
        }
        System.out.println("минимальное число: " + min + " " + "максимальное число: " + max);
    }
}

/**
 * @version 19.07.2018
 * @author Viktor Chernyaev
 * @Java1 homework Lesson-3
 */
import java.util.*;
import java.io.*;

public class Java1Homework3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            Random r = new Random();
            int x = r.nextInt(9);
            int f;
            System.out.println("Введите число!");

            for (int i = 1; i <= 3; i++) {
                f = Integer.parseInt(br.readLine());

                if (f == x) {
                    System.out.println(f + " = " + x + " Ты выйграл!");
                    break;
                }
                else if (f > x) System.out.println(f + " загаданное число меньше");
                else if (f < x) System.out.println(f + " загаданное число больше");

                if (i == 3) System.out.println("Ты проиграл! Загаданное число, было: " + x);
            }

            System.out.println("Хочешь сыграть ещё раз? 1 - ДА / 0 - НЕТ");

            int repeat = Integer.parseInt(br.readLine());
            while ((repeat < 0) || (repeat > 1)) {
                System.out.println("Введите число 1 или 0: 1 - ДА / 0 - НЕТ");
                repeat = Integer.parseInt(br.readLine());
            }

            if (repeat == 1) {
                System.out.println("Начинаем новую игру...");
            }
            else {
                System.out.println("До скорой встречи!");
                return;
            }
        } while (true);
    }
}
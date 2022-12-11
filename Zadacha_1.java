// Задача 1. Написать метод, который переводит число из арабского формата записи в римский.
// Например, 2022 = MMXXII

import java.util.ArrayDeque;
import java.util.Scanner;

public class Zadacha_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите арабские цифры: ");
        Integer number = scan.nextInt();
        ArrayDeque<String> rome = new ArrayDeque<>();
        String[] keys = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        Integer[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        int index = 0;
        while (index < keys.length) {
            while (number >= values[index]) {
                number -= values[index];
                rome.addLast(keys[index]);
            }
            index++;            
        }
        for (String result : rome)
            System.out.print(result);
    }
}

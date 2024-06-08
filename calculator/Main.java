package calculator;

import com.sun.jdi.ArrayReference;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String[] result = split(name);

        if (result != null) {
            System.out.println("В массиве три элемента и первый и третий элементы являются числами.");
        } else {
            System.out.println("Массив не соответствует требованиям.");
        }
    }

    public static String[] split(String name) {
        String[] result = name.split(" ");
        if (cheked(result)) {
            return result;
        } else {
            return null;
        }
    }

    public static boolean cheked(String[] result) {
        return result.length == 3 && isNumeric(result[0]) && isNumeric(result[2]);
    }

    public static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }
}
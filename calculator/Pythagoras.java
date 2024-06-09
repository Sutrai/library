package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pythagoras {
    private boolean exit;
    private Scanner scanner;

    public Pythagoras() {
        exit = false;
        scanner = new Scanner(System.in);
    }

    public void pythagoras() {
        while (!exit) {
            System.out.println("\n > выберите действие:");
            System.out.println(" - 1. > теорема пифагора для гипотенузы ");
            System.out.println(" - 2. > теорема пифагора для катета ");
            System.out.println(" - q. > выход в главное меню");

            char choice = scanner.next().charAt(0);
            double result = 0.0;

            switch (choice) {
                case '1':
                    result = inputTheoremHypotenuse();
                    System.out.println("Результат -->  " + result);
                    break;

                case '2':
                    result = inputLegTheorem();
                    System.out.println("Результат -->  " + result);
                    break;

                case 'q':
                    System.out.println("Возврат в главное меню...");
                    return;

                default:
                    System.out.println("ОШИБКА --> Неизвестный выбор");
            }
        }
    }

    private double inputTheoremHypotenuse() {
        while (!exit) {
            double t1 = inputDouble("> введите первый катет");
            double t2 = inputDouble("> введите первый катет");

            if (t1 > 0 && t2 > 0) {
                return pythagoreanTheoremHypotenuse(t1, t2);

            } else {
                System.out.println("ОШИБКА --> Проверьте ввод");
                scanner.next();
            }
        }
        return 0.0;
    }

    private double pythagoreanTheoremHypotenuse(double t1, double t2) {
        double result = Math.pow(t1, 2) + Math.pow(t2, 2);
        return Math.sqrt(result);
    }

    private double inputLegTheorem() {
        while (!exit) {
                double t1 = inputDouble("> введите известный катет");
                double hypotenuse = inputDouble("> введите гипотенузу");

                if (t1 > 0 && hypotenuse > 0 && hypotenuse > t1) {
                    return pythagoreanLegTheorem(t1, hypotenuse);
                } else {
                    System.out.println("ОШИБКА --> проверьте ввод");
                }
        }
        return 0.0;
    }

    private double pythagoreanLegTheorem(double t1, double hypotenuse) {
        double result = hypotenuse - t1;
        return Math.sqrt(result);
    }

    private double inputDouble(String message) {
        while (true) {
            System.out.println(message);
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("ОШИБКА --> Проверьте ввод");
                scanner.next();
            }
        }
    }
}
package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleCalculator {
    private boolean exit;
    private Scanner scanner;

    public SimpleCalculator() {
        exit = false;
        scanner = new Scanner(System.in);
    }

    public void startCalculator() {
        while (!exit) {
            System.out.println("\n > выберите действие:");
            System.out.println(" - 1. > сложение ");
            System.out.println(" - 2. > вычитание ");
            System.out.println(" - 3. > умножение ");
            System.out.println(" - 4. > деление ");
            System.out.println(" - 5. > корень ");
            System.out.println(" - q. > выход в главное меню\n");

            char choice = scanner.next().charAt(0);
            double result = 0.0;

            switch (choice) {
                case '1':
                    result = calculateAddition();
                    break;
                case '2':
                    result = calculateSubtraction();
                    break;
                case '3':
                    result = calculateMultiplication();
                    break;
                case '4':
                    result = calculateDivision();
                    break;
                case '5':
                    result = calculateSquareRoot();
                    break;
                case 'q':
                    System.out.println("Возврат в главное меню...");
                    return;
                default:
                    System.out.println("ОШИБКА --> Неизвестный выбор");
                    continue;
            }

            System.out.println("Результат -->  " + result);
        }
    }

    private double calculateAddition() {
        double t1 = inputDouble("> введите первое число: ");
        double t2 = inputDouble("> введите второе число: ");
        return t1 + t2;
    }

    private double calculateSubtraction() {
        double t1 = inputDouble("> введите первое число: ");
        double t2 = inputDouble("> введите второе число: ");
        return t1 - t2;
    }

    private double calculateMultiplication() {
        double t1 = inputDouble("> введите первое число: ");
        double t2 = inputDouble("> введите второе число: ");
        return t1 * t2;
    }

    private double calculateDivision() {
        double t1 = inputDouble("> введите первое число: ");
        double t2 = inputDouble("> введите второе число: ");
        if (t2 == 0) {
            System.out.println("Ошибка: Деление на ноль невозможно.");
            return Double.NaN;
        }
        return t1 / t2;
    }

    private double calculateSquareRoot() {
        double t1 = inputDouble("> введите число: ");
        if (t1 < 0) {
            System.out.println("Ошибка: Невозможно вычислить корень из отрицательного числа.");
            return Double.NaN;
        }
        return Math.sqrt(t1);
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

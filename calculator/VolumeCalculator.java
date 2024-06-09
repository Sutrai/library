package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VolumeCalculator {
    private boolean exit;
    private Scanner scanner;

    public VolumeCalculator() {
        exit = false;
        scanner = new Scanner(System.in);
    }

    public void startVolumeCalculator ()
    {
        while (!exit) {
            System.out.println("\n > выберите действие:");
            System.out.println(" - 1. > объем куба");
            System.out.println(" - 2. > объем кубиода");
            System.out.println(" - 3. > объем сферы");
            System.out.println(" - 4. > объем конуса");
            System.out.println(" - q. > выход в главное меню\n");

            char choice = scanner.next().charAt(0);
            double result = 0.0;

            switch (choice) {
                case '1':
                    result = volumeCube();
                    break;
                case '2':
                    result = volumeCubiod();
                    break;
                case '3':
                    result = volumeSphere();
                    break;
                case '4':
                    result = volumeCone();
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
    private double volumeCube ()
    {
        double t1 = inputDouble(" > введите сторону куба ");

        return t1 * t1 * t1;
    }

    private double volumeCubiod ()
    {
        double t1 = inputDouble(" > введите высоту ");
        double t2 = inputDouble(" > введите длинну ");
        double t3 = inputDouble(" > введите высоту ");

        return t1 * t2 * t3;
    }

    private double volumeSphere ()
    {
        double t1 = inputDouble(" > введите радиус ");

        return 1.33333333333*3.14159*(t1 * t1 * t1);
    }

    private double volumeCone ()
    {
        double t1 = inputDouble(" > введите высоту конуса ");
        double t2 = inputDouble(" > введите радиус конуса ");

        return 3.14159*(t1*t1)*(t2/3);
    }

    private double inputDouble(String message) {
        while (true) {
            System.out.println(message);
            try {
                double value = scanner.nextDouble();
                if (value > 0){
                    return value;
                } else {
                    System.out.println("введите число больше ноля");
                }

            } catch (InputMismatchException e) {
                System.out.println("ОШИБКА --> Проверьте ввод");
                scanner.next();
            }
        }
    }
}

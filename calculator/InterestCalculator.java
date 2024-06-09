package calculator;

import com.sun.source.tree.BreakTree;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InterestCalculator {
    private boolean exit;
    private Scanner scanner;

    public InterestCalculator() {
        exit = false;
        scanner = new Scanner(System.in);
    }

    public void interestCalculator()
    {
        while (!exit)
        {
            System.out.println("\n > выберите действие:");
            System.out.println(" - 1. > найти процент от числа ");
            System.out.println(" - 2. > сколько процентов составляет число от числа ");
            System.out.println(" - 3. > прибавить n процентов к числу");
            System.out.println(" - 4. > вычесть n процентов из числа");
            System.out.println(" - q. > выход в главное меню");

            char choice = scanner.next().charAt(0);
            double result = 0.0;
            switch (choice)
            {
                case '1':
                    result = percentageOfNumber();
                    break;
                case '2':
                    result = numbersFromNumber();
                    break;
                case '3':
                    result = addPercentage();
                    break;
                case '4':
                    result = subtractOfNumber();
                    break;
                case 'q':
                    System.out.println("Выход из программы...");
                    exit = true;
                default:
                    System.out.println("ОШИБКА --> Неизвестный выбор");
            }
            System.out.println("Результат -->  " + result);
        }
    }

    private double percentageOfNumber ()
    {   while (!exit)
        {
            double t1 = inputInt("> введите колличество процентов: ");
            double t2 = inputInt("> введите число: ");

            if (t1 >= 0 && t1 <=100)
            {
                return t2 * (t1/100);
            } else{
                System.out.println("ОШИБКА --> Неизвестный выбор");
                scanner.next();
            }
        }
        return 0.0;
    }

    private double numbersFromNumber ()
    {
        double t1 = inputInt("> введите первое значение: ");
        double t2 = inputInt("> введите второе значение: ");

        return 100 * (t1/t2);
    }

    private double addPercentage ()
    {
        double t1 = inputInt("> введите значение: ");
        double t2 = inputInt("> введите процент: ");

        return t1 * (1 + t2/100);
    }

    private double subtractOfNumber ()
    {
        double t1 = inputInt("> введите значение: ");
        double t2 = inputInt("> введите процент: ");

        return t1 * (1 - t2/100);
    }

    private double inputInt(String message) {
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

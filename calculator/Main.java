package calculator;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static boolean exit = false;

    public static void main(String[] args) {

        SimpleCalculator simpleCalculator = new SimpleCalculator();
        Pythagoras pythagoras = new Pythagoras();
        InterestCalculator interestCalculator = new InterestCalculator();
        VolumeCalculator volumeCalculator = new VolumeCalculator();
        Ascii ascii = new Ascii();

        while (!exit) {
            System.out.println("\n< Калькуляторы >");
            System.out.println("- 1.  > обычный калькулятор");
            System.out.println("- 2.  > калькулятор теоремы пифагора");
            System.out.println("- 3.  > калькулятор процентов");
            System.out.println("- 4.  > калькулятор объёма");
            System.out.println("- q.  > выйти из калькулятора");

            System.out.println(" \n > Miscellaneous < ");
            System.out.println(" - A. поиск ASCII таблица" );

            char choice = scanner.next().charAt(0);

            switch (choice) {
                case '1':
                    simpleCalculator.startCalculator();
                    break;
                case '2':
                    pythagoras.pythagoras();
                    break;
                case '3':
                    interestCalculator.interestCalculator();
                    break;
                case '4':
                    volumeCalculator.startVolumeCalculator();
                    break;
                case 'A':
                    ascii.ascii();
                    return;
                case 'q':
                    System.out.println("Выход из калькулятора...");
                    return;
                default:
                    System.out.println("ОШИБКА --> Неизвестный выбор");
            }
        }
    }
}
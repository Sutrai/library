package calculator;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Ascii {
    private boolean exit;
    private Scanner scanner;

    public Ascii() {
        exit = false;
        scanner = new Scanner(System.in);
    }

    public void ascii()
    {
        while(!exit)
        {
            System.out.println("\n > выберите действие:");
            System.out.println(" - 1. > перевести символ в ASCII код ");
            System.out.println(" - 2. > перевести ASCII код в символ ");
            System.out.println(" - q. > выход в главное меню");

            char choice = scanner.next().charAt(0);
            switch (choice)
            {
                case '1':
                    valueToAscii();
                    break;
                case '2':
                    asciiToValue();
                    break;
                case 'q':
                    System.out.println("Выход из программы...");
                    exit = true;
                default:
                    System.out.println("ОШИБКА --> Неизвестный выбор");
            }
        }
    }

    private void valueToAscii() {
        System.out.println("Введите любое число/букву/символ, чтобы найти его значение ASCII.");
        char inputChar = scanner.next().charAt(0);
        int ascii = inputChar;
        System.out.printf("Значение '%c' --> ASCII %d\n", inputChar, ascii);
    }

    private void asciiToValue() {
        System.out.println("Введите любое значение ASCII, чтобы найти его число/букву/символ.");
        int asciiCode = scanner.nextInt();
        char character = (char) asciiCode;
        System.out.printf("ASCII %d --> Значение '%c'\n", asciiCode, character);
    }
}
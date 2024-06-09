import java.util.Scanner;

public class MainMenu {
    private static Scanner scanner = new Scanner(System.in);
    private static boolean exit = false;
    public static void main(String[] args) {

        while (!exit) {
            System.out.println("\n< МЕНЮ >");
            System.out.println("- 1.  > библиотека");
            System.out.println("- 2.  > калькулятор");
            System.out.println("- q.  > выход из программы");

            char choice = scanner.next().charAt(0);

            switch (choice) {
                case '1':
                    library.Main.main(null);
                    break;
                case '2':
                    calculator.Main.main(null);
                    break;
                case 'q':
                    System.out.println("Выход");
                    exit = true;
                    break;
        default:
        System.out.println("ОШИБКА --> Неизвестный выбор");
    }
}

        scanner.close();
    }
}

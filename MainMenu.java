import java.util.Scanner;

public class MainMenu {
    private static Scanner scanner = new Scanner(System.in);
    private static boolean exit = false;
    public static void main(String[] args) {

        while (!exit) {
            System.out.println("1. Библиотека");
            System.out.println("2. хз пока");
            System.out.println("0. Выход");
            System.out.println("Choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    library.Main.main(null);
                    break;
                case 2:
                    calculator.Main.main(null);
                    break;
                case 0:
                    System.out.println("Выход");
                    exit = true;
                    break;
                default:
                    System.out.println("цифру нада");
            }
        }

        scanner.close();
    }
}

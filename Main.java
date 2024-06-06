import jdk.management.jfr.FlightRecorderMXBean;

import java.util.Scanner;

class Main{
    private static Scanner s = new Scanner(System.in);
    private static Manager manager = new Manager();

    public static void main(String[] args){
        while (true){
            menu();
            int choice = Integer.parseInt(s.nextLine());

            switch (choice) {
                case 1:
                    addlist();
                    break;
                case 2:
                    deletelist();
                    break;
                case 3:
                    search();
                    break;
                case 4:
                    listprint();
                    break;
                case 5:
                    changestatus();
                    break;
                case 6:
                    exit();
                    break;
                default:
                    System.out.println("ещё раз");
            }
        }
    }

    public static void menu() {
        System.out.println("1. Добавить");
        System.out.println("2. Удалить");
        System.out.println("3. Поиск");
        System.out.println("4. Вывести");
        System.out.println("5. Изменить статус");
        System.out.println("6. Выход");
        System.out.println("Choice: ");
    }

    public static void addlist(){
        System.out.println("Введите данные:");
        System.out.println("Имя, автор, код");
        String input = s.nextLine();
        String[] book = input.split(",");
        Library library = new Library(book[0].trim(), book[1].trim(), book[2].trim(), false);
        manager.listadd(library);
    }

    public static void deletelist(){
        System.out.println("Введите имя файла:");
        String name = s.nextLine();
        manager.deletelist(name);
    }

    public static void search(){
        System.out.println("Введите название: ");
        String name = s.nextLine();
        String result = String.valueOf(manager.returns(name));
        System.out.println(result);
    }

    public static void listprint(){
        manager.listprint();
    }

    public static void changestatus(){
        System.out.println("Введите название книги: ");
        String name = s.nextLine();
        Library library = manager.returns(name);
        if (library!=null) {

            System.out.println("Введите статус (true/false)");
            Boolean status = Boolean.parseBoolean(s.nextLine());

            if (status) {
                System.out.println("Введите имя пользователя: ");
                String nameuser = s.nextLine();
                manager.changestatus(name, status, nameuser);
                System.out.println("Пользователь добавлен");
            } else {
                manager.changestatus(name, status, "false");
                System.out.println("Пользователь удалён");
            }
        }

    }

    public static void exit(){
        System.out.println("пока");
        System.exit(0);
    }



}
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
                    listprint();
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("пока");
                    System.exit(0);
                    break;
                default:
                    System.out.println("ещё раз");
            }
        }
    }

    public static void menu() {
        System.out.println("1. Добавить");
        System.out.println("2. Удалить");
        System.out.println("3. Вывести");
        System.out.println("4. Изменить статус");
        System.out.println("5. Выход");
        System.out.println("Choice: ");
    }
    public static void addlist(){
        System.out.println("Введите данные:");
        System.out.println("Имя, автор, код");
        String input = s.nextLine();
        String[] book = input.split(",");
        Library library = new Library(book[0].toString(), book[1].toString(), book[2].toString(), false);
        manager.listadd(library);
    }

    public static void deletelist(){
        System.out.println("Введите имя файла:");
        String name = s.nextLine();
        manager.deletelist(name);
    }
    public static void listprint(){
        manager.listprint();
    }


}
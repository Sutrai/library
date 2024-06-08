package library;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Manager {

    private List<Library> list;

    public Manager() {
        this.list = new ArrayList<>();
    }

    public void listadd(Library library){
        list.add(library);
    }

    public void deletelist(String name){
        list.removeIf(book -> book.getName().equals(name));
    }

    public void listprint(){
        for(Library books: list){
            System.out.println(books);
        }
    }

    public void changestatus(String name, boolean status, String nameuser){
        Library library = returns(name);
        if (library!= null){
            library.setStatus(status);
            if (status){
                LocalDate date = LocalDate.now();
                library.setUser(nameuser + " // " + date);
            } else{
                library.setUser("None");
            }

        }
    }

    public Library returns(String name){
        for (Library books: list){
            if (books.getName().equals(name)){
                return books;
            }
        }
        System.out.println("не найдено");
        return null;
    }

}

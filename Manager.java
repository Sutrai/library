import java.util.ArrayList;
import java.util.List;


public class Manager {

    private List<Library> list;

    public Manager() {
        this.list = new ArrayList<>();
    }

    public void deletelist(String name){
        list.removeIf(book -> book.getName().equals(name));
    }

    public Library returns(String name){
        for (Library books: list){
            if (books.getName().equals(name)){
                return books;
            }
        }
        return null;
    }

    public void listadd(Library library){
        list.add(library);
    }

    public void listprint(){
        for(Library books: list){
            System.out.println(books);
        }
    }

}

package bg.unwe;

import java.util.ArrayList;

public class Book {
    private String title;
    private ArrayList<Author> authors;

    public Book(){
        authors=new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addAuthor(Author author){
        authors.add(author);
    }

    public Author getAuthor(int index){
        return authors.get(index);
    }

    public int getAuthorsCount(){
        return authors.size();
    }

    
}

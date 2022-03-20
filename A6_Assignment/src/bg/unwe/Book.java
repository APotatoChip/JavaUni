package bg.unwe;

public class Book {
    private String title;
    private Author[] authors;
    
    public  Book(int authorsCount){
        authors = new Author[authorsCount];
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addAuthor(Author author, int index){
        authors[index]=author;
    }

    public Author getAuthor(int index){
        return authors[index];
    }

    public int getAuthorsCount(){
        return authors.length;
    }

    
}

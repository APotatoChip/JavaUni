package bg.unwe;
public class Book {
    private String title;
    private Author[] authors;
    private int nextIndex;

   public Book(int authorsCount){
        authors=new Author[authorsCount];
        nextIndex=0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addAuthor(Author author){
        authors[nextIndex]=author;
        nextIndex++;
    }

    public Author getAuthor(int index){
        return authors[index];
    }

    public int getAuthorsCount(){
        return authors.length;
    }

    
}

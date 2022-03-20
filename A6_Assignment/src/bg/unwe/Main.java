package bg.unwe;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);

       Book book = new Book(3);
       book.setTitle("Java 2");

       for(int i =0;i<3;i++){
           Author author = new Author();

           System.out.print("Author " + (i+1) + " Name: ");
           String name = scan.nextLine();

           author.setName(name);

           book.addAuthor(author, i);
       }

       scan.close();

       System.out.println("");

       System.out.println("Book: " + book.getTitle());

       for(int i =0;i<book.getAuthorsCount();i++){
           System.out.println("Author " + (i+1) + ": Name = " + book.getAuthor(i).getName());
       }


    }
}

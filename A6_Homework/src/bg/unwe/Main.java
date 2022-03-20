package bg.unwe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       Book book = new Book(3);
       System.out.print("Book: ");
       String title = scan.nextLine();
       book.setTitle(title);

       for(int i =0;i<3;i++){
           System.out.println("Author " + (i+1) + ":");
           System.out.print("Name = ");
           String name = scan.nextLine();
           System.out.print("Country = ");
           String authorCountry = scan.nextLine();
           Author author = new Author();
           author.setName(name);
           Country country = new Country();
           country.setName(authorCountry);
           author.setCountry(country);
           book.addAuthor(author);
       }

       System.out.println("Book: "+ book.getTitle());
       for(int i=0;i<book.getAuthorsCount();i++){
           System.out.println("Author "+(i+1)+": Name = " + book.getAuthor(i).getName()+", Country = "+book.getAuthor(i).getCountry().getName());
       }

       scan.close();

    }
}

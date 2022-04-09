package bg.unwe;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        for(int i =0;i<3;i++){
            Book book=new Book();
            System.out.println("Book "+(i+1)+": Title = ");
            String line = scan.nextLine();
            book.setTitle(line);
            for(int j=0;j<2;j++){
                Author author=new Author();
                Country country=new Country();
                System.out.print("Author "+(j+1)+": Name = ");
                line=scan.nextLine();
                author.setName(line);
                System.out.print("Country = ");
                line=scan.nextLine();
                country.setName(line);
                author.setCountry(country);
                book.addAuthor(author);
            }
            books.add(book);
        }

       

        for(int i=0;i<books.size();i++){
            System.out.println("Book " + (i+1)+": Title = "+books.get(i).getTitle());
            for(int j=0;j<books.get(i).getAuthorsCount();j++){
                System.out.print("Author " + (j+1)+": Name = "+books.get(i).getAuthor(j).getName()+", Country = "+books.get(i).getAuthor(j).getCountry().getName());
                System.out.println("");
            }
        }
scan.close();    }

}

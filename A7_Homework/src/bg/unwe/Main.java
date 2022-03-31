package bg.unwe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Count of authors: ");
        int authorsCount = Integer.parseInt(scan.nextLine());
        Book book = new Book(authorsCount);
        System.out.print("Title: ");
        String title = scan.nextLine();
        book.setTitle(title);

        for(int i =0; i<book.getAuthorsCount(); i++){
            Author author = new Author();
            System.out.print("Author " + (i+1) + " Name: ");
            String name = scan.nextLine();
            author.setName(name);
            Country country = new Country();
            System.out.print("Country: ");
            String countryName = scan.nextLine();
            country.setName(countryName);
            author.setCountry(country);
            book.addAuthor(author);
        }

        scan.close();

        System.out.println("");

        System.out.println("Book: " + book.getTitle());

        for(int i =0;i<book.getAuthorsCount();i++){
            System.out.println("Author " + (i+1) + ": Name = "+book.getAuthor(i).getName() +", Country = "+book.getAuthor(i).getCountry().getName());
        }
    }
}

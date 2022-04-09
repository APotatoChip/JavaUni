package bg.unwe;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<>();

        // while(true){
        //     System.out.print("Enter new title or press enter for break: ");
        //     String line = scan.nextLine();

        //     if(line.length()>0){
        //         Book book = new Book();
        //         book.setTitle(line);

        //         while(true){
        //             System.out.print("Enter new author or press enter for break: ");
        //             line=scan.nextLine();

        //             if(line.length()>0){
        //                 Author author = new Author();
        //                 author.setName(line);

        //                 book.addAuthor(author);
        //             }else{
        //                 break;
        //             }
        //         }
        //         books.add(book);
        //     }else{
        //         break;
        //     }
        // }

        Book book1 = new Book();

        System.out.println("Book 1 Title: ");
        book1.setTitle(scan.nextLine());

        for(int i=0;i<3;i++){
            Author author=new Author();

            System.out.print("Book 1 Author "+(i+1)+": ");
            author.setName(scan.nextLine());

            book1.addAuthor(author);
        }

        books.add(book1);

        Book book2 = new Book();

        System.out.println("Book 2 Title: ");
        book2.setTitle(scan.nextLine());

        for(int i=0;i<2;i++){
            Author author=new Author();

            System.out.print("Book 2 Author "+(i+1)+": ");
            author.setName(scan.nextLine());

            book2.addAuthor(author);
        }

        books.add(book2);

        Book book3 = new Book();

        System.out.println("Book 3 Title: ");
        book3.setTitle(scan.nextLine());

        Author author=new Author();

        System.out.print("Book 3 Author 1: ");
        author.setName(scan.nextLine());

        book3.addAuthor(author);

        books.add(book3);

        System.out.println("");

        for(int i=0;i<books.size();i++){

            System.out.print("Book " +(i+1)+ ": Title = "+books.get(i).getTitle());

            for(int j=0;j<books.get(i).getAuthorsCount();j++){
                System.out.print(", Author " +(j+1)+ " = "+books.get(i).getAuthor(j).getName());
            }

            System.out.println("");
        }
        scan.close();
    }
}

package bg.unwe;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
       Scanner scan = new Scanner(System.in);

        ArrayList<Product> products = new ArrayList<>();

        for(int i=0;i<5;i++){
            System.out.println("Product "+(i+1));

            Product p = null;
            char c = 't';
            switch(i){
                case 0:
                c='t';
                break;
                case 1:
                c='t';
                break;
                case 2:
                c='m';
                break;
                case 3:
                c='b';
                break;
                case 4:
                c='b';

            }

            switch(c){
                case 'm':
                p = new MP3Player();
                System.out.print("Colour Name: ");
                String mp3Colour = scan.nextLine();
                Colour colour = new Colour();
                colour.setName(mp3Colour);
                if(p instanceof MP3Player){
                    ((MP3Player)p).setColour(colour);
                }
                System.out.print("Manufacturer Name: ");
                String mp3Name=scan.nextLine();
                Manufacturer mp3Manufacturer = new Manufacturer();
                mp3Manufacturer.setName(mp3Name);
                if(p instanceof MP3Player){
                    ((MP3Player)p).setManufacturer(mp3Manufacturer);
                }
                break;
                case 't':
                TV tv = new TV();
                System.out.print("TV size: ");
                int size = Integer.parseInt(scan.nextLine());
                tv.setSize(size);
                System.out.print("Manufacturer Name: ");
                String tvName=scan.nextLine();
                Manufacturer tvManufacturer = new Manufacturer();
                tvManufacturer.setName(tvName);
                tv.setManufacturer(tvManufacturer);
                p=tv;
                break;
                case 'b':
                p= new Book();
                System.out.print("Publisher Name: ");
                String pName = scan.nextLine();
                Publisher publisher = new Publisher();
                publisher.setName(pName);
                ((Book)p).setPublisher(publisher);
                System.out.print("Book yearPublished: ");
                int year = Integer.parseInt(scan.nextLine());
                ((Book)p).setYearPublished(year);
                break;
            }

            System.out.print("Price of product "+(i+1)+": ");
            double price = Double.parseDouble(scan.nextLine());

            p.setPrice(price);
            products.add(p);
        }

        scan.close();
        System.out.println("");

        double totalDiscount=0;

        for(int i=0;i<products.size();i++){
            System.out.println("Item "+(i+1)
            +": Type = "+products.get(i).getClass().getSimpleName()
            +", Regular price = "+products.get(i).getPrice()
            +", Sale price = "+products.get(i).getSalePrice());

            totalDiscount+=products.get(i).getPrice()-products.get(i).getSalePrice();
        }

        System.out.println("Total discount = "+totalDiscount);

    }
}

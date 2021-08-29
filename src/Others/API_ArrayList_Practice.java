package Others;

import java.util.ArrayList;

public class API_ArrayList_Practice {
    public static void main(String[] args) {
        //Book[] books = new Book[5];
        // Array List = count no need.
        ArrayList<Book> books = new ArrayList<Book>();
        //int count = 0;

//        books[count++] = new Book("Book1", 4000);
        books.add( new Book("Book1", 4000));
//        books[count++] = new Book("Book2", 6000);
        books.add(new Book("Book2", 6000));
//        books[count++] = new Book("Book3", 5000);
        books.add( new Book("Book3", 5000));
        /*for (int i = 0; i < count; i++) {
            System.out.println(books[i].toString());
        }*/
        for (Book b : books) {
            System.out.println(b.toString());
        }
    }
}

class Book{

    private  String title;
    private int price;

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String toString() {
        return String.format("%s(%d)", this.title, this.price);
    }
}

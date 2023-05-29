
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Don Quixote",1023 , "Miguel de Cervantes Saavedra",1605 );
        Book book2 = new Book("To Kill a Mockingbird",281 , "Harper Lee",1960 );
        Book book3 = new Book("Lord of the Flies",182  , "William Golding",1954 );
        Book book4 = new Book("The Adventures of Huckleberry Finn",327  , "Mark Twain",1884 );
        Book book5 = new Book("The Great Gatsby",180 , "F. Scott Fitzgerald",1925 );

        TreeSet<Book> sortByName  = new TreeSet<>();
        sortByName.add(book1);
        sortByName.add(book2);
        sortByName.add(book3);
        sortByName.add(book4);
        sortByName.add(book5);

        System.out.println("Sayfa sayısına göre sıralama: ");
        for (Book book : sortByName) {
            System.out.println(book.getBookName());
        }
        System.out.println("==============================");


        TreeSet<Book> sortByNumber = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNum()-o2.getPageNum();
            }
        });
        sortByNumber.add(book1);
        sortByNumber.add(book2);
        sortByNumber.add(book3);
        sortByNumber.add(book4);
        sortByNumber.add(book5);
        System.out.println("==============================");
        System.out.println("Sayfa sayısına göre sıralama: ");
        for (Book book : sortByNumber) {
            System.out.println(book.getBookName() + " = " + "Sayfa sayısı : " +  book.getPageNum());
        }


    }
    }

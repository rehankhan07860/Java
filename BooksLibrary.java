
class Libarary{
    String[] books;
    int no_of_book;
    Libarary(){
        this.books = new String[100];
        this.no_of_book = 0;
    }
    void addBook(String book){
        this.books[no_of_book] = book;
        no_of_book++;
        System.out.println(book + " has been added");
    }
    void showavailaiblebook(){
        System.out.println("This books are availaible: ");
        for (String book: books){
            if (book == null){
                continue;
            }
            System.out.println(book);
        }
    }
    void issueBook(String book){
        for (int i = 0; i<this.books.length; i++){
            if (this.books[i].equals(book)){
                System.out.println("This book has been added");
                this.books[i]=null;
                return;
            }
        }
        System.out.println("This book does not exit");
    }
    void returnBook(String book){
        addBook(book);
    }
}

public class BooksLibrary {
    public static void main(String[] args) {
       Libarary myLibaray = new Libarary();
       myLibaray.addBook("Java");
       myLibaray.addBook("C++");
       myLibaray.showavailaiblebook();
       myLibaray.issueBook("C++");
       myLibaray.showavailaiblebook();
       myLibaray.returnBook("C++");
    }
}

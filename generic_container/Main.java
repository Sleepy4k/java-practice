package generic_container;

public class Main {
  public static void main(String[] args) {
    String bookTitle = "Java 8 in Action";
    Book book = new Book(bookTitle);

    Container<String> myBookTitle = new Container<String>(bookTitle);
    Container<Book> myBook = new Container<Book>(book);

    System.out.println(myBookTitle.getData());
    System.out.println(myBook.getData());
  }
}

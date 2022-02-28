/**
 * Book.java
 *
 * This is the class that aggregates the Author class
 *
 * @author axu5 <github.com/axu5>
 * @version 28.02.2022
 */
public class Book {
  public static void main(String[] _args) {
    // create author first
    Author author = new Author("Tan Ah Teck", "ahTeck@nowhere.com", 'm');
    System.out.println(author);

    // create an instance of a Book
    Book book = new Book("Java for Dummies", author, 9.99, 99);
    System.out.println(book);

    // test setters and getters
    book.setPrice(8.88);
    book.setQty(88);
    System.out.println(book);
    System.out.println("title is: " + book.getTitle());
    System.out.println("price is: " + book.getPrice());
    System.out.println("qty is: " + book.getQty());
    System.out.println("author is: " + book.getAuthor());
    System.out.println("author's name is: " + book.getAuthor().getName());
    System.out.println("author's email is: " + book.getAuthor().getEmail());
    System.out.println("author's gender is: " + book.getAuthor().getGender());

    // using anonymous Author instance to create an instance of book
    Book anotherBook = new Book("More Java for dummies", new Author("Peter Lee", "peter@nowhere.com", 'm'), 19.99, 8);
    System.out.println(anotherBook);
  }

  private Author author;
  private String title;
  private double price;
  private int qty;

  Book(String title, Author author, double price, int qty) {
    this.title = title;
    this.author = author;
    this.price = price;
    this.qty = qty;
  }

  public String getTitle() {
    return title;
  }

  public Author getAuthor() {
    return author;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getQty() {
    return qty;
  }

  public void setQty(int qty) {
    this.qty = qty;
  }

  public String toString() {
    return "'" + this.title + "' by " + author.toString();
  }
}
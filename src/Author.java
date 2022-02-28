/**
 * Author.java
 *
 * Author class is the super class for all books.
 *
 * @author axu5 <github.com/axu5>
 * @version 28.02.2022
 */
public class Author {
  public static void main(String[] _args) {

  }

  private String name;
  private String email;
  private char gender;

  Author(String name, String email, char gender) {
    this.name = name;
    this.email = email;
    this.gender = gender;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public char getGender() {
    return gender;
  }

  public String toString() {
    return this.name + " (" + this.gender + ") at " + this.email;
  }
}
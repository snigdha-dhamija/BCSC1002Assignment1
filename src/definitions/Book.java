/*  Created by IntelliJ IDEA.
 *  User: Snigdha Dhamija
 *  Date: 30/08/20
 *  Time: 5:50 PM
 *  File Name : Book.java
 * */
package definitions; 

import java.util.Objects;

public class Book {

    private String nameOfBook;
    private String nameOfAuthorOfTheBook;
    private String thirteenDigitsISBNNumberOfTheBook;

    // Parameterized Constructor
    public Book(String nameOfBook, String nameOfAuthorOfTheBook, String thirteenDigitISBNNumberOfTheBook) {
        this.nameOfBook = nameOfBook;
        this.nameOfAuthorOfTheBook = nameOfAuthorOfTheBook;
        this.thirteenDigitsISBNNumberOfTheBook = thirteenDigistISBNNumberOfTheBook;
    }

    // Non-Parameterized Constructor
    public Book() {
        this.nameOfBook = null;
        this.nameOfAuthorOfTheBook = null;
        this.thirteenDigitsISBNNumberOfTheBook = null;
    }
    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public String getNameOfAuthorOfTheBook() {
        return nameOfAuthorOfTheBook;
    }

    public void setNameOfAuthorOfTheBook(String nameOfAuthorOfTheBook) {
        this.nameOfAuthorOfTheBook = nameOfAuthorOfTheBook;
    }

    public String getThirteenDigitsISBNNumberOfTheBook() {
        return thirteenDigitISBNNumberOfTheBook;
    }

    public void setThirteenDigitsISBNNumberOfTheBook(String thirteenDigitISBNNumberOfTheBook) {
        this.thirteenDigitISBNNumberOfTheBook = thirteenDigitISBNNumberOfTheBook;
    }



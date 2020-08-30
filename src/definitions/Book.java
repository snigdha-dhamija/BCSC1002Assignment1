/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
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

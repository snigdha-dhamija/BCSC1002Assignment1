/*  Created by IntelliJ IDEA.
 *  User: Snigdha Dhamija
 *  Date: 30/08/20
 *  Time: 7:57 PM
 *  File Name : Library.java
 * */
package definitions;

public class Library {

private static final int MAXIMUM_NUMBER_OF_BOOKS_IN_LIBRARY = 5;
    private Book [] booksThatAreRecentlyAvailable;

    // Parameterized Constructor
    public Library(Book[] booksThatAreRecentlyAvailable) {
        this.booksThatAreRecentlyAvailable = booksThatAreRecentlyAvailable;
    }

    // Non-Parameterized Constructor
    public Library() {
        this.booksThatAreRecentlyAvailable = new Book[MAXIMUM_NUMBER_OF_BOOKS_IN_LIBRARY];
        for (int libraryIndex = 0; libraryIndex < MAXIMUM_NUMBER_OF_BOOKS_IN_LIBRARY; libraryIndex++) {
            this.booksThatAreRecentlyAvailable[libraryIndex] = new Book();
        }
    }

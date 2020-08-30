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
    public Book[] getBooksThatAreRecentlyAvailable() {
        return booksThatAreRecentlyAvailable;
    }

    public void setBooksThatAreRecentlyAvailable(Book[] booksThatAreRecentlyAvailable) {
        this.booksThatAreRecentlyAvailable = booksThatAreRecentlyAvailable;
    }
   
    public String toString() {
        return Arrays.toString(booksThatAreRecentlyAvailable);
    }
    public equals()
   {
    if(Library.getBooksThatAreRecentlyAvailable() equals.(Array.getBooksThatAreRecentlyAvailable()));
     System.out.println("Both are equal");
    }
    public hashCode() {
        if(Arrays.hashCode(getBooksThatAreCurrentlyAvailable())==Library.hashCode(getBooksThatAreRecentlyAvailable())); 
        System.out.println("Equal");
    }
/**
     * This method will set the Information of books available in Library.
     */
    public void setBooksInLibrary()
     {
        booksThatAreRecentlyAvailable[0].setNameOfBook("Engineering Physics");
        booksThatAreRecentlyAvailable[0].setNameOfAuthorOfTheBook("S.k Sharma");
        booksThatAreRecentlyAvailable[0].setThirteenDigitsISBNNumberOfTheBook("5678996134689");
        booksThatAreRecentlyAvailable[1].setNameOfBook("Software Engineering");
        booksThatAreRecentlyAvailable[1].setNameOfAuthorOfTheBook("K.K Gupta");
        booksThatAreRecentlyAvailable[1].setThirteenDigitsISBNNumberOfTheBook("9353062012000");
        booksThatAreRecentlyAvailable[2].setNameOfBook("Engineering Chemistry");
        booksThatAreRecentlyAvailable[2].setNameOfAuthorOfTheBook("S.P. Singh");
        booksThatAreRecentlyAvailable[2].setThirteenDigitsISBNNumberOfTheBook("9789332582705");
        booksThatAreRecentlyAvailable[3].setNameOfBook("Essentials of English");
        booksThatAreRecentlyAvailable[3].setNameOfAuthorOfTheBook("Preeti Das");
        booksThatAreRecentlyAvailable[3].setThirteenDigitsISBNNumberOfTheBook("9789388028028");
        booksThatAreRecentlyAvailable[4].setNameOfBook("Core Python Programming");
        booksThatAreRecentlyAvailable[4].setNameOfAuthorOfTheBook("Dr. R. Nageswara Rao");
        booksThatAreRecentlyAvailable[4].setThirteenDigitsISBNNumberOfTheBook("9351199258111");
    }
    /**
     * This method will show the Information of books available in Library.
     */
    public void showAvailableBooks() {
        System.out.println("----------------------------------------------------------------------------------");
        System.out.printf("|%-36s %-21s %-21s|\n", "Name of the book", "Name of the Author", "13-Digits ISBN Number");
        System.out.println("----------------------------------------------------------------------------------");
        for (int libraryIndex = 0; libraryIndex < MAXIMUM_NUMBER_OF_BOOKS_IN_LIBRARY; libraryIndex++) {
            System.out.printf("|%-36s %-21s %-21s|\n", booksThatAreRecentlyAvailable[libraryIndex].getNameOfBook(), booksThatAreRecentlyAvailable[libraryIndex].getNameOfAuthorOfTheBook(), booksThatAreRecentyAvailable[libraryIndex].getThirteenDigitsISBNNumberOfTheBook());
        }
        System.out.println("----------------------------------------------------------------------------------");
    }
}

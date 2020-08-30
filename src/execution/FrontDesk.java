/*  Created by IntelliJ IDEA.
 *  User: Snigdha Dhamija
 *  Date: 30/08/20
 *  Time: 9:35 PM
 *  File Name : FrontDesk.java
 * */
package execution;
import definitions.Library;
import definitions.Student;

import java.util.Scanner;
public class FrontDesk {
    private static final int ISSUE_A_NEW_BOOK = 1;
    private static final int RETURN_A_PREVIOUSLY_ISSUED_BOOK = 2;
    private static final int SHOW_ALL_ISSUED_BOOKS = 3;
    private static final int EXIT = 4;
    
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
        int studentChoice;
        Student student = new Student();
        Library library = new Library();
        library.setBooksInLibrary();
        String booksName;
        do {
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issues book for me.");
            System.out.println("3. Show me all my issues books.");
            System.out.println("4. Exit.");
            System.out.println("Enter your choice (1..4): ");
            studentChoice = scanner.nextInt();
            switch (studentChoice) {
                case ISSUE_A_NEW_BOOK:
                    scanner.nextLine();
                    System.out.println("Enter your name: ");
                    student.setNameOfTheStudent(scanner.nextLine());
                    System.out.println("Enter your University roll number: ");
                    student.setStudentUniversityRollNumber(scanner.nextLong());
                    System.out.println("How much books you want to issue: ");
                    student.setNumberOfBooksIssuedByStudent(scanner.nextInt());
                    System.out.println("These are the available books: ");
                    library.showAvailableBooks();
                    scanner.nextLine();
                    System.out.println("Enter the details of the books you want to issue: ");
                    for (int bookIssuingIndex = 0; bookIssuingIndex < student.getNumberOfBooksIssuedByTheStudent(); bookIssuingIndex++) {
                        System.out.println("Enter name of book " + (bookIssuingIndex + 1) + ": ");
                        booksName = scanner.nextLine();
                        student.issueBooksToStudents(bookIssuingIndex, booksName);
                    }
                    System.out.println("Thank you for Issuing the Books");
                    break;
                case RETURN_A_PREVIOUSLY_ISSUED_BOOK:
                    if (student.getNumberOfBooksIssuedByStudent() == 0) {
                        System.out.println("Sorry, you haven't issued any book yet so you can't return book.");
                    } else {
                        System.out.println("Enter the name of the book you want to return: ");
                        scanner.nextLine();
                        booksName = scanner.nextLine();
                        if (student.returnBook(booksName)) {
                            System.out.println("Thank you for returning the book " + booksName + ".");
                        }
                    }
                    break;
                case SHOW_ALL_ISSUED_BOOKS:
                    student.showIssuedBooksByStudent();
                    break;
                case EXIT:
                    System.out.println("Thanks for using our service.");
                    break;
                default:
                    System.out.println("Your have entered wrong choice!");
                    break;
            }
        } 
        while (studentChoice != EXIT);
        scanner.close();
    }

   

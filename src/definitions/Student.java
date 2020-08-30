/*  Created by IntelliJ IDEA.
 *  User: Snigdha Dhamija
 *  Date: 30/08/20
 *  Time: 8:40 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {
private static final int MAXIMUM_NUMBER_OF_BOOKS_STUDENT_CAN_ISSUE = 5;
    private String studentName;
    private long studentUniversityRollNumber;
    private int numberOfBooksIssuedByStudent;
    private Book[] booksNameIssuedByTheStudent;

    // Parameterized Constructor
    public Student(String studentName, long studentUniversityRollNumber int numberOfBooksIssuedByStudent, Book[] booksNameIssuedByTheStudent) {
        this.studentName = studentName;
        this. studentUniversityRollNumber=studentUniversityRollNumber ;
        this.numberOfBooksIssuedByStudent = numberOfBooksIssuedByStudent;
        this.booksNameIssuedByTheStudent = booksNameIssuedByTheStudent;
    }

    // Non-Parameterized Constructor
    public Student() {
        this.studentName = "";
        this. studentUniversityRollNumber= 0L;
        this.numberOfBooksIssuedByStudent = 0;
        this.booksNameIssuedByTheStudent = new Book[MAXIMUM_NUMBER_OF_BOOKS_STUDENT_CAN_ISSUE];
        for (int initializingBook = 0; initializingBook < MAXIMUM_NUMBER_OF_BOOKS_STUDENT_CAN_ISSUE; initializingBook++) {
            this.booksNameIssuedByTheStudent[initializingBook] = new Book();
        }
    public String getStudentName() {
        return studentName;
    }

    public void setstudentName(String studentName) {
        this.studentName = studentName;
    }

    public long getStudentUniversityRollNumber() {
        return studentUniversityRollNumber;
    }

    public void setStudentUniversityRollNumber(long studentUniversityRollNumber) {
        this.studentUniversityRollNumber = studentUniversityRollNumber;
    }

    public int getNumberOfBooksIssuedByStudent() {
        return numberOfBooksIssuedByStudent;
    }

    public void setNumberOfBooksIssuedByStudent(int numberOfBooksIssuedByStudent) {
        this.numberOfBooksIssuedByStudent = numberOfBooksIssuedByStudent;
    }

    public Book[] getBooksNameIssuedByTheStudent() {
        return BooksNameIssuedByTheStudent;
    }

    public void setBooksNameIssuedByTheStudent(Book[] booksNameIssuedByTheStudent) {
        this.booksNameIssuedByTheStudent = booksNameIssuedByTheStudent;
    }

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
    public String toString() {
        return "Name of the Student: " + getStudentName() + ", " +
                "University Roll Number: " + getStudentUniversityRollNumber() + ", " +
                "Number of Books Issued: " + getNumberOfBooksIssuedByStudent() + ", " +
                "Names of Books Issued: " + Arrays.toString(BooksNameIssuedByTheStudent()) + ".";

    }
    public equals()
    {
    if(Student.getStudentUniversityRollNumber() == student.getStudentUniversityRollNumber() &&
                Student.getNumberOfBooksIssuedByStudent() == student.getNumberOfBooksIssuedByStudent() &&
                Books.equals(getStudentName(), student.StudentName()) &&
                Arrays.equals(BooksNameIssuedByTheStudent(), student.getNamesOfTheBooksIssuedByTheStudent());
    }
    public hashCode()
    {
        if( Book.hashCode(getStudentName()), getStudentUniversityRollNumber(), getNumberOfBooksIssuedByStudent());
        {
         result = 31 * result + Arrays.hashCode(getNamesOfTheBooksIssuedByStudent());
        System.out.println( result);
    }
}
/**
     * This method will issue the books to the Student
     *
     * @param bookIssuingIndex The index where the book is issueing.
     * @param bookName         The name of the book which is issuing.
     */
    public void issueBooksToStudents(int bookIssuingIndex, String bookName) {
        namesOfTheBooksIssuedByTheStudent[bookIssuingIndex].setNameOfTheBook(bookName);
    }

     *
     * @param bookIssuingIndex The index where the book is issueing.
     * @param bookName         The name of the book which is issuing.
     */
    public void issueBooksToStudents(int bookIssuingIndex, String bookName) {
        namesOfTheBooksIssuedByStudent[bookIssuingIndex].setNameOfTheBook(bookName);
    }

    /**
     * This method will return the Book which is issued by the student.
     *
     * @param bookName The name of the book which is used to be returned.
     * @return It will return Boolean value, if return will be successful then it will return true else false.
     */
    public boolean returnBook(String bookName) {
        boolean returnSuccessful = false;
        int returnBookIndex = 0;
        for (int tempIndex = 0; tempIndex < MAXIMUM_BOOKS_STUDENT_CAN_ISSUE; tempIndex++) {
            if (bookName.equals(namesOfTheBooksIssuedByTheStudent[tempIndex].getNameOfTheBook())) {
                returnSuccessful = true;
                returnBookIndex = tempIndex;
                setNumberOfBooksIssuedByStudent(getNumberOfBooksIssuedByStudent() - 1);
                break;
            }
        }
        if (returnSuccessful) {
            namesOfTheBooksIssuedByStudent[returnBookIndex].setNameOfBook(null);
        } else {
            System.out.println("Please Enter the correct book name.");
        }
        return returnSuccessful;
    }

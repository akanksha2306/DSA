package lowLevelDesign;

import java.util.Date;
import java.util.List;

public class LibraryManagement {

    class Library {
        String name;
        Address address;
        List<BookItem> books;
        int rackNumber;//when to use int and INteger;

    }

    class Address {
        int pincode;//is varchar a combo of string and int;
        String Street;
        String City;
        String State;
        String country;

    }

    class Book {
        String title;
        Integer uniqueIdNumber;
        List<Author> authors;
        BookType bookType;//enum hoga yeh
    }

    class BookItem extends Book {
        //here there can be multiple copies of same book, but barcode, and issued date will be different.
        String barcode;
        Date publicationDate;//here issued date can be used.
        Rack rackLocation;//again rack is a complex class
        BookStatus bookStatus;//enum hoga
        BookFormat bookFormat;//hard cover, journal, paperbook
        Date issuedDate;
    }

    public enum BookType {
        SCI_FI, ROMANTIC, FANTASY, DRAMA;
    }

    public enum BookFormat {
        JOURNAL, HARDCOVER, PAPERBACK, NEWSPAPER;
    }

    public enum BookStatus {

        ISSUED, AVAILABLE, LOST, RESERVED;
    }

    class Rack {
        //EXCAT POSITION OF COPY OF BOOK INSIDE THE LIBABRY
        int number;
        String locatinId;


    }

    class Person {
        String firstName;
        String lastName;
    }

    class Author extends Person {
        List<Book> booksPublishedBythisAuthor;
    }

    class SystemUser extends Person {
        String email;
        String phoneNumber;
        Account account;
    }

    class Member extends SystemUser {
        int totalBookCheckout;

        Search searchobj;
        BookIssueService bookIssueService;
    }

    class Librarian extends SystemUser {
        Search searchobj;
        BookIssueService bookIssueService;

        public void addBookItem(BookItem bookItem) {

        }

        public BookItem deleteBook(String barcode) {
            return null;
        }

        public BookItem editBook(BookItem bookItem) {
            return null;
        }
    }

    class Account {
        String userName;
        String passWord;
        int accountId;
    }

    class Search {
        public List<BookItem> getBookByAuthor(Author author) {
            return null;
        }

        public List<BookItem> getBookByTitle(String bookName) {
            return null;
        }

        public List<BookItem> getBookByType(BookType bookType) {
            return null;
        }

        public List<BookItem> getBookByPublicationDate(Date publication) {
            return null;
        }

    }

    class BookIssueService {
        FineService fineService;

        public BookReservationDetail getResevationDetail() {

            return null;
        }

        ;

        public void updateReservationDetails(BookReservationDetail bookReservationDetail) {
        }

        public BookReservationDetail reserveBook(SystemUser user, BookItem bookItem) {
            return null;
        }

        public BookIssueDetail issueBook(SystemUser user, BookItem bookItem) {
            return null;
        }

        public BookIssueDetail renewBook(SystemUser user, BookItem bookItem) {
            return null;


        }

        public void returnBook(SystemUser user, BookItem bookItem) {
        }
    }

    //BookReservationDetail and BookIssueDetail are in similar classes;
    class BookLending {
        BookItem book;
        Date startDate;
        SystemUser user;
    }

    class BookReservationDetail extends BookLending {
        BookStatus reservationStatus;

    }

    class BookIssueDetail extends BookLending {
        Date dueDate;
    }

    class FineService {
        public Fine CalculateFine(BookItem bookItem, SystemUser systemUser, int Days) {
            return null;

        }

    }

    class Fine {
        SystemUser user;
        BookItem bookItem;
        Date fineDate;
        Double fineValue;
    }

    class customer {
        String name;
        String id;
        Book bookId;
    }

    class Notification {

    }


    class Server {

        Notification notification() {
            return null;
        }
    }

}

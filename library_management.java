package com.company;

public class library_management {
    public static void main(String[] args) {
        // To implement a library using Java Class "Library"
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books,
        // Array to store the issued books

        Kirjasto helmet = new Kirjasto();
        helmet.addBook("C++");
        helmet.addBook("Hum kon hain");
        helmet.addBook("Successful Businesses");
        helmet.addBook("What is important in life");
        helmet.showAvailableBooks();
        helmet.issueBooks("Hum kon hain");
        helmet.showAvailableBooks();
        helmet.returnBook("tum kon ho");
        helmet.showAvailableBooks();
        helmet.returnBook("Hum kon hain");
        helmet.showAvailableBooks();
    }
}

class Kirjasto {
    String [] books;
    int counterbook;

    Kirjasto() {
        this.books = new String[100];
        counterbook = 0;
    }

    void addBook(String book) {
        this.books[counterbook] = book;
        counterbook++;
        System.out.println(book + " Has been added");
    }

    void showAvailableBooks() {
        System.out.println("These books are available");
        for (String book : this.books) {
            if (book == null) {
                continue;
            }
            System.out.println("* " + book);
        }
    }
    void issueBooks(String book){
        for (int i = 0; i < this.books.length; i++){
            if (this.books[i].equals(book)){
                System.out.println("This book has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist");

    }
    void returnBook(String book){
        addBook(book);
    }
}
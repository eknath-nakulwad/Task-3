package com.library;


public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("The Alchemist", "Paulo Coelho"));
        library.addBook(new Book("Atomic Habits", "James Clear"));
        library.addBook(new Book("Clean Code", "Robert C. Martin"));

        library.addUser(new User("Alice", 1));
        library.addUser(new User("Bob", 2));

        library.showBooks();

        library.issueBook("The Alchemist", 1);

        library.showBooks();

        library.returnBook("The Alchemist");

        library.showBooks();
    }
}


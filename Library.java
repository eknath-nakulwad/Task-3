package com.library;


import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void issueBook(String title, int userId) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isIssued()) {
                book.issueBook();
                System.out.println("Book issued: " + book + " to " + findUserById(userId));
                return;
            }
        }
        System.out.println("Book not available or already issued.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isIssued()) {
                book.returnBook();
                System.out.println("Book returned: " + book);
                return;
            }
        }
        System.out.println("Invalid return request.");
    }

    public void showBooks() {
        System.out.println("\n📚 Library Books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    private User findUserById(int id) {
        for (User user : users) {
            if (user.getUserId() == id) return user;
        }
        return null;
    }
}


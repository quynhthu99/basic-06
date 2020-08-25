package model.DAO;

import java.util.ArrayList;
import java.util.Scanner;
import model.DTO.Book;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Luong Quynh Thu
 */
public class BookDAO {

    Scanner sc = new Scanner(System.in);
    ArrayList<Book> library = new ArrayList<>();

    public BookDAO() {
        Book defaultBook = new Book("BookA", 1000);
        library.add(defaultBook);
    }

    public ArrayList<Book> getAllBooks() {
        return library;
    }

    public boolean addBook(String name, int price) {

        Book defaultBook = new Book(name, price);
        if (library.add(defaultBook)) {
            return true;
        }
        return false;

    }

    public boolean deleteBook(String name) {
        for (int i = 0; i < library.size(); i++) {
            if (library.get(i).getName().equals(name)) {
                library.remove(library.get(i));
                return true;

            }
            return false;
        }
        return false;

    }

    public boolean updateBook(String name, Book book) {
        for (int i = 0; i < library.size(); i++) {
            if (library.get(i).getName().equals(name)) {
                library.set(i, book);
                return true;
            }

        }
        return false;
    }
}

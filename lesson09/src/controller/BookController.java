/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.DAO.BookDAO;
import model.DTO.Book;

/**
 *
 * @author Luong Quynh Thu
 */
public class BookController {

    BookDAO bookDAO = new BookDAO();

    public ArrayList<Book> getAllBooks() {
        return bookDAO.getAllBooks();
    }

    public boolean addBook(String name, int price) {
        return bookDAO.addBook(name, price);
    }
    public boolean deleteBook(String name){
        return bookDAO.deleteBook(name);
    }
    public boolean updateBook(String name, Book book){
        return bookDAO.updateBook(name, book);
    }

}

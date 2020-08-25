/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.BookController;
import java.util.ArrayList;
import java.util.Scanner;
import model.DTO.Book;

/**
 *
 * @author Luong Quynh Thu
 */
public class BookView {

    Scanner sc = new Scanner(System.in);
    BookController bookController = new BookController();

    public void excute() {

        while (true) {

            System.out.println("1. Show book");
            System.out.println("2. Add book");
            System.out.println("3. Delete book");
            System.out.println("4. Update book");
            System.out.println("5. Type book");
            System.out.println("6. Sort by price");
            System.out.println("7. Exit");
            int inputUser = sc.nextInt();
            sc.nextLine();
            switch(inputUser){
                case 1: 
                    ArrayList<Book> allBooks = bookController.getAllBooks();
                    for (int i = 0; i < allBooks.size(); i++) {
                        System.out.println(allBooks.get(i));
                    }
                    break;
                case 2: 
                    System.out.print("Enter name of book add: "); 
                    String name = sc.nextLine();
                    System.out.print("Enter price of book add: ");
                    int price = sc.nextInt();
                    System.out.println(bookController.addBook(name, price));
                    break;
                case 3: 
                    System.out.print("Enter name of book delete: ");
                    System.out.println(bookController.deleteBook(sc.nextLine()));
                    break;
                case 4: 
                    System.out.print("Enter name of book need update: ");
                    String name1 = sc.nextLine();
                    System.out.print("Enter name update: "); 
                    String name2 = sc.nextLine();
                    System.out.print("Enter price update:  ");
                    int price2 = sc.nextInt();
                    Book book = new Book(name2, price2);
                    System.out.println(bookController.updateBook(name1, book));
                    
                    break;
                case 5: 
                    break;
                case 6: 
                    break;
                case 7: 
                   return;
                default: 
                    break;
            }
        }
    }
}

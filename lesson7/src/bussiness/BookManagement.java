package bussiness;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import entity.Book;

public class BookManagement {
	Scanner sc = new Scanner(System.in);
	private List<Book> listBook;

	public BookManagement() {
		listBook = new ArrayList<>();
	}

	public void showBook() {
		for (int i = 0; i < listBook.size(); i++) {
			System.out.println(listBook.get(i).toString());
		}
	}

	public boolean addBook(Book bk) {
		if (listBook.add(bk))
			return true;
		return false;

	}

	public boolean delete(String name) {
		int a = -1;
		for (Book book : listBook) {
			if (book.getTen().equals(name)) {
				listBook.remove(book);
				a = 1;
			}

		}
		return a == 1 ? true : false;

	}

	public boolean updateBook(String name, Book moi) {
		int a = -1;

		for (int i = 0; i < listBook.size(); i++) {
			if (listBook.get(i).getTen().equals(name)) {
				listBook.set(i, moi);
				a = 1;
			}

		}

		return a == 1 ? true : false;

	}

	public List sortBook() {
		List<Book> arr = new ArrayList<>();
		arr = listBook;
		//Book k;
		for (int i = 0; i < arr.size(); i++) {
			for (int j = 0; j < arr.size() - 1; j++) {
				if (arr.get(j).getGia() > arr.get(j + 1).getGia()) {
					Book k = arr.get(j);
					arr.set(j, arr.get(j + 1));
					arr.set(j + 1, k);

				}
			}
		}
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i).toString());
		}

		return arr;
	}

	public Set<String> typeBook() {
		Set<String> list = new HashSet();

		for (int i = 0; i < listBook.size(); i++) {
			list.add(listBook.get(i).getLoai());
		}
		showSet(list);
		return list;
	}

	public void showSet(Set list) {
		for (Object object : list) {
			System.out.println(object);
		}
	}
}

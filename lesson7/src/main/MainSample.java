package main;

import java.util.Scanner;

import bussiness.BookManagement;
import entity.Book;

public class MainSample {
	public static void main(String[] args) {
		BookManagement book = new BookManagement();
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1. Show book");
			System.out.println("2. Add book");
			System.out.println("3. Delete book");
			System.out.println("4. Update book");
			System.out.println("5. Type book");
			System.out.println("6. Sort by price");
			System.out.println("7. Exit");
			int n = new Scanner(System.in).nextInt();
			switch (n) {
			case 1:
				book.showBook();
				break;
			case 2:
				Book bk = new Book();
				System.out.println("Nhap ten: ");
				bk.setTen(sc.next());
				System.out.println("Nhap loai: ");
				bk.setLoai(sc.next());
				System.out.println("Nhap xuat xu: ");
				bk.setXuatXu(sc.next());
				System.out.println("Nhap gia: ");
				bk.setGia(sc.nextFloat());
				System.out.println("Nhap trang: ");
				bk.setSoTrang(sc.nextInt());

				System.out.println(book.addBook(bk));
				break;
			case 3:
				System.out.println("Nhap ten sach can xoa: ");
				String name = sc.next();
				System.out.println(book.delete(name));
				break;
			case 4:
				System.out.println("Nhap ten sach can update: ");
				String name1 = sc.next();
				System.out.println("Nhap ten: ");
				String ten = sc.next();
				System.out.println("Nhap loai: ");
				String loai = sc.next();
				System.out.println("Nhap xuat xu: ");
				String xuatXu = sc.next();
				System.out.println("Nhap gia: ");
				float gia = sc.nextFloat();
				System.out.println("Nhap so trang: ");
				int soTrang = sc.nextInt();
				Book moi = new Book(ten, xuatXu, loai, gia, soTrang);
				System.out.println(book.updateBook(name1, moi));
				break;
			case 5:
				book.typeBook();
				break;
			case 6:
				book.sortBook();
				break;
			case 7:
				return;
			}
		}
	}
}

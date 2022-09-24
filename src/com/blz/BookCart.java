package com.blz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * @author kastu
 *
 */
public class BookCart {
	/*
	 * Defining sc as a object of scanner , books as a object of list & list as a
	 * object of arraylist
	 */
	Scanner sc = new Scanner(System.in);
	List<Books> books = new ArrayList<>();
	ArrayList<Books> list = new ArrayList<>();

	/*
	 * Defining addNewBook as a method for adding new book to cart Taking inputs
	 * from the user for name , author, genre & release date Displaying message
	 * after adding book into the cart
	 */
	public void addNewBook() {

		System.out.println("Enter Book name...");
		String bookName = sc.next();

		System.out.println("Enter Book author...");
		String bookAuthor = sc.next();

		System.out.println("Enter Book genre...");
		String bookGenre = sc.next();

		System.out.println("Enter Book releasing date...");
		String releaseDate = sc.next();

		Books book = new Books(bookName, bookAuthor, bookGenre, releaseDate);

		list.add(book);

		System.out.println("Your Book added into the cart successfully!!!");

	}

	/*
	 * Defining deleteBook as a method for deleting the book entry into the cart
	 * Taking input from the user for book name using scanner If name2 matches book
	 * name from the cart then that entry will be deleted Displaying message to user
	 * after deleting book
	 */
	public void deleteBook() {
		System.out.println("Enter book name to delete the book from the cart.... ");
		String name2 = sc.next();
		int index = 0;
		for (Books book : list) {
			if (book.getBookName().equals(name2)) {
				list.remove(index);
				System.out.println("The book deleted successfully from the cart!!!");
				break;
			}
			index++;
		}
	}

	/*
	 * Defining searchBook as a method for searching book in the cart by book name
	 * Taking input for book name from the user using scanner If name3 matches book
	 * name then displaying message to user
	 */
	public void searchBook() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter book name to search book entry in book cart: ");
		String name3 = sc.nextLine();
		int index = 0;
		for (Books book : list) {
			if (book.getBookName().equals(name3)) {
				System.out.println("Entered book found in book cart");
			} else {
				System.out.println("Entered book not found in book cart");
			}
		}
	}

	/*
	 * Defining searchBookByAuthor as a method for searching book in the cart by
	 * book author Taking input for book author from the user using scanner If name4
	 * matches book author then displaying message to user
	 */
	public void searchBookByAuthor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter book author to search book entry in book cart: ");
		String name4 = sc.nextLine();
		int index = 0;
		for (Books book : list) {
			if (book.getBookAuthor().equals(name4)) {
				System.out.println("Entered book found in book cart");
			} else {
				System.out.println("Entered book not found in book cart");
			}
		}
	}

	/*
	 * Defining printBooksInBookcart as a method to print beeok in the cart
	 */
	public void printBooksInBookCart() {

		System.out.println(list);
	}
}

package com.blz;

import java.util.Scanner;

/**
 * 
 * @author kastu
 *
 */
public class BooksCartMain {
	/*
	 * Taking sc as a object of scanner method
	 */
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * Displaying welcome message Defining obj as a object of BookCart program
		 * Displying option to user Taking input accodingly from the user using switch
		 * case
		 */
		System.out.println("Welcome to Books cart program.... ");
		BookCart obj = new BookCart();

		while (true) {
			System.out.println("Enter your choice... \n 1. Add  new books\n 2. Delete the book from the cart\n "
					+ "3. Search book by using book name in the cart\n 4. print the book cart\n 0. To exit");

			Scanner scanner = new Scanner(System.in);
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				obj.addNewBook();
				break;
			case 2:
				obj.deleteBook();
				break;
			case 3:
				obj.searchBook();
				break;
			case 4:
				obj.printBooksInBookCart();
				break;
			default:
				System.out.println("Enter the wrong input");
			}

		}

	}

}

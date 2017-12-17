import java.util.Scanner;

public class TestLibrary {
	public static void main(String[] args) {
		Library l = new Library();
		Scanner i = new Scanner(System.in);
		int x;

		System.out.print("**********************************************************************\r\n"
				+ "* Welcome to KSU Library :)\r\n" + "* ---------------------------\r\n"
				+ "* Please enter one of the following options:\r\n" + "* 1) Add a book\r\n" + "* 2) Delete a book\r\n"
				+ "* 3) Find a book\r\n" + "* 4) List all books\r\n" + "* 5) List books for a given genre\r\n"
				+ "* 6) Number of books for a given author\r\n" + "* 7) Total number of books\r\n" + "* 8) Exit\r\n"
				+ "*\r\n" + "**********************************************************************\r\n"
				+ "Enter your option :>");
		x = i.nextInt();
		do {
			if (x == 1) {
				System.out.print("Please, enter the book details #ISBN, author, title, and genre.");
				int a;
				String b, d, e;
				l.addBook(a = i.nextInt(), b = i.next(), d = i.next(), e = i.next());
				System.out.println("The book has been added.");
			}
			if (x == 2) {
				int a;
				l.deleteBook(a=i.nextInt());
				System.out.println("Done");
			}
			if (x == 3) {
				int a;
				System.out.println(l.findBook(a=i.nextInt()));
				System.out.println("Done");
			}
			if (x == 4) {
				l.printAll();
			}
			if (x == 5) {
				String g;
				l.printGenre(g=i.next());
			}
			if (x == 6) {
				String g;
				System.out.println(l.getNumberOfBooksByAuthor(g=i.next()));
			}
			if (x == 7) {
				System.out.println(l.getNumberOfBooks());
			}
			
			System.out.print("**********************************************************************\r\n"
					+ "* Welcome to KSU Library :)\r\n" + "* ---------------------------\r\n"
					+ "* Please enter one of the following options:\r\n" + "* 1) Add a book\r\n" + "* 2) Delete a book\r\n"
					+ "* 3) Find a book\r\n" + "* 4) List all books\r\n" + "* 5) List books for a given genre\r\n"
					+ "* 6) Number of books for a given author\r\n" + "* 7) Total number of books\r\n" + "* 8) Exit\r\n"
					+ "*\r\n" + "**********************************************************************\r\n"
					+ "Enter your option :>");
			
			x = i.nextInt();
		} while (x != 8);
	}

}

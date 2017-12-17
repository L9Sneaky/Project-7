
public class Library {
	private Book[] libraryBooks;
	private int numOfBooks;
	public static final int MAX_NUM = 100;

	public Library() {
		libraryBooks = new Book[MAX_NUM];
		setNumOfBooks(0);
	}
	public int getNumberOfBooks() {
		return numOfBooks-1;
	}

	public void setNumOfBooks(int numOfBooks) {
		this.numOfBooks = numOfBooks;
	}
	
	public Book[] getLibraryBooks() {
		return libraryBooks;
	}

	public boolean addBook(Book b) {
		if (addBook(b.getISBN(), b.getTilte(), b.getAuthor(), b.getGenre())) {
			return true;
		}
		return false;
	}

	public boolean addBook(int ISBN, String title, String author, String genre) {
		Book a = new Book(ISBN, title, author, genre);
		if (a.verifyISBN(ISBN)) {
			if (findBook(ISBN) == -1) {
				libraryBooks[numOfBooks] = a;
				numOfBooks++;
				return true;
			} else
				return false;
		} else
			return false;
	}

	public int findBook(int ISBN) {
		for (int i = 0; i < numOfBooks; i++) {
			if (libraryBooks[i].getISBN() == ISBN) {
				return i;
			}
		}
		return -1;
	}

	public int findBook(Book b) {
		for (int i = 0; i < numOfBooks; i++) {
			if (libraryBooks[i] == b) {
				return i;
			}
		}

		return -1;
	}

	public void deleteBook(int ISBN) {
		libraryBooks[findBook(ISBN)] = libraryBooks[numOfBooks - 1];
		libraryBooks[numOfBooks] = null;
		numOfBooks--;
	}

	public void printAll() {
		for (int i = 0; i < numOfBooks; i++) {
			libraryBooks[i].printBookInfo();
		}
	}

	public void printGenre(String g) {
		for(int i = 0 ; i<numOfBooks;i++) {
			if(libraryBooks[i].getGenre().equalsIgnoreCase(g)) {
				libraryBooks[i].printBookInfo();
			}
		}
	}
	
	public int getNumberOfBooksByAuthor(String author) {
		int sum = 0;
		for(int i = 0; i <numOfBooks;i++) {
			if(libraryBooks[i].getAuthor().equalsIgnoreCase(author));
			sum++;
		}
		return sum;
	}
	
	
}

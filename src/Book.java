
public class Book {
	private int ISBN;
	private String author;
	private String tilte;
	private String genre;
	private String refcode;

	public Book() {
	}

	public Book(int ISBN, String author, String title, String genre) {
		setISBN(ISBN);
		setAuthor(author);
		setTilte(title);
		setGenre(genre);
		refcode = generateReference();
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTilte() {
		return tilte;
	}

	public void setTilte(String tilte) {
		this.tilte = tilte;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getrefcode() {
		return refcode;
	}

	public String generateReference() {
		String v = (author.charAt(0) + "" + author.charAt(1) + "-" + genre.charAt(0) + "" + genre.charAt(1));
		return v.toUpperCase();
	}

	public boolean verifyISBN(int ISBN) {
		// ISBN = 200;
		// System.out.println(ISBN);
		int n1, n2, n3, n4;
		n1 = (ISBN / 1000) % 10;
		n2 = (ISBN / 100) % 10;
		n3 = (ISBN / 10) % 10;
		n4 = (ISBN % 10);
		// n4 = ((n1 * 3 + n2 * 2 + n3 * 1) % 4);
		// System.out.println(n1 + " " + n2 + " " + n3 + " " + n4);
		if ((n1 * 3 + n2 * 2 + n3 * 1) % 4 ==n4) {
			return true;
		} else
			return false;
	}

	public void printBookInfo() {
		System.out.println("Title: " + this.getTilte() + "\nAuthor: " + this.getAuthor() + "\nISBN: " + this.getISBN()
				+ " - Reference Code : " + this.getrefcode() + "\nGenre: " + this.getGenre());
	}

	public boolean equals(Book b) {
		System.out.println(this.refcode +" "+ b.getrefcode());
		if (b.getISBN() != this.ISBN && b.getAuthor().equalsIgnoreCase(this.author) && b.getGenre().equalsIgnoreCase(this.genre) && b.getrefcode().equalsIgnoreCase(this.refcode)) {
						return true;
					} else
						return false;
	}
}

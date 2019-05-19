package week_14_lecture;

public class Book implements Comparable{
	
	private String name;
	private String author;
	private int pages;
	
	/**
	 * constructs a Book object with default values
	 * */
	public Book() {
		this.name = "N/A";
		this.author  = "N/A";
		this.pages = 0;
	}

	/**
	 * constructs a Book object with given name and author
	 * @param name - the name of the book as a string
	 * @param author - the author of the book as a string
	 * */
	public Book(String name, String author) {
		this.name = name;
		this.author = author;
		this.pages = 0;
	}
	
	/**
	 * constructs a Book object with given name, author, and number of pages
	 * @param name - the name of the book as a string
	 * @param author - the name of the author as a string
	 * @param pages - the number of pages as an int
	 * */
	public Book(String name, String author, int pages) {
		this.name = name;
		this.author = author;
		this.pages = pages;
	}
	
	/**
	 *  gets the name of this Book
	 *  @return the name as a string
	 * */
	public String getName() {
		return this.name;
	}
	
	/**
	 * gets the name of the author
	 * @return the name of the author as a string
	 * */
	public String getAuthor() {
		return this.author;
	}
	
	/**
	 * gets the number of pages
	 * @return the number of pages as an integer
	 * */
	public int getPages() {
		return this.pages;
	}
	
	/**
	 * sets the name of this Book
	 * @param name - the name of this Book
	 * */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * sets the author's name
	 * @param author - the name of the author
	 * */
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setPages(int p) {
		this.pages = p;
	}
	
	public String toString() {
		return "Name: " + this.name + "\nAuthor: " + this.author + "\nPages: " + this.pages;
	}
	
	
	public boolean equals(Object o){
		Book other = (Book) o;
		
		return this.author.equals(other.author) && this.name.equals(other.name) && this.pages == other.pages;
	}
	
	public int hashCode() {
		final int HASH_MULTIPLIER = 17;
		int h1 = name.hashCode();
		int h2 = author.hashCode();
		int h3 = pages;
		
		int h = HASH_MULTIPLIER * h1 + h2;
		h = HASH_MULTIPLIER * h + h3;
		return h;
				
	}

	public int compareTo(Object o){
		Book other = (Book) o;
		return this.author.compareTo(other.author);
	}
	
	

}

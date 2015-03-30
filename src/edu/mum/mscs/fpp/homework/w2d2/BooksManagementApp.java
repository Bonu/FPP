/**
 * 
 */
package edu.mum.mscs.fpp.homework.w2d2;

/**
 * 3. A Class Book contains the following fields with private modifier.
		String title;
	    String author;
		String edition;
		String pageCount;
		boolean hardcover;
		double price;
	  Perform the following tasks;
	a)	Create a constructor to initialize the values
	b)	Override the equals() method to check whether the two book objects are equal. Assume title, author and edition are the instances to check the equality.
	c)	Override the hashCode() method.
	d)	Override toString() method to display all the book information.
	e)	Implement the clone() method to make a deep copy.
	f)	Write a Main class to create an object for Book class and execute the operations.
 *
 *
 *output:
 *  --------------Book Store-----------
	Book [title=Core Java, author=Horstmann, edition=2nd, pageCount=486, hardcover=true, price=49.99]
	Book [title=Core Java, author=Horstmann, edition=2nd, pageCount=486, hardcover=false, price=39.99]
	Book [title=Java Concepts, author=Horstmann, edition=5th, pageCount=812, hardcover=true, price=70.0]
	---------Equals operation-----------
	Book 1 equals to Book 2 :true
	Book 1 equals to Book 3 :false
	---------Equals operation-----------
	Book 1 equals to Book 2 :true
	Book 1 equals to Book 3 :false
	----------Hash code------------
	book 1 :1242744346
	book 2 :1242744346
	book 3 :-1411861633
	----------Clone------------
	Clone B3 - B4 
	Book [title=Java Concepts, author=Horstmann, edition=5th, pageCount=812, hardcover=true, price=70.0]
	Book [title=Java Concepts, author=Horstmann, edition=5th, pageCount=812, hardcover=true, price=70.0]

 * @author janardhanbonu
 *
 */

class Book implements Cloneable {
	private String title;
	private String author;
	private String edition;
	private String pageCount;
	private boolean hardcover;
	private double price;
	
	public Book(String title, String author, String edition, String pageCount,
			boolean hardcover, double price) {
		super();
		this.title = title;
		this.author = author;
		this.edition = edition;
		this.pageCount = pageCount;
		this.hardcover = hardcover;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", edition="
				+ edition + ", pageCount=" + pageCount + ", hardcover="
				+ hardcover + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((edition == null) ? 0 : edition.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (edition == null) {
			if (other.edition != null)
				return false;
		} else if (!edition.equals(other.edition))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// deep cloning should create a new object and copy of the existing object with 
		// sub-objects state to the new object. 
		return new Book( title,  author,  edition,  pageCount,
				 hardcover,  price);
	}	

}

public class BooksManagementApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Book b1 = new Book("Core Java", "Horstmann", "2nd", "486", true, 49.99);
		Book b2 = new Book("Core Java", "Horstmann", "2nd", "486", false, 39.99);
		Book b3 = new Book("Java Concepts", "Horstmann", "5th", "812", true, 70.00);
		
		System.out.println("--------------Book Store-----------");
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		System.out.println(b3.toString());

		System.out.println("---------Equals operation-----------");
		System.out.println("Book 1 equals to Book 2 :"+b1.equals(b2));
		System.out.println("Book 1 equals to Book 3 :"+b1.equals(b3));
		
		System.out.println("---------Equals operation-----------");
		System.out.println("Book 1 equals to Book 2 :"+b1.equals(b2));
		System.out.println("Book 1 equals to Book 3 :"+b1.equals(b3));
		
		System.out.println("----------Hash code------------");
		System.out.println("book 1 :"+ b1.hashCode());
		System.out.println("book 2 :"+ b2.hashCode());
		System.out.println("book 3 :"+ b3.hashCode());
		
		System.out.println("----------Clone------------");
		Book b4 = null;
		try {
			b4 = (Book)b3.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.printf("Clone B3 - B4 \n%s\n%s", b3.toString(), b4.toString());
		
	}

}

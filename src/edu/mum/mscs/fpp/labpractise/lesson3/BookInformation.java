/**
 * 
 */
package edu.mum.mscs.fpp.labpractise.lesson3;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Implement the code for the given class diagram

	Library
	+name:String
	+Id : Integer
	+Bookname:String
	+Authourname:String
	+IssueDate:Date
	
	+GetUserDetails()
	+GetBookDetails()
	+DueDate()
	+Report()

   For the above class diagram create one object for Faculty and one object for Student. Faculty 
   can use the book for 2 months from the IssueDate. Student can use the book for 1 month from 
   the IssueDate. Finally make a detailed report with all information by calling Report() method.

 * @author 984417
 */
public class BookInformation {
	
	public String name;
	public int id;
	public String bookName;
	public String authorName;
	public Date issueDate;
	public boolean isStudent;
	
	public BookInformation(String name, int id, String bookName,
			String authorName, Date issueDate, boolean isStudent) {
		super();
		this.name = name;
		this.id = id;
		this.bookName = bookName;
		this.authorName = authorName;
		this.issueDate = issueDate;
		this.isStudent = isStudent;
	}
	
	/**
	 * 
	 */
	public BookInformation() {
		// TODO Auto-generated constructor stub
	}
	
	public void getUserDetails(){
		System.out.println("User Name :"+name+"\n User Id :"+id);
	}
	
	public void getBookDetails(){
		System.out.println("Book Name :"+bookName+"\n Author Name :"+authorName);
	}
	
	public void dueDate() {
		Calendar iDate = new GregorianCalendar();
		iDate.setTime(issueDate);
		Calendar dueDate = new GregorianCalendar();
		
		if(isStudent){
			dueDate.add(Calendar.MONTH, 1);
		}else {
			dueDate.add(Calendar.MONTH, 2);
		}
		System.out.println("Due Date :"+dueDate);
	}
	
	public void Report() {
		getUserDetails();
		getBookDetails();
		System.out.println(isStudent ? "User Type: Student": "User Type: Faculty");
		dueDate();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookInformation bi1 = new BookInformation("Rama",007,"Ramayana", "Valmiki",(new Date()),true);
		BookInformation bi2 = new BookInformation("Ravana",007,"Ramayana", "Valmiki",(new Date()),true);
	}

}

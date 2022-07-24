package book.model;

public class Bookstatus {
	
	private int statuscode;
	private String message;
	private Book book;
	
	
	public Bookstatus() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Bookstatus(int statuscode, String message, Book book) {
		super();
		this.statuscode = statuscode;
		this.message = message;
		this.book = book;
	}


	public int getStatuscode() {
		return statuscode;
	}


	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public Book getBook() {
		return book;
	}


	public void setBook(Book book) {
		this.book = book;
	}
	
	
	
	
	

}

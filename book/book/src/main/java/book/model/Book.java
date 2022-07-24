package book.model;

public class Book {
	
	private int bookid;
	private String bookname;
	private int price;
	private String authorname;
	
	
	public Book() {
	}


	public Book(int bookid, String bookname, int price, String authorname) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.price = price;
		this.authorname = authorname;
	}


	public int getBookid() {
		return bookid;
	}


	public void setBookid(int bookid) {
		this.bookid = bookid;
	}


	public String getBookname() {
		return bookname;
	}


	public void setBookname(String bookname) {
		this.bookname = bookname;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getAuthorname() {
		return authorname;
	}


	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}

	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", price=" + price + ", authorname=" + authorname
				+ "]";
	}
	

}

package book.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import book.model.Book;
import book.model.Bookstatus;



@Repository
public class DAO {

	private JdbcTemplate jdbcTemplate;
	@Autowired
	public DAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}


	
	
	
	public Bookstatus singleselectDAO(int bookid) {
		Bookstatus bookstatus =new Bookstatus(-1,"Book not found",null);
		String q="select bookid,bookname,price,authorname from book3 where bookid=?";
		Object para []= {bookid};
		BeanPropertyRowMapper<Book> bpr=new BeanPropertyRowMapper<Book>(Book.class);
		Book book=null;
		try {
			book=jdbcTemplate.queryForObject(q,para,bpr);
			bookstatus.setStatuscode(1);
			bookstatus.setMessage("book found");
			bookstatus.setBook(book);
		} catch (DataAccessException e) {
			System.out.println("Book not found");
		}
		return bookstatus;
	}


	
	
	
	
	public boolean insertdao(Book book1) {
		Boolean status=false;
		String q="insert into book3 values(?,?,?,?)";
		Object par[]={book1.getBookid(),book1.getBookname(),book1.getPrice(),book1.getAuthorname()};
		int row=jdbcTemplate.update(q,par);
		if (row>0)
		{
			status=true;
		}
		return status;
	}


	
	
	
	public List<Book> selectALLDAO() {
		
		List<Book> books=new ArrayList<Book>();
		String q ="select * from book3";
		BeanPropertyRowMapper<Book> bpr=new BeanPropertyRowMapper<Book>(Book.class);
		try {
			books=jdbcTemplate.query(q, bpr);
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return books;
	}

	
	
	
	

	/*
	 
	 public interface DAo extend JpaRepository<Book,Integer>{
	 
	 } 
	 
	 */
	
	
	
	
	
	
	
	
	
	public String DeleteInDao(int bookid) {
		String status="Failed to delete book";
		String q="delete from book3 where bookid=?";
		Object par[]={bookid};
		int row=jdbcTemplate.update(q,par);
		if(row>0)
		{
			status="Deleted Successfully!";
		}
		return status;
	}

}

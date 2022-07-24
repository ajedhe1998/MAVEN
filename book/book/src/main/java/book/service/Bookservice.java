package book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import book.dao.DAO;
import book.model.Book;
import book.model.Bookstatus;


@Service
public class Bookservice {
	
	
	private DAO dao;

	@Autowired
	public Bookservice(DAO dao) {
		super();
		this.dao = dao;
	}
	
	
	
	public Bookstatus singleselect(int bookid)
	{  			
		return dao.singleselectDAO(bookid);
	}

	public boolean insertservice(Book book1) {
		
		return dao.insertdao(book1);
	}



	public List<Book> selectall() {
		
		return dao.selectALLDAO();
	}



	public String deleteSer(int bookid) {
	
		return dao.DeleteInDao(bookid);
	}
	
	
	
	
	/*
	 
	  public List<Book> getall(){
	  
	  return dao.findall();
	  
	  insert/update--->save
	  
	  deleteById
	  
	  }
	 */
	
	
	
	
	

}

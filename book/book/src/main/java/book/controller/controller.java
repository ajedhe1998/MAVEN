package book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import book.model.Book;
import book.model.Bookstatus;
import book.service.Bookservice;

@RestController
public class controller {
	
	
	private Bookservice bookservice;
	@Autowired
	public controller(Bookservice bookservice) {
		this.bookservice = bookservice;
	}
	
	
	@GetMapping("/single/{bookid}")
	public Bookstatus singleselectcontroler(@PathVariable int bookid) {
		
		return bookservice.singleselect(bookid);
		
	}
	
	
	@PostMapping("/insert")
	public boolean insert(@RequestBody Book book1) {
		
		return bookservice.insertservice(book1);
		
	}
	
	

	@GetMapping("/allselect")
	public List<Book> singleselectcontroler() {
		
		return bookservice.selectall();
		
	}
	
	
	@DeleteMapping("/delete")
	public String deletebook(@RequestParam int bookid) {
		return bookservice.deleteSer(bookid);
		
	}
	
	
	
	
	

}

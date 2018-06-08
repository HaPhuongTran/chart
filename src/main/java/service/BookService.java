package service;

import java.util.List;

import org.springframework.stereotype.Component;

import book.Book;

@Component
public interface BookService {

	   long save(Book book);
	   Book get(long id);
	   List<Book> list();
	   void update(long id, Book book);
	   void delete(long id);
	}

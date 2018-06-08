package service;

import java.util.List;
import dao.BookDao;
import book.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.Transactional;

@Component
@Service
@Transactional(readOnly = true)
public class BookServiceImp implements BookService {

   @Autowired
   private BookDao bookDao;

   @Transactional
   @Override
   public long save(Book book) {
      return bookDao.save(book);
   }

   @Override
   public Book get(long id) {
      return bookDao.get(id);
   }

   @Override
   public List<Book> list() {
      return bookDao.list();
   }

   @Transactional
   @Override
   public void update(long id, Book book) {
      bookDao.update(id, book);
   }

   @Transactional
   @Override
   public void delete(long id) {
      bookDao.delete(id);
   }

}

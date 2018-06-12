package dao;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.criteria.*;
import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import book.Book;
import dao.BookDao;

@Component
@Repository
public class BookDaoImp implements BookDao {

   @Autowired
   private EntityManagerFactory entityManagerFactory;

   @Override
   public long save(Book book) {
	  entityManagerFactory.unwrap(SessionFactory.class).openSession().save(book);
      return book.getId();
   }

   @Override
   public Book get(long id) {
      return entityManagerFactory.unwrap(SessionFactory.class).openSession().get(Book.class, id);
   }

   @Override
   public List<Book> list() {
      Session session = entityManagerFactory.unwrap(SessionFactory.class).openSession();
      CriteriaBuilder cb = session.getCriteriaBuilder();
      CriteriaQuery<Book> cq = cb.createQuery(Book.class);
      Root<Book> root = cq.from(Book.class);
      cq.select(root);
      Query<Book> query = session.createQuery(cq);
      return query.getResultList();
   }

   @Override
   public void update(long id, Book book) {
      Session session = entityManagerFactory.unwrap(SessionFactory.class).openSession();
      Book book2 = session.byId(Book.class).load(id);
      book2.setTitle(book.getTitle());
      book2.setAuthor(book.getAuthor());
      session.flush();
   }

   @Override
   public void delete(long id) {
      Session session = entityManagerFactory.unwrap(SessionFactory.class).openSession();
      Book book = session.byId(Book.class).load(id);
      session.delete(book);
   }

}

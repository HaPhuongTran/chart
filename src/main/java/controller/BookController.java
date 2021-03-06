package controller;

import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import book.Book;
import service.BookService;

@Component
@RestController
@CrossOrigin
public class BookController {

   @Autowired
   private BookService bookService;

   /*---Add new book---*/
   @RequestMapping("/book")
   public @ResponseBody String addNewBook (@RequestParam("title") String title, @RequestParam("author") String author) {
	   Book book = new Book();
	   book.setTitle(title);
	   book.setAuthor(author);
	   bookService.save(book);
	   return "added";
   }

   /*---Get a book by id---*/
   @GetMapping("/book/{id}")
   public ResponseEntity<Book> get(@PathVariable("id") long id) {
      Book book = bookService.get(id);
      return ResponseEntity.ok().body(book);
   }

   /*---get all books---*/
//   @RequestMapping("/book")
//   public ResponseEntity<List<Book>> list() {
//      List<Book> books = bookService.list();
//      return ResponseEntity.ok().body(books);
//   }

   /*---Update a book by id---*/
   @PutMapping("/book/{id}")
   public ResponseEntity<?> update(@PathVariable("id") long id, @RequestBody Book book) {
      bookService.update(id, book);
      return ResponseEntity.ok().body("Book has been updated successfully.");
   }

   /*---Delete a book by id---*/
   @DeleteMapping("/book/{id}")
   public ResponseEntity<?> delete(@PathVariable("id") long id) {
      bookService.delete(id);
      return ResponseEntity.ok().body("Book has been deleted successfully.");
   }
}
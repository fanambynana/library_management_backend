package management.library.crud;

import management.library.model.Book;
import management.library.repository.BookRepository;

import java.util.List;

public class BookCrudOperations implements CrudOperations<Book>{
    BookRepository bookRepository = new BookRepository();

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }
    @Override
    public List<Book> saveAll(List<Book> toSave) {
        return bookRepository.saveAll();
    }
    @Override
    public Book save(Book toSave) {
        return bookRepository.save();
    }
    @Override
    public Book delete(Book toDelete) {
        return bookRepository.delete();
    }
}

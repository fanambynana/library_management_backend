package management.library.repository;

import management.library.bdConnection.DbConnect;
import management.library.model.Book;
import management.library.model.Topic;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    DbConnect dbConnect = new DbConnect();
    Connection connection = dbConnect.createConnection();

    public List<Book> findAll() {
        List<Book> bookList = new ArrayList<>();
        try {
            String allRequest = "SELECT * FROM book";
            Statement allStatement = connection.createStatement();
            ResultSet allResultSet = allStatement.getResultSet();

            while (allResultSet.next()) {
                bookList.add(new Book(
                        allResultSet.getString("id"),
                        allResultSet.getString("book_name"),
                        allResultSet.getInt("page_number"),
                        (LocalDate) allResultSet.getObject("release_date"),
                        new ArrayList<>(((Topic) allResultSet.getObject("topic")).ordinal())
                ));
            }
        } catch (SQLException exception) {
            System.out.println("Error while finding all books :\n" + exception.getMessage());
        }
        return bookList;
    }

    public List<Book> saveAll(List<Book> toSave) {
        for (Book book : toSave) {
            try {
                String allRequest = """
                    INSERT INTO book(book_name, page_number, release_date, topic)
                    VALUES(?, ?, ?, ?);
                """;
                PreparedStatement allStatement = connection.prepareStatement(allRequest);
                allStatement.setString(1, book.getBookName());
                allStatement.setInt(2, book.getPageNumber());
                allStatement.setDate(3, Date.valueOf(book.getReleaseDate()));
                allStatement.setObject(4, book.getTopic());
            } catch (SQLException exception) {
                System.out.println("Error while saving books :\n" + exception.getMessage());
            }
        }
        return this.findAll();
    }

    public Book save(Book toSave) {
        try {
            String saveRequest = """
                    INSERT INTO book(book_name, page_number, release_date, topic)
                    VALUES(?, ?, ?, ?);
                """;
            PreparedStatement allStatement = connection.prepareStatement(saveRequest);
            allStatement.setString(1, toSave.getBookName());
            allStatement.setInt(2, toSave.getPageNumber());
            allStatement.setDate(3, Date.valueOf(toSave.getReleaseDate()));
            allStatement.setObject(4, toSave.getTopic());
        } catch (SQLException exception) {
            System.out.println("Error while saving books :\n" + exception.getMessage());
        }
        return toSave;
    }
}

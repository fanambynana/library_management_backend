package management.library.repository;

import management.library.bdConnection.DbConnect;
import management.library.model.Book;
import management.library.model.Topic;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
}

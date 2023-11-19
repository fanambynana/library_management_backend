package management.library.repository;

import management.library.bdConnection.DbConnect;
import management.library.model.Book;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    DbConnect dbConnect = new DbConnect();
    Connection connection = dbConnect.createConnection();


    public List<Book> findAll() {
        try {
            List<Book> bookList = new ArrayList<>();
            String allRequest = "SELECT * FROM book";
            Statement allStatement = connection.createStatement();
            ResultSet allResultSet = allStatement.getResultSet();

            while (allResultSet.next()) {
                bookList.add(new Book(

                ))
            }
        } catch (SQLException exception) {
            System.out.println("Error while finding all books :\n" + exception.getMessage());
        }
    }
}
